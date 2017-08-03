package com.gewara.gmessage.external.entity;

import java.io.Serializable;

import com.gewara.gmessage.external.constant.MCategory;
import com.gewara.gmessage.external.constant.MType;
import com.gewara.gmessage.external.constant.UserType;

/**
 * ������Ϣ�����߽��в�ѯʱ�Ĳ�ѯ����
 *
 */
public class ReceiverQueryParam implements Serializable{
	private static final long serialVersionUID = -841776701319728714L;
	
	private int pageNo=1;
	private int pageSize=50;//
	
	private MUser receiver=null;
	private Boolean read=false;//
	private MCategory messageCat=MCategory.INTERACT;
	private MType[] types=null;
	private Long reciveTimes=null;//
	
	
	/**
	 * @param receiver ��Ϣ������ID
	 * @param userType ��Ϣ����������
	 */
	public ReceiverQueryParam(String receiver,UserType userType){
		this.receiver=new MUser(receiver,userType);
	}
	
	/**
	 * @param receiver ��Ϣ������ID
	 * @param userType ��Ϣ����������
	 */
	public ReceiverQueryParam(MUser receiver){
		this.receiver=receiver;
	}
	
	public MUser getReceiver() {
		return receiver;
	}

	/**������*/
	public void setReceiver(MUser receiver) {
		this.receiver = receiver;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	/**ҳ�룬Ĭ�ϵ�һҳ*/
	public int getPageSize() {
		return pageSize;
	}
	
	/** ÿҳ�ļ�¼����Ĭ��50��*/
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Boolean getRead() {
		return read;
	}
	
	/**true�������Ѷ���Ϣ�� false������δ����Ϣ������Ϊnull�������С�Ĭ�Ϸ���δ����Ϣ*/
	public void setRead(Boolean read) {
		this.read = read;
	}

	public MCategory getMessageCat() {
		return messageCat;
	}
	
	/**��Ϣ���ࡣ������д��Ĭ�ϻ�����*/
	public void setMessageCat(MCategory messageCat) {
		this.messageCat = messageCat;
	}

	public MType[] getTypes() {
		return types;
	}

	public void setTypes(MType... types) {
		this.types = types;
	}

	public Long getReciveTimes() {
		return reciveTimes;
	}
	
	/**�յ���Ϣ�����ڡ�����ָ������֮�����Ϣ����ʱ��������벻Ҫ����180.������ֶ�Ϊnull����Ĭ��Ϊ�ϴβ�ѯʱ��*/
	public void setReciveTimes(Long reciveTimes) {
		this.reciveTimes = reciveTimes;
	}

}
