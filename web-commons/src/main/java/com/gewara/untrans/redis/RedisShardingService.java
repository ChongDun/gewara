package com.gewara.untrans.redis;

import java.util.List;

public interface RedisShardingService {

	/**
	 * ��ȡredis�л���Ķ���
	 * @param key not blank
	 * @param clazz not null
	 * @return null or obj,������治���ڣ��򷵻صĶ���������ֵΪnull
	 */
	<T> T getHashMapCache(String key, Class<T> clazz);

	/**
	 * ���������redis��
	 * @param key not blank
	 * @param obj not null
	 */
	<T> void putHashMapCache4All(String key, T obj);

	/**
	 * �������һ�����Դ���redis�У������򸲸�ֵ
	 * @param key not blank
	 * @param fieldName not blank
	 * @param fieldValue
	 */
	void putHashMapCache(String key, String fieldName, Object fieldValue);

	/**
	 * �����󼯼���redis list��, ��Ӧ{@link #pollQueueData(String)}
	 * @param key not null
	 * @param objs null empty
	 */
	<T> void putQueueCache4All(String key, List<T> objs);

	/**
	 * ��ȡredis list�еĶ���, ��Ӧ{@link #putQueueCache4All(String, List)}
	 * @param key
	 * @return listΪ�գ�����null
	 */
	<T> T pollQueueData(String key);

	/**
	 * ��key value�Դ��뻺����, ��Ӧ{@link #getCache(String)}
	 * @param key not blank
	 * @param value not blank
	 */
	void putCache(String key, String value);

	/**
	 * ����key��ȡ����ֵ, ��Ӧ{@link #putCache(String, String)}
	 * @param key
	 * @return keyΪ�ջ���value������ʱ����null
	 */
	String getCache(String key);
	/**
	 * ���������redis��,���ҽ���key������ʱ
	 * @param key not blank
	 * @param obj not null
	 * @return ���key�����򷵻�false
	 */
	<T> Boolean putHashMapCache4AllNotExist(String key, T obj);
	/**
	 * ����keyɾ������ֵ
	 * @param key
	 */
	void delCache(String key);
	/**
	 * ����key�������ʱ��
	 * @param key
	 * @param seconds ��
	 */
	void expireCache(String key,int seconds);
}
