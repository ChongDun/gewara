package com.gewara.drama.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ZeroGrabTicketVo extends BaseVo {

	private static final long serialVersionUID = -3298655438669790832L;
	private Long priceid;					//�۸�ID
	private String flag;					//�����ʶ��Ʊ
	private String title;					//˵��
	private Timestamp starttime;			//��ʼʱ��
	private Timestamp endtime;				//����ʱ��
	private Long dpid;						//����ID
	private Long dramaid;					//��ĿID
	private String status;					//״̬
	private Integer sortnum;				//ÿ����Ʊ����
	private String uniqueby;				//ʹ��ʲô����Ψһ��
	private Timestamp addtime;				//���ʱ��
	private Timestamp updatetime;			//����ʱ��
	
	@Override
	public Serializable realId() {
		return priceid;
	}

	public Long getPriceid() {
		return priceid;
	}

	public void setPriceid(Long priceid) {
		this.priceid = priceid;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public Long getDpid() {
		return dpid;
	}

	public void setDpid(Long dpid) {
		this.dpid = dpid;
	}

	public Long getDramaid() {
		return dramaid;
	}

	public void setDramaid(Long dramaid) {
		this.dramaid = dramaid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getSortnum() {
		return sortnum;
	}

	public void setSortnum(Integer sortnum) {
		this.sortnum = sortnum;
	}

	public String getUniqueby() {
		return uniqueby;
	}

	public void setUniqueby(String uniqueby) {
		this.uniqueby = uniqueby;
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

}
