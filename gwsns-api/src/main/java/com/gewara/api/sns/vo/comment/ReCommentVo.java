package com.gewara.api.sns.vo.comment;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

import com.gewara.api.sns.constant.Status;
import com.gewara.api.vo.BaseVo;
import com.gewara.util.JsonUtils;

public class ReCommentVo extends BaseVo {
	private static final long serialVersionUID = 6937601037315369836L;
	public static final String ADDRESS_WEB="web";
	public static final String ADDRESS_WAP="wap";
	public static final String TAG_COMMENT = "comment"; //�ظ�����
	public static final String TAG_RECOMMENT = "recomment"; //�ظ��ظ�
	private Long id;
	private Long memberid;
	private Long relatedid;
	private String body;
	private Timestamp addtime;
	private Long tomemberid;
	private String status;
	private String address;//������Դ
	private String tag;
	private Long transferid;
	private Integer isread;//��������Ƿ��ѿ�,0:δ����1���Ѷ�
	private Integer toRead;//��Իظ��Ƿ��ѿ�,0:δ����1���Ѷ�
	private Integer toTop; // �ظ��ö� 1
	
	private String imgPath;//���ͼƬ
	private Integer flowernum; //�ʻ���
	private Long mtid;	//��ǩid
	
	private String atmemberjson;	//{'�û��ǳ�':�û�id}
	private String replyids;		//�ظ��ظ���id  ��","ƴ��
	
	public String getReplyids() {
		return replyids;
	}
	public void setReplyids(String replyids) {
		this.replyids = replyids;
	}
	public String getAtmemberjson() {
		return atmemberjson;
	}
	public void setAtmemberjson(String atmemberjson) {
		this.atmemberjson = atmemberjson;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Integer getFlowernum() {
		return flowernum;
	}
	public void setFlowernum(Integer flowernum) {
		this.flowernum = flowernum;
	}
	public Integer getIsread() {
		return isread;
	}
	public void setIsread(Integer isread) {
		this.isread = isread;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ReCommentVo(){}
	public ReCommentVo(Long memberid) {
		this.memberid = memberid;
		this.addtime = new Timestamp(System.currentTimeMillis());
		this.status = Status.Y_NEW;
		this.address = ADDRESS_WEB;
		this.isread = 0;
		this.toRead = 0;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRelatedid() {
		return relatedid;
	}

	public void setRelatedid(Long relatedid) {
		this.relatedid = relatedid;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
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
	public Long getTomemberid() {
		return tomemberid;
	}
	public void setTomemberid(Long tomemberid) {
		this.tomemberid = tomemberid;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Long getTransferid() {
		return transferid;
	}
	public void setTransferid(Long transferid) {
		this.transferid = transferid;
	}
	public Integer getToRead() {
		return toRead;
	}
	public void setToRead(Integer toRead) {
		this.toRead = toRead;
	}
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	@Override
	public Serializable realId() {
		return this.id;
	}
	public Integer getToTop() {
		return toTop;
	}
	public void setToTop(Integer toTop) {
		this.toTop = toTop;
	}
	public Long getMtid() {
		return mtid;
	}
	public void setMtid(Long mtid) {
		this.mtid = mtid;
	}
	public Map<String, String> atMemberMap(){
		return JsonUtils.readJsonToMap(this.atmemberjson);
	}
}
