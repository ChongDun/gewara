package com.gewara.partner2.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

/**
 * ����
 * @author user_2
 */
public class ShareBenefitVo extends BaseVo {

	private static final long serialVersionUID = -4880540467784464050L;

	private String accountid; 		// �ʽ��
	private long partnerid; 		// ������ID
	private long amount; 			// ���[��λ����]
	private long shareMonth;		//�����·�[yyyymm]
	private String refsn;			//������ˮ
	private String type;			//��ֵ����["CHARGE"Ԥ����    "SHARE"����   "SERVICE"��������� "MAINTAIN" ά����]
	private Timestamp transactionTime; // ����ʱ��

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}

	public long getPartnerid() {
		return partnerid;
	}

	public void setPartnerid(long partnerid) {
		this.partnerid = partnerid;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getRefsn() {
		return refsn;
	}

	public void setRefsn(String refsn) {
		this.refsn = refsn;
	}

	public Timestamp getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}
	
	public long getShareMonth() {
		return shareMonth;
	}

	public void setShareMonth(long shareMonth) {
		this.shareMonth = shareMonth;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Serializable realId() {
		return null;
	}
}
