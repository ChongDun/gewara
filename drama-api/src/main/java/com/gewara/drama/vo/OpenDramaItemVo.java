package com.gewara.drama.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.drama.constant.OdiConstant;
import com.gewara.drama.constant.Status;
import com.gewara.util.DateUtil;
import com.gewara.util.JsonUtils;

public class OpenDramaItemVo extends BaseVo {
	private static final long serialVersionUID = 7088106495818025707L;

	private Long id;
	private Long dpid;
	private Long dramaid;
	private String dramaname;
	private String name; // 场次名称
	private Long theatreid;
	private String theatrename;
	private Long roomid;
	private String roomname;
	private Timestamp playtime; // 演出时间
	private Timestamp endtime; // 演出结束时间
	private String language;
	private String status;
	private String partner; // 合作伙伴开放状态：Y对外开放,N不对外开放
	private String checkSeat; // 是否检查座位
	private Timestamp opentime;
	private Timestamp closetime;
	private Timestamp updatetime; // 更新时间
	private String opentype; // 开放类型：选座，价格，
	private String elecard;

	private Integer minpoint; // 使用积分下限
	private Integer maxpoint; // 使用积分上限
	private Integer maxbuy; // 购票限制
	private Integer msgMinute; // 短信提前发送时间(分钟)

	private Long topicid; // 取票帖子
	private String takemethod; // 取票方式
	private String takeAddress;		//取票地址
	private Integer remnantnum;		//余票提醒限制数量
	private String remnantnotice;	//余票提醒文案
	private String takemsg; // 取票描述
	private String buylimit; // 购买张数限制，1,2,3,4,5
	private String notifymsg1; // 取票短信
	private String notifymsg2; // 提前3小时提醒短信
	private String notifymsg3; // 提前一天提醒短信
	private String notifyRemark; // 取票短信(快递)
	private String qrcodeRemark; 	//取票短信(二维码电子票)
	private String remark; // 描述
	private String seatlink; // 座位图链接
	private String otherinfo;
	private String spflag;
	private String citycode;
	private String expressid; // 配送方式id
	private String ticketfaceid; // 票面信息
	private String barcode;
	private String period; // 是否固定时间
	private String seller; // 第三方类型：GEWA,GPTBS
	private String sellerseq; // 第三方场次编号
	private String print;
	private Integer sortnum; // 排序字段
	private String saleCycle; // 预售周期
	private String showtype; // 场次类型（普通，特惠）

	private Integer eticketHour; // （A,E 默认电子票时间(小时))
	private Integer eticketWeekHour; // （A,E 默认电子票时间周末(小时))
	private String prepay; // 是否预售
	private String crmflag; // 商户标识
	private String crmMsg; // crm提示文字
	private String gypMsg; // 公益票提示文字

	private Integer seatnum; // 座位数量
	private Integer asellnum; // allow 允许卖出数
	private Integer gsellnum; // Gewa卖出数
	private Integer csellnum; // 影院卖出
	private Integer locknum; // Gewa锁定数
	private Integer remainnum;

	private String greetings; // 是否支持文字票面功能(Y,N)
	private String roomnum;
	private String fieldlogo;
	private String idcard;

	@Override
	public Serializable realId() {
		return id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDpid() {
		return dpid;
	}

	public void setDpid(Long dpid) {
		this.dpid = dpid;
	}

	public Long getDramaid() {
		return dramaid;
	}

	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}

	public String getDramaname() {
		return dramaname;
	}

