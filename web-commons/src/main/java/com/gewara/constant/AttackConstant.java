package com.gewara.constant;


public class AttackConstant {
	/**������״̬����Ч��*/
	public static final String STATUS_ACTIVATED = "activated";
	/**������״̬������Ч��*/
	public static final String STATUS_DEACTIVATED = "deactivated";
	/**������״̬����ɾ����*/
	public static final String STATUS_DELETED = "deleted";
	
	/**������Դ���ֶ�*/
	public static final String ADDSOURCE_MANUAL = "manual";	
	/**������Դ��url*/
	public static final String ADDSOURCE_URL = "url";	
	/**������Դ��ip*/
	public static final String ADDSOURCE_IP = "ip";
	/**������Դ��Exception����*/
	public static final String ADDSOURCE_ATTACK = "attack";
	
	public static final String ACCESS_URL_ALL = "ALL";//����IP���з���


	/**�ص�uri����ͬ��ǰ׺��֪ͨ������ϵͳ�������ϵͳid*/
	public static final String CHANGE_URI = "attack.uri.change.";
	public static final String CHANGE_BLACK = "attack.black.change";
	public static final String CHANGE_WHITE = "attack.white.change";

	/**
	 * �ص�url���������޸ı䶯֪ͨ��ַ
	 */
	public static final String CHANGE_CONFIG = "attack.config.change";

	/**������ȡ������IP*/
	public static final String URI_GET_BLACKLIST = "/inner/ip/blackList.xhtml";
	/**������ȡ����ĺ�����IP*/
	public static final String URI_GET_CHANGED_BLACK ="/inner/ip/black/getNewBlackList.xhtml";
	/**������ȡ������IP*/
	public static final String URI_GET_ALLWHITE = "/inner/ip/white/getAll.xhtml";
	
	public static final String URI_GET_URL_CONFIG = "/inner/url/config/get.xhtml";
}
