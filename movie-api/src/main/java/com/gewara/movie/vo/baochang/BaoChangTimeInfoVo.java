package com.gewara.movie.vo.baochang;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class BaoChangTimeInfoVo extends BaseVo{
	private static final long serialVersionUID = -433054918303275837L;
	
	private Long id;
	private Long roomid;//Ӱ��ID
	private String tag;
	private String startTime;//����ʱ�ο�ʼʱ�䣨HH:MM��
	private String endTime;//����ʱ�ν���ʱ�䣨HH:MM��
	
	public BaoChangTimeInfoVo(){}

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

	public Long getRoomid() {
		return roomid;
	}

	public void setRoomid(Long roomid) {
		this.roomid = roomid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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
	
}
