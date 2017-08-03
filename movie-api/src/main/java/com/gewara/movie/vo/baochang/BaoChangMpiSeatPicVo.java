package com.gewara.movie.vo.baochang;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;
import com.gewara.movie.constant.Status;

public class BaoChangMpiSeatPicVo extends BaseVo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 470350044405929777L;

	@Override
	public Serializable realId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private String id;
	private Long mpid;
	private String seatline;//��λ�к�
	private String seatrank;//��λ�к�
	private String nickname;//����
	private String picUrl;//ͼƬurl
	private String showFlag;//�Ƿ���ʾ
	
	public BaoChangMpiSeatPicVo(){}
	
	public BaoChangMpiSeatPicVo(Long mpid, String seatline, String seatrank, String nickname, String picUrl){
		this.mpid = mpid;
		this.seatline = seatline;
		this.seatrank = seatrank;
		this.nickname = nickname;
		this.picUrl = picUrl;
		this.showFlag = Status.Y;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Long getMpid() {
		return mpid;
	}
	
	public void setMpid(Long mpid) {
		this.mpid = mpid;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPicUrl() {
		return picUrl;
	}
	
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getShowFlag() {
		return showFlag;
	}

	public void setShowFlag(String showFlag) {
		this.showFlag = showFlag;
	}
	
}
