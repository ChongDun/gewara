package com.gewara.api.vo.pay;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class RouteVo extends BaseVo {
	private static final long serialVersionUID = 4914995483381697521L;
	private String opcode;
	private String accept_address;
	private String accept_time;
	private String remark;
	
	public String getOpcode() {
		return opcode;
	}
	
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccept_address() {
		return accept_address;
	}

	public void setAccept_address(String accept_address) {
		this.accept_address = accept_address;
	}

	public String getAccept_time() {
		return accept_time;
	}

	public void setAccept_time(String accept_time) {
		this.accept_time = accept_time;
	}

	@Override
	public Serializable realId() {
		return opcode;
	}

}
