package com.gewara.util;

import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.RandomUtils;
/**
 * @author <a href="mailto:acerge@163.com">gebiao(acerge)</a>
 * @since 2007-9-28����02:05:17
 */
public final class PKCoderUtil {
	private static transient String Algorithm = "DES"; // ���� �����㷨,���� DES,DESede(TripleDES),Blowfish
	private static transient byte[] DEFAULT_KEY={-72,-16,-79,-22,-79,-32,-48,-76};
	private static final transient GewaLogger dbLogger = LoggerUtils.getLogger(PKCoderUtil.class);
	
	public static final String encodePK(long pk){
		return encodePK(pk, DEFAULT_KEY);
	}
	public static final String encodePK(Long pk, byte[] skey){
		byte[] bytes = long2bytes(pk);
		byte[] encoded = encode(bytes, skey);
		String result = byte2hex(encoded);
		return result;
	}
	private static final byte[] long2bytes(long num){
		//�������λһ���ֽ�
		byte[] b=new byte[7];
		for(int i=1;i<8;i++){
			b[i-1]=(byte)(num>>>(56-i*8));
		}
		return b;
	}
	public static final String encodePK(String pkStr){
		Long pk = Long.valueOf(pkStr);
		return encodePK(pk);
	}
	public static final String encodeString(String original, byte[] skey){
		String result = null;
		byte[] pkbytes;
		try {
			pkbytes = original.getBytes("gbk");
			byte[] encoded = encode(pkbytes, skey);
			result = byte2hex(encoded);
		} catch (Exception e) {
			dbLogger.error(original + LoggerUtils.getExceptionTrace(e, 10));
		}
		return result;
	}
	public static final String encodeString(String original){
		return encodeString(original, DEFAULT_KEY);
	}
	public static final String decodeString(String encrypt){
		return decodeString(encrypt, DEFAULT_KEY);
	}
	public static final String decodeString(String encodedHex, byte[] skey){
		byte[] encoded = hex2byte(encodedHex);
		byte[] decoded = decode(encoded,skey);
		try {
			String s = new String(decoded, "gbk");
			return s;
		} catch (Exception e) {
			dbLogger.error(encodedHex + ":" + e.getClass().getName());
			return null;
		}
	}
	// ����
	public static final Long encodeNumer(long num){
		byte[] bytes = long2bytes(num);
		byte[] encoded = encode(bytes, DEFAULT_KEY);
		Long mask=0xffL;
		Long temp=0L;
		Long res=0L;
		for(int i=0;i<8;i++){
			res<<=8;
			temp=encoded[i]&mask;
			res|=temp;
		}
		return Math.abs(res);
	}
	private static final byte[] encode(byte[] input, byte[] key){
		SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key, Algorithm);
		Cipher c1 = null;
		try {
			c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.ENCRYPT_MODE, deskey);
			byte[] cipherByte = c1.doFinal(input);
			return cipherByte;
		} catch (Exception e) {
			dbLogger.error(e.getClass().getCanonicalName());
		}
		return null;
	}

	// ����
	private static byte[] decode(byte[] input, byte[] key) {
		SecretKey deskey = new javax.crypto.spec.SecretKeySpec(key, Algorithm);
		Cipher c1=null;
		try {
			c1 = Cipher.getInstance(Algorithm);
			c1.init(Cipher.DECRYPT_MODE, deskey);
			byte[] clearByte = c1.doFinal(input);
			return clearByte;	
		} catch (Exception e) {
			dbLogger.error(e.getClass().getCanonicalName());
		}
		return null;
	}

	// �ֽ���ת����16�����ַ���
	private static final String byte2hex(byte bytes[]) {
		StringBuilder retString = new StringBuilder();
		for (int i = 0; i < bytes.length; ++i) {
			retString.append(Integer.toHexString(0x0100 + (bytes[i] & 0x00FF)).substring(1).toUpperCase());
		}
		return retString.toString();
	}

	// ��16�����ַ���ת�����ֽ���
	private static final byte[] hex2byte(String hex) {
		byte[] bts = new byte[hex.length() / 2];
		for (int i = 0; i < bts.length; i++) {
			bts[i] = (byte) Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
		}
		return bts;
	}
	public static final String encryptString(String original, String key){
		String tmpKey = StringUtils.rightPad(key, 8, "��");
		try{
			byte[] keys = Arrays.copyOf(tmpKey.getBytes("utf-8"), 8);
			String str = original;
			return encodeString(str, keys);
		} catch (Exception e) {
			dbLogger.error(original + ":" + key + ":" + e.getClass().getCanonicalName());
		}
		return null;
	}
	public static final String decryptString(String encryptStr, String key){
		if(StringUtils.isBlank(encryptStr)||encryptStr.length()%2==1) return "";
		try{
			String tmpKey = StringUtils.rightPad(key, 8, "��");
			byte[] keys = Arrays.copyOf(tmpKey.getBytes("utf-8"), 8);
			String str = decodeString(encryptStr, keys);
			return str;
		} catch (Exception e) {
			dbLogger.error(encryptStr + ":" + e.getClass().getCanonicalName());
			return "";
		}
	}
	/**
	 * @param pKey 3DES��Կ/24
	 * @param pIV 3DES����/8
	 * @param pContent ��������
	 * @return
	 */
	public static String TriDesEncrypt(String pKey, String pIV, String pContent){				
		String ret="";
		try {
			//��ʼ��Cipher
			javax.crypto.spec.IvParameterSpec iv = new javax.crypto.spec.IvParameterSpec(pIV.getBytes());
			javax.crypto.spec.SecretKeySpec key = new javax.crypto.spec.SecretKeySpec(pKey.getBytes(),"DESede");
			javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DESede/CBC/PKCS5Padding");
		
			//ִ�м��ܲ���Base64����
			cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, key, iv);
			
			ret=Base64.encodeBase64String(cipher.doFinal(pContent.getBytes("utf-8")));
			
			return ret.replaceAll("\r\n","");
		} catch (Exception e) {
			dbLogger.error(LoggerUtils.getExceptionTrace(e, 10));
			return "";
		}		
	}
	public static String triDesDecrypt(String enc, String pKey, String pIV){				
		String ret="";
		try {
			//��ʼ��Cipher
			javax.crypto.spec.IvParameterSpec iv = new javax.crypto.spec.IvParameterSpec(pIV.getBytes());
			javax.crypto.spec.SecretKeySpec key = new javax.crypto.spec.SecretKeySpec(pKey.getBytes(),"DESede");
			javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DESede/CBC/PKCS5Padding");
		
			//ִ�м��ܲ���Base64����
			cipher.init(javax.crypto.Cipher.DECRYPT_MODE, key, iv);
			ret = new String(cipher.doFinal(Base64.decodeBase64(enc)), "UTF-8");
			return ret.replaceAll("\r\n","");
		} catch (Exception e) {
			dbLogger.error(LoggerUtils.getExceptionTrace(e, 10));
			return "";
		}		
	}
	/**
	 * RSA����
	 * @param pKey RSA��Կ
	 * @param pContent ��������
	 * @return
	 */
	public static String RSAEncrypt(String pKey, String pContent) {				
		String ret="";
		try {
			//������Կ�õ���Կ
			int startIndex=pKey.indexOf("<Modulus>")+9;
			int endIndex=pKey.indexOf("</Modulus>");		
			
			byte[] b= Base64.decodeBase64(pKey.substring(startIndex, endIndex));
			
			String N = byte2hex(b);
			
			startIndex=pKey.indexOf("<Exponent>")+10;
			endIndex=pKey.indexOf("</Exponent>");
			
			b = Base64.decodeBase64(pKey.substring(startIndex, endIndex));
			
			String E = byte2hex(b);
			
			//��ʼ��Cipher
			java.math.BigInteger bigN=new java.math.BigInteger(N,16);
			java.math.BigInteger bigE=new java.math.BigInteger(E,16);						
			java.security.spec.RSAPublicKeySpec pubSpec=new java.security.spec.RSAPublicKeySpec(bigN,bigE);			
			javax.crypto.Cipher cipher=javax.crypto.Cipher.getInstance("RSA/ECB/PKCS1Padding");			
			
			//ִ�м��ܲ���Base64����
			cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, java.security.KeyFactory.getInstance("RSA").generatePublic(pubSpec));					
			
			ret = Base64.encodeBase64String(cipher.doFinal(pContent.getBytes("utf-8")));
			
			return ret.replaceAll("\r\n","");
		} catch (Exception e) {
			dbLogger.error(LoggerUtils.getExceptionTrace(e, 10));
			return "";
		}		
	}
	/**
	 * @param keyStr 24�ֽڣ�base64����
	 * @param plainText �����ܵ��ַ�
	 * @param encoding
	 * @return ���ܺ���base64������ַ���
	 */
	public static String encryptWithThiDES(String keyStr, String plainText, String encoding) {
		try{
			byte[] key = Base64.decodeBase64(keyStr);
			byte[] src = plainText.getBytes(encoding);
			byte[] result = encryptWithThiDES(key, src);
			return Base64.encodeBase64String(result).replaceAll("\r\n", "");
		} catch (Exception e) {
			dbLogger.error(LoggerUtils.getExceptionTrace(e, 10));
		}
		return null;
	}
	/**
	 * @param keyStr 24�ֽڣ�base64����
	 * @param encrypt ���ܺ���ֽ���base64������ַ���
	 * @param encoding ����
	 * @return
	 * @throws Exception
	 */
	public static String decryptWithThiDES(String keyStr, String encrypt, String encoding) {
		try {
			byte[] key = Base64.decodeBase64(keyStr);
			byte[] src = Base64.decodeBase64(encrypt);
			byte[] result = decryptWithThiDES(key, src);
			return new String(result, encoding);
		} catch (Exception e) {
			dbLogger.error(LoggerUtils.getExceptionTrace(e, 10));
		}
		return null; 
	}
	public static byte[] encryptWithThiDES(byte[] key, byte[] src) throws Exception{
		SecretKey deskey = new SecretKeySpec(key, "DESede");
		Cipher cipher = Cipher.getInstance("DESede");
		cipher.init(Cipher.ENCRYPT_MODE, deskey);
		byte[] result = cipher.doFinal(src);
		return result;
	}
	public static byte[] decryptWithThiDES(byte[] key, byte[] encrypted) throws Exception {
		//������Կ
		SecretKey deskey = new SecretKeySpec(key, "DESede");
		//����
		Cipher c1 = Cipher.getInstance("DESede");
		c1.init(Cipher.DECRYPT_MODE, deskey);
		byte[] result = c1.doFinal(encrypted);
		return result;
	}
	public static String getRandomKey(int length){
		byte[] key = new byte[length];
		for(int i=0;i<length;i++){
			key[i] = (byte)(RandomUtils.nextInt() & 0xff);
		}
		return Base64.encodeBase64String(key); 
	}
}
