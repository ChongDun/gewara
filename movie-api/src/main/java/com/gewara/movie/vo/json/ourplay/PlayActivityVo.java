package com.gewara.movie.vo.json.ourplay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;
/**
 * 
 * ��Ƭ�
 *
 */
public class PlayActivityVo extends BaseVo{
	private static final long serialVersionUID = 2677478173649308488L;
	private String activityId; //�id ����
	private Long playMovieId; //playMovie������
	private Timestamp activityTime; //�ʱ��
	private String cinemaAddress; //ӰԺ����+ӰԺ��ַ
	private Integer limitPersonCount; //��������
	private Integer limitPonitValue; //��ƬԱ����������
	private Timestamp startTime; //���Чʱ�� ��ʼʱ��
	private Timestamp endTime; //���Чʱ�� ����ʱ��
	private Timestamp addTime;   //���ʱ��
	private Timestamp updateTime;//����ʱ��
	private Integer applyNum;//��������
	public PlayActivityVo(){}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getPlayMovieId() {
		return playMovieId;
	}
	public void setPlayMovieId(Long playMovieId) {
		this.playMovieId = playMovieId;
	}
	
	public String getCinemaAddress() {
		return cinemaAddress;
	}
	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}
	public Integer getLimitPersonCount() {
		return limitPersonCount;
	}
	public void setLimitPersonCount(Integer limitPersonCount) {
		this.limitPersonCount = limitPersonCount;
	}
	@Override
	public Serializable realId() {
		return activityId;
	}

	public Timestamp getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Timestamp activityTime) {
		this.activityTime = activityTime;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getApplyNum() {
		return applyNum;
	}

	public void setApplyNum(Integer applyNum) {
		this.applyNum = applyNum;
	}

	public Integer getLimitPonitValue() {
		return limitPonitValue;
	}

	public void setLimitPonitValue(Integer limitPonitValue) {
		this.limitPonitValue = limitPonitValue;
	}

	
}
