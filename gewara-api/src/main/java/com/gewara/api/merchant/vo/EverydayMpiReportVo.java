package com.gewara.api.merchant.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.BaseVo;
/**
 * ����ͳ�Ƶĳ���
 * @author gang.liu
 *
 */
public class EverydayMpiReportVo extends BaseVo{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4481307586398663355L;

	private Date playDate; //����
	
	private int cinemaCount;//ͳ��ӰԺ���� ������ ������ ϵͳֱ���Ƶ���ӰԺ ������������ƬӰԺ 
	
	private int mpiCinemaCount;// ��ƬӰԺ��
	
	private int mpiCount; //�ܳ�����
	
	private List<Map<String,Long>> movieMpiCount ;// ÿ��ӰƬ ÿ��ĳ����� Map��keyֵ ��Ӧ���壺movieId ��Ӱid mpiCount����Ӧ��Ӱĳ�����Ƭ��
	
	private List<Map<String,Long>> goleMovieMpiCount ;// �ƽ�ʱ��ÿ��ӰƬ ÿ��ĳ����� Map��keyֵ ��Ӧ���壺movieId ��Ӱid mpiCount����Ӧ��Ӱĳ�����Ƭ��
	
	public EverydayMpiReportVo(){}
	
	public EverydayMpiReportVo(Date playDate,int cinemaCount,int mpiCinemaCount,int mpiCount,
			List<Map<String,Long>> movieMpiCount,List<Map<String,Long>> goleMovieMpiCount){
		this.playDate = playDate;
		this.cinemaCount = cinemaCount;
		this.mpiCinemaCount = mpiCinemaCount;
		this.mpiCount = mpiCount;
		this.movieMpiCount = movieMpiCount;
		this.goleMovieMpiCount = goleMovieMpiCount;
	}
	
	public Date getPlayDate() {
		return playDate;
	}

	public void setPlayDate(Date playDate) {
		this.playDate = playDate;
	}

	public int getCinemaCount() {
		return cinemaCount;
	}

	public void setCinemaCount(int cinemaCount) {
		this.cinemaCount = cinemaCount;
	}

	public int getMpiCinemaCount() {
		return mpiCinemaCount;
	}

	public void setMpiCinemaCount(int mpiCinemaCount) {
		this.mpiCinemaCount = mpiCinemaCount;
	}

	public int getMpiCount() {
		return mpiCount;
	}

	public void setMpiCount(int mpiCount) {
		this.mpiCount = mpiCount;
	}

	public List<Map<String, Long>> getMovieMpiCount() {
		return movieMpiCount;
	}

	public void setMovieMpiCount(List<Map<String, Long>> movieMpiCount) {
		this.movieMpiCount = movieMpiCount;
	}

	public List<Map<String, Long>> getGoleMovieMpiCount() {
		return goleMovieMpiCount;
	}

	public void setGoleMovieMpiCount(List<Map<String, Long>> goleMovieMpiCount) {
		this.goleMovieMpiCount = goleMovieMpiCount;
	}

	@Override
	public Serializable realId() {
		return playDate;
	}

}
