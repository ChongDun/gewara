package com.gewara.untrans;

public interface ServiceRegister {

	/**
	 * ��zkע�����ӿ�����
	 * ���ڷ����ֵ�serviceNameʹ��{@link ServiceDetails#buildServiceName(String, String)}����
	 * @param details
	 * @throws Exception
	 */
	void registerService(ServiceDetails details) throws Exception;

	/**
	 * �޸�zk�Ѿ�ע��ķ���ӿ�����
	 * @param details
	 * @throws Exception
	 */
	void updateService(ServiceDetails details) throws Exception;

}
