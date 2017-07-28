/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.cons;

import com.gewara.cons.OtherFeeRefundConstant;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.lang.StringUtils;

public abstract class AccountRefundConstant implements Serializable {
	private static final long serialVersionUID = 2425895630620383174L;
	public static final String STATUS_APPLY = "apply";
	public static final String STATUS_FAIL = "fail";
	public static final String STATUS_DEBIT = "debit";
	public static final String STATUS_REAPPLY = "reapply";
	public static final String STATUS_SUCCESS = "success";
	public static final String ORIGIN_REFUND = "refund";
	public static final String ORIGIN_APPLY = "apply";
	public static final String ORIGIN_CHARGE = "charge";
	public static final String ORIGIN_INSURE = "insure";
	public static final String ORIGIN_COMPENSATE = "compensate";
	public static final String REFUND_ORIGIN_CUSTOMER = "customer";
	public static final String REFUND_ORIGIN_SERVICE = "service";
	public static final String REFUND_ORIGIN_SYSTEM = "system";
	public static final Map<String, String> statusTextMap;
	public static final Map<String, String> originTextMap;
	public static final Map<String, String> refundOriginTextMap;

	public static String getStatusText(String status) {
		String text = (String) statusTextMap.get(status);
		return StringUtils.isNotBlank(text) ? text : "δ֪";
	}

	static {
		HashMap textMap = new HashMap();
		textMap.put("apply", "������");
		textMap.put("fail", "�˿�ʧ��");
		textMap.put("success", "�˿�ɹ�");
		statusTextMap = UnmodifiableMap.decorate(textMap);
		HashMap tmp = new HashMap();
		tmp.put("refund", "�����˿�");
		tmp.put("apply", "�ͷ��˿�");
		tmp.put("charge", "��ֵ�˿�");
		tmp.put("insure", "�����˿�");
		tmp.put("compensate", "�⳥����");
		tmp.putAll(OtherFeeRefundConstant.originTextMap);
		originTextMap = UnmodifiableMap.decorate(tmp);
		HashMap refundOriginTmpMap = new HashMap();
		refundOriginTmpMap.put("customer", "�ͻ��ύ");
		refundOriginTmpMap.put("service", "�ͷ��ύ");
		refundOriginTmpMap.put("system", "ϵͳ�ύ");
		refundOriginTextMap = UnmodifiableMap.decorate(refundOriginTmpMap);
	}
}