/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.mall.constant;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public class MallOrderConstant {
	public static final String STATUS_NEW = "new";
	public static final String STATUS_CANCEL = "cancel";
	public static final String STATUS_REPEAT = "cancel_repeat";
	public static final String STATUS_TIMEOUT = "cancel_timeout";
	public static final String STATUS_NEW_CONFIRM = "new_confirm";
	public static final String STATUS_PAID_FAILURE = "paid_failure";
	public static final String STATUS_PAID_SUCCESS = "paid_success";
	public static final String STATUS_PAID_RETURN = "paid_return";
	public static final String STATUS_PAID_RETURN_PART = "paid_return_part";
	public static final String MALL_STATUS_PAID_DEPOSIT = "paid_deposit";
	public static final String MALL_STATUS_PAID_RETAINAGE = "paid_retainage";
	public static final String MALL_STATUS_PAID_EXCHANGE = "paid_exchange";
	public static final String EXP_STATUS_INIT = "init";
	public static final String EXP_STATUS_WAITSEND = "waitSend";
	public static final String EXP_EXPRESS_RECEIVE = "expressReceive";
	public static final String EXP_STATUS_SENDED = "sended";
	public static final String EXP_STATUS_RECEVIVE = "receive";
	public static final String EXP_STATUS_SENDED4ALL = "sended4All";
	public static final String EXP_STATUS_SENDED4PART = "sended4Part";
	public static final String EXP_STATUS_RECEVIVE4ALL = "receive4All";
	public static final String EXP_STATUS_RECEVIVE4PART = "receive4Part";
	public static final String EXP_STATUS_EXPRESS_RECEVIVE = "expressReceive";
	public static final String CATEGORY_PRODUCT = "product";
	public static final String CATEGORY_PRESELL_DEPOSIT = "presell_deposit";
	public static final String CATEGORY_PRESELL_RETAINAGE = "presell_retainage";
	public static Map<String, String> orderStatusMap;
	public static Map<String, String> expStatusMap;
	public static final String NS_HC_MOVIEORDER_ = "order4Movie";

	public static String getMovieHcTable(Long movieId) {
		return "order4Movie" + Math.abs(movieId.hashCode()) % 40;
	}

	static {
		LinkedHashMap linkedstatusMap = new LinkedHashMap();
		linkedstatusMap.put("new", "������");
		linkedstatusMap.put("cancel", "ȡ������");
		linkedstatusMap.put("cancel_repeat", "�ظ�����");
		linkedstatusMap.put("cancel_timeout", "��ʱȡ��");
		linkedstatusMap.put("new_confirm", "�ȴ�����");
		linkedstatusMap.put("cancel", "ȡ������");
		linkedstatusMap.put("cancel_repeat", "�ظ�����");
		linkedstatusMap.put("cancel_timeout", "��ʱȡ��");
		linkedstatusMap.put("paid_failure", "������");
		linkedstatusMap.put("paid_success", "�����ɹ�");
		linkedstatusMap.put("paid_return", "�˿��");
		linkedstatusMap.put("paid_return_part", "�����˿�");
		linkedstatusMap.put("paid_deposit", "�������");
		linkedstatusMap.put("paid_retainage", "β�����");
		linkedstatusMap.put("paid_exchange", "��������");
		orderStatusMap = UnmodifiableMap.decorate(linkedstatusMap);
		expStatusMap = new LinkedHashMap();
		expStatusMap.put("waitSend", "�ȴ�����");
		expStatusMap.put("sended", "�����ѷ���");
		expStatusMap.put("receive", "������ջ�");
		expStatusMap.put("sended4All", "�����ѷ���");
		expStatusMap.put("sended4Part", "���ַ���");
		expStatusMap.put("receive4All", "������ջ�");
		expStatusMap.put("receive4Part", "�����ջ�");
		expStatusMap.put("expressReceive", "��ݹ�˾������");
	}
}