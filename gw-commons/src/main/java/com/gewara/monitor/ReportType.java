package com.gewara.monitor;

/**
 * @author gebiao(ge.biao@gewara.com)
 * @since Mar 3, 2014 11:57:56 AM
 */
public enum ReportType {
	reqnum("���ڴ������������"),
	dubbonum("DUBBO���ڴ������������"),
	jmsnum("���ڷ��͵�JMS��Ϣ����"),
	jvmdump("thread dump"),
	reqstats("����ͳ��"),
	exception("�쳣ͳ��"),
	scache("ServiceCache"),
	pcache("PageCache"),
	mongo("mongo��ͳ��"),
	gcache("GuavaCache"),
	dubboReq("dubbo�ӿ�����"),
	gworder("gworder������"),
	error("�������");//dubbo.xxxx, exception.xxxx
	
	private String description;
	public String getDescription() {
		return description;
	}
	private ReportType(String description){
		this.description = description;
	}
	
}
