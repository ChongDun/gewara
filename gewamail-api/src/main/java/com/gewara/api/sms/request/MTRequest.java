package com.gewara.api.sms.request;

import java.sql.Timestamp;

import com.gewara.api.MsgRequest;

/**
 * ���ŷ��ͽӿڣ�������Ϣ
 * 
 * @author leo.li
 * Modify Time Jan 15, 2013 11:22:08 AM
 */
public class MTRequest extends MsgRequest{
	
	private static final long serialVersionUID = -7958685800960343234L;
	
	/**�ͻ��˶���ID������ */
	private String smsId; 
	/**���ұ��룬�Ǳ���*/
	private String countryCode;
	/**�ֻ��ţ����� */
	private String mobile; 
	/**�������ݣ����� */
	private String content; 
	/**ҵ�����ͣ����ڶ��ŷ�������ҳ���õ�ֵ������ */
	private String busType;
	/**����Ψһ��ʶ�������������ظ����ͣ����ṩ��һ��������ѡ */
	private String smsUkey;
	/**��ʱ����ʱ�䣬��ָ����ֵ��ϵͳ���ڸ�ʱ�䷢�Ͷ��ţ���ѡ */
	private Timestamp attime;
	
	/**��ѡ���ṩ6�������ֶΣ�����Ӣ���ַ�150������50 */
	private String field01;
	private String field02;
	private String field03;
	private String field04;
	private String field05;
	private String field06;
	private String field07;
	private String field08;
	private String field09;
	private String field10;
	
	public MTRequest(){}
	
	/**
	 * ����MT����
	 * 
	 * @param smsId   �ͻ��˶���ID������
	 * @param mobile  �ֻ��ţ�����
	 * @param content �������ݣ����� 
	 * @param busType ҵ�����ͣ����ڶ��ŷ�������ҳ���õ�ֵ������
	 *
	 * @author leo.li
	 * Modify Time Jan 15, 2013 11:25:52 AM
	 */
	public MTRequest(String smsId,String mobile,String content,String busType){
		this.smsId = smsId;
		this.mobile = mobile;
		this.content = content;
		this.busType = busType;
	}
	
	/**
	 * ��ȡ�ͻ��˶���ID
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public String getSmsId() {
		return smsId;
	}
	
	/**
	 * ���ÿͻ��˶���ID����ֵ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setSmsId(String smsId) {
		this.smsId = smsId;
	}
	
	/**
	 * ��ȡ���ұ���
	 * 
	 * @return String
	 */
	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * ��ȡ�ֻ���
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public String getMobile() {
		return mobile;
	}
	
	/**
	 * �����ֻ��ţ���ֵ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	/**
	 * ��ȡ��������
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * ���ö������ݣ���ֵ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * ��ȡҵ�����ͣ����ڶ��ŷ�������ҳ���õ�ֵ
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public String getBusType() {
		return busType;
	}
	
	/**
	 * ����ҵ�����ͣ����ڶ��ŷ�������ҳ���õ�ֵ����ֵ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setBusType(String busType) {
		this.busType = busType;
	}
	
	/**
	 * ��ȡ����Ψһ��ʶ�������������ظ����ͣ����ṩ��һ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public String getSmsUkey() {
		return smsUkey;
	}
	
	/**
	 * ���ö���Ψһ��ʶ�������������ظ����ͣ����ṩ��һ����
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setSmsUkey(String smsUkey) {
		this.smsUkey = smsUkey;
	}
	
	/**
	 * ��ȡ��ʱ����ʱ�䣬��ָ����ֵ��ϵͳ���ڸ�ʱ�䷢�Ͷ���
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public Timestamp getAttime() {
		return attime;
	}
	
	/**
	 * ���ö�ʱ����ʱ�䣬��ָ����ֵ��ϵͳ���ڸ�ʱ�䷢�Ͷ��ţ���ֵ��ѡ
	 * 
	 * @return String
	 * Modify Time Jan 15, 2013 11:23:22 AM
	 */
	public void setAttime(Timestamp attime) {
		this.attime = attime;
	}

	public String getField01() {
		return field01;
	}

	public void setField01(String field01) {
		this.field01 = field01;
	}

	public String getField02() {
		return field02;
	}

	public void setField02(String field02) {
		this.field02 = field02;
	}

	public String getField03() {
		return field03;
	}

	public void setField03(String field03) {
		this.field03 = field03;
	}

	public String getField04() {
		return field04;
	}

	public void setField04(String field04) {
		this.field04 = field04;
	}

	public String getField05() {
		return field05;
	}

	public void setField05(String field05) {
		this.field05 = field05;
	}

	public String getField06() {
		return field06;
	}

	public void setField06(String field06) {
		this.field06 = field06;
	}

	public String getField07() {
		return field07;
	}

	public void setField07(String field07) {
		this.field07 = field07;
	}

	public String getField08() {
		return field08;
	}

	public void setField08(String field08) {
		this.field08 = field08;
	}

	public String getField09() {
		return field09;
	}

	public void setField09(String field09) {
		this.field09 = field09;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}
}
