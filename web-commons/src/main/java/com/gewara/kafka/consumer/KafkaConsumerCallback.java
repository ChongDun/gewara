package com.gewara.kafka.consumer;

/**
 * kafka���ѻص�
 * @author quzhuping
 *
 */
public interface KafkaConsumerCallback {
	/**
	 * �ص��������ݷ���<br>
	 * ��Ҫʵ���첽�߼�����
	 * @param topic
	 * @param value
	 */
	void doCallBack(String topic, String value);
}
