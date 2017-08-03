package com.gewara.cons;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.lang.StringUtils;

public abstract class AccountRefundConstant implements Serializable {
	
	private static final long serialVersionUID = 2425895630620383174L;
	
	public static final String STATUS_APPLY = "apply";			//������
	//public static final String STATUS_ACCEPT = "accept"; 		//�ѽ���
	//public static final String STATUS_UNACCEPT = "reject"; 		//�������˿�
	public static final String STATUS_FAIL = "fail"; 			//�˿�ʧ��
	public static final String STATUS_DEBIT = "debit";			//�˻��ۿ�
	public static final String STATUS_REAPPLY = "reapply";		//���²�ȫ��Ϣ
	public static final String STATUS_SUCCESS = "success";		//���ص�����֧���ɹ�
	
	public static final String ORIGIN_REFUND = "refund";		//�����˿�
	public static final String ORIGIN_APPLY = "apply";			//�ͷ����������˿�
	public static final String ORIGIN_CHARGE = "charge";		//��ֵ�˿�
	public static final String ORIGIN_INSURE = "insure";		//�����˿�
	public static final String ORIGIN_COMPENSATE= "compensate"; //�⳥����
	
	public static final String REFUND_ORIGIN_CUSTOMER= "customer"; //�ͻ��ύ
	public static final String REFUND_ORIGIN_SERVICE= "service";   //�ͷ��ύ
	public static final String REFUND_ORIGIN_SYSTEM= "system";     //ϵͳ�ύ
	
	public static final Map<String, String> statusTextMap;
	public static final Map<String, String> originTextMap;
	public static final Map<String, String> refundOriginTextMap;
	static{
		Map<String, String> textMap = new HashMap<String, String>();
		textMap.put(STATUS_APPLY, "������");
		//textMap.put(STATUS_ACCEPT, "�ѽ���");
		//textMap.put(STATUS_UNACCEPT, "�������˿�");
		textMap.put(STATUS_FAIL, "�˿�ʧ��");
		textMap.put(STATUS_SUCCESS, "�˿�ɹ�");
		statusTextMap = UnmodifiableMap.decorate(textMap);
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put(ORIGIN_REFUND, "�����˿�");
		tmp.put(ORIGIN_APPLY, "�ͷ��˿�");
		tmp.put(ORIGIN_CHARGE, "��ֵ�˿�");
		tmp.put(ORIGIN_INSURE, "�����˿�");
		tmp.put(ORIGIN_COMPENSATE, "�⳥����");
		tmp.putAll(OtherFeeRefundConstant.originTextMap);
		originTextMap = UnmodifiableMap.decorate(tmp);
		Map<String, String> refundOriginTmpMap = new HashMap<String, String>();
		refundOriginTmpMap.put(REFUND_ORIGIN_CUSTOMER, "�ͻ��ύ");
		refundOriginTmpMap.put(REFUND_ORIGIN_SERVICE, "�ͷ��ύ");
		refundOriginTmpMap.put(REFUND_ORIGIN_SYSTEM, "ϵͳ�ύ");
		refundOriginTextMap = UnmodifiableMap.decorate(refundOriginTmpMap);
	}
	
	public static String getStatusText(String status){
		String text = statusTextMap.get(status);
		return StringUtils.isNotBlank(text)? text : "δ֪";
	}
}
