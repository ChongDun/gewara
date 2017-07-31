package com.gewara.untrans.monitor;


public interface ConfigCenter {
	/**
	 * ע�ᵥϵͳ����
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param trigger
	 */
	void register(String systemid, String tag, ConfigTrigger trigger);
	/**
	 * ע��ȫ������
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param trigger
	 */
	void registerGlobal(String tag, ConfigTrigger trigger);

	/**
	 * ע�ᵥϵͳ���ã����������ֹ���ڵ������µ�����Ϣ��ʧ��
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param partition  ���128��
	 * @param trigger
	 */
	void register(String systemid, String tag, ConfigTrigger trigger, int partition);
	/**
	 * ע��ȫ�����ã����������ֹ���ڵ������µ�����Ϣ��ʧ��
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param trigger
	 * @param partition
	 */
	void registerGlobal(String tag, ConfigTrigger trigger, int partition);
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/**
	 * 
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 */
	void refresh(String systemid, String tag);
	
	/**
	 * 
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param data
	 */
	void refresh(String systemid, String tag, String data);
	
	/**
	 * 
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 */
	void refreshGlobal(String tag);
	
	/**
	 * 
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 * @param data
	 */
	void refreshGlobal(String tag, String data);

	/**
	 * 
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 */
	void reloadGlobal(String tag);
	
	/**
	 * 
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 */
	void reloadCurrent(String systemid, String tag);
	
	/**
	 * 
	 * @param systemid
	 * @param tag ��Ŀ¼�����ֻ��һ��Ŀ¼��ֱ�Ӵ�Ŀ¼���ƣ�����Ƕ༶Ŀ¼��Ŀ¼���á�/��������ע��ͷβ���ܼӡ�/��
	 */
	ConfigData getConfigData(String systemid, String tag);
}
