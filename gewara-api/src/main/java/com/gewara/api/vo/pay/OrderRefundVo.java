/**
 * 
 */
package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.util.DateUtil;
/**
 * �����˿�
 * @author gebiao(ge.biao@gewara.com)
 * @since Aug 20, 2012 4:43:34 PM
 */
public class OrderRefundVo extends BaseVo {
	private static final long serialVersionUID = 6029378080103301843L;
	private Long id;
	private Integer version;			//�汾
	private String tradeno;				//������
	private String ordertype;			//��������
	private Long placeid;				//����ID
	private Long memberid;				//�û�ID
	private String mobile;				//�ֻ���
	private String orderstatus;			//״̬���ͣ�paid_failure: ��������  paid_success: �ɽ����� paid_failure_unfix: ��λ������
	private String refundtype;			//�˿����ͣ�unknown, all ȫ���˿part �����˿supplement ����
	private Long partnerid;				//�����̼�
	private Timestamp expiretime;		//��������ʱ��
	
	private Integer gewaRetAmount;		//Gewara�˿�
	private Integer merRetAmount;		//�̼��˿�

	private Integer oldSettle;			//ԭ������
	private Integer newSettle;			//�½�����
	private String settletype;			//��������
	private String cardno;				//����ȯ��
	
	private String opmark;				//������ʶ����¼��Ҫ����ɵĲ���
	private String reason;				//ԭ��
	private String retback;				//�Ƿ�Ҫԭ·���أ�Y����Ҫ��N������Ҫ��O��δ֪, �μ�����(Other)��S: ���ύ����(Submit) R�������Ѿ�����(Refund)��F�����񷵻�����(Failure)
	private Long applyuser;				//������
	private String applyinfo;			//������Ϣ
	
	private String otherinfo;			//������Ϣ�������ˣ����񷵻���Ϣ
	
	
	//���㷽ʽ
	private Timestamp addtime;			//��������
	private Timestamp refundtime; 		//�˿�ʱ��
	private String status;				//״̬
	private String dealinfo;			//������Ϣ

	private String preinfo;				//Ԥ����Ҫ��
	private String cancelinfo;			//�ж�����
	
	private String origin;				//��Դ   user���û�   kf���ͷ� 
	private String reasoninfo;			//������û��˿��¼�û��˿�ԭ��	
	
	private String ticketRefund;		//��Ʊ����
	
	public OrderRefundVo(){}

	@Override
	public Serializable realId() {
		return id;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public String getTradeno() {
		return tradeno;
	}
	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getStatus() {
		return status;
	}
	public String getTicketRefund() {
		return ticketRefund;
	}

	public void setTicketRefund(String ticketRefund) {
		this.ticketRefund = ticketRefund;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOpmark() {
		return opmark;
	}
	public void setOpmark(String opmark) {
		this.opmark = opmark;
	}
	public String getRetback() {
		return retback;
	}
	public void setRetback(String retback) {
		this.retback = retback;
	}
	public Integer getGewaRetAmount() {
		return gewaRetAmount;
	}
	public void setGewaRetAmount(Integer gewaRetAmount) {
		this.gewaRetAmount = gewaRetAmount;
	}
	public Integer getMerRetAmount() {
		return merRetAmount;
	}
	public void setMerRetAmount(Integer merRetAmount) {
		this.merRetAmount = merRetAmount;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public Long getPartnerid() {
		return partnerid;
	}
	public void setPartnerid(Long partnerid) {
		this.partnerid = partnerid;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public Timestamp getRefundtime() {
		return refundtime;
	}
	public void setRefundtime(Timestamp refundtime) {
		this.refundtime = refundtime;
	}
	public Long getApplyuser() {
		return applyuser;
	}
	public void setApplyuser(Long applyuser) {
		this.applyuser = applyuser;
	}
	public String getRefundtype() {
		return refundtype;
	}
	public void setRefundtype(String refundtype) {
		this.refundtype = refundtype;
	}
	public String getApplyinfo() {
		return applyinfo;
	}
	public void setApplyinfo(String applyinfo) {
		this.applyinfo = applyinfo;
	}
	public String getDealinfo() {
		return dealinfo;
	}
	public void setDealinfo(String dealinfo) {
		this.dealinfo = dealinfo;
	}
	public Timestamp getExpiretime() {
		return expiretime;
	}
	public void setExpiretime(Timestamp expiretime) {
		this.expiretime = expiretime;
	}
	public boolean gainExpired(){//�ǹ��ڶ���
		return expiretime != null && expiretime.before(new Timestamp(System.currentTimeMillis())); 
	}
	public String getPreinfo() {
		return preinfo;
	}
	public void setPreinfo(String preinfo) {
		this.preinfo = preinfo;
	}
	public String getCancelinfo() {
		return cancelinfo;
	}
	public void setCancelinfo(String cancelinfo) {
		this.cancelinfo = cancelinfo;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getOldSettle() {
		return oldSettle;
	}
	public void setOldSettle(Integer oldSettle) {
		this.oldSettle = oldSettle;
	}
	public Integer getNewSettle() {
		return newSettle;
	}
	public void setNewSettle(Integer newSettle) {
		this.newSettle = newSettle;
	}
	public String getSettletype() {
		return settletype;
	}
	public void setSettletype(String settletype) {
		this.settletype = settletype;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	public Long getPlaceid() {
		return placeid;
	}
	public void setPlaceid(Long placeid) {
		this.placeid = placeid;
	}
	/*public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}*/
	public String getRefundStatusText(){
		if(StringUtils.equals(status, "finish") || StringUtils.equals(status, "success")){
			return "���˿�";
		}else if(StringUtils.equals(status, "reject") || StringUtils.equals(status, "user_reject")){
			return "�˿�ʧ��";
		}else{
			return "�˿����";
		}
	}	
	
	public boolean hasRefundTimeout(){
		double diffMinu = DateUtil.getDiffMinu(DateUtil.getCurFullTimestamp(), addtime);
		return diffMinu > 10;
	}
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getReasoninfo() {
		return reasoninfo;
	}

	public void setReasoninfo(String reasoninfo) {
		this.reasoninfo = reasoninfo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
	
}
