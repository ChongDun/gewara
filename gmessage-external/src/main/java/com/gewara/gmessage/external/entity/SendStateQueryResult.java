package com.gewara.gmessage.external.entity;

import java.io.Serializable;


/**
 * ��ѯ��Ϣ����״̬���
 * 
 * @author ����
 * @createDate 2015��12��4��
 */
public class SendStateQueryResult implements Serializable{
	private static final long serialVersionUID = -8509780580348754248L;
	
	private Long umid=null; //�û���ϢID
	private MUser receiver = null;//��������Ϣ
	private Long sendTime = null;// �ʹﵽ�����ߵ�ʱ��
	private Long readTime = null;// �������Ķ�ʱ��
	private Long delTimes = null;// ɾ��ʱ��

	public Long getUmid() {
		return umid;
	}

	public void setUmid(Long umid) {
		this.umid = umid;
	}

	public MUser getReceiver() {
		return receiver;
	}

	public void setReceiver(MUser receiver) {
		this.receiver = receiver;
	}

	public Long getSendTime() {
		return sendTime;
	}

	public Long getReadTime() {
		return readTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	public void setReadTime(Long readTime) {
		this.readTime = readTime;
	}

	public Long getDelTimes() {
		return delTimes;
	}

	public void setDelTimes(Long delTimes) {
		this.delTimes = delTimes;
	}
}
