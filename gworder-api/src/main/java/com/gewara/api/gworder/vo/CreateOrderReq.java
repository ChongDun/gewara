package com.gewara.api.gworder.vo;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;

/**
 * ���������������
 * <br>Ĭ�ϴ���������ҵ�����߼��ڵ㳬ʱʱ��Ϊ30��
 * @author quzhuping
 *
 */
public class CreateOrderReq extends BaseVo {
	private static final long serialVersionUID = -6371087548888845993L;
	
	public  static final String TAG_MOVIE="movie";
	public  static final String TAG_DRAMA="drama";
	public  static final String TAG_GOODS="goods";
	
	protected String tag;				//movie��drama������
	protected String contextKey;		//������key
	protected String asyncQueueKey;		//�첽��Ӧ����key�����������
	protected Long invalidTime;			//���������Чʱ�䣬������Чʱ������������ĺ�������
	protected Long memberId;			//�����û�
	protected Long relatedId;			//mpid,goodsid,ottid(sport),dpid(drama),pubid(pubsale),gci(gym),mctid(membercard)
	protected String remoteIp;			//�û�ip
	protected String source;			//������Դ��������ʶ������Դ��������վ��Openapi
	public CreateOrderReq(){
		invalidTime = System.currentTimeMillis() + 60 * 1000;
	}
	
	public CreateOrderReq(String tag, String contextKey, String asyncQueueKey, String remoteIp, Long memberId, Long relatedId) {
		super();
		invalidTime = System.currentTimeMillis() + 60 * 1000;
		this.tag = tag;
		this.contextKey = contextKey;
		this.asyncQueueKey = asyncQueueKey;
		this.memberId = memberId;
		this.relatedId = relatedId;
		this.remoteIp = remoteIp;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}

	public long getRelatedId() {
		return relatedId;
	}

	public Long getInvalidTime() {
		return invalidTime;
	}

	public void setInvalidTime(Long invalidTime) {
		this.invalidTime = invalidTime;
	}

	public String getContextKey() {
		return contextKey;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public void setRelatedId(Long relatedId) {
		this.relatedId = relatedId;
	}

	public void setContextKey(String contextKey) {
		this.contextKey = contextKey;
	}

	public String getAsyncQueueKey() {
		return asyncQueueKey;
	}
	

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	/**
	 * �����첽��Ӧ����key,������Ϣ�����÷�����
	 * @param asyncQueueKey ����queueName + systemId + systemhost
	 */
	public void setAsyncQueueKey(String asyncQueueKey) {
		this.asyncQueueKey = asyncQueueKey;
	}

	/**
	 * ����Ψһkey,����û���ָ����ʹ��Ĭ�Ϲ���
	 * <br>�첽�����Ĺ���ʹ��
	 * @return
	 */
	public String buildContextKey(){
		if(StringUtils.isBlank(contextKey)){
			contextKey =  memberId + ":" + tag + ":" + relatedId;
		}
		return contextKey;
	}
	
	/**
	 * ���ó�ʱʱ��
	 * @param invalidTime
	 */
	public void setInvalidTime(long invalidTime, TimeUnit unit){
		this.invalidTime = System.currentTimeMillis() + unit.toMillis(invalidTime);
	}

	/**
	 * �Ƿ��ǳ�ʱ����
	 * @return true ��ʱ��false δ��ʱ
	 */
	public boolean isTimeoutReq(){
		return (System.currentTimeMillis() - invalidTime) > 0;
	}
	
	@Override
	public Serializable realId() {
		return this.buildContextKey();
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
}
