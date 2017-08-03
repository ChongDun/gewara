package com.gewara.movie.vo.baochang;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.util.DateUtil;

public class BaoChangOrderInfoVo extends BaseVo {
	private static final long serialVersionUID = -5463299983756719416L;
	
	private Long id;
	private Long cinemaid;//ӰԺ
	private String cinemaname;
	private Long roomid;//Ӱ��ID
	private String roomname;
	private Long movieid;//ӰƬID
	private String moviename;
	private String imgUrl;
	private Long mpid;//����ID
	private Long memberid;//ԤԼ��ID
	private String mobile;//Ԥ���ֻ���
	private String tradeNo;//������
	private Date appointmentDate;//ԤԼ����
	private String startTime;//ԤԼʱ��Σ���ʼʱ�䣩
	private String endTime;//ԤԼʱ��Σ�����ʱ�䣩
	private Date playdate;		//��ӳ����
	private String showtime;	//��ӳʱ��
	private String status;//״̬
	private String remark;//˵��
	private Timestamp createtime;//����ʱ��
	private Timestamp successtime;//�ɹ�ʱ��
	private String citycode;
	private Integer prTicketNum;
	private Integer recTicketNum;
	private String orderType;//�������ͣ�exist�����г��ζ�����appointment��ԤԼ���ζ�����
	private Timestamp validtime;		//��Чʱ��
	private Integer price;		//�ɱ���
	private Integer gewaprice;	//��������
	private Integer successPrice;//ʵ��ȷ�ϼ۸�
	private String userRemark;//������˵��
	private String username;//����������
	private String from;//�µ���Դ��orderInfo����׿��ios��IOS��
	
	public BaoChangOrderInfoVo(){}

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

	public Long getCinemaid() {
		return cinemaid;
	}

	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}

	public String getCinemaname() {
		return cinemaname;
	}

	public void setCinemaname(String cinemaname) {
		this.cinemaname = cinemaname;
	}

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

	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public Long getMpid() {
		return mpid;
	}

	public void setMpid(Long mpid) {
		this.mpid = mpid;
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

	public String getTradeNo() {
		return tradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getPlaydate() {
		return playdate;
	}

	public void setPlaydate(Date playdate) {
		this.playdate = playdate;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Integer getPrTicketNum() {
		return prTicketNum;
	}

	public void setPrTicketNum(Integer prTicketNum) {
		this.prTicketNum = prTicketNum;
	}

	public Integer getRecTicketNum() {
		return recTicketNum;
	}

	public void setRecTicketNum(Integer recTicketNum) {
		this.recTicketNum = recTicketNum;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Timestamp getValidtime() {
		return validtime;
	}

	public void setValidtime(Timestamp validtime) {
		this.validtime = validtime;
	}

	public boolean isTimeout(){
		return validtime!=null && validtime.before(new Timestamp(System.currentTimeMillis()));
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Timestamp getSuccesstime() {
		return successtime;
	}

	public void setSuccesstime(Timestamp successtime) {
		this.successtime = successtime;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getGewaprice() {
		return gewaprice;
	}

	public void setGewaprice(Integer gewaprice) {
		this.gewaprice = gewaprice;
	}

	public Integer getSuccessPrice() {
		return successPrice;
	}

	public void setSuccessPrice(Integer successPrice) {
		this.successPrice = successPrice;
	}
	
	public Timestamp getPlaytime() {
		return (playdate != null && StringUtils.isNotBlank(showtime))?DateUtil.parseTimestamp(DateUtil.formatDate(playdate) + " " + showtime + ":00"):null;
	}
	
	public String showPlaytime(){
		if(playdate == null){
			return null;
		}
		int month = DateUtil.getMonth(playdate);
		int day = DateUtil.getDay(playdate);
		return month + "��" + day + "��" + showtime;
	}

	public String getUserRemark() {
		return userRemark;
	}

	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
}
