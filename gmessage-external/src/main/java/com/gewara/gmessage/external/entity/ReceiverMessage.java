package com.gewara.gmessage.external.entity;

/**
 * ��Ϣ���������ܲ鿴����Ϣ���ݡ�
 * @author ����
 * 
 */
public class ReceiverMessage extends MessageBaseInfo{
	private static final long serialVersionUID = 6239060865973734192L;

	/**�û���ϢID*/
	private long messageID=-1;
	
	/**��Ϣ������*/
	private MUser sender=null;
	
	/**����ʱ��*/
	private long sendTimes=-1;
	
	private Long expiryTimes=null;

	/** ��Ϣ��״̬���Ѷ���δ�� */
	private boolean read=false;

	public long getMessageID() {
		return messageID;
	}

	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}

	public MUser getSender() {
		return sender;
	}

	public void setSender(MUser sender) {
		this.sender = sender;
	}

	public long getSendTimes() {
		return sendTimes;
	}

	public void setSendTimes(long sendTimes) {
		this.sendTimes = sendTimes;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public Long getExpiryTimes() {
		return expiryTimes;
	}

	public void setExpiryTimes(Long expiryTimes) {
		this.expiryTimes = expiryTimes;
	}
	
}
