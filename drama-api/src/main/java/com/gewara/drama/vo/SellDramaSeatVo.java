package com.gewara.drama.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.drama.constant.TheatreSeatConstant;

public class SellDramaSeatVo extends BaseVo {

	private static final long serialVersionUID = -7943952447862925974L;

	private Long id;
	private Integer version;		//�汾
	private Long odiid;				//��������
	private Long dpid;				//
	private Long areaid;			//��������
	private Long orderid;			//������
	private String seatline;		//��λ�к�
	private String seatrank;		//��λ�к�
	private Timestamp validtime;
	private Integer price;
	private Integer theatreprice;
	private Integer costprice;
	private String status;			//״̬
	private String remark;
	
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getOdiid() {
		return odiid;
	}

	public void setOdiid(Long odiid) {
		this.odiid = odiid;
	}

	public Long getDpid() {
		return dpid;
	}

	public void setDpid(Long dpid) {
		this.dpid = dpid;
	}

	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public String getSeatline() {
		return seatline;
	}

	public void setSeatline(String seatline) {
		this.seatline = seatline;
	}

	public String getSeatrank() {
		return seatrank;
	}

	public void setSeatrank(String seatrank) {
		this.seatrank = seatrank;
	}

	public Timestamp getValidtime() {
		return validtime;
	}

	public void setValidtime(Timestamp validtime) {
		this.validtime = validtime;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTheatreprice() {
		return theatreprice;
	}

	public void setTheatreprice(Integer theatreprice) {
		this.theatreprice = theatreprice;
	}

	public Integer getCostprice() {
		return costprice;
	}

	public void setCostprice(Integer costprice) {
		this.costprice = costprice;
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

	public boolean hasAvailable() {
		Timestamp cur = new Timestamp(System.currentTimeMillis());
		return StringUtils.equals(status, TheatreSeatConstant.STATUS_NEW) && validtime.before(cur);
	}
	
	public boolean hasAvailableBy(Long sorderid){
		Timestamp cur = new Timestamp(System.currentTimeMillis());
		return StringUtils.equals(status, TheatreSeatConstant.STATUS_NEW) && validtime.before(cur) || sorderid.equals(this.orderid);
	}
	
	public boolean hasSold(){
		return TheatreSeatConstant.STATUS_SOLD.equals(status);
	}
	
	public String getSeatLabel(){
		return seatline+"��"+seatrank+"��";
	}

	
	public String getKey(){
		return this.seatline + ":" + this.seatrank;
	}
}
