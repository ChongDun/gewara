package com.gewara.drama.vo.schedule;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class PrivilegeMemberVo extends BaseVo {

	private static final long serialVersionUID = 7660140476295168432L;

	private Long id;// ����
	private String mobile;// �ֻ��ţ�Ψһ��
	private String checkpass;// ��֤��
	private Timestamp starttime;// ��Чʱ�俪ʼ
	private Timestamp endtime;// ��Чʱ�����
	private String status;// ״̬ [Y,N]
	private Double discount;// �Ż�����
	private String distype;// �Ż�����
	private Timestamp addtime;// ����ʱ��
	private Timestamp updatetime;// ����ʱ��
	private Long memberid;// �û�ID
	private Timestamp bindtime;// ���û�ʱ��
	private Integer version;
	private Integer orderNum;		//�µ���������
	private Integer ticketNum;		//��Ʊ��������
	private String elecard;
	private String greetings;
	private Timestamp schedulestarttime;// �ɹ��򳡴�ʱ�俪ʼ
	private Timestamp scheduleendtime;// �ɹ��򳡴�ʱ�����

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCheckpass() {
		return checkpass;
	}

	public void setCheckpass(String checkpass) {
		this.checkpass = checkpass;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getDistype() {
		return distype;
	}

	public void setDistype(String distype) {
		this.distype = distype;
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

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public Timestamp getBindtime() {
		return bindtime;
	}

	public void setBindtime(Timestamp bindtime) {
		this.bindtime = bindtime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Integer getTicketNum() {
		return ticketNum;
	}

	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}

	public String getElecard() {
		return elecard;
	}

	public void setElecard(String elecard) {
		this.elecard = elecard;
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public Timestamp getSchedulestarttime() {
		return schedulestarttime;
	}

	public void setSchedulestarttime(Timestamp schedulestarttime) {
		this.schedulestarttime = schedulestarttime;
	}

	public Timestamp getScheduleendtime() {
		return scheduleendtime;
	}

	public void setScheduleendtime(Timestamp scheduleendtime) {
		this.scheduleendtime = scheduleendtime;
	}
}
