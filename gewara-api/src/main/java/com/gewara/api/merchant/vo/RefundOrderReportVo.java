package com.gewara.api.merchant.vo;

import java.io.Serializable;

public class RefundOrderReportVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8035836968754933075L;
	private Long cinemaid;
	private String cinemaName;
	private String citycode;
	private Long quantity;//��ƱƱ��
	private Long totalcost;//��Ʊ�ܽ��
	private Long orderCount;//��Ʊ������
	private Long totalCount;//�ܶ�����
	
	public Long getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}
	public Long getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(Long totalcost) {
		this.totalcost = totalcost;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Long getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(Long orderCount) {
		this.orderCount = orderCount;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
}
