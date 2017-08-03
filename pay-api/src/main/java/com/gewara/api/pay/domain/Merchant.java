package com.gewara.api.pay.domain;

import com.gewara.api.pay.ApiObject;

public class Merchant extends ApiObject{

	private static final long serialVersionUID = -7238549364422637305L;
	
	private Long id;	//����
	private Long gatewayId;	//֧������ID
	private String merchantCode;	//�̻��ű�ʶ
	private String merchantNo;	//�̻���
	private String cityCode;	//����
	private String acquiringBank;	//�յ���
	private String description;	//�̻���˵��
	private String status;	//�̻���״̬��NO_USE��δ���ã�IN_USE��ʹ���У�DESUETUDE��������
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGatewayId() {
		return gatewayId;
	}

	public void setGatewayId(Long gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}
}
