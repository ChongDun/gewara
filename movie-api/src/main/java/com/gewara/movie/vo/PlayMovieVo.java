package com.gewara.movie.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class PlayMovieVo extends BaseVo {

	private Long id; //Ψһ��ʾ
	private Long kindId; //�������,������һ��
	private String kindName; //��ӳ�������
	private String belongToKind;//�����ĸ���� ����ҵor�¾��� ���ڵ�ֵ�� newBusiness newClassics Ӱչģʽ(yingzhan)
	private Long movieId; //ӰƬID
	private Timestamp playStartTime; //ӰƬ��ӳ��ʼʱ��
	private Timestamp playEndTime;  //ӰƬ��ӳ����ʱ��
	private Timestamp cinemaPlayTime; //ӰԺ��ӳʱ��
	private Integer orderNumber;	//�������
	private Integer status;	//�Ƿ�ɾ�� 1=ɾ�� 0=δɾ��
	private Timestamp addtime; //���ʱ��
	private Timestamp updatetime;//�޸�ʱ��
	private String activityId; //��Ƭ�id
	private Timestamp startTime; //���Чʱ�� ��ʼʱ��
	private Timestamp endTime; //���Чʱ�� ����ʱ��
	private String impression; //ӰƬӡ�� ���ӡ���ö��ŷֿ�
	private String qualityReport; //��������
	private String videoLink; //��Ƶ����
	private String playCityCode;//��ӳ���б���
	private String describe;//����
	private String yingzhangurl;//Ӱչ��url�������Ӱչģʽ�Ļ�
	private String yingzhanAddress;//Ӱչ��ַ
	private String relativeIds;//Ӱչ����id
	private String imgUrl;
	public String getRelativeIds() {
		return relativeIds;
	}
	public void setRelativeIds(String relativeIds) {
		this.relativeIds = relativeIds;
	}
	public String getYingzhangurl() {
		return yingzhangurl;
	}

	public void setYingzhangurl(String yingzhangurl) {
		this.yingzhangurl = yingzhangurl;
	}

	public PlayMovieVo(){}
	private static final long serialVersionUID = 6672625770368452937L;

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

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public Timestamp getPlayStartTime() {
		return playStartTime;
	}

	public void setPlayStartTime(Timestamp playStartTime) {
		this.playStartTime = playStartTime;
	}

	public Timestamp getPlayEndTime() {
		return playEndTime;
	}

	public void setPlayEndTime(Timestamp playEndTime) {
		this.playEndTime = playEndTime;
	}

	public Timestamp getCinemaPlayTime() {
		return cinemaPlayTime;
	}

	public void setCinemaPlayTime(Timestamp cinemaPlayTime) {
		this.cinemaPlayTime = cinemaPlayTime;
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

	public Long getKindId() {
		return kindId;
	}

	public void setKindId(Long kindId) {
		this.kindId = kindId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getImpression() {
		return impression;
	}

	public void setImpression(String impression) {
		this.impression = impression;
	}

	public String getVideoLink() {
		return videoLink;
	}

	public void setVideoLink(String videoLink) {
		this.videoLink = videoLink;
	}

	public String getQualityReport() {
		return qualityReport;
	}

	public void setQualityReport(String qualityReport) {
		this.qualityReport = qualityReport;
	}

	public String getPlayCityCode() {
		return playCityCode;
	}

	public void setPlayCityCode(String playCityCode) {
		this.playCityCode = playCityCode;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	public String getKindName() {
		return kindName;
	}
	
	public void setKindName(String kindName) {
		this.kindName = kindName;
	}
	
	public String getBelongToKind() {
		return belongToKind;
	}
	
	public void setBelongToKind(String belongToKind) {
		this.belongToKind = belongToKind;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Timestamp getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	
	public Timestamp getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	public String getYingzhanAddress() {
		return yingzhanAddress;
	}
	
	public void setYingzhanAddress(String yingzhanAddress) {
		this.yingzhanAddress = yingzhanAddress;
	}
	
}
