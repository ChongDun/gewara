package com.gewara.movie.vo.json.ourplay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;


public class ApplyVo extends BaseVo{
	private static final long serialVersionUID = -5401784424476256109L;
	private String id; //���� memberid+"_"+activityId
	private Long memberId; //�û�id
	private Long movieId; //��Ӱid
	private String activityId; //�id
	private String userName; //����
	private Integer age;	//����
	private String constellation; //����
	private String phone; //�ֻ���
	private String reason; //����
	private String gender;//�Ա�
	private String isOk;//�����Ƿ�ͨ����
	private Timestamp addtime; //���ʱ��
	private Timestamp updatetime;//�޸�ʱ��
	private String friendname;//��ʾ����λ�����Ƽ�������
	private String isReturnPoint;//�Ƿ񷵻ػ���
	
	public String getIsReturnPoint() {
		return isReturnPoint;
	}

	public void setIsReturnPoint(String isReturnPoint) {
		this.isReturnPoint = isReturnPoint;
	}

	public String getFriendname() {
		return friendname;
	}

	public void setFriendname(String friendname) {
		this.friendname = friendname;
	}

	// ��ѯ����д��д��������memberid movieid starttime endtime ��ӳ��ʼʱ�� ����ʱ�䣬���ʼʱ�䣬����ʱ�䣬ӰԺ��ӳʱ��
	public ApplyVo(){}
	
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getConstellation() {
		return constellation;
	}
	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public Serializable realId() {
		return this.id;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getIsOk() {
		return isOk;
	}
	public void setIsOk(String isOk) {
		this.isOk = isOk;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	



}
