package com.gewara.api.pay.domain;

import java.sql.Timestamp;

import com.gewara.api.pay.ApiObject;

/**
 * �̻��ر���Ϣ���ɲ���ά��
 * 
 * @author leo.li
 * Modify Time 2014��3��28�� ����3:01:49
 */
public class MerchantSpec extends ApiObject{
		
	private static final long serialVersionUID = 3131371299419499986L;
	
	/**�˿���ţ�CW������*/
	public static final String REFUNDDEPT_CW = "CW";
	/**�˿���ţ�KF���ͷ�*/
	public static final String REFUNDDEPT_KF = "KF";
	
	
	private String merchantCode;//�̻��ű�ʶ
	private String gatewayCode;//֧������
	private String cityCode;//����
	private String acquiringBank;//�յ���
	private String refundDept;//�˿���ţ�CW������KF���ͷ�
	private String refundHandling;//�˿��ʽ :ԭ·�˻�:ylth;֪ͨ�������˿�:tzhzftk;�����������˿�:gwxxtk;��ȷ����:dqdz
	private String queryUrl;//�̻���ѯ����
	private String partnerLinkman;//�������˿���ϵ��
	private String partnerRefundEmail;//�������˿�����
	private String partnerRefundPhoneCode;//�������˿�绰
	private String description;//��ע
	private Timestamp addTime;	//����ʱ��
	private Timestamp modifyTime;	//�޸�ʱ��
	private String modifyUser;//�޸���

	private String shoukuanStatus;//�տ�ϵͳ����״̬
	private String shoukuanPayChannel;//�տ�ϵͳ֧������
	private String reportType;//����ϵͳ����
	
	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getGatewayCode() {
		return gatewayCode;
	}

	public void setGatewayCode(String gatewayCode) {
		this.gatewayCode = gatewayCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getAcquiringBank() {
		return acquiringBank;
	}

	public void setAcquiringBank(String acquiringBank) {
		this.acquiringBank = acquiringBank;
	}

	public String getRefundDept() {
		return refundDept;
	}

	public void setRefundDept(String refundDept) {
		this.refundDept = refundDept;
	}

	public String getRefundHandling() {
		return refundHandling;
	}

	public void setRefundHandling(String refundHandling) {
		this.refundHandling = refundHandling;
	}

	public String getQueryUrl() {
		return queryUrl;
	}

	public void setQueryUrl(String queryUrl) {
		this.queryUrl = queryUrl;
	}

	public String getPartnerLinkman() {
		return partnerLinkman;
	}

	public void setPartnerLinkman(String partnerLinkman) {
		this.partnerLinkman = partnerLinkman;
	}

	public String getPartnerRefundEmail() {
		return partnerRefundEmail;
	}

	public void setPartnerRefundEmail(String partnerRefundEmail) {
		this.partnerRefundEmail = partnerRefundEmail;
	}

	public String getPartnerRefundPhoneCode() {
		return partnerRefundPhoneCode;
	}

	public void setPartnerRefundPhoneCode(String partnerRefundPhoneCode) {
		this.partnerRefundPhoneCode = partnerRefundPhoneCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getShoukuanStatus() {
		return shoukuanStatus;
	}

	public void setShoukuanStatus(String shoukuanStatus) {
		this.shoukuanStatus = shoukuanStatus;
	}

	public String getShoukuanPayChannel() {
		return shoukuanPayChannel;
	}

	public void setShoukuanPayChannel(String shoukuanPayChannel) {
		this.shoukuanPayChannel = shoukuanPayChannel;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
}
