package com.gewara.command;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.BaseVo;

public class CommentVoCommand extends BaseVo implements Serializable{
	private static final long serialVersionUID = -4003691784832936833L;
	private Integer pageNumber;	//��ҳҳ��
	private Integer maxCount;	//����
	private Integer fromcount; //��ʼ����
	private String topic;		//����
	private String tag;					//��������
	private Long relatedid;				//����ID
	private String status;				//wala״̬
	private Integer bodyLength;		//���ڶ���������
	private Timestamp startTime;			//��ѯ������ʱ��
	private Timestamp endTime;
	private String flag;  				//ֵΪticket��ѯ��Ʊ�û�����������
	private Long mincommentid;			//��ѯcommentid֮�������
	private List<Long> memberidList;	//��ѯ���û�id ���ɳ���1000��
	private Long transferid;			//ת����commentid
	private String micrbody;			// ģ����ѯ����
	private String queryType;			//��ѯ����hot nothot					
	private String order;   			// ��������flowernum ��������
	private boolean asc;					//���� (������)
	private Long moderatorid;			//����id
	private String mtids;					//��ǩid
	private Integer basicweight;		//����Ȩ��
	private boolean gt;					//�Ƿ����
	private String source;				//��������Դ wap,web�ȵ�
	private Integer marks;				//�Ƿ�������
	private String pic;					//�Ƿ���ͼƬ
	private String video;				//�Ƿ�����Ƶ
	private String title;				//�Ƿ��б���
	private String qa;					//�Ƿ�Ϊ�ʴ�
	private Long memberid;				//�����û�id
	private String nickname;			//�û��ǳ�
	private String mtName;				//��ǩ����
	private String pointx;
	private String pointy;
	private String ip;
	private String otherinfo;
	
	private String type;					//��������
	private String citycode;				//���б���
	
	private List<Long> biglabelidList;	//���ǩidList
	
	public List<Long> getBiglabelidList() {
		return biglabelidList;
	}

	public void setBiglabelidList(List<Long> biglabelidList) {
		this.biglabelidList = biglabelidList;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getBodyLength() {
		return bodyLength;
	}

	public void setBodyLength(Integer bodyLength) {
		this.bodyLength = bodyLength;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Long getMincommentid() {
		return mincommentid;
	}

	public void setMincommentid(Long mincommentid) {
		this.mincommentid = mincommentid;
	}

	public List<Long> getMemberidList() {
		return memberidList;
	}

	public void setMemberidList(List<Long> memberidList) {
		this.memberidList = memberidList;
	}

	public Long getTransferid() {
		return transferid;
	}

	public void setTransferid(Long transferid) {
		this.transferid = transferid;
	}

	public String getMicrbody() {
		return micrbody;
	}

	public void setMicrbody(String micrbody) {
		this.micrbody = micrbody;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}

	public Long getModeratorid() {
		return moderatorid;
	}

	public void setModeratorid(Long moderatorid) {
		this.moderatorid = moderatorid;
	}

	public String getMtids() {
		return mtids;
	}

	public void setMtids(String mtids) {
		this.mtids = mtids;
	}

	public Integer getBasicweight() {
		return basicweight;
	}

	public void setBasicweight(Integer basicweight) {
		this.basicweight = basicweight;
	}

	public boolean isGt() {
		return gt;
	}

	public void setGt(boolean gt) {
		this.gt = gt;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getQa() {
		return qa;
	}

	public void setQa(String qa) {
		this.qa = qa;
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

	public String getMtName() {
		return mtName;
	}

	public void setMtName(String mtName) {
		this.mtName = mtName;
	}

	public String getPointx() {
		return pointx;
	}

	public void setPointx(String pointx) {
		this.pointx = pointx;
	}

	public String getPointy() {
		return pointy;
	}

	public void setPointy(String pointy) {
		this.pointy = pointy;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public Serializable realId() {//����ȷ��Ψһ��
		return 0;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public Integer getFromcount() {
		return fromcount;
	}

	public void setFromcount(Integer fromcount) {
		this.fromcount = fromcount;
	}
	
}
