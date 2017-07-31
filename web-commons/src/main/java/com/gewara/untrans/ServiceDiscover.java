package com.gewara.untrans;

import java.util.List;

import org.apache.curator.x.discovery.ServiceInstance;

public interface ServiceDiscover {

	/**
	 * ����name��ȡbasePah·���µķ���ʵ��<br>
	 * {@link ServiceDiscover#getServiceInstance(String, String)}
	 * @param name
	 * @return
	 * @throws Exception
	 */
	List<ServiceInstance<ServiceDetails>> getServiceInstance(String name) throws Exception;

	/**
	 * ���ݷ����ṩ��systemId �� name��ȡbasePah·���µķ���ʵ��
	 * <br>���ڷ�����ҵ�serviceNameʹ��{@link ServiceDetails#buildServiceName(String, String)}����
	 * @param providerSystemId
	 * @param name
	 * @return
	 * @throws Exception
	 */
	List<ServiceInstance<ServiceDetails>> getServiceInstance(String providerSystemId, String name) throws Exception;

}
