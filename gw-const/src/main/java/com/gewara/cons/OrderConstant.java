/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.cons;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;

public class OrderConstant {
	public static final String CHANGEHIS_KEY_CHANGESEAT = "changeSeat";
	public static final String CHANGEHIS_KEY_SUCCESSCHANGE = "successChange";
	public static final String CHANGEHIS_KEY_MPITO = "mpito";
	public static final String CHANGEHIS_KEY_MPIFROM = "mpifrom";
	public static final String CHANGEHIS_KEY_RECONFIRMS = "reconfirms";
	public static final String CHANGEHIS_KEY_MOBILE_BUYTIMES = "buytimes";
	public static final String CHANGEHIS_KEY_MEMBER_BUYTIMES = "mbtimes";
	public static final String CHANGEHIS_KEY_PROCESSTIMES = "processtimes";
	public static final String CHANGEHIS_KEY_PROCESSMSG = "processError";
	public static final String CHANGEHIS_KEY_PROCESSCODE = "processCode";
	public static final String OTHERKEY_CREDENTIALSID = "credentialsId";
	public static final String OTHERKEY_BINDMEMBER = "bindMember";
	public static final String OTHERKEY_TELEPHONE = "telephone";
	public static final String OTHERKEY_BINDMOBILE = "bindMobile";
	public static final String OTHERKEY_USE_INSURE = "isUseInsure";
	public static final String OTHERKEY_CREATEMEMBER = "createMember";
	public static final String OTHERKEY_DELAY_CARDNO = "delayCardNo";
	public static final String OTHERKEY_TAKEMETHOD_ID = "takemethodID";
	public static final String OTHERKEY_CHARITY = "charity";
	public static final String OTHERKEY_GREETINGS = "greetings";
	public static final String OTHERKEY_DISTYPE = "p_distype";
	public static final String OTHERKEY_DISCOUNT = "p_discount";
	public static final String OTHERKEY_DISAMOUNT = "p_disamount";
	public static final String OTHERKEY_CARDNO = "cardno";
	public static final String OTHERKEY_SHARECODE = "sharecode";
	public static final String OTHERKEY_CONVERTSTATUS = "convertStatus";
	public static final String OTHERKEY_EXTERNALORDERNO = "externalOrderNo";
	public static final String OTHERKEY_COUNTRY_CODE = "countryCode";
	public static final String OTHERKEY_CUST_FIRSTNAME = "firstName";
	public static final String OTHERKEY_CUST_LASTNAME = "lastName";
	public static final String OTHERKEY_CLIENTIP = "clientIp";
	public static final String STATUS_NEW = "new";
	public static final String STATUS_NEW_UNLOCK = "new_unlock";
	public static final String STATUS_NEW_CONFIRM = "new_confirm";
	public static final String STATUS_PAID = "paid";
	public static final String STATUS_PAID_FAILURE = "paid_failure";
	public static final String STATUS_PAID_SPECIAL = "paid_special";
	public static final String STATUS_PAID_UNFIX = "paid_failure_unfix";
	public static final String STATUS_PAID_SUCCESS = "paid_success";
	public static final String STATUS_PAID_RETURN = "paid_return";
	public static final String STATUS_EMAIL_ID = "email_id";
	public static final String STATUS_CANCEL = "cancel";
	public static final String STATUS_SYS_CANCEL = "cancel_sys";
	public static final String STATUS_SYS_CHANGE_CANCEL = "cancel_sys_change";
	public static final String STATUS_REPEAT = "cancel_repeat";
	public static final String STATUS_USER_CANCEL = "cancel_user";
	public static final String STATUS_TIMEOUT = "cancel_timeout";
	public static final Map<String, String> statusMap = new HashMap();
	public static final Map<String, String> manualOrderMap;
	public static final String UNIQUE_BY_MEMBERID = "memberid";
	public static final String UNIQUE_BY_MOBILE = "mobile";
	public static final String UNIQUE_BY_MEMBER_AND_MOBILE = "all";
	public static final String UNIQUE_BY_PARTNERNAME = "partnername";
	public static final String UNIQUE_BY_DEVICEID = "deviceid";
	public static final String ORDER_EXPRESSNO = "expressNo";
	public static final String ORDER_EXPRESSMode = "expressMode";
	public static final String SYSBANK_BUY = "buy";
	public static final String SYSBANK_GIFT = "gift";
	public static final String ORDER_BANKMEMBERUKEY = "bankMemberUkey";
	public static final String ORDER_HASLOVESEAT = "hasLoveSeat";
	public static final String TRAINING_ORDER_IS_SURE = "isSure";
	public static final String SETTLE_NONE = "O";
	public static final String SETTLE_N = "N";
	public static final String SETTLE_Y = "Y";
	public static final String DISCOUNT_STATUS_Y = "Y";
	public static final String DISCOUNT_STATUS_N = "N";
	public static final String PREPAY_Y = "Y";
	public static final String PREPAY_N = "N";
	public static final String PREPAY_S = "S";
	public static final String PREPAY_G = "G";
	public static final String PREPAY_T = "T";
	public static final String PREPAY_P = "P";
	public static final String PREPAY_C = "C";
	public static final String PREPAY_A = "A";
	public static final String ORDER_TYPE_TICKET = "ticket";
	public static final String ORDER_TYPE_GOODS = "goods";
	public static final String ORDER_TYPE_DRAMA = "drama";
	public static final String ORDER_TYPE_PUBSALE = "pubsale";
	public static final String ORDER_TYPE_GUARANTEE = "guarantee";
	public static final String ORDER_TYPE_MALL = "mall";
	public static final String ORDER_TYPE_BAOCHANG = "baoChang";
	public static final String ORDER_PRICATEGORY_MOVIE = "movie";
	public static final String ORDER_PRICATEGORY_DRAMA = "drama";
	public static final String ORDER_PRICATEGORY_ACTIVITY = "activity";
	public static final String ORDER_PRICATEGORY_PUBSALE = "pubsale";
	public static final String ORDER_PRICATEGORY_POINT = "point";
	public static final String ORDER_PRICATEGORY_MAll = "mall";
	public static final String REMOTE_STATUS_NEW = "N";
	public static final String REMOTE_STATUS_LOCK = "0";
	public static final String REMOTE_STATUS_FIXED = "1";
	public static final String REMOTE_STATUS_UNLOCK = "2";
	public static final String REMOTE_STATUS_FAILED = "F";
	public static final String REMOTE_STATUS_ERROR = "X";
	public static final String REMOTE_STATUS_CANCEL = "C";
	public static final String REMOTE_STATUS_UNKNOWN = "U";
	public static final String CHECKMARK_N = "N";
	public static final String CHECKMARK_Y = "Y";
	public static final String OTHERFEE_REASON_UMPAY = "umPay";
	public static final String OTHERFEE_REASON_UMPAY_SH = "umPay_sh";
	public static final String OTHERFEE_REASON_EXPRESS = "express";
	public static final Long CARD_DELAY_GOODSID = Long.valueOf(152385164L);
	public static final String MANUAL_STATUS_NEW = "new";
	public static final String MANUAL_STATUS_CHECK = "checked";
	public static final String MANUAL_STATUS_CANCEL = "cancel";
	public static final String MANUAL_STATUS_PAY = "pay";
	public static final String MANUAL_STATUS_NOISSUE = "noissue";
	public static final String MANUAL_STATUS_CANISSUE = "canissue";
	public static final String MANUAL_STATUS_ISSUE = "issue";
	public static final String MANUAL_SETTLETYPE_NORM = "norm";
	public static final String MANUAL_SETTLETYPE_MANUAL = "manual";
	public static final Integer MINPOINT = Integer.valueOf(500);
	public static final Integer MAXPOINT = Integer.valueOf(10000);
	public static final String PUBSALE_MSG = "��������������ܰ��ʾ��������ĸ��������������Ļ�Ѿ��ĳɹ�����������Чʱ���ڶԸö�������ȷ�ϼ�֧����лл��";

