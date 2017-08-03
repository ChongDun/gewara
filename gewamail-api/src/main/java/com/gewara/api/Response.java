package com.gewara.api;

import java.io.Serializable;

public class Response implements Serializable {

	private static final long serialVersionUID = -8647520008960856935L;

	private String code;
	private String msg;

	/**
	 * ��0000������ʾ�ɹ�����9999������ʾ����
	 */
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void setCodeSuccess() {
		this.code = "0000";
	}
	
	public void setCodeSuccess(String msg) {
		setCodeSuccess();
		setMsg(msg);
	}
	
	public boolean isSuccess() {
		return code!=null?"0000".equals(code):false;
	}

	/**
	 * ��ȡ�����Ϣ
	 */
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
