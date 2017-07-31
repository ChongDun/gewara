package com.gewara.api.vo.api;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ApiUserBusinessVo extends BaseVo{
	private static final long serialVersionUID = 1570825734279704022L;
	private Long id;
	private String showModel;		//չ�ַ�ʽ android ios wap pc �ն˻������ӻ�
	private String coopModel;		//����ģʽ
	private String createOrder;		//�Ƿ��������
	private String moneyto;			//�տ
	private String gewaBusUser;		//��������������
	private String gewaTecUser;		//����������������
	private String partnerBusUser;	//������������ϵ��
	private String partnerTecUser;	//�����̼�����ϵ��
	private Timestamp onTime;		//��������
	private Timestamp offTime;		//��������
	private String webSite;			//���ϵ�ַ
	private String email;			//�������û�email �û����˻���Ϣ
	private String remark;
	
	/** 
	 * �˿��
	 * 0:����
	 * 1:�ͷ�
	 */
	private Integer refundDepartment;
	
	/** 
	 * �˿ʽ  
	 * 0:ԭ·�˻�
	 * 1:֪ͨ�������˿�
	 * 2:�����������˿�
	 * 3:��ȷ����
	 */
	private Integer refundWay;
	
	/** �̻���ѯ���� */
	private String queryLink;
	
	/** �������˿���ϵ�� */
	private String partnerRefundMan;
	
	/** �������˿����� */
	private String partnerRefundEmail;
	
	/** �������˿�绰 */
	private String partnerRefundMobile;
	
	/** �˿�������ע */
	private String refundRemark;
	
	/** �����̱������ */
	private String reportType;
	
	/** ��Ʊ���� (���û�/�������)*/
	private String invoiceDraw;
	
	/** ��Ʊ���߽��(ȫ��/���) */
	private String invoiceAmount;
	
	/** �������ڼ�����(��ʼʱ��-����ʱ��-����(json��ʽ))*/
	private String cycleRates;
	
	public ApiUserBusinessVo(){
		
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

	public String getShowModel() {
		return showModel;
	}

	public void setShowModel(String showModel) {
		this.showModel = showModel;
	}

	public String getCoopModel() {
		return coopModel;
	}

	public void setCoopModel(String coopModel) {
		this.coopModel = coopModel;
	}

	public String getCreateOrder() {
		return createOrder;
	}

	public void setCreateOrder(String createOrder) {
		this.createOrder = createOrder;
	}

	public String getMoneyto() {
		return moneyto;
	}

	public void setMoneyto(String moneyto) {
		this.moneyto = moneyto;
	}

	public String getGewaBusUser() {
		return gewaBusUser;
	}

	public void setGewaBusUser(String gewaBusUser) {
		this.gewaBusUser = gewaBusUser;
	}

	public String getGewaTecUser() {
		return gewaTecUser;
	}

	public void setGewaTecUser(String gewaTecUser) {
		this.gewaTecUser = gewaTecUser;
	}

	public String getPartnerBusUser() {
		return partnerBusUser;
	}

	public void setPartnerBusUser(String partnerBusUser) {
		this.partnerBusUser = partnerBusUser;
	}

	public String getPartnerTecUser() {
		return partnerTecUser;
	}

	public void setPartnerTecUser(String partnerTecUser) {
		this.partnerTecUser = partnerTecUser;
	}

	public Timestamp getOnTime() {
		return onTime;
	}

	public void setOnTime(Timestamp onTime) {
		this.onTime = onTime;
	}

	public Timestamp getOffTime() {
		return offTime;
	}

	public void setOffTime(Timestamp offTime) {
		this.offTime = offTime;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Integer getRefundDepartment() {
		return refundDepartment;
	}
	
	public void setRefundDepartment(Integer refundDepartment) {
		this.refundDepartment = refundDepartment;
	}
	
	public Integer getRefundWay() {
		return refundWay;
	}
	
	public void setRefundWay(Integer refundWay) {
		this.refundWay = refundWay;
	}
	
	public String getQueryLink() {
		return queryLink;
	}
	
	public void setQueryLink(String queryLink) {
		this.queryLink = queryLink;
	}
	
	public String getPartnerRefundMan() {
		return partnerRefundMan;
	}
	
	public void setPartnerRefundMan(String partnerRefundMan) {
		this.partnerRefundMan = partnerRefundMan;
	}
	
	public String getPartnerRefundEmail() {
		return partnerRefundEmail;
	}
	
	public void setPartnerRefundEmail(String partnerRefundEmail) {
		this.partnerRefundEmail = partnerRefundEmail;
	}
	
	public String getPartnerRefundMobile() {
		return partnerRefundMobile;
	}
	
	public void setPartnerRefundMobile(String partnerRefundMobile) {
		this.partnerRefundMobile = partnerRefundMobile;
	}
	
	public String getRefundRemark() {
		return refundRemark;
	}
	
	public void setRefundRemark(String refundRemark) {
		this.refundRemark = refundRemark;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public String getInvoiceDraw() {
		return invoiceDraw;
	}

	public void setInvoiceDraw(String invoiceDraw) {
		this.invoiceDraw = invoiceDraw;
	}

	public String getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getCycleRates() {
		return cycleRates;
	}

	public void setCycleRates(String cycleRates) {
		this.cycleRates = cycleRates;
	}
	
}
