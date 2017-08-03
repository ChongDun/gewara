package com.gewara.api.gworder.vo;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.gworder.drama.vo.UserAddressReqVo;
import com.gewara.cons.OrderConstant;

public class CreateDramaOrderReq extends CreateOrderReq {
	private static final long serialVersionUID = 3742081079538472755L;
	
	public static String SOURCE_OPENAPI_PARTNER_SH = "openapi_partner_sh";
	public static String SOURCE_OPENAPI_MOBILE_SH = "openapi_mobile_sh";
	public static String SOURCE_PC_GEWA_SH = "pc_gewa_sh";
	public static String OPENTYPE_SEAT = "seat";
	public static String OPENTYPE_PRICE = "price";
	public static String OPENTYPE_AUTO = "auto";
	public static String OPENTYPE_MULTI_PRICE = "multiPrice";

	//ѡ��
	private Long areaid;				//����ID
	private Long disid;					//��ƱID
	private String seatLabel;			//��λ��Ϣ
	//�۸�
	private Long priceid;				//�۸�ID
	private Integer quantity;			//����
	private String pricelist;			//�۸���Ϣ[{}]
	
	private String openType; 			//�µ����ͣ�seatѡ����price�۸�multiPrice��۸�
	private Long partnerId; 			//������ID
	private String briefName;
	private String ukey;				//�������û�Ψһ��ʶ
	private String nickName;			//�û��ǳ�
	private String spkey; 				// �����ؼۻ
	private String origin; 				// �µ���Դ
	private String mobile; 				// �µ��ֻ���
	private String idcard; 				// ���֤
	private Integer orderPrice;      //�µ��ܼ۸�
	private boolean checkIdcard = true; // ��֤���֤��Ϣ
	private String userType;
	private Long privilegeMemberid;
	private String greetings;			//�Զ���Ʊֽ����
	private Integer percent;			//crm�Ż��ۿ����Ż�Ϊ100,����Ϊ90
	private String bindMobile;			//�û����ֻ�
	private String supperseller;		//֧�ֻ��ų��ĳ�������
	private String include;				//������������Y����/N�ų�
	
	private String takemethod;			//ȡƱ��ʽ
	private Long userAddressid;			//�û���ַ
	private UserAddressReqVo addressReq;//��ݵ�ַ���������ã�
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~from odi~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	private boolean booking = true;
	private Long dpid;
	private Long configid;				//configid�������µ���
	
	public CreateDramaOrderReq(){
		
	}
	public CreateDramaOrderReq(Long dpid, String mobile, String remoteIp, boolean booking){
		this.tag = TAG_DRAMA;
		this.relatedId = dpid;
		this.mobile = mobile;
		this.remoteIp = remoteIp;
		this.booking = booking;
		this.dpid = dpid;
	}
	
	public Long getDisid() {
		return disid;
	}
	public void setDisid(Long disid) {
		this.disid = disid;
	}
	public String getSeatLabel() {
		return seatLabel;
	}
	public void setSeatLabel(String seatLabel) {
		this.seatLabel = seatLabel;
	}
	public Long getPriceid() {
		return priceid;
	}
	public void setPriceid(Long priceid) {
		this.priceid = priceid;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getPricelist() {
		return pricelist;
	}
	public void setPricelist(String pricelist) {
		this.pricelist = pricelist;
	}
	public Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public boolean isCheckIdcard() {
		return checkIdcard;
	}
	public void setCheckIdcard(boolean checkIdcard) {
		this.checkIdcard = checkIdcard;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getOpenType() {
		return openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}
	
	public boolean hasPUsertype(){
		return StringUtils.equals(this.userType, OrderConstant.PREPAY_P);
	}
	public String getUkey() {
		return ukey;
	}
	public void setUkey(String ukey) {
		this.ukey = ukey;
	}
	public String getBriefName() {
		return briefName;
	}
	public void setBriefName(String briefName) {
		this.briefName = briefName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Long getAreaid() {
		return areaid;
	}
	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}
	public String getGreetings() {
		return greetings;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	public Integer getPercent() {
		return percent;
	}
	public void setPercent(Integer percent) {
		this.percent = percent;
	}
	public String getSupperseller() {
		return supperseller;
	}
	public void setSupperseller(String supperseller) {
		this.supperseller = supperseller;
	}
	public String getBindMobile() {
		return bindMobile;
	}
	public void setBindMobile(String bindMobile) {
		this.bindMobile = bindMobile;
	}
	public String getTakemethod() {
		return takemethod;
	}
	public void setTakemethod(String takemethod) {
		this.takemethod = takemethod;
	}
	public Long getUserAddressid() {
		return userAddressid;
	}
	public void setUserAddressid(Long userAddressid) {
		this.userAddressid = userAddressid;
	}
	public UserAddressReqVo getAddressReq() {
		return addressReq;
	}
	public void setAddressReq(UserAddressReqVo addressReq) {
		this.addressReq = addressReq;
	}
	public boolean isBooking() {
		return booking;
	}
	public void setBooking(boolean booking) {
		this.booking = booking;
	}
	public Long getDpid() {
		return dpid;
	}
	public void setDpid(Long dpid) {
		this.dpid = dpid;
	}
	public Long getConfigid() {
		return configid;
	}
	public void setConfigid(Long configid) {
		this.configid = configid;
	}
	public Long getPrivilegeMemberid() {
		return privilegeMemberid;
	}
	public void setPrivilegeMemberid(Long privilegeMemberid) {
		this.privilegeMemberid = privilegeMemberid;
	}
	public String getInclude() {
		return include;
	}
	public void setInclude(String include) {
		this.include = include;
	}
	public Integer getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Integer orderPrice) {
		this.orderPrice = orderPrice;
	}
	
}
