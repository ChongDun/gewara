/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.drama.constant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class OtherFeeRefundConstant implements Serializable {
	private static final long serialVersionUID = 6682861817043274469L;
	public static final String STATUS_APPLY = "apply";
	public static final String STATUS_ACCEPT = "accept";
	public static final String STATUS_REJECT = "reject";
	public static final String STATUS_SUCCESS = "success";
	public static final String ORIGIN_EXPRESS = "express";
	public static final String ORIGIN_INSURE = "insure";
	public static final String ORIGIN_UMPAY = "umpay";
	public static final String ORIGIN_CHANGE = "change";
	public static final String REASON_MEMBER = "member";
	public static final String REASON_EXPRESS_MERGE = "expressMerge";
	public static final String REASON_EXPRESS_LOSE = "expressLose";
	public static final String REASON_UNKNOWN = "unknown";
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

	static {
		HashMap tmpStatus = new HashMap();
		tmpStatus.put("apply", "����");
		tmpStatus.put("accept", "����");
		tmpStatus.put("reject", "�ܾ��˿�");
		tmpStatus.put("success", "�˿�ɹ�");
		statusTextMap = UnmodifiableMap.decorate(tmpStatus);
		HashMap tmp = new HashMap();
		tmp.put("express", "����˿�");
		tmp.put("insure", "�����˿�");
		tmp.put("umpay", "�ƶ��������˿�");
		tmp.put("change", "������������˿�");
		originTextMap = UnmodifiableMap.decorate(tmp);
		HashMap tmpOrigin = new HashMap();
		tmpOrigin.put("E", "express");
		tmpOrigin.put("I", "insure");
		tmpOrigin.put("U", "umpay");
		tmpOrigin.put("C", "change");
		shortOrignMap = UnmodifiableMap.decorate(tmpOrigin);
		LinkedHashMap tmpReason = new LinkedHashMap();
		tmpReason.put("expressMerge", "��ݺϲ�");
		tmpReason.put("expressLose", "��ݶ�ʧ");
		tmpReason.put("member", "�û�ԭ��");
		tmpReason.put("unknown", "δ֪");
		reasonTextMap = UnmodifiableMap.decorate(tmpReason);
		LinkedHashMap tmpRetback = new LinkedHashMap();
		tmpRetback.put("Y", "��Ҫ");
		tmpRetback.put("N", "����Ҫ");
		tmpRetback.put("O", "�μ�����");
		tmpRetback.put("S", "���ύ����");
		tmpRetback.put("R", "����ɹ�");
		tmpRetback.put("F", "����ʧ��");
		retbackMap = UnmodifiableMap.decorate(tmpRetback);
	}
}