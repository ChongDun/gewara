package com.gewara.drama.vo;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;
import com.gewara.drama.constant.TheatreSeatConstant;

public class OpenTheatreSeatVo extends BaseVo {

	private static final long serialVersionUID = 7302103820051859243L;
	private Long id;				
	private Long odiid;				//��������
	private Long dpid;				//
	private Long areaid;			//���������ַ
	private Integer price;			//�۸�
	private Integer theatreprice;	//��Ժ��
	private Integer costprice;		//�ɱ���
	private String status;			//״̬
	private String remark;			//��ע
	//��λ��Ϣ
	private Integer lineno;			//ǰ��ڼ���,ϵͳ����
	private Integer rankno;			//����ڼ���,ϵͳ����
	private String seatline;		//��λ�к�
	private String seatrank;		//��λ�к�
	private String seattype;		//�۸�����
	private String loveInd;			//������
	
	private Long tipid;				//���μ۸�ID
	private Long tspid;				//����۸�ID

	
	
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

	public Integer getLineno() {
		return lineno;
	}

	public void setLineno(Integer lineno) {
		this.lineno = lineno;
	}

	public Integer getRankno() {
		return rankno;
	}

	public void setRankno(Integer rankno) {
		this.rankno = rankno;
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

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getLoveInd() {
		return loveInd;
	}

	public void setLoveInd(String loveInd) {
		this.loveInd = loveInd;
	}

	public String getPosition(){
		return this.lineno+":" + this.rankno; 
	}
	
	public String getSeatLabel(){
		return seatline+"��"+seatrank+"��";
	}
	
	public String getKey(){
		return this.seatline+":"+this.seatrank;
	}
	
	public Long getTipid() {
		return tipid;
	}

	public void setTipid(Long tipid) {
		this.tipid = tipid;
	}

	public Long getTspid() {
		return tspid;
	}

	public void setTspid(Long tspid) {
		this.tspid = tspid;
	}

	public boolean isAvailable() {
		return StringUtils.equals(this.status, TheatreSeatConstant.STATUS_NEW);
	}
}
