package com.gewara.api.sms.response;

import com.gewara.api.MsgResponse;
/**
 * ���ζ��ŷ���״̬
 */
public class BatchSmsStatusResponse extends MsgResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7944063687032876841L;
	/**
	 * ���ζ��ŷ���״̬��������Json��ʽ
	 */
	private String statusInfo;

	public String getStatusInfo() {
		return statusInfo;
	}

	public void setStatusInfo(String statusInfo) {
		this.statusInfo = statusInfo;
	}
	
	public BatchSmsStatusResponse(){
		
	}
	public BatchSmsStatusResponse(String statusInfo,String code,String msg){
		super.setCode(code);
		super.setMsg(msg);
		this.statusInfo = statusInfo;
	}
	
	public BatchSmsStatusResponse getSuccessReturn(String statusInfo){
		BatchSmsStatusResponse response = new BatchSmsStatusResponse();
		response.setStatusInfo(statusInfo);
		response.setSuccess();
		return response;
	}
	
}
