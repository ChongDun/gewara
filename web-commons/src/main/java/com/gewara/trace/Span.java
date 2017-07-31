package com.gewara.trace;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import com.gewara.util.JsonUtils;
/**
 * ��������һ���ڵ㣬ͨ��traceIdȷ�����ݵĵ���������
 * <br>���꣺<hr>http://wk.gewara.com/pages/viewpage.action?pageId=19147575</hr>
 * @author user
 *
 */
public class Span implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;		//=traceId + spanId
	private String traceId;	//ȫ��Ψһid
	private Integer parentId;	//��ID�����Ϊ0��Ϊroot span
	private Integer spanId;		//��ǰ�ڵ�id
	private Long callTime;	//����ʱ���
	private Long rvTime;	//����ʱ���
	private String systemId;//ϵͳid
	private String host;//�ڵ�������
	private String spanUri;	//�ڵ�uri
	private Integer duration;
	
	public Span(){
	}
	/**
	 * ���캯��
	 * @param systemId ϵͳid
	 * @param hostname �ڵ�������
	 * @param spanUri �ڵ�uri
	 * @param traceId ȫ��Ψһid
	 * @param parentId ��ID�����Ϊ0��Ϊroot span
	 * @param spanId ��ǰ�ڵ�id
	 * @param calltime ����ʱ���
	 */
	public Span(String systemId, String host, String spanUri, String traceId, Integer parentId, Integer spanId,Long calltime){
		this.id = traceId + "_" + spanId;
		this.systemId = systemId;
		this.host = host;
		this.spanUri = clean(spanUri);
		this.traceId = traceId;
		this.parentId = parentId;
		this.spanId = spanId;
		this.callTime = calltime;
	}
	
	@Override
	public String toString(){
		return JsonUtils.writeObjectToJson(this);
	}
	
	public String getTraceId() {
		return traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getSpanId() {
		return spanId;
	}
	public void setSpanId(Integer spanId) {
		this.spanId = spanId;
	}
	public Long getCallTime() {
		return callTime;
	}
	public void setCallTime(Long callTime) {
		this.callTime = callTime;
	}
	public Long getRvTime() {
		return rvTime;
	}
	public void setRvTime(Long rvTime) {
		this.rvTime = rvTime;
		this.duration = (int) (this.rvTime - this.callTime);
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getSpanUri() {
		return spanUri;
	}
	public void setSpanUri(String spanUri) {
		this.spanUri = clean(spanUri);
	}
	public String getId() {
		return id;
	}
	/**
	 * �洢ʱ��Ϊes��idʹ��
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	public String getHost() {
		return host;
	}

	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	private String clean(String src){
		String rv = StringUtils.replace(StringUtils.replace(StringUtils.substringBefore(src, "("),"com.", "c."),"gewara.", "g.");
		if(StringUtils.contains(rv, " ")){
			rv = StringUtils.substringAfterLast(rv, " ");
		}
		return rv;
	}
}