	public void setDramaname(String dramaname) {
		this.dramaname = dramaname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTheatreid() {
		return theatreid;
	}

	public void setTheatreid(Long theatreid) {
		this.theatreid = theatreid;
	}

	public String getTheatrename() {
		return theatrename;
	}

	public void setTheatrename(String theatrename) {
		this.theatrename = theatrename;
	}

	@Deprecated
	public Long getRoomid() {
		return roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Timestamp getPlaytime() {
		return playtime;
	}

	public void setPlaytime(Timestamp playtime) {
		this.playtime = playtime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getOpentime() {
		return opentime;
	}

	public void setOpentime(Timestamp opentime) {
		this.opentime = opentime;
	}

	public Timestamp getClosetime() {
		return closetime;
	}

	public void setClosetime(Timestamp closetime) {
		this.closetime = closetime;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public String getOpentype() {
		return opentype;
	}

	public void setOpentype(String opentype) {
		this.opentype = opentype;
	}

	public Integer getMinpoint() {
		return minpoint;
	}

	public void setMinpoint(Integer minpoint) {
		this.minpoint = minpoint;
	}

	public Integer getMaxpoint() {
		return maxpoint;
	}

	public void setMaxpoint(Integer maxpoint) {
		this.maxpoint = maxpoint;
	}

	public Integer getMaxbuy() {
		return maxbuy;
	}

	public void setMaxbuy(Integer maxbuy) {
		this.maxbuy = maxbuy;
	}

	public Integer getMsgMinute() {
		return msgMinute;
	}

	public void setMsgMinute(Integer msgMinute) {
		this.msgMinute = msgMinute;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getExpressid() {
		return expressid;
	}

	public void setExpressid(String expressid) {
		this.expressid = expressid;
	}

	public String getTicketfaceid() {
		return ticketfaceid;
	}

	public void setTicketfaceid(String ticketfaceid) {
		this.ticketfaceid = ticketfaceid;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getSellerseq() {
		return sellerseq;
	}

	public void setSellerseq(String sellerseq) {
		this.sellerseq = sellerseq;
	}

	public String getPrint() {
		return print;
	}

	public void setPrint(String print) {
		this.print = print;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getElecard() {
		return elecard;
	}

	public void setElecard(String elecard) {
		this.elecard = elecard;
	}

	public Long getTopicid() {
		return topicid;
	}

	public void setTopicid(Long topicid) {
		this.topicid = topicid;
	}

	public String getTakemethod() {
		return takemethod;
	}

	public void setTakemethod(String takemethod) {
		this.takemethod = takemethod;
	}

	public String getTakemsg() {
		return takemsg;
	}

	public void setTakemsg(String takemsg) {
		this.takemsg = takemsg;
	}

	public String getBuylimit() {
		return buylimit;
	}

	public void setBuylimit(String buylimit) {
		this.buylimit = buylimit;
	}

	public String getNotifymsg1() {
		return notifymsg1;
	}

	public void setNotifymsg1(String notifymsg1) {
		this.notifymsg1 = notifymsg1;
	}

	public String getNotifymsg2() {
		return notifymsg2;
	}

	public void setNotifymsg2(String notifymsg2) {
		this.notifymsg2 = notifymsg2;
	}

	public String getNotifymsg3() {
		return notifymsg3;
	}

	public void setNotifymsg3(String notifymsg3) {
		this.notifymsg3 = notifymsg3;
	}

	public String getNotifyRemark() {
		return notifyRemark;
	}

	public void setNotifyRemark(String notifyRemark) {
		this.notifyRemark = notifyRemark;
	}
	
	public String getQrcodeRemark() {
		return qrcodeRemark;
	}

	public void setQrcodeRemark(String qrcodeRemark) {
		this.qrcodeRemark = qrcodeRemark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSeatlink() {
		return seatlink;
	}

	public void setSeatlink(String seatlink) {
		this.seatlink = seatlink;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public String getSpflag() {
		return spflag;
	}

	public void setSpflag(String spflag) {
		this.spflag = spflag;
	}

	public Integer getSortnum() {
		return sortnum;
	}

	public void setSortnum(Integer sortnum) {
		this.sortnum = sortnum;
	}

	public String getSaleCycle() {
		return saleCycle;
	}

	public void setSaleCycle(String saleCycle) {
		this.saleCycle = saleCycle;
	}

	public String getShowtype() {
		return showtype;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public Integer getSeatnum() {
		return seatnum;
	}

	public void setSeatnum(Integer seatnum) {
		this.seatnum = seatnum;
	}

	public Integer getAsellnum() {
		return asellnum;
	}

	public void setAsellnum(Integer asellnum) {
		this.asellnum = asellnum;
	}

	public Integer getGsellnum() {
		return gsellnum;
	}

	public void setGsellnum(Integer gsellnum) {
		this.gsellnum = gsellnum;
	}

	public Integer getCsellnum() {
		return csellnum;
	}

	public void setCsellnum(Integer csellnum) {
		this.csellnum = csellnum;
	}

	public Integer getLocknum() {
		return locknum;
	}

	public void setLocknum(Integer locknum) {
		this.locknum = locknum;
	}

	public Integer getEticketHour() {
		return eticketHour;
	}

	public void setEticketHour(Integer eticketHour) {
		this.eticketHour = eticketHour;
	}

	public Integer getEticketWeekHour() {
		return eticketWeekHour;
	}

	public void setEticketWeekHour(Integer eticketWeekHour) {
		this.eticketWeekHour = eticketWeekHour;
	}

	public String getPrepay() {
		return prepay;
	}

	public void setPrepay(String prepay) {
		this.prepay = prepay;
	}

	public Integer getRemainnum() {
		return this.remainnum;
	}

	public void setRemainnum(Integer remainnum) {
		this.remainnum = remainnum;
	}

	public boolean hasPeriod(String perod) {
		if (StringUtils.isBlank(perod))
			return false;
		return StringUtils.equals(this.period, perod);
	}

	public boolean hasUnOpenToGewa() {
		return StringUtils.contains(otherinfo, OdiConstant.UNOPENGEWA);
	}

	public boolean hasUnShowToGewa() {
		return hasOnlyUnShowToGewa() || hasUnOpenToGewa();
	}

	public boolean hasUnOpenToSpecial() {
		return StringUtils.equals(otherinfo, OdiConstant.UNOPENSPECIAL);
	}

	public boolean hasOnlyUnShowToGewa() {
		return StringUtils.contains(otherinfo, OdiConstant.UNSHOWGEWA);
	}

	public boolean hasOpenToApp() {
		return StringUtils.equals(JsonUtils.getJsonValueByKey(otherinfo, OdiConstant.ODIOPTION), OdiConstant.OPENTOAPP);
	}

	public boolean hasOpenToWap() {
		return StringUtils.equals(JsonUtils.getJsonValueByKey(otherinfo, OdiConstant.ODIOPTION), OdiConstant.OPENTOWAP);
	}

	public String gainItemName() {
		if (hasPeriod(OdiConstant.STATUS_BOOK)) {
			return DateUtil.format(this.playtime, "M月d日 HH:mm");
		}
		return this.name;
	}

	public boolean hasBooking() {
		return StringUtils.equals(status, OdiConstant.STATUS_BOOK) && !hasClosed() && hasOpen() && !hasExpired();
	}

	public boolean isPartnerBooking() {
		return StringUtils.contains(status, OdiConstant.STATUS_BOOK) && !hasClosed() && hasOpen() && !hasExpired() && hasOpenPartner();
	}

	public boolean hasExpired() {
		Timestamp cur = new Timestamp(System.currentTimeMillis());
		if (playtime == null || endtime == null) {
			return true;
		}
		return playtime.before(cur) && StringUtils.equals(this.period, Status.Y) || endtime.before(cur) && StringUtils.equals(this.period, Status.N)
						|| StringUtils.equals(this.status, Status.DEL);
	}

	public boolean hasSeller(String sell) {
		if (StringUtils.isBlank(sell))
			return false;
		return StringUtils.equals(this.seller, sell);
	}

	public boolean hasOpen() {
		if (opentime == null)
			return false;
		return opentime.before(new Timestamp(System.currentTimeMillis()));
	}

	public boolean hasClosed() {
		if (closetime == null)
			return false;
		Timestamp cur = new Timestamp(System.currentTimeMillis());
		return cur.after(closetime);
	}

	public boolean hasOpenseat() {
		return OdiConstant.OPEN_TYPE_SEAT.equals(this.opentype);
	}

	public boolean hasOpenprice() {
		return OdiConstant.OPEN_TYPE_PRICE.equals(this.opentype);
	}

	public boolean hasOpenPartner() {
		return StringUtils.equals(partner, Status.Y);
	}

	public boolean hasGewa() {
		return StringUtils.equals(OdiConstant.PARTNER_GEWA, seller);
	}

	public boolean hasOpenPointPay() {
		return maxpoint != null && maxpoint > 0;
	}

	public boolean hasOpenCardPay() {
		return StringUtils.containsAny(this.elecard, "ABD");
	}

	public boolean hasDisCountPay() {
		return StringUtils.contains(this.elecard, "M");
	}

	public boolean hasDiscount() {
		return hasOpenPointPay() || hasDisCountPay() || hasOpenCardPay();
	}

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	public String getCheckSeat() {
		return checkSeat;
	}

	public void setCheckSeat(String checkSeat) {
		this.checkSeat = checkSeat;
	}

	public String getCrmflag() {
		return crmflag;
	}

	public void setCrmflag(String crmflag) {
		this.crmflag = crmflag;
	}

	public String getCrmMsg() {
		return crmMsg;
	}

	public void setCrmMsg(String crmMsg) {
		this.crmMsg = crmMsg;
	}

	public String getGypMsg() {
		return gypMsg;
	}

	public void setGypMsg(String gypMsg) {
		this.gypMsg = gypMsg;
	}

	public String getRoomnum() {
		return roomnum;
	}

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	public String getFieldlogo() {
		return fieldlogo;
	}

	public void setFieldlogo(String fieldlogo) {
		this.fieldlogo = fieldlogo;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getTakeAddress() {
		return takeAddress;
	}

	public void setTakeAddress(String takeAddress) {
		this.takeAddress = takeAddress;
	}

	public Integer getRemnantnum() {
		return remnantnum;
	}

	public void setRemnantnum(Integer remnantnum) {
		this.remnantnum = remnantnum;
	}

	public String getRemnantnotice() {
		return remnantnotice;
	}

	public void setRemnantnotice(String remnantnotice) {
		this.remnantnotice = remnantnotice;
	}

}
