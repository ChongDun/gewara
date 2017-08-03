package com.gewara.cons;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;



/**
 * API��Ʊϵͳ���õ��ĳ���
 * @author acerge(acerge@163.com)
 * @since 12:27:06 PM Apr 22, 2011
 * 0000	�ɹ�
 * 1001  ���β�����
 * 1002  ���ε�ǰδ���Ŷ�Ʊ��1���ر� 2��ֻ��10��00��18��00���� 3��ӰԺ�رն��ⶩƱ ��
 * 1003  ӰԺ������Ϣ��ͬ������Ҫ�ȴ�Gewaraϵͳ����ӰԺ��Ϣ
 *
 * 2001  �޷�����ӰԺ
 * 2002  ��λλ�ô��󣺲�����������ѡ��������
 * 2003  ��λ��ռ��
 * 2004  ��λ�������ƴ��󣺳���5����ĳЩ������ֻ�����������ĸ���
 * 2005  ��λ�������ƴ����л������Ƶ�
 * 2006  Υ�������������
 * 2098  ���ڸ���ӰԺ����
 * 2099  ��λ����δ֪����
 * 4001  �̼Ҳ�����  
 * 4002  �̼���Ȩ��  
 * 4003  У�����  
 * 4004  ��������ȱ�ٲ������ʽ����ȷ  
 * 4005  ���ݴ������ѯ�����ݲ����ڵ�
 * 4006  ֧������  
 *	
 * 5000	�û�������
 * 5001	�û�δ��¼
 * 5002	�û���Ȩ��
 * 5003	�����ظ�����
 * 
 * 9999  δ֪��������δ����Ĵ���
 */
public abstract class ApiConstant {
	public static final String OPENAPI_AUTH_KEY = "__OPENAPI_AUTH_KEY__";//servlet request key for OpenApiAuth
	public static final String CODE_SUCCESS = "0000";				//�ɹ�
	public static final String CODE_OPI_NOT_EXISTS = "1001";		//���β�����
	public static final String CODE_OPI_CLOSED = "1002";			//���ιر�
	public static final String CODE_OPI_UNSYNCH = "1003";			//������Ϣ��ͬ��
	
	public static final String CODE_OPI_UNTO_OPENTIME = "1100";		//û������ʱ��
	public static final String CODE_OPI_EXPIRE  = "1101";				//���ι���
	public static final String CODE_OPI_STATUS_CLOSE  = "1102";		//����״̬�ر�
	public static final String CODE_OPI_BEFORE_CLOSETIME  = "1104";//�����ѹر�
	public static final String CODE_OPI_SOLD_OUT  = "1105";			//��λ������
	public static final String CODE_OPI_UN_MID_TIME  = "1106";		//����ÿ�쿪��ʱ���
	// �ж��ؼۻ�Ƿ����
	public static final String CODE_OPI_SD_QUOTA_FULL  = "1201";	//��������
	public static final String CODE_OPI_SD_QUTY_MORE = "1202";		//��������
	
	
	public static final String CODE_CONNECTION_ERROR = "2001";
	public static final String CODE_SEAT_POS_ERROR = "2002";
	public static final String CODE_SEAT_OCCUPIED = "2003";			//��λ��ռ��
	public static final String CODE_SEAT_NUM_ERROR = "2004";			//��λ��������
	public static final String CODE_SEAT_LIMITED = "2005";
	public static final String CODE_SEAT_BREAK_RULE = "2006";
	public static final String CODE_SEAT_SEATTYPE_ERROR = "2007";
	public static final String CODE_SEAT_LOCK_ERROR_CINEMA = "2010";	//������λ����
	public static final String CODE_CCTO_ERROR = "2011";					//��������ӰԺ���Ӳ�����
	public static final String CODE_TC_ERROR = "2012";						//����������
	public static final String CODE_SEAT_RELEASED = "2013";				//��λ�Ѿ��ͷŻ򲻴���
	public static final String CODE_SYNCH_DATA = "2098";					//���ڸ���ӰԺ����
	public static final String CODE_SEAT_LOCK_ERROR = "2099";
	
	public static final String CODE_ORDER_NEED_CANCEL = "3100";		//������Ҫȡ���������µ�
	public static final String CODE_ORDER_SD_REPEAT = "3101";		//�ظ��μ��ؼۻ
	
