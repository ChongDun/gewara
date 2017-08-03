package com.gewara.movie.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;
import com.gewara.util.DateUtil;

/**
 * ��ӰӢ���ֶ�            
 * @author john
 *
 */

public class MovieExtraVo extends BaseVo implements Serializable {
	private static final long serialVersionUID = 4965993143973574947L;
	
	private Long id;
	private String language;		//����
	private String state;			//����
	private String director;		//����
	private String actors;			//����
	private String content;			//����
	private String addtime;
	private String updatetime;
	
	public MovieExtraVo(){}
	
	public MovieExtraVo(Long id){
		this.id = id;
		this.addtime = DateUtil.getCurFullTimestampStr();
		this.updatetime = this.addtime;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActors() {
		return actors;
	}
	public void setActors(String actors) {
		this.actors = actors;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getUpdatetime() {
		return updatetime;
	}
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	
}
