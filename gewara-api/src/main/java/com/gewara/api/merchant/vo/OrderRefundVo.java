package com.gewara.api.merchant.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class OrderRefundVo extends BaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2778346477632735962L;
	private String tradeNo; //������
	private Long movieId; //ӰƬid
	private Timestamp playTime;  //��ӳʱ��
	private String cinemaName;
	private Integer unitprice;		//����
	private Integer quantity;			//����
	private Integer totalfee;			//�����ܽ��
	private Integer orderCost;//������
	private Long cinemaId;   //ӰԺid
	private String otherInfo;  //Ӱ������Ϣ
	private Long memberId; //�û�id
	private String nickName;   //�û��ǳ�
	private String mobile;    //�û��ֻ���
	private Timestamp addtime;			//��������
	private Timestamp refundtime; 		//�˿�ʱ�䡿
	private String reason;				//ԭ��
	private String applyinfo;			//��ע��Ϣ
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public Timestamp getPlayTime() {
		return playTime;
	}
	public void setPlayTime(Timestamp playTime) {
		this.playTime = playTime;
	}
	public String getCinemaName() {
		return cinemaName;
	}
	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}
	public Integer getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(Integer unitprice) {
		this.unitprice = unitprice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(Integer totalfee) {
		this.totalfee = totalfee;
	}
	public Long getCinemaId() {
		return cinemaId;
	}
	public void setCinemaId(Long cinemaId) {
		this.cinemaId = cinemaId;
	}
	public String getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Timestamp getRefundtime() {
		return refundtime;
	}
	public void setRefundtime(Timestamp refundtime) {
		this.refundtime = refundtime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getApplyinfo() {
		return applyinfo;
	}
	public void setApplyinfo(String applyinfo) {
		this.applyinfo = applyinfo;
	}
	@Override
	public Serializable realId() {
		return tradeNo;
	}
	public Integer getOrderCost() {
		return orderCost;
	}
	public void setOrderCost(Integer orderCost) {
		this.orderCost = orderCost;
	}
}