	public static Map convert2Chinese(Map params) {
		HashMap map = new HashMap();
		if (params != null && !params.isEmpty()) {
			Iterator arg1 = params.keySet().iterator();

			while (arg1.hasNext()) {
				Object key = arg1.next();
				if ("address".equals(key)) {
					map.put("�ջ���ַ", params.get("address"));
				} else if ("remark".equals(key)) {
					if (StringUtils.isNotBlank((String) params.get(key))) {
						map.put("��ע", params.get(key));
					}
				} else if (!"preType".equals(key)) {
					if ("category".equals(key)) {
						map.put("��Ʒ���", params.get("category"));
					} else {
						map.put(key, params.get(key));
					}
				}
			}

			return map;
		} else {
			return map;
		}
	}

	static {
		statusMap.put("cancel", "������ȡ��");
		statusMap.put("cancel_repeat", "�ظ�����");
		statusMap.put("cancel_user", "�û�ȡ��");
		statusMap.put("cancel_sys", "ϵͳȡ��");
		statusMap.put("cancel_sys_change", "ϵͳ����ȡ��");
		statusMap.put("new", "�¶���");
		statusMap.put("new_confirm", "�ȴ�����");
		statusMap.put("new_unlock", "��ʱ����");
		statusMap.put("paid", "����ɹ�");
		statusMap.put("paid_success", "���׳ɹ�");
		statusMap.put("paid_failure", "����������");
		statusMap.put("paid_special", "�������⴦��");
		statusMap.put("paid_failure_unfix", "��λ������");
		statusMap.put("paid_return", "�˿�ȡ��");
		statusMap.put("cancel_timeout", "��ʱȡ��");
		HashMap tmpManualOrderMap = new HashMap();
		tmpManualOrderMap.put("new", "δ���");
		tmpManualOrderMap.put("checked", "���ͨ��");
		tmpManualOrderMap.put("cancel", "����");
		tmpManualOrderMap.put("pay", "���ͨ���Ѹ���");
		tmpManualOrderMap.put("noissue", "δ��Ʊ");
		tmpManualOrderMap.put("canissue", "�ɳ�Ʊ");
		tmpManualOrderMap.put("issue", "�ѳ�Ʊ");
		manualOrderMap = MapUtils.unmodifiableMap(tmpManualOrderMap);
	}
}