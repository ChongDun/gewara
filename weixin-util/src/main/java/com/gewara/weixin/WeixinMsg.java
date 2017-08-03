package com.gewara.weixin;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

public class WeixinMsg implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7752796432896344309L;
	//������Ϣ
	private String toUserName;
	private String fromUserName;
	private String createTime;
	private String msgType;
	private String msgId;
	//�ı���Ϣ
	private String content;
	//����λ����Ϣ
	private String location_X;
	private String location_Y;
	private String latitude;
	private String longitude;
	private String scale;
	private String label;
	//ͼƬ��Ϣ
	private String picUrl;
	
	private String event;
	private String eventKey;
	
	//��Ƶ��Ϣý��id
	private String mediaId;

	// ΢�ſ����
	private String cardId;
	// ΢�ſ�ȯ��ͨ��cardid
	private String cardID;
	
	
	// ΢�ſ���
	private String friendUserName;	// ���ͷ��˺ţ�һ��OpenID��
	private String isGiveByFriend;	// �Ƿ�Ϊת����1 �����ǣ�0 �����
	private String userCardCode;	// code ���к�
	private String outerId;			// ��ȡ����ֵ��������ȡ��������ͳ��
	

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
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLocation_X() {
		return location_X;
	}
	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}
	public String getLocation_Y() {
		return location_Y;
	}
	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public boolean isText(){
		return StringUtils.equalsIgnoreCase(msgType, "text");
	}
	public boolean isLocation(){
		return StringUtils.equalsIgnoreCase(msgType, "location");
	}
	public boolean isImage(){
		return StringUtils.equalsIgnoreCase(msgType, "image");
	}
	
	public boolean isVoice(){
		return StringUtils.equalsIgnoreCase(msgType, "voice");
	}
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getFriendUserName() {
		return friendUserName;
	}
	public void setFriendUserName(String friendUserName) {
		this.friendUserName = friendUserName;
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
	public String getCardID() {
		return cardID;
	}
	public void setCardID(String cardID) {
		this.cardID = cardID;
	}
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
