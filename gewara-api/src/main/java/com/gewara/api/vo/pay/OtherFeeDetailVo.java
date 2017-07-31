package com.gewara.api.vo.pay;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class OtherFeeDetailVo extends BaseVo{
	private static final long serialVersionUID = 2420637586145837449L;
	public static final String FEETYPE_E = "E";		//��ݷ�
	public static final String FEETYPE_U = "U";		//�ƶ�������
	public static final String FEETYPE_C = "C";		//����������������ķ���
	
	private Long id;
	private Long orderid;		//������id
	private Integer fee;		//����
	private Integer quantity;	//����
	private String feetype;		//��������
	private String reason;		//ԭ��  ��orderid+reason��Ψһ
	private String status;     //
	private String otherinfo;  //��Ӱ��Ʊ�� �������� ����
	
	public OtherFeeDetailVo(){
	}
	public OtherFeeDetailVo(Long orderid, String feetype, Integer fee, String reason){
		this(orderid, feetype, fee, reason, 1);
	}
	
	public OtherFeeDetailVo(Long orderid, String feetype, Integer fee, String reason, Integer quantity){
		this.orderid = orderid;
		this.feetype = feetype;
		this.fee = fee;
		this.reason = reason;
		this.quantity = quantity;
	}
	
	public OtherFeeDetailVo(OtherFeeDetailVo otherFeeDetail){
		this.orderid = otherFeeDetail.getOrderid();
		this.fee = otherFeeDetail.getFee();
		this.quantity = otherFeeDetail.getQuantity();
		this.feetype = otherFeeDetail.getFeetype();
		this.reason = otherFeeDetail.getReason();
	}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getFeetype() {
		return feetype;
	}
	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Integer getFee() {
		return fee;
	}
	public void setFee(Integer fee) {
		this.fee = fee;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}
}
