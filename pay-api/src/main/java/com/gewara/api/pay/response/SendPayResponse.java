package com.gewara.api.pay.response;

import com.gewara.api.pay.ApiResponse;

public class SendPayResponse extends ApiResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4471112511786362286L;

	public SendPayResponse(){
		super();
	}
	
	/**
	 * �����ţ�֧������ɹ����ظú�
	 */
	private String tradeNo;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
}
