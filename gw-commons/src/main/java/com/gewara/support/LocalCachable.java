package com.gewara.support;

public interface LocalCachable {
	/**
	 * �����뱾�ػ���ʱ���ٴζ������ݣ�Ӧ�÷���true����ֹ���ػ��汻����
	 * @return
	 */
	boolean fromCache();
	/**
	 * ���˶�������Ϊ���ػ���
	 * @param fromCache
	 */
	void fix2Cache();
	/**
	 * �ж������Ƿ�Ҫ���棬���������ʷ���ݲ�����
	 * @return
	 */
	boolean cachable();
	
}
