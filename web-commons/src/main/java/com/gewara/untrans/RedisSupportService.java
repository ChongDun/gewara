package com.gewara.untrans;

import java.util.concurrent.BlockingQueue;

import org.springframework.data.redis.support.collections.DefaultRedisMap;

import com.gewara.support.concurrent.AtomicCounter;

/**
 * redis֧�ַ�����
 * <br>����spring-redis��װ
 * @author quzhuping
 *
 * @param <E>
 */
public interface RedisSupportService<E> {

	/**
	 * ��ȡ����redis listʵ�ֵ�queue��<b>�Ѿ����浽����cache</b>
	 * <br>ʹ��.poll()������ȡͷ������
	 * <br>ʹ��.offer(E)
	 * @param key
	 * @return
	 */
	BlockingQueue<E> getRedisQueue(String key);
	
	/**
	 * ��ȡ����redis string ʵ�ֵ�atomicCounter
	 * @param key
	 * @return
	 */
	AtomicCounter getRedisAtomicCounter(String key);

	/**
	 * ��ȡredisMap��<b>�Ѿ����浽����cache</b>
	 * @param key
	 * @return
	 */
	DefaultRedisMap<String, Object> getRedisHash(String key);

}
