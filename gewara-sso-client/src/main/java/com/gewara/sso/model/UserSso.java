package com.gewara.sso.model;

public class UserSso {
	private Long id;//�û�ID
	private String username;//��¼��
	private String password;//����ʹ��
	private String nickname;//�û�����
	private String accountEnabled;//����ʹ��		
	private String citycode="";//��������			
	private String mobile;//�ֻ�����				
	private String rolenames;//����ʹ��	
	private String usertype;//����ʹ��	
	private Long deptid;//����id
	private String mail;//����
	private String district;//����
	private String station;//��λ
	public UserSso() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAccountEnabled() {
		return accountEnabled;
	}
	public void setAccountEnabled(String accountEnabled) {
		this.accountEnabled = accountEnabled;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRolenames() {
		return rolenames;
	}
	public void setRolenames(String rolenames) {
		this.rolenames = rolenames;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Long getDeptid() {
		return deptid;
	}
	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	
}
