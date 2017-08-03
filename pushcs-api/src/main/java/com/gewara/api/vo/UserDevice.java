package com.gewara.api.vo;

import java.io.Serializable;

public class UserDevice implements Serializable{
	private static final long serialVersionUID = -2486453578172419891L;
	
	private Long userId;		//�û�id
	private String deviceId;	//���ͱ�ʶ
	@Deprecated
	private String appToken;	//Ӧ��token
	private String deviceTag; 	//�豸��ǣ�android��ios
	private String appName;		//Ӧ������
	private String appVersion;	//Ӧ�ð汾
	private String acceptPush;	//Ӧ���Ƿ����push��Ϣ
	private String cityCode; //���б���
	private String cityName; //��������
	private String pointx;
	private String pointy;
	private String uuid; //�豸Ψһ��ʶ
	/**
	 * 
	 * @param uuid�豸Ψһ��ʶ
	 * @param userId �û�id
	 * @param deviceId  ���ͱ�ʶ
	 * @param deviceTag �豸��ǣ�android��ios
	 * @param appName Ӧ������
	 * @param appVersion Ӧ�ð汾
	 * @param acceptPush Ӧ���Ƿ����push��Ϣ
	 * @param cityCode ���б���
	 * @param cityName ��������
	 * @param pointx
	 * @param pointy
	 */
	public UserDevice(String uuid,Long userId,String deviceId,String deviceTag,String appName,String appVersion,String acceptPush,String cityCode,String cityName,String pointx,String pointy) {
		this.uuid=uuid;
		this.userId=userId;
		this.deviceId=deviceId;
		this.deviceTag=deviceTag;
		this.appName=appName;
		this.appVersion=appVersion;
		this.acceptPush=acceptPush;
		this.cityCode=cityCode;
		this.cityName=cityName;
		this.pointx=pointx;
		this.pointy=pointy;
	}
	
	/**
	 * 
	 * @param userId �û�id
	 * @param deviceId �豸id
	 * @param appToken Ӧ��token
	 * @param deviceTag �豸��ǣ�android��ios
	 * @param appName Ӧ������
	 * @param appVersion Ӧ�ð汾
	 * @param acceptPush Ӧ���Ƿ����push��Ϣ
	 * @param cityCode �û����б���  �û�ʹ���豸���ڵĳ���
	 * @param cityName
	 * @param pointx
	 * @param pointy
	 */
	@Deprecated
	public UserDevice(Long userId, String deviceId, String appToken, String deviceTag, 
			String appName, String appVersion, String acceptPush,String cityCode,String cityName,String pointx,String pointy){
		this.userId = userId;
		this.deviceId = deviceId;
		this.appToken = appToken;
		this.deviceTag = deviceTag;
		this.appName = appName;
		this.appVersion = appVersion;
		this.acceptPush = acceptPush;
		this.cityCode=cityCode;	
		this.cityName=cityName;
		this.pointx=pointx;
		this.pointy=pointy;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	@Deprecated
	public String getAppToken() {
		return appToken;
	}
	@Deprecated
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getDeviceTag() {
		return deviceTag;
	}

	public void setDeviceTag(String deviceTag) {
		this.deviceTag = deviceTag;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAcceptPush() {
		return acceptPush;
	}

	public void setAcceptPush(String acceptPush) {
		this.acceptPush = acceptPush;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPointx() {
		return pointx;
	}
	public void setPointx(String pointx) {
		this.pointx = pointx;
	}
	public String getPointy() {
		return pointy;
	}
	public void setPointy(String pointy) {
		this.pointy = pointy;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}
