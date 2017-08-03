package com.gewara.movie.vo.brand;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

/**
 * Ʒ��--�̻�
 */
public class BrandVo extends BaseVo{

	private static final long serialVersionUID = 7873532222364050961L;
	
	private Long id;
	private String brandname;	//Ʒ������
	private String logourl;		//logo
	private Byte status;		//״̬
	private Integer brandtype;	//Ʒ������
	private Timestamp addtime;
	private Timestamp updatetime;
	private String brandcolor;	//ɫֵ
	
	public String getBrandcolor() {
		return brandcolor;
	}

	public void setBrandcolor(String brandcolor) {
		this.brandcolor = brandcolor;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
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
		return this.id;
	}
	public Integer getBrandtype() {
		return brandtype;
	}
	public void setBrandtype(Integer brandtype) {
		this.brandtype = brandtype;
	}
}
