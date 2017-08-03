package com.gewara.api.gworder.vo;

import java.util.Date;
import java.util.Map;

public class CreateBaoChangOrderReq extends CreateOrderReq{
	private static final long serialVersionUID = 8648509662662203801L;
	private String mobile;
	private Long mpid;
	private Long partnerid;
	private Long movieid;
	private String membername;
	private Date appointmentDate;//ԤԼ����
	private String startTime;//ԤԼʱ��Σ���ʼʱ�䣩
	private String endTime;//ԤԼʱ��Σ�����ʱ�䣩
	private BaoChangData baoChangData;
	private String origin;			//������Դ
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	private Map<String, String> descMap;
	public CreateBaoChangOrderReq(){
		
	}
	public CreateBaoChangOrderReq(Long movieid, BaoChangData baoChangData, Date appointmentDate, String startTime, String endTime, Long partnerid){
		this.movieid = movieid;
		this.baoChangData = baoChangData;
		this.appointmentDate = appointmentDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.partnerid = partnerid;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public Long getPartnerid() {
		return partnerid;
	}
	public void setPartnerid(Long partnerid) {
		this.partnerid = partnerid;
	}
	public Long getMovieid() {
		return movieid;
	}
	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}
	public Map<String, String> getDescMap() {
		return descMap;
	}
	public void setDescMap(Map<String, String> descMap) {
		this.descMap = descMap;
	}
	public Long getMpid() {
		return mpid;
	}
	public void setMpid(Long mpid) {
		this.mpid = mpid;
	}
	public BaoChangData getBaoChangData() {
		return baoChangData;
	}
	public void setBaoChangData(BaoChangData baoChangData) {
		this.baoChangData = baoChangData;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}
