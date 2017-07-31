package com.gewara.trace;

import java.io.Serializable;

/**
 * ������������
 * <br>���꣺<hr>http://wk.gewara.com/pages/viewpage.action?pageId=19147575</hr>
 * @author user
 */
public class TraceContext implements Serializable{
	private static final long serialVersionUID = -6108668320446033050L;
	
	public static String DT_TRACEID = "DT_TRACEID";
	public static String DT_PARENTID = "DT_PARENTID";
	public static String DT_SPANSEQ = "DT_SPANSEQ";

	private String traceId; //������ȫ��id
	private int parentId;
	private int spanSeq;	//��ǰspan����ţ��ӽڵ��ڴ˻����ϼ�1�������Լ���spanid
	
	public TraceContext(String traceId, int parentId, int spanSeq){
		this.traceId = traceId;
		this.parentId = parentId;
		this.spanSeq =spanSeq;
	}

	public String getTraceId() {
		return traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public int getSpanSeq() {
		return spanSeq;
	}

	public void setSpanSeq(int spanSeq) {
		this.spanSeq = spanSeq;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	
}
