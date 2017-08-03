package com.gewara.movie.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.BaseVo;

public class MusicAlbumVo extends BaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 309009193307051030L;
	private String list_id;//��ѡ��ID
	private String collect_name;//��ѡ������
	private String collect_logo;//��ѡ��LOGO
	private List<Long> movieid;//��ӰID
	private Integer likeNum;//ϲ����
	private Integer talkNum;//������
	private Timestamp createTime;//����ʱ��
	private Timestamp updateTime;//�޸�ʱ��
	private List<MovieMusicVo> songs;//����
	private Boolean isUpdate;//�Ƿ����
	private String type;//ר�� ��ѡ�� �����б�(album,collection,song)
	public MusicAlbumVo() {
		super();
	}
	public String getList_id() {
		return list_id;
	}
	public void setList_id(String list_id) {
		this.list_id = list_id;
	}
	public String getCollect_name() {
		return collect_name;
	}
	public void setCollect_name(String collect_name) {
		this.collect_name = collect_name;
	}
	public String getCollect_logo() {
		return collect_logo;
	}
	public void setCollect_logo(String collect_logo) {
		this.collect_logo = collect_logo;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public List<Long> getMovieid() {
		return movieid;
	}
	public void setMovieid(List<Long> movieid) {
		this.movieid = movieid;
	}
	public Integer getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(Integer likeNum) {
		this.likeNum = likeNum;
	}
	public Integer getTalkNum() {
		return talkNum;
	}
	public void setTalkNum(Integer talkNum) {
		this.talkNum = talkNum;
	}
	public List<MovieMusicVo> getSongs() {
		return songs;
	}
	public void setSongs(List<MovieMusicVo> songs) {
		this.songs = songs;
	}
	public Boolean getIsUpdate() {
		return isUpdate;
	}
	public void setIsUpdate(Boolean isUpdate) {
		this.isUpdate = isUpdate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public Serializable realId() {
		return list_id;
	}

}
