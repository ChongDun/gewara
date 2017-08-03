package com.gewara.api.gworder.vo;

import org.apache.commons.lang.StringUtils;

public class CreateMovieOrderReq extends CreateOrderReq {
	private static final long serialVersionUID = 7886321040828404207L;
	
	public static String SOURCE_OPENAPI_PARTNER_SH = "openapi_partner_sh";
	public static String SOURCE_OPENAPI_MOBILE_SH = "openapi_mobile_sh";
	public static String SOURCE_PC_GEWA_SH = "pc_gewa_sh";
	public static String SOURCE_PC_PARTNER_SH = "pc_partner_sh";
	public static String SOURCE_H5_PARTNER_SH = "h5_partner_sh";
	public static String SOURCE_H5_GEWA_SH = "h5_gewa_sh";
	private String memberNickName;	//�û��ǳ�
	private String seatLabel;		//��λ��1:2,1:3
	private String secid;			//Ӱ�������
	private String mobile;			//�û���Ʊ�ֻ���
	private Long goodsid;			//��Ʒid
	private Integer quantity;		//��Ʒ����
	private String spkey;			//
	private String origin;			//
	private String paymethod;		//
	
	private Long partnerId;			//
	private String partnerBriefname;// 
	private String partnerUkey;		//�������û�Ψһ��ʶ
	
	private String ignoreSeatPosValid = "N";//���Թ�����֤
	private OrderMpiVo mpiVo;
	public CreateMovieOrderReq(){
		
	}
	public CreateMovieOrderReq(OrderMpiVo mpiVo, String mobile, String seatLabel, String remoteIp){
		this.tag = TAG_MOVIE;
		this.mpiVo = mpiVo;
		this.relatedId = mpiVo.getMpid();
		this.mobile = mobile;
		this.seatLabel = seatLabel;
		this.remoteIp = remoteIp;
	}
	public String getMemberNickName() {
		return memberNickName;
	}
	public void setMemberNickName(String memberNickName) {
		this.memberNickName = memberNickName;
	}
	public String getSeatLabel() {
		return seatLabel;
	}
	public void setSeatLabel(String seatLabel) {
		this.seatLabel = seatLabel;
	}
	public String getSecid() {
		return secid;
	}
	public void setSecid(String secid) {
		this.secid = secid;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(Long goodsid) {
		this.goodsid = goodsid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getSpkey() {
		return spkey;
	}
	public void setSpkey(String spkey) {
		this.spkey = spkey;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerBriefname() {
		return partnerBriefname;
	}
	public void setPartnerBriefname(String partnerBriefname) {
		this.partnerBriefname = partnerBriefname;
	}
	public String getPartnerUkey() {
		return partnerUkey;
	}
	public void setPartnerUkey(String partnerUkey) {
		this.partnerUkey = partnerUkey;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public String getIgnoreSeatPosValid() {
		return ignoreSeatPosValid;
	}

	public void setIgnoreSeatPosValid(String ignoreSeatPosValid) {
		this.ignoreSeatPosValid = ignoreSeatPosValid;
	}
	/**
	 * ���Թ�����֤
	 * @return
	 */
	public boolean ignoreSeatPos(){
		return StringUtils.equals("Y", ignoreSeatPosValid);
	}
	public OrderMpiVo getMpiVo() {
		return mpiVo;
	}
	public void setMpiVo(OrderMpiVo mpiVo) {
		this.mpiVo = mpiVo;
	}
}
