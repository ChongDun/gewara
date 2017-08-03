package com.gewara.api.gworder.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class BaoChangData extends BaseVo {
	private static final long serialVersionUID = -7264253187060423972L;
	private Long id;
	private Long cinemaid;//ӰԺID
	private Long roomid;//Ӱ��ID
	private Integer price;		//�ɱ���
	private Integer gewaprice;	//��������
	private String citycode;//���д���

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

	public Long getRoomid() {
		return roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
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

}
