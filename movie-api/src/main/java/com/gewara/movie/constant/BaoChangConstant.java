/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.movie.constant;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public class BaoChangConstant {
	public static final String MSG_URL_ORDER_DETAIL = "gewara://com.gewara.movie?pageid=7";
	public static final String MSG_URL_PARTNER = "gewara://com.gewara.movie?pageid=23";
	public static final String MSG_URL_REDIRECT = "gewara://com.gewara.movie?pageid=5";
	public static final Integer DATA_VALID = Integer.valueOf(1);
	public static final Integer DATA_INVALID = Integer.valueOf(0);
	public static final String SEND_MSG_CHANNEL_APPOINTMENT = "channel_appointment";
	public static final String SEND_MSG_CHANNEL_PAID = "channel_paid";
	public static final String SEND_MSG_CHANNEL_FAIL = "channel_fail";
	public static final String SEND_MSG_CHANNEL_RECEIPTOR = "channel_receiptor";
	public static final String BAOCHANG_FROM_ANDROID = "android";
	public static final String BAOCHANG_FROM_IOS = "ios";
	public static final Integer PURCHASER_TICKET_NUM = Integer.valueOf(1000);
	public static final Integer RECEIPTOR_TICKET_NUM = Integer.valueOf(5);
	public static final String ORDER_TYPE_EXIST = "exist";
	public static final String ORDER_TYPE_APPOINTMENT = "appointment";
	public static final String CACHE_TAG_ADD_UPDATE = "add_update";
	public static final String CACHE_TAG_REMOVE = "remove";
	public static final String MPI_STATUS_LOCK = "lock";
	public static final String MPI_STATUS_SUCCESS = "success";
	public static final String MPI_STATUS_UNLOCK = "unlock";
	public static final String TIME_TAG_MORNING = "morning";
	public static final String TIME_TAG_AFTERNOON = "afternoon";
	public static final String TIME_TAG_NIGHT = "night";
	public static final String ORDER_STATUS_ORDER_SUCCESS = "order_success";
	public static final String ORDER_STATUS_PROCESSING = "processing";
	public static final String ORDER_STATUS_SECCUSS = "seccuss";
	public static final String ORDER_STATUS_FAIL = "fail";
	public static final String ORDER_STATUS_REFUND_SECCUSS = "refund_seccuss";
	public static final String ORDER_STATUS_REFUND_FAIL = "refund_fail";
	public static final String ORDER_STATUS_CANCEL = "cancel";
	public static final List<String> baoChangOrderStatusList = Arrays
			.asList(new String[] { "processing", "seccuss", "fail" });
	public static final String[] baoChangMsgAppointmentIos = new String[] { "%username", "%appointmentDate",
			"%appointmentTime", "%roomname", "%cinemaname", "%moviename", "%orderDetailUrl" };
	public static final String[] baoChangMsgPaidIos = new String[] { "%username", "%playdate", "%playtime", "%roomname",
			"%cinemaname", "%moviename", "%partnerUrl" };
	public static final String[] baoChangMsgFailIos = new String[] { "%username", "%appointmentDate",
			"%appointmentTime", "%roomname", "%cinemaname", "%moviename", "%reason" };
	public static final String[] baoChangMsgReceiptorIos = new String[] { "%username", "%playdate", "%playtime",
			"%password", "%roomname", "%cinemaname", "%moviename", "%movieseat", "%tuhaoname", "%ticketcount" };
	public static final List<String> baoChangOrderStatusListAndroid = Arrays
			.asList(new String[] { "processing", "seccuss", "fail" });
	public static final String[] baoChangMsgAppointmentAndroid = new String[] { "%username", "%appointmentDate",
			"%appointmentTime", "%roomname", "%cinemaname", "%moviename" };
	public static final String[] baoChangMsgPaidAndroid = new String[] { "%username", "%playdate", "%playtime",
			"%roomname", "%cinemaname", "%moviename" };
	public static final String[] baoChangMsgFailAndroid = new String[] { "%username", "%appointmentDate",
			"%appointmentTime", "%roomname", "%cinemaname", "%moviename", "%reason" };
	public static final String[] baoChangMsgReceiptorAndroid = new String[] { "%username", "%playdate", "%playtime",
			"%password", "%roomname", "%cinemaname", "%moviename", "%movieseat", "%tuhaoname", "%ticketcount" };
	public static final Map<String, String> baoChangOrderStatusMap;
	public static final Map<String, String> baoChangOrderTypeMap;
	public static final Map<String, String> baoChangMpiStatusMap;
	public static final Map<String, String> baoChangTimeTagMap;
	public static final Map<String, String> baoChangStatesMap;

	static {
		LinkedHashMap tmp = new LinkedHashMap();
		tmp.put("order_success", "�µ��ɹ�δ֧��");
		tmp.put("processing", "���ΰ�����");
		tmp.put("seccuss", "�����ɹ�");
		tmp.put("fail", "����ʧ��");
		tmp.put("refund_seccuss", "�˿�ɹ�");
		tmp.put("refund_fail", "�˿�ʧ��");
		baoChangOrderStatusMap = UnmodifiableMap.decorate(tmp);
		tmp = new LinkedHashMap();
		tmp.put("exist", "���г��ζ���");
		tmp.put("appointment", "ԤԼ���ζ���");
		baoChangOrderTypeMap = UnmodifiableMap.decorate(tmp);
		tmp = new LinkedHashMap();
		tmp.put("lock", "�����ѱ�����");
		tmp.put("success", "�����ɹ�");
		tmp.put("unlock", "������");
		baoChangMpiStatusMap = UnmodifiableMap.decorate(tmp);
		tmp = new LinkedHashMap();
		tmp.put("morning", "����");
		tmp.put("afternoon", "����");
		tmp.put("night", "����");
		baoChangTimeTagMap = UnmodifiableMap.decorate(tmp);
		tmp = new LinkedHashMap();
		tmp.put("processing", "css/wap/movie/private/phone/guide_bcz@3x.png?v=20150106");
		tmp.put("seccuss", "css/wap/movie/private/phone/guide_bccg@3x.png?v=20150106");
		tmp.put("refund_seccuss", "css/wap/movie/private/phone/guide_bcsb@3x.png?v=20150106");
		tmp.put("refund_fail", "css/wap/movie/private/phone/guide_bcsb@3x.png?v=20150106");
		baoChangStatesMap = UnmodifiableMap.decorate(tmp);
	}
}