package com.gewara.api.pay.domain;

import com.gewara.api.pay.ApiObject;

public class Bank extends ApiObject{
	
	private static final long serialVersionUID = -1244879481213909584L;
	
	private Long id;	//����
	private Long gatewayId;	//֧������ID
	private String gwraBankCode;	//�������д���
	private String bankName;	//��������
	private String bankType;	//�������ͣ�����֧��ƽ̨���д��벻һ������֧������Ĭ��ֵΪ��DEFAULT
	
	
	public String getPayBank(){
		//if(StringUtils.isBlank(bankType) || StringUtils.equals("DEFAULT", bankType)){
		if(bankType == null || "".equals(bankType.trim()) || "DEFAULT".equals(bankType)){	
			return gwraBankCode;
		}
		return gwraBankCode + "_" + bankType;
	}
	

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

	public String getGwraBankCode() {
		return gwraBankCode;
	}

	public void setGwraBankCode(String gwraBankCode) {
		this.gwraBankCode = gwraBankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
}
