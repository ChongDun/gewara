package com.gewara.ucenter.vo.member;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class MemberMergerHisVo extends BaseVo{
	private static final long serialVersionUID = 8946272152683008335L;
	private Long id;
	private Long memberId;//�ϲ��˻�ID
	private String memberPhone;//�ϲ��˻��ֻ�
	private Long mergerMemberId;//���ϲ��˻�ID
	private String mergerMemberNickName;//���ϲ��˻����ǳ�
	private Long operationUserId;//������ID
	private Timestamp addtime;//����ʱ��
	private Timestamp updatetime;//����ʱ��
	private String otherInfo;//������Ϣ
	private String status;//״̬��Y:��N��δ�󶨳ɹ�A�������
	private String remark;//��ע
	private Long bindStep;//1��ͬ���û������ɹ�2��ͬ���û����Żݻ�ɹ�3��ͬ���û����Ż�ȯ�ɹ�4��ͬ������ϲ���ɹ�5��ͬ��ȥ���ɹ�
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public Long getMergerMemberId() {
		return mergerMemberId;
	}
	public void setMergerMemberId(Long mergerMemberId) {
		this.mergerMemberId = mergerMemberId;
	}
	public String getMergerMemberNickName() {
		return mergerMemberNickName;
	}
	public void setMergerMemberNickName(String mergerMemberNickName) {
		this.mergerMemberNickName = mergerMemberNickName;
	}
	public Long getOperationUserId() {
		return operationUserId;
	}
	public void setOperationUserId(Long operationUserId) {
		this.operationUserId = operationUserId;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Long getBindStep() {
		return bindStep;
	}
	public void setBindStep(Long bindStep) {
		this.bindStep = bindStep;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	
}
