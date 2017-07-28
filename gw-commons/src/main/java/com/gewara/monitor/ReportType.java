/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.monitor;

public enum ReportType {
	reqnum("���ڴ������������"), dubbonum("DUBBO���ڴ������������"), jmsnum("���ڷ��͵�JMS��Ϣ����"), jvmdump("thread dump"), reqstats(
			"����ͳ��"), exception("�쳣ͳ��"), scache("ServiceCache"), pcache("PageCache"), mongo(
					"mongo��ͳ��"), gcache("GuavaCache"), dubboReq("dubbo�ӿ�����"), gworder("gworder������"), error("�������");

	private String description;

	public String getDescription() {
		return this.description;
	}

	private ReportType(String description) {
		this.description = description;
	}
}