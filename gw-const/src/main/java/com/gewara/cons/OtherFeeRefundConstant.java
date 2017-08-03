package com.gewara.cons;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class OtherFeeRefundConstant implements Serializable {

	private static final long serialVersionUID = 6682861817043274469L;
	public static final String STATUS_APPLY = "apply"; 		//����
	public static final String STATUS_ACCEPT = "accept"; 	//����
	public static final String STATUS_REJECT = "reject"; 	//�ܾ��˿�
	public static final String STATUS_SUCCESS = "success";	//�˿�ɹ�
	
	public static final String ORIGIN_EXPRESS = "express";		//��ݷ�
	public static final String ORIGIN_INSURE = "insure";		//���շ�
	public static final String ORIGIN_UMPAY = "umpay";			//�ƶ�������
	public static final String ORIGIN_CHANGE = "change";		//����������������ķ���
	
	//�˿�ԭ��
	public static final String REASON_MEMBER = "member";				//�û�ԭ��
	public static final String REASON_EXPRESS_MERGE = "expressMerge";	//��ݺϲ�
	public static final String REASON_EXPRESS_LOSE = "expressLose";		//��ݶ�ʧ
	public static final String REASON_UNKNOWN = "unknown";				//δ֪
	
	//�˻��˿� Y����Ҫ��N������Ҫ��O��δ֪, �μ�����(Other)��S: ���ύ����(Submit) R�������Ѿ�����(Refund)��F�����񷵻�����(Failure)
	public static final String RETBACK_Y = "Y";
	public static final String RETBACK_N = "N";
	public static final String RETBACK_OTHER = "O";
	public static final String RETBACK_SUBMIT = "S";
	public static final String RETBACK_REFUND = "R";
	public static final String RETBACK_FAILURE = "F";
	
	public static final Map<String, String> statusTextMap;
	public static final Map<String, String> originTextMap;
	public static final Map<String, String> shortOrignMap;
	public static final Map<String, String> reasonTextMap;
	public static final Map<String, String> retbackMap;
	static{
		Map<String, String> tmpStatus = new HashMap<String, String>();
		tmpStatus.put(STATUS_APPLY, "����");
		tmpStatus.put(STATUS_ACCEPT, "����");
		tmpStatus.put(STATUS_REJECT, "�ܾ��˿�");
		tmpStatus.put(STATUS_SUCCESS, "�˿�ɹ�");
		statusTextMap = UnmodifiableMap.decorate(tmpStatus);
		
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put(ORIGIN_EXPRESS, "����˿�");
		tmp.put(ORIGIN_INSURE, "�����˿�");
		tmp.put(ORIGIN_UMPAY, "�ƶ��������˿�");
		tmp.put(ORIGIN_CHANGE, "������������˿�");
		originTextMap = UnmodifiableMap.decorate(tmp);
		Map<String, String> tmpOrigin = new HashMap<String, String>();
		tmpOrigin.put(OtherFeeDetailConstant.FEETYPE_E, ORIGIN_EXPRESS);
		tmpOrigin.put(OtherFeeDetailConstant.FEETYPE_I, ORIGIN_INSURE);
		tmpOrigin.put(OtherFeeDetailConstant.FEETYPE_U, ORIGIN_UMPAY);
		tmpOrigin.put(OtherFeeDetailConstant.FEETYPE_C, ORIGIN_CHANGE);
		shortOrignMap = UnmodifiableMap.decorate(tmpOrigin);
		Map<String, String> tmpReason = new LinkedHashMap<String, String>();
		tmpReason.put(REASON_EXPRESS_MERGE, "��ݺϲ�");
		tmpReason.put(REASON_EXPRESS_LOSE, "��ݶ�ʧ");
		tmpReason.put(REASON_MEMBER, "�û�ԭ��");
		tmpReason.put(REASON_UNKNOWN, "δ֪");
		reasonTextMap = UnmodifiableMap.decorate(tmpReason);
		
		Map<String, String> tmpRetback = new LinkedHashMap<String, String>();
		tmpRetback.put(RETBACK_Y, "��Ҫ");
		tmpRetback.put(RETBACK_N, "����Ҫ");
		tmpRetback.put(RETBACK_OTHER, "�μ�����");
		tmpRetback.put(RETBACK_SUBMIT, "���ύ����");
		tmpRetback.put(RETBACK_REFUND, "����ɹ�");
		tmpRetback.put(RETBACK_FAILURE, "����ʧ��");
		retbackMap = UnmodifiableMap.decorate(tmpRetback);
	}
}
