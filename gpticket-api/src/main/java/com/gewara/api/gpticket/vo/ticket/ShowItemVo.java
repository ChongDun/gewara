package com.gewara.api.gpticket.vo.ticket;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ShowItemVo extends BaseVo {
	private static final long serialVersionUID = 6391912619089689711L;
	
	private String siseq;		//��Ƭ��ţ�partner+pseqno(DramaPlayItem-->sellerseq)
	private String showname;		//��������
	private Long dramaid;			//��ĿID
	private Long theatreid;		//����ID
	private String fieldnum;		//�������
	private String fieldname;		//��������
	private Timestamp playtime;	//��ӳʱ��
	private Timestamp endtime;	//����ʱ��
	private Timestamp opentime;
	private Timestamp closetime;
	
	private String citycode;
	
	private String partner;		//������
	private String pseqno;		//������ID
	private String itemtype;		//ѡ����ѡ�۸�
	private String period;		//�Ƿ���ʱ��
	private String express;		//��ݷ�ʽ
	private String showtype;		//��������
	private String crmflag;		//�̻���ʶ
	private String takemethod;
	private String takeAddress;
	private Integer maxbuy;
	private Integer idMaxbuy;
	private String fieldlogo;
	private String idcard;
	
	private String status;		//״̬�����á�ɾ��
	private Timestamp createtime;	//����ʱ��
	private Timestamp updatetime;	//����ʱ��
	
	@Override
	public Serializable realId() {
		return siseq;
	}
	
	public String getSiseq() {
		return siseq;
	}
	public void setSiseq(String siseq) {
		this.siseq = siseq;
	}
	
	public String getShowname() {
		return showname;
	}
	
	public void setShowname(String showname) {
		this.showname = showname;
	}
	
	public Long getDramaid() {
		return dramaid;
	}
	
	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}
	
	public Long getTheatreid() {
		return theatreid;
	}
	
	public void setTheatreid(Long theatreid) {
		this.theatreid = theatreid;
	}
	public String getFieldnum() {
		return fieldnum;
	}
	public void setFieldnum(String fieldnum) {
		this.fieldnum = fieldnum;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public Timestamp getPlaytime() {
		return playtime;
	}
	public void setPlaytime(Timestamp playtime) {
		this.playtime = playtime;
	}
	public Timestamp getEndtime() {
		return endtime;
	}
	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}
	public Timestamp getOpentime() {
		return opentime;
	}
	public void setOpentime(Timestamp opentime) {
		this.opentime = opentime;
	}
	public Timestamp getClosetime() {
		return closetime;
	}
	public void setClosetime(Timestamp closetime) {
		this.closetime = closetime;
	}
	public String getCitycode() {
		return citycode;
	}
	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public String getPseqno() {
		return pseqno;
	}
	public void setPseqno(String pseqno) {
		this.pseqno = pseqno;
	}
	public String getItemtype() {
		return itemtype;
	}
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getExpress() {
		return express;
	}
	public void setExpress(String express) {
		this.express = express;
	}
	
	public String getShowtype() {
		return showtype;
	}

	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Timestamp getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public String getCrmflag() {
		return crmflag;
	}

	public void setCrmflag(String crmflag) {
		this.crmflag = crmflag;
	}

	public String getTakemethod() {
		return takemethod;
	}

	public void setTakemethod(String takemethod) {
		this.takemethod = takemethod;
	}

	public Integer getMaxbuy() {
		return maxbuy;
	}

	public void setMaxbuy(Integer maxbuy) {
		this.maxbuy = maxbuy;
	}

	public String getFieldlogo() {
		return fieldlogo;
	}

	public void setFieldlogo(String fieldlogo) {
		this.fieldlogo = fieldlogo;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getTakeAddress() {
		return takeAddress;
	}

	public void setTakeAddress(String takeAddress) {
		this.takeAddress = takeAddress;
	}

	public Integer getIdMaxbuy() {
		return idMaxbuy;
	}

	public void setIdMaxbuy(Integer idMaxbuy) {
		this.idMaxbuy = idMaxbuy;
	}
	
}
