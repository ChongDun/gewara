package com.gewara.api.activity.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class TreasureVo extends BaseVo{
	
	private static final long serialVersionUID = -673268778354641818L;
	//�������˵��ղ�
	public static final String ACTION_COLLECT = "collect";
	//ǩ��
	public static final String ACTION_SIGN = "sign";
	//��������ȥ����Ӱ���뿴
	public static final String ACTION_XIANGQU = "xiangqu";
	//������ȥ������Ӱ�Ŀ���
	public static final String ACTION_QUGUO = "quguo";
	//���ĳ����ѧ
	public static final String ACTION_XIANGXUE="xiangxue";
	//�������٤
	public static final String ACTION_PLAYING="playing";
	//�����٤
	public static final String ACTION_PLAYED="played";
	//��һ�����٤
	public static final String ACTION_TOGETHER="together";
	
	//��ע��
	public static final String TAG_MEMBER = "member";
	
	// �������ǰ��
	public static final String ACTION_FANS = "fans";	// ��Ϊ��˿
	//�ղػ
	public static final String ACTION_ACTIVITY = "activity";
	
	private Long id;
	private Long memberid; //����������
	//private Member member; //�ֹ�����
	private String tag; //ģ��
	private String action;//������xiangqu��quguo��collect��xiangxue
	private Long relatedid;//�����Ķ���
	private Timestamp addtime; 
	
	//20110418
	private String actionlabel; //��ǩ
	private Integer unreadnum; //δ����ǩ����
	
	public String getActionlabel() {
		return actionlabel;
	}
	public void setActionlabel(String actionlabel) {
		this.actionlabel = actionlabel;
	}
	
	public TreasureVo() {}
	
	
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

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Long getRelatedid() {
		return relatedid;
	}

	public void setRelatedid(Long relatedid) {
		this.relatedid = relatedid;
	}

	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	/*public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return member;
	}*/
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Integer getUnreadnum() {
		return unreadnum;
	}
	public void setUnreadnum(Integer unreadnum) {
		this.unreadnum = unreadnum;
	}
}
