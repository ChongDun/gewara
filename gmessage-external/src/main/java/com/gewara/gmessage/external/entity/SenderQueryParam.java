package com.gewara.gmessage.external.entity;

import java.io.Serializable;

import com.gewara.gmessage.external.constant.MCategory;

/**
 * ��Ϣ�����ߵĲ�ѯ����
 *
 */
public class SenderQueryParam implements Serializable {
	
	private static final long serialVersionUID = -7149461923621738247L;

	/**�����û���Ϣ*/
	private MUser sender=null;
	
	/**ҳ�룬Ĭ�ϵ�һҳ*/
	private int pageNo=1;//ҳ�룬Ĭ�ϵ�һҳ
	
	/**ÿҳ�ļ�¼����Ĭ��50*/
	private int pageSize=50;//ÿҳ�ļ�¼����Ĭ��50��
	
	private MCategory messageCat=MCategory.INTERACT;
	
	/**�������ڣ�����ָ������֮�����Ϣ����ָ����Ĭ��Ϊ�����ڵ���Ϣ*/
	private Long sendTimes=null;//
 
	public MUser getSender() {
		return sender;
	}

	public void setSender(MUser sender) {
		this.sender = sender;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getSendTimes() {
		return sendTimes;
	}

	public void setSendTimes(Long sendTimes) {
		this.sendTimes = sendTimes;
	}

	public MCategory getMessageCat() {
		return messageCat;
	}

	public void setMessageCat(MCategory messageCat) {
		this.messageCat = messageCat;
	}
}
