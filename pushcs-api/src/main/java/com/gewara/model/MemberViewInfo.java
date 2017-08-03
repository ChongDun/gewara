package com.gewara.model;

import java.io.Serializable;
import java.util.List;
/**
 * �û���Ӱ��Ϣ
 * 
 * @author jeremylei
 * @date 2016/04/15
 */
public class MemberViewInfo  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3363180767294549933L;
	private Long movieid; // ��Ӱid
	private Long cinemaid; // ӰԺid
	private Long playtime; // ��ӳʱ��
	private Integer viewcounts; // �õ�Ӱ��Ӱ����
	private List<Long> othermembers; // ͬ���ι�Ӱ�û�id�б�

	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public Long getCinemaid() {
		return cinemaid;
	}

	public void setCinemaid(Long cinemaid) {
		this.cinemaid = cinemaid;
	}

	public Long getPlaytime() {
		return playtime;
	}

	public void setPlaytime(Long playtime) {
		this.playtime = playtime;
	}

	public Integer getViewcounts() {
		return viewcounts;
	}

	public void setViewcounts(Integer viewcounts) {
		this.viewcounts = viewcounts;
	}

	public List<Long> getOthermembers() {
		return othermembers;
	}

	public void setOthermembers(List<Long> othermembers) {
		this.othermembers = othermembers;
	}
}
