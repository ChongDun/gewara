package com.gewara.movie.vo.partner;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class PartnerMovieReqVo extends PartnerPageReqVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3518296887659553743L;
	private Long cinemaid;
	private Date playdate;
	private List<Long> movieIdList=null;
	private List<Map> rowList=null;
	
	public PartnerMovieReqVo(){}

	public PartnerMovieReqVo(String appkey, String citycode) {
		this.appkey = appkey;
		this.citycode = citycode;
	}

	public PartnerMovieReqVo(String appkey, String citycode, Long cinemaid, Date playdate) {
		this.appkey = appkey;
		this.citycode = citycode;
		this.cinemaid = cinemaid;
		this.playdate = playdate;
	}

	public Long getCinemaid() {
		return cinemaid;
	}

	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}

	public Date getPlaydate() {
		return playdate;
	}

	public void setPlaydate(Date playdate) {
		this.playdate = playdate;
	}

	public List<Long> getMovieIdList() {
		return movieIdList;
	}

	public void setMovieIdList(List<Long> movieIdList) {
		this.movieIdList = movieIdList;
	}

	public List<Map> getRowList() {
		return rowList;
	}

	public void setRowList(List<Map> rowList) {
		this.rowList = rowList;
	}
	
	

}
