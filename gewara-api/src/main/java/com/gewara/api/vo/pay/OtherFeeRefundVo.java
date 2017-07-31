package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class OtherFeeRefundVo extends BaseVo {
	private static final long serialVersionUID = 7420087805465434371L;

	private Long id;
	private Integer version;			//�汾
	private String tradeno;				//������
	private String ordertype;			//��������
	private Long memberid;				//�û�ID
	private Long partnerid;				//������ID
	private String mobile;				//�ֻ���
	private String orderstatus;			//״̬���ͣ�paid_failure: ��������  paid_success: �ɽ����� paid_failure_unfix: ��λ������
	private String origin;				//��Դ����������
	private String reason;				//ԭ��
	private Integer gewaRetAmount;		//Gewara�˿�
	private Integer oldFeeAmount;		//
	private String retback;				//�Ƿ�Ҫԭ·���أ�Y����Ҫ��N������Ҫ��O��δ֪, �μ�����(Other)��S: ���ύ����(Submit) R�������Ѿ�����(Refund)��F�����񷵻�����(Failure)
	private Long applyuser;				//������
	private String applyinfo;			//������Ϣ
	private String otherinfo;			//������Ϣ�������ˣ����񷵻���Ϣ
	private Timestamp addtime;			//��������
	private Timestamp refundtime; 		//�˿�ʱ��
	private String status;				//״̬
	private Long dealuser;				//������
	private String dealinfo;			//������Ϣ
	private Long batch;					//���α�ʶ

	public OtherFeeRefundVo(){}
	
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getTradeno() {
		return tradeno;
	}

	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}

	public String getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}

	public Long getPartnerid() {
		return partnerid;
	}
	
	public void setPartnerid(Long partnerid) {
		this.partnerid = partnerid;
	}
	
	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getOldFeeAmount() {
		return oldFeeAmount;
	}
	
	public void setOldFeeAmount(Integer oldFeeAmount) {
		this.oldFeeAmount = oldFeeAmount;
	}
	public String getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getGewaRetAmount() {
		return gewaRetAmount;
	}

	public void setGewaRetAmount(Integer gewaRetAmount) {
		this.gewaRetAmount = gewaRetAmount;
	}

	public String getRetback() {
		return retback;
	}

	public void setRetback(String retback) {
		this.retback = retback;
	}

	public Long getApplyuser() {
		return applyuser;
	}

	public void setApplyuser(Long applyuser) {
		this.applyuser = applyuser;
	}

	public String getApplyinfo() {
		return applyinfo;
	}

	public void setApplyinfo(String applyinfo) {
		this.applyinfo = applyinfo;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Timestamp getRefundtime() {
		return refundtime;
	}

	public void setRefundtime(Timestamp refundtime) {
		this.refundtime = refundtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getDealuser() {
		return dealuser;
	}
	public void setDealuser(Long dealuser) {
		this.dealuser = dealuser;
	}
	public String getDealinfo() {
		return dealinfo;
	}

	public void setDealinfo(String dealinfo) {
		this.dealinfo = dealinfo;
	}
	
	public Long getBatch() {
		return batch;
	}
	
	public void setBatch(Long batch) {
		this.batch = batch;
	}

}
