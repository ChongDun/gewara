package com.gewara.movie.vo.baochang;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class BaoChangBasePriceInfoVo extends BaseVo{
	private static final long serialVersionUID = 2341673502898415531L;
	
	protected Long id;
	protected Long cinemaid;//ӰԺID
	protected String cinemaname;//ӰԺ����
	protected Long roomid;//Ӱ��ID
	protected String roomname;//Ӱ������
	protected String settlementNo; //������
	protected Integer price;		//�ɱ���
	protected Integer gewaprice;	//��������
	protected String citycode;//���д���
	protected Integer validFlag; //�Ƿ���Ч
	
	public BaoChangBasePriceInfoVo(){}

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

	public Long getCinemaid() {
		return cinemaid;
	}

	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}

	public String getCinemaname() {
		return cinemaname;
	}

	public void setCinemaname(String cinemaname) {
		this.cinemaname = cinemaname;
	}

	public Long getRoomid() {
		return roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getSettlementNo() {
		return settlementNo;
	}

	public void setSettlementNo(String settlementNo) {
		this.settlementNo = settlementNo;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getGewaprice() {
		return gewaprice;
	}

	public void setGewaprice(Integer gewaprice) {
		this.gewaprice = gewaprice;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

}
