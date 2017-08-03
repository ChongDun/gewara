package com.gewara.movie.vo.json.ourplay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;


public class MemberPraiseVo extends BaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7680984355389224217L;
	private String me_movieid;
	private Long memberid;//�û�ID
	private Long movieid;//ӰƬid
	private Long walaid;//����id
	private Timestamp ordertime;//����ʱ��
	private Integer packetstatus;//�������״̬(0δ�����,1�ѷ����)
	private Long playMovieId;//��ӳ��ӰID
	private Timestamp createtime;//����ʱ��
	private Timestamp updatetime;//������ʱ��
	

	public MemberPraiseVo() {
		super();
	}
	public MemberPraiseVo(Long memberid,Long movieid,Long walaid){
		super();
		this.memberid = memberid;
		this.movieid = movieid;
		this.walaid = walaid;
		this.me_movieid = spliceMeMovieid(memberid,movieid);
		this.packetstatus = 0;
		this.createtime = new Timestamp(System.currentTimeMillis());
		this.updatetime = new Timestamp(System.currentTimeMillis());
	}
	@Override
	public Serializable realId() {
		return memberid+"_"+movieid;
	}
	
	public String getMe_movieid() {
		return me_movieid;
	}

	public void setMe_movieid(String me_movieid) {
		this.me_movieid = me_movieid;
	}

	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	public Long getMovieid() {
		return movieid;
	}
	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}
	public Long getWalaid() {
		return walaid;
	}
	public void setWalaid(Long walaid) {
		this.walaid = walaid;
	}
	public Integer getPacketstatus() {
		return packetstatus;
	}
	public void setPacketstatus(Integer packetstatus) {
		this.packetstatus = packetstatus;
	}
	
	public Timestamp getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Timestamp ordertime) {
		this.ordertime = ordertime;
	}
	public static String spliceMeMovieid(Long memberid,Long movieid){
		return memberid+"_"+movieid;
	}
	public Long getPlayMovieId() {
		return playMovieId;
	}
	public void setPlayMovieId(Long playMovieId) {
		this.playMovieId = playMovieId;
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
	
}
