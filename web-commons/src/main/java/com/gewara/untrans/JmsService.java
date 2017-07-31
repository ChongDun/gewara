package com.gewara.untrans;

import java.util.Map;

public interface JmsService {
	/**
	 * ����һ�����Ͷ���
	 * @param queue
	 * @param persist
	 * @param override �Ѵ����Ƿ񸲸�
	 * @return
	 */
	void addQueue(String queue, boolean persist, boolean override);
	/**
	 * @param msgtag
	 * @param keyList ��,�ָ������key
	 * @param params ��keyList��Ӧ�����ֵ
	 */
	void sendMsgToDst(String dst, String tag, String msg);
	void sendMsgToDst(String dst, String tag, Map msg);
	void sendMsgToDst(String dst, String tag, String keyList, Object ... params);
	void sendMsgToDstWithMultiHead(String dst, String tag, Map msg, Map<String, String> headMap);
	
	/**
	 * ��ʱ����Ŀ��
	 * @param dst
	 * @param tag
	 * @param msgMap
	 * @param delay �״��ӳ�(ms)
	 */
	void delaySendMsgToDst(String dst, String tag, Map msgMap, long delay);
	/**
	 * ��ʱ����Ŀ��
	 * @param dst
	 * @param tag
	 * @param msg
	 * @param delay �״��ӳ�(ms)
	 */
	void delaySendMsgToDst(String dst, String tag, String msg, long delay);
	/**
	 * TODO:test
	 * ��ʱ�ظ�������Ϣ��dst
	 * @param dst
	 * @param tag
	 * @param msgMap
	 * @param delay �״��ӳ�(ms)
	 * @param period ÿ�μ�� (ms)
	 * @param repeatNum �ط�����(��һ�η�������ظ�repeatNum�Σ�
	 */
	void periodSendMsgToDst(String dst, String tag, Map msgMap, long delay, long period, int repeatNum);
}
