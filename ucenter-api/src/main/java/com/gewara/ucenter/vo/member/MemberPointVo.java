package com.gewara.ucenter.vo.member;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.gewara.api.vo.BaseVo;

public class MemberPointVo extends BaseVo {
	
	private static final long serialVersionUID = 2495173855721498326L;
	private Long memberid;
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	/** �ܻ��� */
	private Integer pointvalue = 0;
	
	public Integer getPointvalue() {
		return pointvalue;
	}

	public void setPointvalue(Integer pointvalue) {
		this.pointvalue = pointvalue;
	}

	public String getPointtype() {
		return pointtype;
	}

	public void setPointtype(String pointtype) {
		this.pointtype = pointtype;
	}

	public Timestamp getPointtime() {
		return pointtime;
	}

	public void setPointtime(Timestamp pointtime) {
		this.pointtime = pointtime;
	}

	public String getPointstatus() {
		return pointstatus;
	}

	public void setPointstatus(String pointstatus) {
		this.pointstatus = pointstatus;
	}

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public String getPointinfo() {
		return pointinfo;
	}

	public void setPointinfo(String pointinfo) {
		this.pointinfo = pointinfo;
	}

	public List<MemberPointTypeVo> getPointTypeList() {
		return pointTypeList;
	}

	public void setPointTypeList(List<MemberPointTypeVo> pointTypeList) {
		this.pointTypeList = pointTypeList;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getContinunum() {
		return continunum;
	}

	public void setContinunum(Integer continunum) {
		this.continunum = continunum;
	}

	private String pointtype;
	
	private Timestamp pointtime;

	/**
	 * ״̬(fail(����δ���)/success(�������))
	 */
	private String pointstatus;

	/**
	 * ��ʾ
	 */
	private String tips;

	/**
	 * �����Ϣ
	 */
	private String pointinfo;

	/**
	 * �����ʽ����
	 */
	private List<MemberPointTypeVo> pointTypeList = new ArrayList<MemberPointTypeVo>();
	
	/** ��ȡ��ʽ */
	private String reason;
	
	/** ��ȡ��ֵ */
	private Integer point;
	
	/** ��ȡʱ��  */
	private Timestamp addtime;
	
	/** �ǳ� */
	private String nickname;
	
	/** ͷ�� */
	private String headpic;
	
	/** ��ע */
	private String remark;
	
	/** ���ֻ�ȡ����  */
	private String tag;
	
	/** ������ȡ���� */
	private Integer continunum;

	@Override
	public Serializable realId() {
		return id;
	}
}
