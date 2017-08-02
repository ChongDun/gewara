package com.gewara.untrans.monitor;

import java.io.Serializable;
import java.util.Map;

public interface MonitorService {
	String KEY_TABLENAME = "TABLE_NAME";
	String KEY_HEXID = "HEXID";
	String PRE_WEBSERVICE = "PRE_WEBSERVICE";

	enum EXCEPTION_TAG{
		PAGE,		//ҳ���쳣
		SERVICE,	//�����쳣
		JOB			//��ʱ�����쳣
	}
	/**
	 * ������־����
	 * @param datatype
	 * @param entry
	 */
	void addMonitorEntry(String datatype, Map<String, String> entry);
	void addMonitorEntry(MonitorEntry entry);
	/**
	 * ��ȡͳ����Ϣ��count������������queued����ǰ������
	 * @return
	 */
	Map<String, String> getMonitorStatus();
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~business method~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/**
	 * ��̨�༭����
	 * @param userid
	 * @param clazz
	 * @param relatedid
	 * @param content
	 */
	void saveChangeLog(Long userid, Class clazz, Serializable relatedid, Map changeMap);
	/**
	 * ϵͳ���ݸ���
	 * @param clazz
	 * @param relatedid
	 * @param changeMap
	 */
	void saveSysChangeLog(Class clazz, Serializable relatedid, Map changeMap);
	/**
	 * ɾ������
	 * @param userid
	 * @param relatedid
	 * @param entity
	 */
	void saveDelLog(Long userid, Serializable relatedid, Object entity);
	/**
	 * ��������
	 * @param userid
	 * @param clazz
	 * @param relatedid
	 * @param entity
	 */
	void saveAddLog(Long userid, Class clazz, Serializable relatedid, Object entity);
	/**
	 * ǰ̨�û���Ϊ
	 * @param memberid
	 * @param action
	 * @param content
	 * @param ip
	 */
	void saveMemberLogMap(Long memberid, String action, Map<String, String> info, String ip);

	void saveMemberLog(Long memberid, String action, String content, String ip);

	/**
	 * ǰ̨�û���Ϊ
	 * @param membername: ��¼����
	 * @param action
	 * @param content
	 * @param ip
	 */
	void saveMemberLogByName(String membername, String action, Map<String, String> info, String ip);

	/**
	 * ϵͳ��������
	 * @param action
	 * @param title
	 * @param content
	 */
	void saveSysWarn(String title, String content, RoleTag role);
	void saveSysWarn(Class clazz, Serializable relatedid, String title, String content, RoleTag role);
	void saveSysTemplateWarn(String title, String template, Map model, RoleTag role);
	/**
	 * ϵͳ��������
	 * @param action
	 * @param title
	 * @param template
	 * @param model
	 */
	void saveSysTemplateWarn(Class clazz, Serializable relatedid, String title, String template, Map model, RoleTag role);
	
	void addApiLog(Map<String, String> params, long calltime);
	/**
	 * ���ӵ��ô���
	 * @param callname
	 */
	void incrementCallCount(String callname);
	/**
	 * ���ٵ��ô���
	 * @param msgname
	 */
	void decrementCallCount(String callname);
	Map<String, Integer> getCallCountInfo();
	int getCallCount(String callname);
	void addSysLog(SysLogType logtype, Map<String, String> entry);
	void addCountRecord(String tag, Long relatedid, Map updateMap);
	/**
	 * 
	 * @param tag
	 * @param location��uri �� service��job����
	 * @param title ����
	 * @param e excepion
	 */
	String logException(EXCEPTION_TAG tag, String location, String title, Throwable e, Map<String, String> otherinfo);
	/**
	 * ���ӷǷ����ʼ�¼
	 * @param ip
	 * @param params
	 */
	void logViolation(String ip, String resource, Map<String, String> params);
	
	void addTableData(String tablename, Map<String, String> params, byte[] rowId);
	void addBeanData(Class clazz, Map<String, String> bean);
	void addMonitorEvent(String eventType, Map<String, String> eventEntry);
	void addAccessLog(Map<String, String> logEntry);
	void addApiCall(Map<String, String> paramsLog, long cur, boolean success);
}
