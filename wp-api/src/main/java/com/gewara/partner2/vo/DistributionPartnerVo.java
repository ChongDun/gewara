package com.gewara.partner2.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

/**
 * ����ϵͳ-������
 * 
 * @author chunhui.wang
 *
 */
public class DistributionPartnerVo extends BaseVo {
	private static final long serialVersionUID = -2992423661776140813L;

	private long id; // ����
	private long sellerid; // ���۾�����
	private long partnerid; // ������ID
	private String partnername; // ����������
	private String partnerkey; // ������key
	private String partnertype;//����������
	private String groupid; // ����
	private Timestamp contractstarttime; // ��ͬ��ʼʱ��
	private Timestamp contractendtime; // ��ͬ����ʱ��
	private long annualquota; // �걣���
	private String businessmobile; // �̼ҶԽ����ֻ�
	private String businessname; // �̼ҶԽ�����
	private String sellermobile; // ���۾����ֻ�
	private String sellername; // ���۾���
	private long technologyfee; // ���������
	private long maintainfee; // ά����
	private String runsub; // ����
	private String advanceCharge;//Ԥ������
	private String status; // ״̬ 0 ��Ч 1Ԥ�� 2���� 3ɾ��
	private String accountid;// �ʽ��˻�
	private String taxatfee; //˰��
	private String cooperatstatus;//����״̬
	private String iscinemamanage;//�Ƿ������ι���
	private Timestamp addtime; // ���ʱ��
	private Timestamp updatetime; // ����ʱ��

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSellerid() {
		return sellerid;
	}

	public void setSellerid(long sellerid) {
		this.sellerid = sellerid;
	}

	public long getPartnerid() {
		return partnerid;
	}

	public void setPartnerid(long partnerid) {
		this.partnerid = partnerid;
	}

	public String getPartnername() {
		return partnername;
	}

	public void setPartnername(String partnername) {
		this.partnername = partnername;
	}

	public String getPartnerkey() {
		return partnerkey;
	}

	public void setPartnerkey(String partnerkey) {
		this.partnerkey = partnerkey;
	}

	public String getPartnertype() {
		return partnertype;
	}

	public void setPartnertype(String partnertype) {
		this.partnertype = partnertype;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public Timestamp getContractstarttime() {
		return contractstarttime;
	}

	public void setContractstarttime(Timestamp contractstarttime) {
		this.contractstarttime = contractstarttime;
	}

	public Timestamp getContractendtime() {
		return contractendtime;
	}

	public void setContractendtime(Timestamp contractendtime) {
		this.contractendtime = contractendtime;
	}

	public long getAnnualquota() {
		return annualquota;
	}

	public void setAnnualquota(long annualquota) {
		this.annualquota = annualquota;
	}

	public String getBusinessmobile() {
		return businessmobile;
	}

	public void setBusinessmobile(String businessmobile) {
		this.businessmobile = businessmobile;
	}

	public String getBusinessname() {
		return businessname;
	}

	public void setBusinessname(String businessname) {
		this.businessname = businessname;
	}

	public String getSellermobile() {
		return sellermobile;
	}

	public void setSellermobile(String sellermobile) {
		this.sellermobile = sellermobile;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public long getTechnologyfee() {
		return technologyfee;
	}

	public void setTechnologyfee(long technologyfee) {
		this.technologyfee = technologyfee;
	}

	public long getMaintainfee() {
		return maintainfee;
	}

	public void setMaintainfee(long maintainfee) {
		this.maintainfee = maintainfee;
	}

	public String getRunsub() {
		return runsub;
	}

	public void setRunsub(String runsub) {
		this.runsub = runsub;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAccountid() {
		return accountid;
	}

	public void setAccountid(String accountid) {
		this.accountid = accountid;
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
	
	public String getAdvanceCharge() {
		return advanceCharge;
	}

	public void setAdvanceCharge(String advanceCharge) {
		this.advanceCharge = advanceCharge;
	}
	
	public String getTaxatfee() {
		return taxatfee;
	}

	public void setTaxatfee(String taxatfee) {
		this.taxatfee = taxatfee;
	}
	
	public String getCooperatstatus() {
		return cooperatstatus;
	}

	public void setCooperatstatus(String cooperatstatus) {
		this.cooperatstatus = cooperatstatus;
	}
	
	public String getIscinemamanage() {
		return iscinemamanage;
	}

	public void setIscinemamanage(String iscinemamanage) {
		this.iscinemamanage = iscinemamanage;
	}

	@Override
	public Serializable realId() {
		return id;
	}
}
