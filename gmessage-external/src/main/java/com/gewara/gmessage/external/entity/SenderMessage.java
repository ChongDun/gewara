package com.gewara.gmessage.external.entity;

import com.gewara.gmessage.external.constant.NoticeType;

public class SenderMessage extends MessageBaseInfo{
	private static final long serialVersionUID = 5203539060269685510L;
	

	/**��ϢID*/
	private long messageID=-1;
	
	/**��Ϣ������*/
	private MUser sender=null;
	
	/**����ʱ��*/
	private long sendTimes=-1;
	
	/**ʧЧʱ��,����������㡣*/
	private Long expiryTimes=null;
	
	/**��Ϣ֪ͨ����*/
	private NoticeType[] noticeType =null;

	/**
	 * ��ϢID
	 * @return
	 */
	public long getMessageID() {
		return messageID;
	}

	/**
	 * ��Ϣ��������Ϣ
	 * @return
	 */
	public MUser getSender() {
		return sender;
	}

	/**
	 * ��Ϣ����ʱ�䣬����
	 * @return
	 */
	public long getSendTimes() {
		return sendTimes;
	}

	/**
	 * ��ϢʧЧʱ��
	 * @return
	 */
	public Long getExpiryTimes() {
		return expiryTimes;
	}

	/**
	 * ��Ϣ���ѷ�ʽ
	 * @return
	 */
	public NoticeType[] getNoticeType() {
		return noticeType;
	}

	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}

	public void setSender(MUser sender) {
		this.sender = sender;
	}

	public void setSendTimes(long sendTimes) {
		this.sendTimes = sendTimes;
	}

	public void setExpiryTimes(Long expiryTimes) {
		this.expiryTimes = expiryTimes;
	}

	public void setNoticeType(NoticeType[] noticeType) {
		this.noticeType = noticeType;
	}

	
}
