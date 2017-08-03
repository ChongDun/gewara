package com.gewara.partner2.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.model.BaseObject;

public class PartnerVo extends BaseObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6832295342083678638L;
	
	public static final String NAME_WAP = "gewap";
	public static final String NAME_WEIXIN = "weixin";
	public static final String NAME_WANDAWAP = "wandawap";
	public static final String NAME_QIEKE = "qieke";
	public static final String NAME_BAISHITONG = "baishitong";
	public static final String NAME_SPD_BANK = "spd";
	// ����
	public static final String NAME_BANK_COMM = "bankcomm";
	// ƽ��һǮ��
	public static final String NAME_PINGANFU = "pinganfu";
	// 
	public static final String NAME_CHUBAO = "chubao";
	// �ߵµ�ͼ
	public static final String NAME_AMAP = "amap";
	// ƽ������ͨ
	public static final String NAME_PINGANWLT = "pinganwlt";
	// ���㹺
	public static final String NAME_UNIONGO = "uniongo";
	// ��Ҧ������
	public static final String NAME_EYUYAO = "eyuyao";
	// ����
	public static final String NAME_CCBANK = "ccbank";
	// ΢��
	public static final String NAME_WEIBOH5 = "weibo_h5";
	public static final String NAME_CMB_BANK = "cmbchina";
	public static final String NAME_BAIDU_MAP = "openapi_baidumap";
	public static final String NAME_HANGZHOUAPP = "hangzhouapp";
	public static final String NAME_139SZ = "139sz";//��������
	public static final String NAME_CM_PAY = "cmpay";
	// �Ϻ������
	public static final String NAME_SHDGM = "shdgm";
	// �㷢����
	public static final String NAME_CGBCHINA = "cgbchina";
	// ̩¡����
	public static final String NAME_TAILONGBANK = "tailongbank";
	
	public static final String NAME_UNION = "unionClient";
	// һ�ŵ�
	public static final String NAME_YIHAODIAN = "yihaodian";
	// ƽ�����ÿ�
	public static final String NAME_PINGANCREDITCARD = "pinganCreditcard";
	
	public static final String NAME_CCBAPP = "CCBAPP";
	
	public static final String NAME_UNIONPAYWALLET = "unionpayWallet";

	// ������
	public static final String NAME_CAIMIAO = "caimiao";
	
	private Long id;
	
	/** ����������  */
	private String name;
	/** ��Կ */
	private String privatekey;
	/** ������KEY(Ψһ��ʶ) */
	private String appkey;
	
	/** ����������������Ϣ(json��ʽ) */
	private String otherinfo;
	private String defaultCityCode;
	
	/** �汾�� */
	private String version;
	
	/** Ĭ�ϳ���CODE */
	private String citycode;
	
	/** ���ݸ�ʽ(xml/json)*/
	private String format;
	
	/** ��ע */
	private String remark;
	
	/** ����ʱ�� */
	private Timestamp createtime;
	
	/** ����ʱ�� */
	private Timestamp updatetime;
	
	/** RSA����˽Կ */
	private String rsaprivatekey;

	/** RSA���ܹ�Կ */
	private String rsapublickey;

	/** ��תURL */
	private String redirecturl;
	
	public PartnerVo(){
		
	}
	public PartnerVo(String name){
		this.name  = name;
	}
	public String getName() {
		if(StringUtils.equalsIgnoreCase(name, "androidV64")){
			return "android2009";
		}else if(StringUtils.equalsIgnoreCase(name, "iphoneV64")){
			return "iphonepk2009";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public String getAppkey() {
		if(StringUtils.equalsIgnoreCase(appkey, "androidV64")){
			return "android2009";
		}else if(StringUtils.equalsIgnoreCase(appkey, "iphoneV64")){
			return "iphonepk2009";
		}
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	public String getDefaultCityCode() {
		return defaultCityCode;
	}
	public void setDefaultCityCode(String defaultCityCode) {
		this.defaultCityCode = defaultCityCode;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRsaprivatekey() {
		return rsaprivatekey;
	}
	public void setRsaprivatekey(String rsaprivatekey) {
		this.rsaprivatekey = rsaprivatekey;
	}
	public String getRsapublickey() {
		return rsapublickey;
	}
	public void setRsapublickey(String rsapublickey) {
		this.rsapublickey = rsapublickey;
	}
	public String getRedirecturl() {
		return redirecturl;
	}
	public void setRedirecturl(String redirecturl) {
		this.redirecturl = redirecturl;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	
}