package com.gewara.api.sns.vo.recommend;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

/**
 * �Ƽ���������Ϣ
 * @author zxl
 *
 */
public class RecommendBatchVo extends BaseVo {

	private static final long serialVersionUID = 8336932693361209138L;

	private Long id; // ����
	private String type;// ���� square,friends
	private String status; // Y_NEW��N_DELETE
	private String condition;// ��������
	private String remark;// ����˵��
	private Long memberid; // ��ӱ�ǩ�û�
	private String nickname;
	private Timestamp addtime; // ������ǩʱ��

	public RecommendBatchVo() {
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCondition() {
		return condition;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

}
