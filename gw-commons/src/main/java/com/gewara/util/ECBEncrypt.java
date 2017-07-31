package com.gewara.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * ECB����ʵ�֣�����8λ��MAC�룬���ܲ���DES����
 */
public class ECBEncrypt {

	/**
	 * ʵ��ECB���ܣ�����16λʮ������MAC��,��������쳣����null
	 * @param input ����
	 * @param key ��Կʮ������(����)
	 * @return 8λMAC��
	 */
	public static String ecbEncrypt(String input, String key) {
		return ecbEncrypt(input, key, "iso-8859-1", 8);
	}
	public static String ecbEncrypt(String input, String keyStr, String charset, int length) {
		byte[] keys = String2Hex(keyStr);
		return ecbEncrypt(input, keys, charset, length);
	}
	public static String ecbEncrypt(String input, byte[] keys, String charset, int length) {
		byte[] mac = new byte[8];
		byte[] temp = new byte[8];
		int z = 0;
		try {
			byte[] bt = input.getBytes(charset);//iso-8859-1
			int len = bt.length;
			int other = len % 8;
			// ������������8���ֽڣ�����0����
			if (other != 0) {
				byte[] tt = bt;
				bt = new byte[tt.length + (8 - other)];
				System.arraycopy(tt, 0, bt, 0, len);
			}

			// ��ʼ��mac���飬�����ĵ�ǰ8���ֽڣ���������ѭ�����
			for (int i = 0; i < 8; i++) {
				mac[i] = bt[i];
			}
			// ѭ�����
			for (int i = 8; i <= bt.length; i++, z++) {
				if (i != 8 && i % 8 == 0) {
					for (int j = 0; j < 8; j++) {
						mac[j] = (byte) (mac[j] ^ temp[j]);
					}
					z = 0;
					temp = new byte[8];
				}
				if (i != bt.length) {
					temp[z] = bt[i];
				}
			}
			byte[] tmpResult = new byte[8];// ������������
			tmpResult = des(mac, keys);
			return Hex2String(tmpResult).toUpperCase().substring(0, length);
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Description: ��16���Ƶ�byte����ת��Ϊ16���Ƶ��ַ���
	 * 
	 * @author Administrator 2009-8-25 ����04:09:41
	 * @param bytearr
	 * @return
	 */
	public static String Hex2String(byte[] bytearr) {
		if (bytearr == null) {
			return "null";
		}
		StringBuilder sb = new StringBuilder();

		for (int k = 0; k < bytearr.length; k++) {
			if ((bytearr[k] & 0xFF) < 16) {
				sb.append("0");
			}
			sb.append(Integer.toString(bytearr[k] & 0xFF, 16));
		}
		return sb.toString();

	}

	/**
	 * Description: ��16�����ַ���ת��Ϊ16���Ƶ�byte����
	 * 
	 * @author Ivan 2009-8-25 ����04:09:08
	 * @param bytearr
	 * @return
	 */
	public static byte[] String2Hex(String bytearr) {

		if (bytearr == null || bytearr.length() % 2 != 0) {
			return new byte[] {};
		}

		byte[] dest = new byte[bytearr.length() / 2];

		for (int i = 0; i < dest.length; i++) {
			String val = bytearr.substring(2 * i, 2 * i + 2);
			dest[i] = (byte) Integer.parseInt(val, 16);
		}
		return dest;
	}

	/**
	 * Description: des����
	 * 
	 * @author Ivan 2009-8-25 ����04:08:37
	 * @param reqBytes
	 * @param key
	 * @return
	 * @throws InvalidKeyException
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 * @throws UnsupportedEncodingException
	 * @throws ShortBufferException
	 */
	public static byte[] des(byte[] reqBytes, byte[] key) throws InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
			IllegalBlockSizeException, BadPaddingException, ShortBufferException {
		SecretKeySpec keySpec = null;
		DESKeySpec deskey = null;
		deskey = new DESKeySpec(key);
		keySpec = new SecretKeySpec(deskey.getKey(), "DES");

		Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);

		byte[] cipherText = new byte[cipher.getOutputSize(reqBytes.length)];
		int ctLength = cipher.update(reqBytes, 0, reqBytes.length, cipherText, 0);
		ctLength += cipher.doFinal(cipherText, ctLength);

		// byte[] data = cipher.doFinal(reqBytes);
		return cipherText;
	}
}
