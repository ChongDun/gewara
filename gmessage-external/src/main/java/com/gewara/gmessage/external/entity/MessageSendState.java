package com.gewara.gmessage.external.entity;
import java.io.Serializable;
import java.util.Map;


/**
 * ��Ϣ����״̬
 * ���ڲ�ʵ�֡�ռ��
 * @author user
 *
 */
public class MessageSendState implements Serializable{

	private static final long serialVersionUID = -2838290126478956154L;

	/**��ϢID*/
	private Long messageID=null;
	
	/**������ʾsmsÿ���û��ķ���״̬*/
	private Map<String,Boolean> sms=null;
	
	/**������ʾpushÿ���û��ķ���״̬*/
	private Map<String,Boolean> push=null;
	
	/**������ʾվ���ŵ�ÿ���û��ķ���״̬*/
	private Map<String,Boolean> website=null;

	public Long getMessageID() {
		return messageID;
	}

	public void setMessageID(Long messageID) {
		this.messageID = messageID;
	}

	public Map<String, Boolean> getSms() {
		return sms;
	}

	public void setSms(Map<String, Boolean> sms) {
		this.sms = sms;
	}

	public Map<String, Boolean> getPush() {
		return push;
	}

	public void setPush(Map<String, Boolean> push) {
		this.push = push;
	}

	public Map<String, Boolean> getWebsite() {
		return website;
	}

	public void setWebsite(Map<String, Boolean> website) {
		this.website = website;
	}
	
}
