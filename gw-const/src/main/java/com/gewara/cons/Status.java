package com.gewara.cons;


public abstract class Status {

	public static final String Y = "Y";							//������ʾ
	public static final String Y_NEW = "Y_NEW";				//�����ӡ��ʴ𡢻ظ�...
	public static final String Y_LOCK = "Y_LOCK";			//��
	public static final String Y_DOWN = "Y_DOWN";			//�³�����
	public static final String Y_LOCK_DOWN = "Y_LD";
	
	public static final String DEL = "D";						//ɾ��
	public static final String N = "N";							//���ⲻ��ʾ
	public static final String N_DELETE = "N_DELETE";		//��ɾ��
	public static final String N_FILTER = "N_FILTER";		//���ؼ��ֹ���
	public static final String N_ACCUSE = "N_ACCUSE";		//�ٱ���ʵ
	public static final String N_NIGHT = "N_NIGHT";			//ҹ�䷢��
	
	public static final String N_ERROR = "N_ERR";			//���ִ���
	
	public static final String Y_STOP = "Y_STOP";			//�ֹͣ����
	public static final String Y_PROCESS = "Y_PROCESS";	//����Ա���
	public static final String Y_TREAT = "Y_TREAT";			//����ڴ���

	public static final String SINA = "sina";//����΢��
	public static final String NO_ATTENTION = "0";//�޹�ϵ
	public static final String ONLY_ATTENTION = "1";//���ҹ�ע��
	public static final String ONLY_BEATTENTION = "2";//����ע�ҵ�
	public static final String EACH_ATTENTION = "3";//�໥��ע
	public static final String MOBILE_PHONE = "mobile";//ͨѶ¼
	public static final String MOBILE_MD5_CODE = "!*@#$d";
}
