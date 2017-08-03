package com.gewara.cons;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public class OtherFeeDetailConstant {
	public static final String FEETYPE_E = "E";		//��ݷ�
	public static final String FEETYPE_U = "U";		//�ƶ�������
	public static final String FEETYPE_C = "C";		//����������������ķ���
	public static final String FEETYPE_I = "I";		//ƽ����Ʊ���շ���
	
	public static final String INSURE_USER_NAME =  "insureUName"; //�������û�����
	public static final String INSURE_USER_BIRTHDAY =  "insureUBirthday";//�������û�����
	
	public static final String STATUS_NEW = "new";
	public static final String STATUS_SUCCESS = "success";
	public static final String STATUS_REFUND = "refund";
	
	public static final Map<String, String> originFeetypeMap;
	
	static{
		Map<String, String> tmpOrigin = new HashMap<String, String>();
		tmpOrigin.put(OtherFeeRefundConstant.ORIGIN_EXPRESS, FEETYPE_E);
		tmpOrigin.put(OtherFeeRefundConstant.ORIGIN_INSURE, FEETYPE_I);
		tmpOrigin.put(OtherFeeRefundConstant.ORIGIN_UMPAY, FEETYPE_U);
		tmpOrigin.put(OtherFeeRefundConstant.ORIGIN_CHANGE, FEETYPE_C);
		originFeetypeMap = UnmodifiableMap.decorate(tmpOrigin);
	}
}