	public static final String CODE_PARTNER_NOT_EXISTS = "4001";	//�̼Ҳ�����
	public static final String CODE_PARTNER_NORIGHTS = "4002";		//�̼���Ȩ��
	public static final String CODE_SIGN_ERROR = "4003";				//У�����  
	public static final String CODE_PARAM_ERROR = "4004";				//��������ȱ�ٲ������ʽ����ȷ  
	public static final String CODE_DATA_ERROR = "4005";				//���ݴ������ѯ�����ݲ����ڵ�
	public static final String CODE_PAY_ERROR = "4006";				//֧������
	public static final String CODE_SECURITY_VERIFY = "4999";		//�ֻ����Ž��а�ȫ��֤
	
	public static final String CODE_SUBSCRIBE_ERROR = "4040";		//ԤԼ����ʧ��
	
	public static final String CODE_WEIBO_EXPRIES = "4100"; 			//΢������
	public static final String CODE_UNBIND_MOBILE = "4101"; 			//û�а��ֻ�
	
	public static final String CODE_MEMBER_NOT_EXISTS = "5000";		//�û�������
	public static final String CODE_NOTLOGIN = "5001";					//�û�δ��¼
	public static final String CODE_USER_NORIGHTS = "5002";			//�û���Ȩ��
	public static final String CODE_REPEAT_OPERATION = "5003";		//�����ظ�����
	public static final String CODE_NOT_EXISTS = "5004";
	public static final String CODE_DATA_NULL = "5005"; 				//����Ϊ��
	//public static final String CODE_ERROR = "5006"; //�쳣

	
	public static final String CODE_TRAFFIC_CONTROL = "6000";	//����������
	public static final String CODE_PAYPASS_ERROR = "6001";		//֧��������ڼ�
	
	public static final String CODE_ELECARD_ISBIND = "8001";		// ȯ�Ѿ�����
	public static final String CODE_NIDE_BINDMOBILE = "8100";	// ��Ҫ���ֻ���
	public static final String CODE_MOBILE_NOTREG = "8101";		// �ֻ���δע��
	

	public static final String CODE_UNKNOWN_ERROR = "9999";
	
	public static final String CODE_GETED_POINT_STABLE_ERROR   = "9001";//����Ѿ���ȡ��-��׬��
	public static final String CODE_GETED_POINT_BIT_ERROR      = "9002";//����Ѿ���ȡ��-ð����
	public static final String CODE_GETED_POINT_BRT_ERROR      = "9003";//����Ѿ���ȡ��-΢����
	public static final String CODE_GETED_POINT_FESTIVAL_ERROR = "9004";//����Ѿ���ȡ��-����

	public static final String CODE_MOBILE_VALID = "9900";// APP��Ҫ��ת��H5������֤��code
	
	public static final String CODE_FCARD_ERROR = "9101";// �㿨֧�����Żݻ���
	public static final String CODE_FCARD_CHANGE_ERROR = "9102";// �㿨֧����ͬ���ظ�ʹ��
	public static final String CODE_FCARD_USE_ERROR = "9103";// �㿨����ʹ��
	public static final String CODE_FCARD_USEOUT = "9104";// �㿨����
	
	public static final String CODE_FCARD_LOCK = "9201";//�㿨������
	public static final String CODE_FCARD_LOCK_FAIL = "9202";//�㿨����ʧ��
	public static final String CODE_FCARD_LOCK_NOT_MATCH="9203";//������Ϣ��ƥ��
	public static final String CODE_FCARD_NOT_LOCK="9204";//�㿨δ����
	
	public static final Map<String, String> ORDER_STATUS_MAP;
	static{
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put(OrderConstant.STATUS_NEW, "new");
		tmp.put(OrderConstant.STATUS_NEW_UNLOCK, "new");
		tmp.put(OrderConstant.STATUS_NEW_CONFIRM, "new");
		tmp.put(OrderConstant.STATUS_PAID, "paid");
		tmp.put(OrderConstant.STATUS_PAID_FAILURE, "paid");
		tmp.put(OrderConstant.STATUS_PAID_UNFIX, "paid");
		tmp.put(OrderConstant.STATUS_PAID_SUCCESS, "success");
		tmp.put(OrderConstant.STATUS_PAID_RETURN, "refund");
		tmp.put(OrderConstant.STATUS_CANCEL, "cancel");
		tmp.put(OrderConstant.STATUS_SYS_CANCEL,"cancel");
		tmp.put(OrderConstant.STATUS_REPEAT,"repeat");
		tmp.put(OrderConstant.STATUS_USER_CANCEL,"cancel");
		tmp.put(OrderConstant.STATUS_TIMEOUT, "cancel");
		ORDER_STATUS_MAP = UnmodifiableMap.decorate(tmp);
	}
	public static Map<String, String> getOrderStatusMap(){
		return ORDER_STATUS_MAP;
	}
	public static String getMappedOrderStatus(String status){
		return ORDER_STATUS_MAP.get(status);
	}
	
}
