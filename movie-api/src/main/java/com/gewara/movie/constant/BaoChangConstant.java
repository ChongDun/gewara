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
	
	public static final Integer DATA_VALID = 1;   //��Ч����
	public static final Integer DATA_INVALID = 0; //��Ч����
	
	public static final String SEND_MSG_CHANNEL_APPOINTMENT = "channel_appointment";   //����ԤԼ���׳ɹ���ԤԼӰԺ������
	public static final String SEND_MSG_CHANNEL_PAID = "channel_paid";   //�������׳ɹ�������ԤԼ�ɹ������ó��γɹ���
	public static final String SEND_MSG_CHANNEL_FAIL = "channel_fail";   //����ʧ��
	public static final String SEND_MSG_CHANNEL_RECEIPTOR = "channel_receiptor";   //��Ʊ�˶���
	
	public static final String BAOCHANG_FROM_ANDROID = "android";   //��׿
	public static final String BAOCHANG_FROM_IOS = "ios";   //IOS
	
	public static final Integer PURCHASER_TICKET_NUM = 1000; //���������ѡ������
	public static final Integer RECEIPTOR_TICKET_NUM = 5; //��Ʊ�����ѡ������
	
	public static final String ORDER_TYPE_EXIST = "exist";//���г��ζ���
	public static final String ORDER_TYPE_APPOINTMENT = "appointment";//ԤԼ���ζ���
	
	public static final String CACHE_TAG_ADD_UPDATE = "add_update";//����/�޸Ķ���
	public static final String CACHE_TAG_REMOVE = "remove";//ɾ��
	
	public static final String MPI_STATUS_LOCK = "lock";//��������
	public static final String MPI_STATUS_SUCCESS = "success";//�����ɹ�
	public static final String MPI_STATUS_UNLOCK = "unlock";//δ����
	
	public static final String TIME_TAG_MORNING = "morning";//����
	public static final String TIME_TAG_AFTERNOON = "afternoon";//����
	public static final String TIME_TAG_NIGHT = "night";//����
	
	public static final String ORDER_STATUS_ORDER_SUCCESS = "order_success"; //�µ��ɹ�δ֧��
	public static final String ORDER_STATUS_PROCESSING = "processing"; //���ΰ�����
	public static final String ORDER_STATUS_SECCUSS = "seccuss"; //�����ѿ���
	public static final String ORDER_STATUS_FAIL = "fail"; //����ʧ��
	public static final String ORDER_STATUS_REFUND_SECCUSS = "refund_seccuss"; //�˿�ɹ�
	public static final String ORDER_STATUS_REFUND_FAIL = "refund_fail"; //�˿�ʧ��
	public static final String ORDER_STATUS_CANCEL = "cancel"; //����ȡ��
	public static final List<String> baoChangOrderStatusList = Arrays.asList(ORDER_STATUS_PROCESSING,
			ORDER_STATUS_SECCUSS, ORDER_STATUS_FAIL);
	public static final String[] baoChangMsgAppointmentIos = new String[]{"%username", "%appointmentDate", "%appointmentTime", 
		"%roomname", "%cinemaname", "%moviename", "%orderDetailUrl"};
	public static final String[] baoChangMsgPaidIos = new String[]{"%username", "%playdate", "%playtime", 
		"%roomname", "%cinemaname", "%moviename", "%partnerUrl"};
	public static final String[] baoChangMsgFailIos = new String[]{"%username", "%appointmentDate", "%appointmentTime", 
		"%roomname", "%cinemaname", "%moviename","%reason"};
	public static final String[] baoChangMsgReceiptorIos = new String[]{"%username", "%playdate", "%playtime", "%password", 
		"%roomname", "%cinemaname", "%moviename","%movieseat","%tuhaoname","%ticketcount"};
	public static final List<String> baoChangOrderStatusListAndroid = Arrays.asList(ORDER_STATUS_PROCESSING,
			ORDER_STATUS_SECCUSS, ORDER_STATUS_FAIL);
	public static final String[] baoChangMsgAppointmentAndroid = new String[]{"%username", "%appointmentDate", "%appointmentTime", 
		"%roomname", "%cinemaname", "%moviename"};
	public static final String[] baoChangMsgPaidAndroid = new String[]{"%username", "%playdate", "%playtime", 
		"%roomname", "%cinemaname", "%moviename"};
	public static final String[] baoChangMsgFailAndroid = new String[]{"%username", "%appointmentDate", "%appointmentTime", 
		"%roomname", "%cinemaname", "%moviename","%reason"};
	public static final String[] baoChangMsgReceiptorAndroid = new String[]{"%username", "%playdate", "%playtime", "%password", 
		"%roomname", "%cinemaname", "%moviename","%movieseat","%tuhaoname","%ticketcount"};
	public static final Map<String, String> baoChangOrderStatusMap;
	public static final Map<String, String> baoChangOrderTypeMap;
	public static final Map<String, String> baoChangMpiStatusMap;
	public static final Map<String, String> baoChangTimeTagMap;
	public static final Map<String, String> baoChangStatesMap;
	static{
		Map<String, String> tmp = new LinkedHashMap<String, String>();
		
		tmp.put(ORDER_STATUS_ORDER_SUCCESS, "�µ��ɹ�δ֧��");
		tmp.put(ORDER_STATUS_PROCESSING, "���ΰ�����");
		tmp.put(ORDER_STATUS_SECCUSS, "�����ɹ�");
		tmp.put(ORDER_STATUS_FAIL, "����ʧ��");
		tmp.put(ORDER_STATUS_REFUND_SECCUSS, "�˿�ɹ�");
		tmp.put(ORDER_STATUS_REFUND_FAIL, "�˿�ʧ��");
		baoChangOrderStatusMap = UnmodifiableMap.decorate(tmp);
		
		tmp = new LinkedHashMap<String, String>();
		tmp.put(ORDER_TYPE_EXIST, "���г��ζ���");
		tmp.put(ORDER_TYPE_APPOINTMENT, "ԤԼ���ζ���");
		baoChangOrderTypeMap = UnmodifiableMap.decorate(tmp);
		
		tmp = new LinkedHashMap<String, String>();
		tmp.put(MPI_STATUS_LOCK, "�����ѱ�����");
		tmp.put(MPI_STATUS_SUCCESS, "�����ɹ�");
		tmp.put(MPI_STATUS_UNLOCK, "������");
		baoChangMpiStatusMap = UnmodifiableMap.decorate(tmp);
		
		tmp = new LinkedHashMap<String, String>();
		tmp.put(TIME_TAG_MORNING, "����");
		tmp.put(TIME_TAG_AFTERNOON, "����");
		tmp.put(TIME_TAG_NIGHT, "����");
		baoChangTimeTagMap = UnmodifiableMap.decorate(tmp);
		
		tmp = new LinkedHashMap<String, String>();
		tmp.put(ORDER_STATUS_PROCESSING, "css/wap/movie/private/phone/guide_bcz@3x.png?v=20150106");
		tmp.put(ORDER_STATUS_SECCUSS, "css/wap/movie/private/phone/guide_bccg@3x.png?v=20150106");
		tmp.put(ORDER_STATUS_REFUND_SECCUSS, "css/wap/movie/private/phone/guide_bcsb@3x.png?v=20150106");
		tmp.put(ORDER_STATUS_REFUND_FAIL, "css/wap/movie/private/phone/guide_bcsb@3x.png?v=20150106");
		baoChangStatesMap = UnmodifiableMap.decorate(tmp);
	}
}
