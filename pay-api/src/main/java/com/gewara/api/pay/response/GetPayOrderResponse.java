package com.gewara.api.pay.response;

import java.sql.Timestamp;

import com.gewara.api.pay.ApiResponse;

public class GetPayOrderResponse extends ApiResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -238185555140104352L;
	
	private String tradeno;	
	
	//֧�����
	private String status;			//֧��״̬
	private Timestamp paidtime;		//֧��ʱ��
	private Integer paidAmount;		//֧������λ����
	private String payseqno;		//������֧�����
	
	//֪ͨ���
	private String notifyStatus;	//֧��֪ͨ״̬
	private Timestamp lastNotify;	//���֪ͨ״̬
	private Integer notifyTimes;	//֪ͨ����
	
	private String gatewayCode;//֧�����ش���	
	private String merchantCode;//�̻��ű�ʶ
	private String tradeNoSuffix;//�����ź�׺��ĳЩ֧��ƽ̨Ҫ���̻������Ų����ظ��ύ�������������4λ���ڶ����ź��洫�����У�ÿ�����ɶ�׷��������ֶ�
	
	public String getTradeno() {
		return tradeno;
	}
	public void setTradeno(String tradeno) {
		this.tradeno = tradeno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getPaidtime() {
		return paidtime;
	}
	public void setPaidtime(Timestamp paidtime) {
		this.paidtime = paidtime;
	}
	public Integer getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Integer paidAmount) {
		this.paidAmount = paidAmount;
	}
	public String getPayseqno() {
		return payseqno;
	}
	public void setPayseqno(String payseqno) {
		this.payseqno = payseqno;
	}
	public String getNotifyStatus() {
		return notifyStatus;
	}
	public void setNotifyStatus(String notifyStatus) {
		this.notifyStatus = notifyStatus;
	}
	public Timestamp getLastNotify() {
		return lastNotify;
	}
	public void setLastNotify(Timestamp lastNotify) {
		this.lastNotify = lastNotify;
	}
	public Integer getNotifyTimes() {
		return notifyTimes;
	}
	public void setNotifyTimes(Integer notifyTimes) {
		this.notifyTimes = notifyTimes;
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
	public String getTradeNoSuffix() {
		return tradeNoSuffix;
	}
	public void setTradeNoSuffix(String tradeNoSuffix) {
		this.tradeNoSuffix = tradeNoSuffix;
	}

}
