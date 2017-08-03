package com.gewara.api.pay.domain;

import java.util.List;

import com.gewara.api.pay.ApiObject;

public class Gateway extends ApiObject{

	private static final long serialVersionUID = -8456169610882556337L;
	
	private Long id ;
	private String gatewayCode;	//֧������
	private String gatewayName;	//֧����������
	private String supportBank;	//�Ƿ�֧������
	private String gatewayType;	//���ͣ�PLATFORM��֧��ƽ̨��BANK������ֱ����CARD����֧��
	private String status;		//״̬��NO_USE��δ���ã�IN_USE��ʹ���У�DESUETUDE��������
	private String bankTypeKey;	//��������key������ֻ������ģ�����{"C":"���ÿ�","KJ":"������ÿ�֧��"}
	private boolean supportRefund;//�Ƿ�֧���˿�
	
	private List<Merchant> merchantList;
	
	private List<Bank> bankList;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGatewayCode() {
		return gatewayCode;
	}

	public void setGatewayCode(String gatewayCode) {
		this.gatewayCode = gatewayCode;
	}

	public String getGatewayName() {
		return gatewayName;
	}

	public void setGatewayName(String gatewayName) {
		this.gatewayName = gatewayName;
	}

	public String getSupportBank() {
		return supportBank;
	}

	public void setSupportBank(String supportBank) {
		this.supportBank = supportBank;
	}

	public String getGatewayType() {
		return gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBankTypeKey() {
		return bankTypeKey;
	}

	public void setBankTypeKey(String bankTypeKey) {
		this.bankTypeKey = bankTypeKey;
	}

	public List<Merchant> getMerchantList() {
		return merchantList;
	}

	public void setMerchantList(List<Merchant> merchantList) {
		this.merchantList = merchantList;
	}

	public List<Bank> getBankList() {
		return bankList;
	}

	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}

	public boolean isSupportRefund() {
		return supportRefund;
	}

	public void setSupportRefund(boolean supportRefund) {
		this.supportRefund = supportRefund;
	}

}
