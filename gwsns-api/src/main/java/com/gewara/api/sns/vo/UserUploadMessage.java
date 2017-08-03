package com.gewara.api.sns.vo;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class UserUploadMessage extends BaseVo implements Serializable {
 
	private static final long serialVersionUID = -3322684887723628280L;
	private Long memberId;//��ǰ�û�id
	private String codeName;//source��Ӧ������
	private String code;//source��Ӧ��code
	private Long gewaraMemberId;//�ֻ���Ӧ�ĸ������û�id
	private String isNewUser;//��ƥ�䵽���û����
	private String headpicUrl;
	private String nickname;
	private String personDescribe;
	private String relationship;//�û���ϵ
	private String updaTime;//ʱ��
	private String source;//����
	private Integer traceNum;//Ӱ������
	private Object[] userMark; //������ǩ
	private String nickName;
	
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getGewaraMemberId() {
		return gewaraMemberId;
	}

	public void setGewaraMemberId(Long gewaraMemberId) {
		this.gewaraMemberId = gewaraMemberId;
	}

	public String getIsNewUser() {
		return isNewUser;
	}

	public void setIsNewUser(String isNewUser) {
		this.isNewUser = isNewUser;
	}

	public String getHeadpicUrl() {
		return headpicUrl;
	}

	public void setHeadpicUrl(String headpicUrl) {
		this.headpicUrl = headpicUrl;
	}

	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPersonDescribe() {
		return personDescribe;
	}

	public void setPersonDescribe(String personDescribe) {
		this.personDescribe = personDescribe;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getUpdaTime() {
		return updaTime;
	}

	public void setUpdaTime(String updaTime) {
		this.updaTime = updaTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "UserUploadMessage [memberId=" + memberId + ", codeName="
				+ codeName + ", code=" + code + ", gewaraMemberId="
				+ gewaraMemberId + ", isNewUser=" + isNewUser + ", headpicUrl="
				+ headpicUrl + ", nickname=" + nickname + ", personDescribe="
				+ personDescribe + ", relationship=" + relationship
				+ ", updaTime=" + updaTime + ", source=" + source
				+ ", traceNum=" + traceNum + "]";
	}

	public Integer getTraceNum() {
		return traceNum;
	}

	public void setTraceNum(Integer traceNum) {
		this.traceNum = traceNum;
	}

	public Object[] getUserMark() {
		return userMark;
	}

	public void setUserMark(Object[] userMark) {
		this.userMark = userMark;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public Serializable realId() {
		return null;
	}


	
}
