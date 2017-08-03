package com.gewara.api.sns.vo.label;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class BigLabelVo extends BaseVo {
	private static final long serialVersionUID = -573268711254641818L;
	private Long id; // ����
	private String name; // ��ǩ����
	private String pinyin; // ��ǩƴ��
	private String remark; // ���
	private String logo; // Сͼ�꣨·����
	private String cover; // ����ͼƬ��·����
	private Integer fanscount; // ��˿����
	private Integer clickedtimes; // ��������
	private Integer commentcount; // ��������
	private Integer relatedcount; // ����������
	private String status; // ��Ч״̬ Y--��Ч��N---��Ч
	private Long memberid; // ��ӱ�ǩ�û�
	private Timestamp addTime; // ������ǩʱ��
	private Timestamp updateTime; // ������±�ǩʱ��
	private Integer attStatus = 0;//��ע״̬   0-δ��ע(Ĭ��)��1�ѹ�ע
	
	private String showRelated; // ��ʾ���� Y--��ʾ��N---����ʾ
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Integer getFanscount() {
		return fanscount;
	}

	public void setFanscount(Integer fanscount) {
		this.fanscount = fanscount;
	}

	public Integer getClickedtimes() {
		return clickedtimes;
	}

	public void setClickedtimes(Integer clickedtimes) {
		this.clickedtimes = clickedtimes;
	}

	public Integer getCommentcount() {
		return commentcount;
	}

	public void setCommentcount(Integer commentcount) {
		this.commentcount = commentcount;
	}

	public Integer getRelatedcount() {
		return relatedcount;
	}

	public void setRelatedcount(Integer relatedcount) {
		this.relatedcount = relatedcount;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Integer getAttStatus() {
		return attStatus;
	}

	public void setAttStatus(Integer attStatus) {
		this.attStatus = attStatus;
	}
	
	public String getShowRelated() {
		return showRelated;
	}

	public void setShowRelated(String showRelated) {
		this.showRelated = showRelated;
	}

}