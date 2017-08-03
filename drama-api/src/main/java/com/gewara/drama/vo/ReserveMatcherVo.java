package com.gewara.drama.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.gewara.api.vo.BaseVo;

public class ReserveMatcherVo extends BaseVo {

	private static final long serialVersionUID = 2364212550624963422L;
	private Long id;
	private Long dramaid;
	private Date reservedate;
	private Integer version;
	private String serialnum;					//���
	private String starttime;
	private String endtime;
	private Integer totalnum;					//��ԤԼ����
	private Integer displaynum;				//��ʾ��
	private Integer reservenum;				//��ԤԼ����
	private Integer reserveofflinenum;				//������ԤԼ����
	private Integer totalofflinenum;					//���¿�ԤԼ����
	private Integer handmadenum;					//�����ֹ�ԤԼ
	private String status;						//״̬
	private Timestamp addtime;
	private Timestamp updatetime;
	private String priceids;				//����۸�ID
	private String prices;
	private String itempriceids;			//���μ۸�ID
	private String dpids;			//����ID
	private String priceDpids;     //���μ۸�ID ��Ӧ�ĳ���ID
	
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

	public Long getDramaid() {
		return dramaid;
	}

	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}

	public Date getReservedate() {
		return reservedate;
	}

	public void setReservedate(Date reservedate) {
		this.reservedate = reservedate;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(String serialnum) {
		this.serialnum = serialnum;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public Integer getTotalnum() {
		return totalnum;
	}

	public void setTotalnum(Integer totalnum) {
		this.totalnum = totalnum;
	}

	public Integer getDisplaynum() {
		return displaynum;
	}

	public void setDisplaynum(Integer displaynum) {
		this.displaynum = displaynum;
	}

	public Integer getReservenum() {
		return reservenum;
	}

	public void setReservenum(Integer reservenum) {
		this.reservenum = reservenum;
	}

	public Integer getReserveofflinenum() {
		return reserveofflinenum;
	}

	public void setReserveofflinenum(Integer reserveofflinenum) {
		this.reserveofflinenum = reserveofflinenum;
	}

	public Integer getTotalofflinenum() {
		return totalofflinenum;
	}

	public void setTotalofflinenum(Integer totalofflinenum) {
		this.totalofflinenum = totalofflinenum;
	}

	public Integer getHandmadenum() {
		return handmadenum;
	}

	public void setHandmadenum(Integer handmadenum) {
		this.handmadenum = handmadenum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public String getPriceids() {
		return priceids;
	}

	public void setPriceids(String priceids) {
		this.priceids = priceids;
	}

	public String getPrices() {
		return prices;
	}

	public void setPrices(String prices) {
		this.prices = prices;
	}

	public String getItempriceids() {
		return itempriceids;
	}

	public void setItempriceids(String itempriceids) {
		this.itempriceids = itempriceids;
	}

	public String getDpids() {
		return dpids;
	}

	public void setDpids(String dpids) {
		this.dpids = dpids;
	}

	public String getPriceDpids() {
		return priceDpids;
	}

	public void setPriceDpids(String priceDpids) {
		this.priceDpids = priceDpids;
	}

}
