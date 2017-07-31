package com.gewara.api.filter;

public class DubboApiAuth {
	private String reqUri;		//����URI
	private String systemid;	//ϵͳID
	private Long userid;	//��¼�û�ID
	private String username;		//��¼�û�����
	private String sessionid;	//��¼�û�sessionid
	private String remoteIp;
	
	public DubboApiAuth(String reqUri, String systemid, Long userid, String username, String sessionid, String remoteIp){
		this.reqUri = reqUri;
		this.systemid = systemid;
		this.userid = userid;
		this.username = username;
		this.sessionid = sessionid;
		this.remoteIp = remoteIp;
	}
	
	
	public String getReqUri() {
		return reqUri;
	}
	
	public String getSystemid() {
		return systemid;
	}
	
	public Long getUserid() {
		return userid;
	}


	public String getUsername() {
		return username;
	}

	public String getSessionid() {
		return sessionid;
	}
	
	public String getRemoteIp() {
		return remoteIp;
	}
	
	
}
