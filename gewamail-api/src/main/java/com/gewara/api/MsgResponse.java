package com.gewara.api;

import java.io.Serializable;

public abstract class MsgResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8647520008960856935L;
	
	private String code;

	private String msg;
	
	
	public boolean isSuccess() {
		return code != null ? "0000".equals(code) : false;
	}
	
	public void setSuccess() {
		this.code = "0000";
		this.msg = "�ɹ�";
	}
	
	public void setSuccess(String msg) {
		setSuccess();
		setMsg(msg);
	}
	
	public void setFailure() {
		this.code = "9999";
		this.msg = "ʧ��";
	}
	
	public void setFailure(String msg) {
		setFailure();
		setMsg(msg);
	}
		
	/**
	 * ��0000������ʾ�ɹ�����9999������ʾ����
	 * 
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Jan 15, 2013 11:19:31 AM
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * ��ȡ�����Ϣ
	 * 
	 * @return
	 *
	 * @author leo.li
	 * Modify Time Jan 15, 2013 11:20:54 AM
	 */
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
		
}
