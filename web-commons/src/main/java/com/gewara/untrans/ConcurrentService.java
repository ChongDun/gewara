package com.gewara.untrans;

import java.util.concurrent.BlockingQueue;

import com.gewara.support.concurrent.AtomicCounter;

public interface ConcurrentService {
	/**
	 * ��ȡȫ�ּ�����
	 * @param key
	 * @return
	 */
	AtomicCounter getAtomicCounter(String key);
	/**
	 * ��ȡcluster�����������֧�֣�
	 * @param key
	 * @return
	 */
	AtomicCounter getLocalAtomicCounter(String key);
	/**
	 * ��ȡclusterQueue�����֧�֣�
	 * @param key
	 * @return
	 */
	BlockingQueue<Object> getBlockQueue(String key);
	void unregisterBlockQueue(String key);

}
