package com.gewara.api.gpticket.vo.ticket;
import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

/**
 * @author <a href="mailto:acerge@163.com">gebiao(acerge)</a>
 * @since 2007-9-28����02:05:17
 */
public class FieldAreaSeatVo extends BaseVo{
	private static final long serialVersionUID = -4016785855588367848L;
	
	private Long id;
	private Long areaid;		//����ID
	private Integer lineno;		//ǰ��ڼ���,ϵͳ����
	private Integer rankno;		//����ڼ���,ϵͳ����
	private String seatline;	//��λ�к�
	private String seatrank;	//��λ�к�
	private String loveInd;		//������ 0����ͨ��λ 1������������λ��� 2���������ڶ���λ���
	private String seatno;		//��λ���

	@Override
	public Serializable realId() {
		return id;
	}
	
	public Long getAreaid() {
		return areaid;
	}

	public void setAreaid(Long areaid) {
		this.areaid = areaid;
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
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public String getSeatLabel(){
		return seatline+"��"+seatrank+"��";
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
	
	public String getRelative(){
		return this.seatline + ":" + this.seatrank;
	}

}
