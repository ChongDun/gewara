package com.gewara.api.gewampi.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import com.gewara.api.gewampi.util.RequestParamsMap;


public class MovieItemBasicQueryRequest implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1363532714670489706L;
	private String citycode;	//����
	private String countycode;  //����
	private Long cinemaid;		//ӰԺID
	private Long movieid;		//ӰƬID
	private Date playdate;		//��ӳ����	
	private String opentype;	//��������
	private String seqNo;		//�ⲿ����ID
	private Long batch;				//���α�ʶ
	private String openStatus;		//����״̬��init����ʼ״̬��open���ѿ��ţ�close���Ժ�Ҳ������
	private String mpitype;			//�������� filmfest ��Ӱ�ڳ���
	
	//����Ϊopi����
	private Long openid;			//					------>ԭopi���id
	private String status;			//״̬����Ԥ��������Ԥ���� Y[��Ԥ��]N[����Ԥ��]D[ɾ��]
	private String partner;			//������鿪��״̬��Y���⿪��,N�����⿪��
	private String characteristic;
	
	//����Map�еĲ�ѯ����
	private Timestamp playtimeGte; //��ӳʱ����ڵ��ڸ�ʱ��
	private Timestamp playtimeLt; //��ӳʱ��С�ڸ�ʱ��	
	private String showtimeGte; //���ڵ��ڸ�ʱ�䣬��ֵֻ����playdate��Ϊ��ʱ������Ч
	private String showtimeLt;  //С�ڸ�ʱ�䣬��ֵֻ����playdate��Ϊ��ʱ������Ч
	
	//��������	
	private Integer from;
	private Integer maxnum;
	
	private String propertyName;	//DistinctPropertyʱ��Ҫ
	
	/**
	 * gteShowtime������������
	 * ����ѯ����ʹ�û��棬��ע���ֵ����key��
	 * @return
	 * @author leo
	 * @addTime 2015��6��30������2:20:18
	 */
	public Map<String, Object> gainParamsMap(){
		Map<String, Object> params = new RequestParamsMap<String, Object>();
		params.put("citycode", citycode);
		params.put("countycode", countycode);
		params.put("cinemaid", cinemaid);
		params.put("movieid", movieid);
		params.put("playdate", playdate);
		params.put("opentype", opentype);
		params.put("seqNo", seqNo);
		params.put("batch", batch);
		params.put("openStatus", openStatus);
		params.put("mpitype", mpitype);
		params.put("openid", openid);
		params.put("status", status);
		params.put("partner", partner);
		params.put("characteristic", characteristic);
		return params;
	}

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

	public Date getPlaydate() {
		return playdate;
	}

	public void setPlaydate(Date playdate) {
		this.playdate = playdate;
	}

	public String getOpentype() {
		return opentype;
	}

	public void setOpentype(String opentype) {
		this.opentype = opentype;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}

	public Long getBatch() {
		return batch;
	}

	public void setBatch(Long batch) {
		this.batch = batch;
	}

	public String getOpenStatus() {
		return openStatus;
	}

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}

	public String getMpitype() {
		return mpitype;
	}

	public void setMpitype(String mpitype) {
		this.mpitype = mpitype;
	}

	public Long getOpenid() {
		return openid;
	}

	public void setOpenid(Long openid) {
		this.openid = openid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public Integer getMaxnum() {
		return maxnum;
	}

	public void setMaxnum(Integer maxnum) {
		this.maxnum = maxnum;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getCountycode() {
		return countycode;
	}

	public void setCountycode(String countycode) {
		this.countycode = countycode;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}

	public String getShowtimeGte() {
		return showtimeGte;
	}

	public void setShowtimeGte(String showtimeGte) {
		this.showtimeGte = showtimeGte;
	}

	public String getShowtimeLt() {
		return showtimeLt;
	}

	public void setShowtimeLt(String showtimeLt) {
		this.showtimeLt = showtimeLt;
	}

	public Timestamp getPlaytimeGte() {
		return playtimeGte;
	}

	public void setPlaytimeGte(Timestamp playtimeGte) {
		this.playtimeGte = playtimeGte;
	}

	public Timestamp getPlaytimeLt() {
		return playtimeLt;
	}

	public void setPlaytimeLt(Timestamp playtimeLt) {
		this.playtimeLt = playtimeLt;
	}
}
