package com.gewara.movie.vo.star;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class CastPictureVo extends BaseVo {
	private static final long serialVersionUID = -100677988174265653L;
	private Long id;
	private Long castid; // ����ID
	private String picname; // ͼƬ��
	private String picurl; // ͼƬ·��
	private String piccategory; // ͼƬ����
	private Timestamp addtime; // ����ʱ��
	private Timestamp updatetime; // ����ʱ��
	private Integer picwidth;
	private Integer picheight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCastid() {
		return castid;
	}

	public void setCastid(Long castid) {
		this.castid = castid;
	}

	public String getPicname() {
		return picname;
	}

	public void setPicname(String picname) {
		this.picname = picname;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

	public String getPiccategory() {
		return piccategory;
	}

	public void setPiccategory(String piccategory) {
		this.piccategory = piccategory;
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

	public Integer getPicwidth() {
		return picwidth;
	}

	public void setPicwidth(Integer picwidth) {
		this.picwidth = picwidth;
	}

	public Integer getPicheight() {
		return picheight;
	}

	public void setPicheight(Integer picheight) {
		this.picheight = picheight;
	}


}
