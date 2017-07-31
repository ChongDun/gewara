package com.gewara.api.vo.partner;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class FanliMemberVo extends BaseVo {
	private static final long serialVersionUID = -7934071223394226183L;
	private Long _id;
	private String uid ;//��������Ա���
	private String channel_id;//��������
	private String tracking_code;//Ч��׷��ʶ����
	private String username;//���ϵ�½���û���
	private String usersafekey;//���ϵ�¼��֤��
	private String email;//�û�email
	private String show_name;//�û��ǳ�
	private String province;//ʡ
	private String city;//��
	private String area;//��
	private String zip;//�ʱ�
	private String phone;//�绰
	private String mobile;//�ֻ�
	private String name;
	private String address;
	private Long createTime;//����ʱ��
	private Long updateTIme;//������ʱ��
	
	public FanliMemberVo() {
		super();
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(String channel_id) {
		this.channel_id = channel_id;
	}
	public String getTracking_code() {
		return tracking_code;
	}
	public void setTracking_code(String tracking_code) {
		this.tracking_code = tracking_code;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsersafekey() {
		return usersafekey;
	}
	public void setUsersafekey(String usersafekey) {
		this.usersafekey = usersafekey;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getShow_name() {
		return show_name;
	}
	public void setShow_name(String show_name) {
		this.show_name = show_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateTIme() {
		return updateTIme;
	}
	public void setUpdateTIme(Long updateTime) {
		this.updateTIme = updateTime;
	}
	public Object get_id() {
		return _id;
	}
	public void set_id(Long _id) {
		this._id = _id;
	}
	@Override
	public Serializable realId() {
		return this._id;
	}
	
}
