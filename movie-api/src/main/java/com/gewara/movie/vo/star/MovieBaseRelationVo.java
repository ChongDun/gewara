package com.gewara.movie.vo.star;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class MovieBaseRelationVo extends BaseVo {
	private static final long serialVersionUID = 843392976501206925L;
	private Long id;
	private Long movieid;				//��ӰID
	private Long baseinfoid;			//������ϢID
	private String infotype;			//��Ϣ����
	private Timestamp addtime;			//����ʱ��
	private Timestamp updatetime;		//����ʱ��
	private Integer ordernum;			//�������

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public Long getBaseinfoid() {
		return baseinfoid;
	}

	public void setBaseinfoid(Long baseinfoid) {
		this.baseinfoid = baseinfoid;
	}

	public String getInfotype() {
		return infotype;
	}

	public void setInfotype(String infotype) {
		this.infotype = infotype;
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

	@Override
	public Serializable realId() {
		return id;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

}
