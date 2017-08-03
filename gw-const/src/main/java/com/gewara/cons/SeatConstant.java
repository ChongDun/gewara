package com.gewara.cons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class SeatConstant {
	public static final String STATUS_NEW = "A";//����λ
	public static final String STATUS_SELLING = "W";//�۳���������ݿ��в����ڴ�״̬��ֻ��status==A and validtime<cur�Ż᷵�ش�״̬��
	public static final String STATUS_SOLD = "S";//�۳�
	
	public static final String STATUS_LOCKB = "B";//ӰԺ�۳�����
	public static final String STATUS_LOCKC = "C";//������λ����
	public static final String STATUS_LOCKD = "D";//��Ʊ����
	
	public static final String STATUS_LOCKZ = "Z";//ӰԺά������
	
	public static final String STATUS_LOCKM = "M";	//��ͨ�û�������λ
	public static final String STATUS_LOCKG = "G";	//�����û�������λ
	
	public static final String STATUS_LOCK_REMOTE = "R";//ӰԺ�۳�����
	
	private static final Map<String, String> statusTextMap = new HashMap<String, String>();
	static{
		statusTextMap.put(STATUS_LOCKB, "ӰԺ�۳�����");
		statusTextMap.put(STATUS_LOCKC, "������λ����");
		statusTextMap.put(STATUS_LOCKD, "��Ʊ����");
		statusTextMap.put(STATUS_LOCKZ, "ӰԺά������");
	}
	public static final List<String> STATUS_LOCK_LIST = Arrays.asList(STATUS_LOCKB, STATUS_LOCKC, STATUS_LOCKD);
	//����ά����λ
	public static final List<String> STATUS_LOCK_LIST2 = Arrays.asList(STATUS_LOCKB, STATUS_LOCKC, STATUS_LOCKD, STATUS_LOCKZ);


}
