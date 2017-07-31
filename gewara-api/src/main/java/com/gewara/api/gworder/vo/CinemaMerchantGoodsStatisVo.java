package com.gewara.api.gworder.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class CinemaMerchantGoodsStatisVo extends BaseVo {
	private static final long serialVersionUID = -8567796112326795892L;
	private Long cinemaid;//ӰԺID
	private String dateStr;//��ѯ�ؼ���
	private Integer totalfee;//�������
	private Integer quantity;//��Ʒ����
	private Integer orderNum;//��������
	private Long createTime;//����ʱ��
	private Long updateTime;//������ʱ��
	public CinemaMerchantGoodsStatisVo() {
		super();
	}
	@Override
	public Serializable realId() {
		return dateStr;
	}
	public Long getCinemaid() {
		return cinemaid;
	}
	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}
	public String getDateStr() {
		return dateStr;
	}
	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}
	public Integer getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(Integer totalfee) {
		this.totalfee = totalfee;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}
	
}
