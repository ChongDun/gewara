package com.gewara.api.vo.api;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ApiUserVo extends BaseVo {

	private static final long serialVersionUID = -8764502160288937246L;
	private Long id;
	private String usertype;		//�û����ͣ�gewa,partner
	private String category;		//���ࣺticket....
	private String partnername;		//�����������
	private String briefname;		//���
	private String partnerip;		//�������IP
	private String content;			//����
	private Timestamp updatetime;	//����ʱ��
	private Long clerk;				//������
	private String status;			//��ǰ״̬����ͣʹ�á����á�����ʹ��
	private String logo;			//��˾LOGO
	private String roles;			//����Ľ�ɫ
	private String partnerpath;		//��˾Path
	private String citycode;		//���ŵĳ���
	private String defaultCity;		//Ĭ�ϳ���
	private String partnerkey;
	private String otherinfo;
	private String privatekey;
	
	@Override
	public Serializable realId() {
		return id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPartnername() {
		return partnername;
	}

	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}

	public String getBriefname() {
		return briefname;
	}

	public void setBriefname(String briefname) {
		this.briefname = briefname;
	}

	public String getPartnerip() {
		return partnerip;
	}

	public void setPartnerip(String partnerip) {
		this.partnerip = partnerip;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Long getClerk() {
		return clerk;
	}

	public void setClerk(Long clerk) {
		this.clerk = clerk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPartnerpath() {
		return partnerpath;
	}

	public void setPartnerpath(String partnerpath) {
		this.partnerpath = partnerpath;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getDefaultCity() {
		return defaultCity;
	}

	public void setDefaultCity(String defaultCity) {
		this.defaultCity = defaultCity;
	}

	public String getPartnerkey() {
		return partnerkey;
	}

	public void setPartnerkey(String partnerkey) {
		this.partnerkey = partnerkey;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public String getPrivatekey() {
		return privatekey;
	}

	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}

}
