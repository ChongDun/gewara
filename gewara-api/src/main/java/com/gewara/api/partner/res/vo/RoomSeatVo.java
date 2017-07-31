package com.gewara.api.partner.res.vo;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;

public class RoomSeatVo extends BaseVo{
	private static final long serialVersionUID = 6030230522663576759L;
	public static final String SECTION_UP = "up";		//¥��
	public static final String SECTION_DOWN = "dw";		//¥��
	private Long id;
	private Long roomid;		//Ӱ��ID
	private Integer lineno;		//ǰ��ڼ���,ϵͳ����
	private Integer rankno;		//����ڼ���,ϵͳ����
	private String seatline;	//��λ�к�
	private String seatrank;	//��λ�к�
	private String loveInd;		//������ 0����ͨ��λ 1������������λ��� 2���������ڶ���λ���
	private String initstatus;	//ÿ�ο��ų�ʼ״̬
	private String secid;		//����ID
	private String seatStatus;
	public RoomSeatVo(){
		
	}
	public String getSeatLabel(){
		if(StringUtils.isNotBlank(secid)){
			if(SECTION_UP.equals(secid)){
				return "¥��" + seatline + "��"+seatrank+"��";
			}else if(SECTION_DOWN.equals(secid)){
				return "¥��" + seatline + "��" + seatrank + "��";
			}
		}
		return seatline+"��"+seatrank+"��";
	}
	public String getKey(){
		return this.seatline+":"+this.seatrank;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoomid() {
		return roomid;
	}
	public void setRoomid(Long roomid) {
		this.roomid = roomid;
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
	public String getLoveInd() {
		return loveInd;
	}
	public void setLoveInd(String loveInd) {
		this.loveInd = loveInd;
	}
	public String getInitstatus() {
		return initstatus;
	}
	public void setInitstatus(String initstatus) {
		this.initstatus = initstatus;
	}
	public String getSecid() {
		return secid;
	}
	public void setSecid(String secid) {
		this.secid = secid;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	public String getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}
}
