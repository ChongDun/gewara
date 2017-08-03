package com.gewara.api.gpticket.vo.ticket;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class ShowSeatVo extends BaseVo {
	
	private static final long serialVersionUID = -2879362811381467253L;
	
	private Long id;
	private String siseqno;			//���α��(ShowItem-->siseq)
	private String arseqno;			//�������(ShowArea-->saseqNo)
	private String priceseq;		//�����۸���(ShowPrice-->sispseq)
	
	private Integer lineno;			//��������X
	private Integer rankno;			//��������Y
	private String seatline;		//��
	private String seatrank;		//��(��)
	private String status;			//״̬
	private String ticketid;		//�۸�ID
	private Integer price;			//�۸�
	private String loveInd;			//
	private String seatno;			//
	
	public ShowSeatVo(){}
	
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


	public String getSiseqno() {
		return siseqno;
	}


	public void setSiseqno(String siseqno) {
		this.siseqno = siseqno;
	}


	public String getArseqno() {
		return arseqno;
	}


	public void setArseqno(String arseqno) {
		this.arseqno = arseqno;
	}

	public String getPriceseq() {
		return priceseq;
	}

	public void setPriceseq(String priceseq) {
		this.priceseq = priceseq;
	}

	public Integer getLineno() {
		return lineno;
	}


	public void setLineno(Integer lineno) {
		this.lineno = lineno;
	}


	public Integer getRankno() {
		return rankno;
	}


	public void setRankno(Integer rankno) {
		this.rankno = rankno;
	}


	public String getSeatline() {
		return seatline;
	}


	public void setSeatline(String seatline) {
		this.seatline = seatline;
	}


	public String getSeatrank() {
		return seatrank;
	}


	public void setSeatrank(String seatrank) {
		this.seatrank = seatrank;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
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

	public String getLoveInd() {
		return loveInd;
	}

	public void setLoveInd(String loveInd) {
		this.loveInd = loveInd;
	}

	public String getSeatno() {
		return seatno;
	}

	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}

	public String getSeatLabel(){
		return seatline+"��"+seatrank+"��";
	}
}
