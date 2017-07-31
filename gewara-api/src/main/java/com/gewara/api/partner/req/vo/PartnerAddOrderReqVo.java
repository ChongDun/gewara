package com.gewara.api.partner.req.vo;

import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;


/**
 * ��������
 */
public class PartnerAddOrderReqVo extends PartnerBaseReqVo {
	private static final long serialVersionUID = -9010424348846855963L;
	// ¥��¥�±�ʶ
	private String secid;
	// �û�ID
	private String memberEncode;
	// �������û���ʶ
	private String ukey;
	// ����ID
	private Long mpid;
	// �ֻ���
	private String mobile;
	// ��λ��Ϣ
	private String seatLable;
	// ��ƷID
	private Long goodsId;
	// ������Ʒ����
	private Integer quantity;
	// �ؼۻID
	private Long discountId;
	// ��Դ����
	private String origin;
	private String paybank;
	private String paymethod;
	private String ignoreSeatPosValid = "N";//���Թ�����֤
	private Map<String, String> otherinfoMap;

	
	public PartnerAddOrderReqVo() {
		
	}
	
	public PartnerAddOrderReqVo(String appkey, Long mpid, String mobile, String seatLabel, String secid, String ukey, String memberEncode) {
		this.appkey = appkey;
		this.mpid = mpid;
		this.mobile = mobile;
		this.seatLable = seatLabel;
		this.secid = secid;
		this.ukey = ukey;
		this.memberEncode = memberEncode;
	}
	
	public String getSecid() {
		return secid;
	}

	public void setSecid(String secid) {
		this.secid = secid;
	}

	public Long getMpid() {
		return mpid;
	}

	public void setMpid(Long mpid) {
		this.mpid = mpid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSeatLable() {
		return seatLable;
	}

	public void setSeatLable(String seatLable) {
		this.seatLable = seatLable;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPaybank() {
		return paybank;
	}

	public void setPaybank(String paybank) {
		this.paybank = paybank;
	}

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	
	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public String getUkey() {
		return ukey;
	}

	public void setUkey(String ukey) {
		this.ukey = ukey;
	}

	public String getMemberEncode() {
		return memberEncode;
	}

	public void setMemberEncode(String memberEncode) {
		this.memberEncode = memberEncode;
	}

	public Map<String, String> getOtherinfoMap() {
		return otherinfoMap;
	}

	public void setOtherinfoMap(Map<String, String> otherinfoMap) {
		this.otherinfoMap = otherinfoMap;
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
}
