package com.gewara.ucenter.vo.member;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class OpenMemberVo extends BaseVo {

	private static final long serialVersionUID = 8774133904980152319L;

	private Long id;
	private Long memberid;			//�󶨵��û�
	private String loginname;		//��¼����Email��mobile��
	private String source;			//��Դ
	private String category;		//С�� ����֧��������Ϊ��ݵ�¼��Ǯ��
	private String nickname;		//�������û����ǳ�
	private String headpic;
	private String otherinfo;		//��������
	private Long relateid;			//��ǰͬ���û�ID
	private String mobile;			//����֧����������¼�û�������
	private Timestamp validtime;	//��Чʱ��
	private String unionid;
	
	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

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

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadpic() {
		return headpic;
	}

	public void setHeadpic(String headpic) {
		this.headpic = headpic;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public Long getRelateid() {
		return relateid;
	}

	public void setRelateid(Long relateid) {
		this.relateid = relateid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Timestamp getValidtime() {
		return validtime;
	}

	public void setValidtime(Timestamp validtime) {
		this.validtime = validtime;
	}
}
