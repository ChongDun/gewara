package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;

public class SpCodeVo extends BaseVo {

	private static final long serialVersionUID = -6167296620246800818L;
	public static final String PASSPRE = "I";	//��ǰ׺
	private Long id;
	private Integer version;	//
	private Long sdid;			//�ؼۻ
	private Long memberid;		//�û�ID	
	private String mobile;		//�ֻ�
	private Timestamp sendtime;	//����ʱ��
	private Long orderid;		//��������
	private Integer usedcount;	//ʹ�ô���
	private String temppass;
	@Override
	public Serializable realId() {
		return id;
	}

	public boolean hasBound(){//�Ѿ��󶨵�ȯ
		return this.memberid > 0 || StringUtils.length(mobile) == 11 || this.usedcount > 0;
	}
	public boolean canUseByMember(Long mid){//�Ƿ�����ռ��
		return memberid<=0 || memberid.equals(mid);
	}
	
	public Long getSdid() {
		return sdid;
	}
	public void setSdid(Long sdid) {
		this.sdid = sdid;
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
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Timestamp getSendtime() {
		return sendtime;
	}
	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
	}

	public Integer getUsedcount() {
		return usedcount;
	}

	public void setUsedcount(Integer usedcount) {
		this.usedcount = usedcount;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gainTemppass() {
		return temppass;
	}

	public void setTemppass(String temppass) {
		this.temppass = temppass;
	}
	
}
