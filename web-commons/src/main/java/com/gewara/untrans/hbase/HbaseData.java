package com.gewara.untrans.hbase;

import java.util.Arrays;
import java.util.List;

public class HbaseData {
	//���ݱ�
	public static final String TABLE_LOGENTRY = "exceptionlog";		//ҳ�������־��Exception��
	public static final String TABLE_MONITOR = "monitor";				//�������
	public static final String TABLE_APILOG = "apilog";				//api��־
	public static final String TABLE_APILOG2 = "apilog2";				//api��־2����apilog���л����������
	public static final String TABLE_HFHLOG = "hfhlog";				//������apiͳ�ƣ�Ŀǰֻ�л��ˡ���������־
	public static final String TABLE_SYSWARN = "syswarn";				//ϵͳ����
	public static final String TABLE_SYSLOG = "syslog";				//ϵͳ��־
	public static final String TABLE_GEWAORDER = "gewaorder";		//�¶�����־
	public static final String TABLE_CHANGEHIS = "changehis";		//�¶��������־
	public static final String TABLE_MEMBERLOG = "memberlog";		//ǰ̨�û�����
	public static final String TABLE_MEMBERLOG2 = "memberlog2";		//ǰ̨�û�����:membernameΪ����
	public static final String TABLE_DOMAINLOG = "domainlog";		//��̨��־
	public static final String TABLE_APICALL = "apicall";				//����API��־�������߼�¼��
	public static final String TABLE_IPSTATS = "ipstats";				//IP����ͳ��
	public static final String TABLE_COUNTRECORD = "countrecord";	//��������
	public static final String TABLE_VIOLATION = "violation";		//�Ƿ�����
	public static final String TABLE_DATASTORE = "datastore";		//������־
	public static final String TABLE_CCSREQ = "ccsreq";				//������־
	public static final String TABLE_OPISTATS = "opistats";			//����ͳ������
	public static final String TABLE_BEANDATA = "beandata";			//����ͳ������
	public static final String TABLE_APPREPORT = "appreport";		//APP�����ϱ�
	public static final String TABLE_DAUDATA = "daudata";				//�ջ��û�����
	public static final String TABLE_MEMACTCONVERGE = "memactconverge";	//�û���Ϊ�ۺ�����
	public static final String TABLE_EVENT = "event";					//����¼���һ��Ϊ���¡����ݵ������ϱ���
	public static final String TABLE_ERRORLOG = "errorlog";			//������־
	public static final String TABLE_OPISTATS_TRIGGER = "opistats_trigger";//����ͳ�ƴ�����¼
	public static final String TABLE_ACCESSLOG = "accesslog";		//access.log
	//public static final String TABLE_DAUCOUNT = "daucount";		//�ջ��û��ۺ�
	
	

	//�Զ���rowid����֧��ֱ��rowidʱ�䷶Χ
	private static final List<String> SELF_GENROWID_TABLES = Arrays.asList(TABLE_CHANGEHIS, TABLE_GEWAORDER);
	/**
	 * �ж�һ�����Ƿ�֧��ֱ��rowidʱ�䷶Χ��ѯ,Ĭ�� hbase ֧��TimeRange������Ҫ����???
	 * @param table
	 * @return
	 */
	public static boolean supportTimeRange(String table){
		return !SELF_GENROWID_TABLES.contains(table);
	}
}
