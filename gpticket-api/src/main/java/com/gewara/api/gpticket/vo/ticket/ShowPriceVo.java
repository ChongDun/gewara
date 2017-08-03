package com.gewara.api.gpticket.vo.ticket;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ShowPriceVo extends BaseVo{
	private static final long serialVersionUID = -8924784923828458573L;
	
	private String sispseq;			// areaseq + partner + priceseqno;
	private String saseqNo;			//������(ShowArea-->saseqNo)
	private String siseq;			//����ID
	private String areaseq;			//����������ID
	private String partner;			//��������ʶ
	private String pseqno;			//���������α��
	private String ticketid;		//���������μ۸���
	private Long dramaid;			//��Ŀ���
	private Integer price;			//����
	private Integer lowest;			//�������
	private Integer ticketTotal;	//Ʊ��
	private Integer ticketLimit;	//
	private Long priceid;			
	private String status;
	private String flag;				//
	private Long color;
	private String retail;
	private Integer maxBuy;
	
	private Timestamp createtime;
	private Timestamp updatetime;
	
	public ShowPriceVo(){}
	
	@Override
	public Serializable realId() {
		return sispseq;
	}
	
	public String getSispseq() {
		return sispseq;
	}
	
	public void setSispseq(String sispseq) {
		this.sispseq = sispseq;
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
	
	public String getTicketid() {
		return ticketid;
	}
	
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getLowest() {
		return lowest;
	}
	
	public void setLowest(Integer lowest) {
		this.lowest = lowest;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Long getPriceid() {
		return priceid;
	}

	public void setPriceid(Long priceid) {
		this.priceid = priceid;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}
	
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Long getDramaid() {
		return dramaid;
	}

	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}

	public Integer getTicketTotal() {
		return ticketTotal;
	}

	public void setTicketTotal(Integer ticketTotal) {
		this.ticketTotal = ticketTotal;
	}

	public Integer getTicketLimit() {
		return ticketLimit;
	}

	public void setTicketLimit(Integer ticketLimit) {
		this.ticketLimit = ticketLimit;
	}

	public String getSaseqNo() {
		return saseqNo;
	}

	public void setSaseqNo(String saseqNo) {
		this.saseqNo = saseqNo;
	}

	public Long getColor() {
		return color;
	}

	public void setColor(Long color) {
		this.color = color;
	}

	public String getRetail() {
		return retail;
	}

	public void setRetail(String retail) {
		this.retail = retail;
	}

	public Integer getMaxBuy() {
		return maxBuy;
	}

	public void setMaxBuy(Integer maxBuy) {
		this.maxBuy = maxBuy;
	}

}
