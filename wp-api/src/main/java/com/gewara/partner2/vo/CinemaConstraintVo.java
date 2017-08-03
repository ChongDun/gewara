package com.gewara.partner2.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class CinemaConstraintVo extends BaseVo {

	private static final long serialVersionUID = 1138307994529929676L;

	private long id; // ����
	private String patnerkey; // ������key
	private String provincename; // ʡ��
	private String citycode; // ������
	private String hidetype; // �������� 1ӰԺ2 �۸�����3 ʱ������
	private String cckey; // ΨһԼ��
	private String hideconstraint; // ��������
	private Timestamp addtime; // ���ʱ��
	private Timestamp updatetime; // �޸�ʱ��

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatnerkey() {
		return patnerkey;
	}

	public void setPatnerkey(String patnerkey) {
		this.patnerkey = patnerkey;
	}

	public String getProvincename() {
		return provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getHidetype() {
		return hidetype;
	}

	public void setHidetype(String hidetype) {
		this.hidetype = hidetype;
	}

	public String getCckey() {
		return cckey;
	}

	public void setCckey(String cckey) {
		this.cckey = cckey;
	}

	public String getHideconstraint() {
		return hideconstraint;
	}

	public void setHideconstraint(String hideconstraint) {
		this.hideconstraint = hideconstraint;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public Timestamp getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public Serializable realId() {
		return id;
	}

}
