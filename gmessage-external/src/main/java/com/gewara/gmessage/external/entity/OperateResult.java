package com.gewara.gmessage.external.entity;

import java.io.Serializable;

/**
 * ���������
 * @author ����
 * @createDate 2015��3��6��
 */
public class OperateResult implements Serializable{
	private static final long serialVersionUID = -4280148580555226376L;

	/*�����Ƿ�ɹ�*/
	private boolean success=true;//�Ƿ�ɹ�

	/**����ʧ�ܴ���*/
	private String failCode=null;//ʧ�ܴ��룻
	/**����ʧ��ԭ������*/
	private String failMessage=null;//ʧ��ԭ��������
	
	public OperateResult(boolean success){
		this.success=success;
	}
	
	public OperateResult(boolean success,String failCode){
		this.success=success;
		this.failCode=failCode;
	}	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getFailCode() {
		return failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}
	public String getFailMessage() {
		return failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}
}
