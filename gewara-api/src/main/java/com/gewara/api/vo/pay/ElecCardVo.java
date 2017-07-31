package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ElecCardVo extends BaseVo {

	private static final long serialVersionUID = 3978900461424543223L;
	private Long id;
	private String cardno;			//����
	private String status;			//״̬
	private ElecCardBatchVo ebatch;	//����
	private Long deluserid;			//������
	private Timestamp deltime;		//����ʱ��
	private Long possessor;			//ӵ����
	private Long gainer;			//��ȡ��
	private String mobile;			//��ȡ�ֻ���󶨱�־
	private Long orderid;			//ʹ�õĶ�����
	private Integer version;		//
	private Timestamp begintime;
	private Timestamp endtime;
	private String remark;  //������ע˵��
	private Double useAmount; //ʹ�ý��
	
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

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ElecCardBatchVo getEbatch() {
		return ebatch;
	}

	public void setEbatchVo(ElecCardBatchVo ebatch) {
		this.ebatch = ebatch;
	}

	public Long getDeluserid() {
		return deluserid;
	}

	public void setDeluserid(Long deluserid) {
		this.deluserid = deluserid;
	}

	public Timestamp getDeltime() {
		return deltime;
	}

	public void setDeltime(Timestamp deltime) {
		this.deltime = deltime;
	}

	public Long getPossessor() {
		return possessor;
	}

	public void setPossessor(Long possessor) {
		this.possessor = possessor;
	}

	public Long getGainer() {
		return gainer;
	}

	public void setGainer(Long gainer) {
		this.gainer = gainer;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Timestamp getBegintime() {
		return begintime;
	}

	public void setBegintime(Timestamp begintime) {
		this.begintime = begintime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getUseAmount() {
		return useAmount;
	}

	public void setUseAmount(Double useAmount) {
		this.useAmount = useAmount;
	}
	
}
