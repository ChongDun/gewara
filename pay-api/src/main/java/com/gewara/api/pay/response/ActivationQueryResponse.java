package com.gewara.api.pay.response;

import com.gewara.api.pay.ApiResponse;

public class ActivationQueryResponse extends ApiResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6544109331366876341L;
	
	public ActivationQueryResponse(){
		super();
	}
	
	/**
	 * ��ͨ״̬
	 */
	private String activateStatus;
	
	/**
	 * �ѿ�ͨʱ�����ֻ��ţ�δ��ͨʱ���ؿ�
	 */
	private String phoneNumber;
	
	private Integer transLimit;
	
	private Integer sumLimit;
	
	private String expiry;
	
	/**
	 * ����ϵͳ������
	 */
	private String cupReserved;

	public String getActivateStatus() {
		return activateStatus;
	}

	public void setActivateStatus(String activateStatus) {
		this.activateStatus = activateStatus;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getTransLimit() {
		return transLimit;
	}

	public void setTransLimit(Integer transLimit) {
		this.transLimit = transLimit;
	}

	public Integer getSumLimit() {
		return sumLimit;
	}

	public void setSumLimit(Integer sumLimit) {
		this.sumLimit = sumLimit;
	}

	public String getCupReserved() {
		return cupReserved;
	}

	public void setCupReserved(String cupReserved) {
		this.cupReserved = cupReserved;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

}
