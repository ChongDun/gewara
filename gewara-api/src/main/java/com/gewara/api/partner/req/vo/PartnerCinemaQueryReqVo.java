package com.gewara.api.partner.req.vo;

import java.util.Date;

/**
 * ӰԺ��ѯ
 * 
 */
public class PartnerCinemaQueryReqVo extends PartnerPageReqVo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6903767757594858880L;
	//
	private String quyuType;
	// ӰԺ����
	private String serviceType;
	// ��ӰID
	private Long movieId;
	// �ؼۻID
	private Long discountId;
	// ����code
	private String countycode;
	// �����ֶ�
	private String orderField;
	// ����ID
	private Long subwayId;
	// ��ȦID
	private String indexareacode;
	// ��������
	private Date playDate;
	// pointx
	private Double pointx;
	// pointy
	private Double pointy;
	
	private Long memberid;

	public String getQuyuType() {
		return quyuType;
	}

	public void setQuyuType(String quyuType) {
		this.quyuType = quyuType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getCountycode() {
		return countycode;
	}

	public void setCountycode(String countycode) {
		this.countycode = countycode;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public Long getSubwayId() {
		return subwayId;
	}

	public void setSubwayId(Long subwayId) {
		this.subwayId = subwayId;
	}

	public String getIndexareacode() {
		return indexareacode;
	}

	public void setIndexareacode(String indexareacode) {
		this.indexareacode = indexareacode;
	}

	public Date getPlayDate() {
		return playDate;
	}

	public void setPlayDate(Date playDate) {
		this.playDate = playDate;
	}

	public Double getPointx() {
		return pointx;
	}

	public void setPointx(Double pointx) {
		this.pointx = pointx;
	}

	public Double getPointy() {
		return pointy;
	}

	public void setPointy(Double pointy) {
		this.pointy = pointy;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	
	
}
