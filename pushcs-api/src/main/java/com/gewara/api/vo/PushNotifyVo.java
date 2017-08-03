package com.gewara.api.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class PushNotifyVo implements Serializable {

	private static final long serialVersionUID = -4913145637989111850L;
	private String product;
	private String title;
	private String msgType;
	private String content;
	private String links;
	private String relatedId;
	private Timestamp sentTime;
	private Long userId;
	private Integer validTime;
	private String msgKey;
	private String version;
	private String appVersion;

	/**
	 * ��Ϣ�汾Ĭ��Ϊ1.0
	 * {@link #PushNotifyVo(Long, String, String, String, String, String, String, Timestamp, Integer, String, String)}
	 * @param userId
	 * @param msgType ��Ϣ����T1,T2...
	 * @param product cinema,sport
	 * @param title	����Ϊ�գ�Ŀǰ��ʹ��
	 * @param content
	 * @param links
	 * @param relatedId
	 * @param sentTime ������ʱ��
	 * @param validTime ��Чʱ������λ��
	 */
	public PushNotifyVo(Long userId, String msgType, String product,
			String title, String content, String links, String relatedId,
			Timestamp sentTime, Integer validTime, String msgKey) {
		this.userId = userId;
		this.msgType = msgType;
		this.product = product;
		this.title = title;
		this.content = content;
		this.links = links;
		this.relatedId = relatedId;
		this.sentTime = sentTime;
		this.validTime = validTime;
		this.msgKey = msgKey;
		this.version = "1.0";
	}

	/**
	 * {@link #PushNotifyVo(Long, String, String, String, String, String, String, Timestamp, Integer, String)}
	 * @param userId
	 * @param msgType ��Ϣ����T1,T2...
	 * @param product cinema,sport
	 * @param title	����Ϊ�գ�Ŀǰ��ʹ��
	 * @param content
	 * @param links
	 * @param relatedId
	 * @param sentTime ������ʱ��
	 * @param validTime ��Чʱ������λ��
	 * @param version �汾
	 */
	public PushNotifyVo(Long userId, String msgType, String product,
			String title, String content, String links, String relatedId,
			Timestamp sentTime, Integer validTime, String msgKey, String version) {
		this.userId = userId;
		this.msgType = msgType;
		this.product = product;
		this.title = title;
		this.content = content;
		this.links = links;
		this.relatedId = relatedId;
		this.sentTime = sentTime;
		this.validTime = validTime;
		this.msgKey = msgKey;
		this.version = version;
	}
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public String getRelatedId() {
		return relatedId;
	}

	public void setRelatedId(String relatedId) {
		this.relatedId = relatedId;
	}

	public Timestamp getSentTime() {
		return sentTime;
	}

	public void setSentTime(Timestamp sentTime) {
		this.sentTime = sentTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getValidTime() {
		return validTime;
	}

	public void setValidTime(Integer validTime) {
		this.validTime = validTime;
	}

	public String getMsgKey() {
		return msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
