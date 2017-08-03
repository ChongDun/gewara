package com.gewara.api.sns.vo.guess;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;
/**
 * ��Ʊ����̨����  
 *
 */
public class GuessSetupVo extends BaseVo{
	private static final long serialVersionUID = -6238251192248125698L;
	private Long id; //����id
	private Integer consumepoint; //�����Ļ���
	private Integer multiple; //����
	private Timestamp starttime;//��ʼʱ��
	private Timestamp endtime;//����ʱ��
	private Timestamp addtime;//����ʱ��
	private String status;//״̬Y_NEW --�½�  Y_END --����   N_DELETE --ɾ�� 
	private Long winid;//����Ʊ�����(ѡ��ID)
	private String winPic; //����Ʊ�����ͼƬ
	private String bgPic;
	
	//@Transient
	private Long memberid; //�����û�ID
	private String title; //��Ʊ������
	private String body;//��Ʊ������
	private Long movieid;//������ӰID
	private String cover;//��Ʊ������
	private String process;
	private String shareTitle;//�������
	private String shareBody;//��������
	
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

	public Integer getConsumepoint() {
		return consumepoint;
	}

	public void setConsumepoint(Integer consumepoint) {
		this.consumepoint = consumepoint;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Timestamp getStarttime() {
		return starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public Timestamp getAddtime() {
		return addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getWinid() {
		return winid;
	}

	public void setWinid(Long winid) {
		this.winid = winid;
	}

	public String getWinPic() {
		return winPic;
	}

	public void setWinPic(String winPic) {
		this.winPic = winPic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}
	
	public Long getMemberid() {
		return memberid;
	}

	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public Long getMovieid() {
		return movieid;
	}

	public void setMovieid(Long movieid) {
		this.movieid = movieid;
	}

	public String getBgPic() {
		return bgPic;
	}

	public void setBgPic(String bgPic) {
		this.bgPic = bgPic;
	}

	public String getShareTitle() {
		return shareTitle;
	}

	public void setShareTitle(String shareTitle) {
		this.shareTitle = shareTitle;
	}

	public String getShareBody() {
		return shareBody;
	}

	public void setShareBody(String shareBody) {
		this.shareBody = shareBody;
	}

}
