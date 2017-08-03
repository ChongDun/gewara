package com.gewara.drama.vo.cmd;

import com.gewara.drama.vo.partner.req.PartnerBaseReqVo;


public class GrabRosterParamsVo extends PartnerBaseReqVo {
	private static final long serialVersionUID = -1665911655807876167L;
	private Long memberid;
	private String membername;
	private String membermobile;
	private String mobile;
	private Integer quantity;
	private Long priceid;
	private String origin;
	private String email;
	private String realName;
	private String IDCard;
	private String memberencode;

	public GrabRosterParamsVo() {
	}

	/**
	 * ��Ʊ���ɶ�������Ʊ��web�ˣ�
	 * 
	 * @param memberid
	 * @param mobile
	 * @param quantity
	 * @param priceid
	 * @param origin
	 * @param remoteIp
	 * @param email
	 *           �����ַ ��ѡ�ֶ�
	 * @param realName
	 *           ��ʵ���� ��ѡ�ֶ�
	 * @param IDCard
	 *           ���֤���� ��ѡ�ֶ�
	 */
	public GrabRosterParamsVo(Long memberid, String mobile, Integer quantity, Long priceid, String origin, String remoteIp) {
		this.memberid = memberid;
		this.mobile = mobile;
		this.quantity = quantity;
		this.priceid = priceid;
		this.origin = origin;
		this.remoteIp = remoteIp;

	}

	/**
	 * 
	 * ��Ʊ���ɶ�������Ʊ��wap�ˣ�
	 * @param appkey
	 * @param memberid
	 * @param mobile
	 * @param quantity
	 * @param priceid
	 * @param origin
	 * @param remoteIp
	 * @param email
	 *           �����ַ ��ѡ�ֶ�
	 * @param realName
	 *           ��ʵ���� ��ѡ�ֶ�
	 * @param IDCard
	 *           ���֤���� ��ѡ�ֶ�
	 */
	public GrabRosterParamsVo(String appkey, Long memberid, String mobile, Integer quantity, Long priceid, String origin, String remoteIp) {
		this(memberid, mobile, quantity, priceid, origin, remoteIp);
		this.appkey = appkey;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getPriceid() {
		return priceid;
	}

	public void setPriceid(Long priceid) {
		this.priceid = priceid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getMembermobile() {
		return membermobile;
	}

	public void setMembermobile(String membermobile) {
		this.membermobile = membermobile;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberencode() {
		return memberencode;
	}

	public void setMemberencode(String memberencode) {
		this.memberencode = memberencode;
	}

}
