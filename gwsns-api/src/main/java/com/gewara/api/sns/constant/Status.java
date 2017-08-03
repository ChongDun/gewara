package com.gewara.api.sns.constant;

import org.apache.commons.lang.StringUtils;

public abstract class Status {
	public static final String Y = "Y";							//������ʾ
	public static final String Y_NEW = "Y_NEW";				//�����ӡ��ʴ𡢻ظ�...
	public static final String Y_LOCK = "Y_LOCK";			//��
	public static final String Y_DOWN = "Y_DOWN";			//�³�����
	public static final String Y_LOCK_DOWN = "Y_LD";

	public static final String N = "N";							//���ⲻ��ʾ
	public static final String N_DELETE = "N_DELETE";		//��ɾ��
	public static final String N_FILTER = "N_FILTER";		//���ؼ��ֹ���
	public static final String N_ACCUSE = "N_ACCUSE";		//�ٱ���ʵ
	public static final String N_NIGHT = "N_NIGHT";			//ҹ�䷢��
	
	public static final String N_ERROR = "N_ERR";			//���ִ���
	
	public static final String Y_STOP = "Y_STOP";			//�ֹͣ����
	public static final String Y_PROCESS = "Y_PROCESS";	//����Ա���
	public static final String Y_TREAT = "Y_TREAT";			//����ڴ���
	
	public static final String STATUS_OPEN = "Y"; //�ѿ�
	public static final String STATUS_UNOPEN = "N"; //δ��
	
	public static final String Y_END = "Y_END"; //��Ʊ���ѿ���
	
	public static final String STATUS_OPENED = "Y_OPEN"; //�ѿ�
	public static final String STATUS_UNPOST = "Y_NOTPOST";//δ�ʼ�
	public static final String STATUS_POST_EXPRESS = "Y_EXP"; //���
	public static final String STATUS_POST_COMMON = "Y_POST";//ƽ�� 
	public static final String STATUS_UNOPENED = "N_NOTOPEN";//δ��
	public static final String STATUS_APPLY = "N_APPLY";//����
	//20110822
	public static final String STATUS_TRASH="N_TRASH";//��Ʊ��������������
	public static final String STATUS_APPLY_AGAIN="N_APPLYAGAIN";//���벹��
	public static final String STATUS_OPEN_AGAIN="Y_AGAIN";//�Ѳ���
	public static boolean isHidden(String status){
		return StringUtils.isNotBlank(status) && status.startsWith(N);
	}
	
	public static final String STATUS_N = "n";
	public static final String STATUS_Y = "y";
	public static final String TAG_BINDMOBILE = "bindMobile"; //�ֻ����
	public static final String TAG_USERLOGIN ="userLogin"; //����Ա��¼
	public static final Integer VALDMIN = 30;
}
