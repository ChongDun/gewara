package com.gewara.untrans;

import java.util.Collection;
import java.util.Map;

import com.gewara.model.BaseObject;
import com.gewara.support.CachePair;

public interface CacheService extends CacheTools {
	// �̶�����
	String REGION_TENMIN = "tenMin";
	String REGION_ONEHOUR = "oneHour";
	String REGION_LOGINAUTH = "loginAuth"; // 2hour
	String REGION_SERVICE = "service"; // 12 hour
	String REGION_FIVEDAY = "fiveDay"; // 5day
	String REGION_LOGINKEY = "loginKey";

	/**
	 * @param claszz
	 * @param key
	 * @param mpid
	 */
	<T extends BaseObject> void cleanUkey(Class<T> claszz, String key, Long mpid);

	/**
	 * @function ���key
	 */
	Map<String, Object> getBulk(String regionName, Collection<String> keys);

	/**
	 * ʹ�ö����ĳ�ʱʱ��
	 * 
	 * @param regionName
	 * @param key
	 * @param value
	 * @param timeoutSecond
	 *            ��ʱ����
	 */
	void set(String regionName, String key, Object value, int timeoutSecond);

	/**
	 * ֱ�Ӹ��»���
	 */
	void updateValue(String regionName, String key, String newvalue);

	void refreshVersion();

	Integer getCacheTime(String region);

	/**
	 * ���Ӽ�������ԭ�Ӳ���
	 * 
	 * @param key
	 * @param by
	 *            ���ֵ
	 * @param defvalue
	 *            Ĭ��ֵ
	 * @return
	 */
	int incr(String regionName, String key, int by, int defvalue);

	/**
	 * ԭ�Ӽ�
	 * 
	 * @param regionName
	 * @param key
	 * @param by
	 *            ����
	 * @param def
	 *            Ĭ��ֵ
	 * @return the new value, or -1 if we were unable to increment or add
	 */
	int incrementAndGet(String regionName, String key, int by, int def);

	CachePair getCachePair(String regionName, String key);

	/**
	 * @param regionName
	 * @param key
	 * @param version
	 * @param value
	 * @param expSeconds
	 * @return
	 */
	boolean setCachePair(String regionName, String key, long version, Object value, int expSeconds);

	void add(String regionName, String key, Object value, int expSeconds);

	/**
	 * ԭ�Ӽ�
	 * 
	 * @param regionName
	 * @param key
	 * @param by
	 * @param def
	 *            the default value (if the counter does not exist)
	 * @return the new value, or -1 if we were unable to decrement or add
	 */
	int decrAndGet(String regionName, String key, int by, int def);

	/**
	 * ԭ�Ӽ�
	 * 
	 * @param regionName
	 * @param key
	 * @param by
	 * @param def
	 * @param exp
	 *            ��ʱʱ��,��
	 * @return
	 */
	int incrementAndGet(String regionName, String key, int by, int def, int exp);
}
