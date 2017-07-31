package com.gewara.api.vo.mongo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class WeixinFriendCardVo extends BaseVo{
	private static final long serialVersionUID = 5839294364342968226L;
	private String id;
	private String event;
	private String toUserName;
	private String fromUserName;
	private String friendUserName;
	private String createTime;
	private String createTimeStr;
	private String msgType;
	private String isGiveByFriend;
	private String userCardCode;
	private String outerId;
	private String del;
	// 0δʹ�ã�1��ʹ�ã�2������
	private String used;
	private String cardId;
	private String tradeNo;
	//�ÿ������Ժ��û��Ƿ��Ѿ���ȡ�˵ڶ���ȯ 0 δ��ȡ��1�ѻ�ȡ
	private String gived;
	//���Ƿ���� 0δ������1�Ѻ���
	private String consume;
	
	@Override
	public Serializable realId() {
		return id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public String getFriendUserName() {
		return friendUserName;
	}
	public void setFriendUserName(String friendUserName) {
		this.friendUserName = friendUserName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getIsGiveByFriend() {
		return isGiveByFriend;
	}
	public void setIsGiveByFriend(String isGiveByFriend) {
		this.isGiveByFriend = isGiveByFriend;
	}
	public String getUserCardCode() {
		return userCardCode;
	}
	public void setUserCardCode(String userCardCode) {
		this.userCardCode = userCardCode;
	}
	public String getOuterId() {
		return outerId;
	}
	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	public String getUsed() {
		return used;
	}
	public void setUsed(String used) {
		this.used = used;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getConsume() {
		return consume;
	}
	public void setConsume(String consume) {
		this.consume = consume;
	}
	public String getGived() {
		return gived;
	}
	public void setGived(String gived) {
		this.gived = gived;
	}

}
