package com.gewara.api.gpticket.vo.ticket;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ShowPackPriceVo extends BaseVo {
	private static final long serialVersionUID = -6403056517188327510L;
	private String packpseq;		//��Ʊ���
	private String name;			//��Ʊ����
	private String packpid;			//��������Ʊ���
	private String saseqNo;			//������(ShowArea-->saseqNo)
	private String siseq;			//����ID
	private String areaseq;			//����������ID
	private String partner;			//��������ʶ
	private String pseqno;			//���������α��
	private String sispseq;			//�۸���
	private String ticketid;		//�������۸���
	private Integer quantity;		//��Ʊ����
	private Integer price;			//�۸�
	private Timestamp starttime;	//��ʼʱ��
	private Timestamp endtime;		//����ʱ��
	private String retail;			//�Ƿ�����
	private String status;			//״̬
	private Long priceid;			//���μ۸�ID
	private Long itemPackid;		//������ƱID	
	private Integer maxBuyNumberEachOrder;//ÿ���ĵ���Ʊ�۵����Ʊ��Ŀ
	
	@Override
	public Serializable realId() {
		return packpseq;
	}

	public String getPackpseq() {
		return packpseq;
	}

	public void setPackpseq(String packpseq) {
		this.packpseq = packpseq;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackpid() {
		return packpid;
	}

	public void setPackpid(String packpid) {
		this.packpid = packpid;
	}

	public String getSaseqNo() {
		return saseqNo;
	}

	public void setSaseqNo(String saseqNo) {
		this.saseqNo = saseqNo;
	}

	public String getSiseq() {
		return siseq;
	}

	public void setSiseq(String siseq) {
		this.siseq = siseq;
	}

	public String getAreaseq() {
		return areaseq;
	}

	public void setAreaseq(String areaseq) {
		this.areaseq = areaseq;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getPseqno() {
		return pseqno;
	}

	public void setPseqno(String pseqno) {
		this.pseqno = pseqno;
	}

	public String getSispseq() {
		return sispseq;
	}

	public void setSispseq(String sispseq) {
		this.sispseq = sispseq;
	}

	public String getTicketid() {
		return ticketid;
	}

	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getRetail() {
		return retail;
	}

	public void setRetail(String retail) {
		this.retail = retail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getPriceid() {
		return priceid;
	}

	public void setPriceid(Long priceid) {
		this.priceid = priceid;
	}

	public Long getItemPackid() {
		return itemPackid;
	}

	public void setItemPackid(Long itemPackid) {
		this.itemPackid = itemPackid;
	}

	public Integer getMaxBuyNumberEachOrder() {
		return maxBuyNumberEachOrder;
	}

	public void setMaxBuyNumberEachOrder(Integer maxBuyNumberEachOrder) {
		this.maxBuyNumberEachOrder = maxBuyNumberEachOrder;
	}

}
