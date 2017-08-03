package com.gewara.mall.constant;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public class MallOrderConstant {
	//�¶���
	public static final String STATUS_NEW = "new";									
	//ȡ������
	public static final String STATUS_CANCEL = "cancel";							
	//�ظ�����
	public static final String STATUS_REPEAT = "cancel_repeat";
	//��ʱȡ��
	public static final String STATUS_TIMEOUT = "cancel_timeout";
	//ȥ����
	public static final String STATUS_NEW_CONFIRM = "new_confirm";	
	//��֧��������
	public static final String STATUS_PAID_FAILURE = "paid_failure";				
	//���׳ɹ�������������״̬��
	public static final String STATUS_PAID_SUCCESS = "paid_success";				
	//�˿��
	public static final String STATUS_PAID_RETURN = "paid_return";
	//�����˿�
	public static final String STATUS_PAID_RETURN_PART = "paid_return_part";
	
	//�������
	public static final String MALL_STATUS_PAID_DEPOSIT = "paid_deposit";
	//β�����
	public static final String MALL_STATUS_PAID_RETAINAGE = "paid_retainage";
	//TODO ��������
	public static final String MALL_STATUS_PAID_EXCHANGE = "paid_exchange";			
	
	//��ʼ
	public static final String EXP_STATUS_INIT = "init";
	//�ȴ�����
	public static final String EXP_STATUS_WAITSEND = "waitSend";
	//��ݹ�˾������
	public static final String EXP_EXPRESS_RECEIVE = "expressReceive";
	//�����ѷ���
	public static final String EXP_STATUS_SENDED = "sended";
	//������ջ�
	public static final String EXP_STATUS_RECEVIVE = "receive";
		
	//ȫ������
	public static final String EXP_STATUS_SENDED4ALL = "sended4All";
	//���ַ���
	public static final String EXP_STATUS_SENDED4PART = "sended4Part";
	//ȫ���ջ�
	public static final String EXP_STATUS_RECEVIVE4ALL = "receive4All";
	//�����ջ�
	public static final String EXP_STATUS_RECEVIVE4PART = "receive4Part";
	//��ݹ�˾������
	public static final String EXP_STATUS_EXPRESS_RECEVIVE = "expressReceive";
	
	//��ͨ��Ʒ
	public static final String CATEGORY_PRODUCT = "product";
	//Ԥ�۶���
	public static final String CATEGORY_PRESELL_DEPOSIT = "presell_deposit";
	//Ԥ��β��
	public static final String CATEGORY_PRESELL_RETAINAGE = "presell_retainage";
	
	public static Map<String, String>  orderStatusMap;
	public static Map<String, String>  expStatusMap;
	static{
		LinkedHashMap<String, String> linkedstatusMap = new LinkedHashMap<>();
		linkedstatusMap.put(STATUS_NEW, "������");
		linkedstatusMap.put(STATUS_CANCEL, "ȡ������");
		linkedstatusMap.put(STATUS_REPEAT, "�ظ�����");
		linkedstatusMap.put(STATUS_TIMEOUT, "��ʱȡ��");
		
		linkedstatusMap.put(STATUS_NEW_CONFIRM, "�ȴ�����");
		linkedstatusMap.put(STATUS_CANCEL, "ȡ������");
		linkedstatusMap.put(STATUS_REPEAT, "�ظ�����");
		linkedstatusMap.put(STATUS_TIMEOUT, "��ʱȡ��");
		
		
		linkedstatusMap.put(STATUS_PAID_FAILURE, "������");
		linkedstatusMap.put(STATUS_PAID_SUCCESS, "�����ɹ�");
		linkedstatusMap.put(STATUS_PAID_RETURN, "�˿��");
		linkedstatusMap.put(STATUS_PAID_RETURN_PART, "�����˿�");
		
		linkedstatusMap.put(MALL_STATUS_PAID_DEPOSIT, "�������");
		linkedstatusMap.put(MALL_STATUS_PAID_RETAINAGE, "β�����");
		linkedstatusMap.put(MALL_STATUS_PAID_EXCHANGE, "��������");
		orderStatusMap = UnmodifiableMap.decorate(linkedstatusMap);
		
		expStatusMap = new LinkedHashMap<>();
		expStatusMap.put(EXP_STATUS_WAITSEND, "�ȴ�����");
		expStatusMap.put(EXP_STATUS_SENDED, "�����ѷ���");
		expStatusMap.put(EXP_STATUS_RECEVIVE, "������ջ�");
		
		expStatusMap.put(EXP_STATUS_SENDED4ALL, "�����ѷ���");
		expStatusMap.put(EXP_STATUS_SENDED4PART, "���ַ���");
		expStatusMap.put(EXP_STATUS_RECEVIVE4ALL, "������ջ�");
		expStatusMap.put(EXP_STATUS_RECEVIVE4PART, "�����ջ�");
		expStatusMap.put(EXP_STATUS_EXPRESS_RECEVIVE, "��ݹ�˾������");
	}
	public static final String NS_HC_MOVIEORDER_ = "order4Movie";
	public static String getMovieHcTable(Long movieId){
		return NS_HC_MOVIEORDER_+ Math.abs(movieId.hashCode())%40;
	}
}
