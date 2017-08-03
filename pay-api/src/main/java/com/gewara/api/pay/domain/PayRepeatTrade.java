package com.gewara.api.pay.domain;

import java.sql.Timestamp;

import com.gewara.api.pay.ApiObject;

public class PayRepeatTrade extends ApiObject{
	
	private static final long serialVersionUID = 7652210940331647300L;
	
	private String id;				//ID
	private String tradeNo;			//������
	private String merTradeNo;		//������
	private String payseqno;		//������֧�����
	private String gatewayCode;		//֧�����ش���	
	private String merchantCode;	//�̻��ű�ʶ
	private Integer paidAmount;		//֧������λ����
	private Timestamp notifyTime;	//֧��ʱ��
	private String abcOtherinfo;	//ũ��POS������Ϣ�����֡����
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getMerTradeNo() {
		return merTradeNo;
	}
	public void setMerTradeNo(String merTradeNo) {
		this.merTradeNo = merTradeNo;
	}
	public String getPayseqno() {
		return payseqno;
	}
	public void setPayseqno(String payseqno) {
		this.payseqno = payseqno;
	}
	public String getGatewayCode() {
		return gatewayCode;
	}
	public void setGatewayCode(String gatewayCode) {
		this.gatewayCode = gatewayCode;
	}
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public Integer getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Timestamp getNotifyTime() {
		return notifyTime;
	}
	public void setNotifyTime(Timestamp notifyTime) {
		this.notifyTime = notifyTime;
	}
	public String getAbcOtherinfo() {
		return abcOtherinfo;
	}
	public void setAbcOtherinfo(String abcOtherinfo) {
		this.abcOtherinfo = abcOtherinfo;
	}	
}
