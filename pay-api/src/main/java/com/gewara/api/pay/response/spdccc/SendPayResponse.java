package com.gewara.api.pay.response.spdccc;

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
	/**
	 * ����������ˮ
	 */
	private String bigOrderReqNo;

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getBigOrderReqNo() {
		return bigOrderReqNo;
	}

	public void setBigOrderReqNo(String bigOrderReqNo) {
		this.bigOrderReqNo = bigOrderReqNo;
	}
	
	
}
