/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.drama.constant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class InsureConstant implements Serializable {
	private static final long serialVersionUID = -1000044432709835122L;
	public static final String STATUS_NEW = "new";
	public static final String STATUS_INSURE_FAIL = "insure_fail";
	public static final String STATUS_INSURE_SUCCESS = "insure_success";
	public static final String STATUS_INSURE_CANCEL = "insure_cancel";
	public static final String STATUS_GW_RETURN = "gw_return";
	public static final String STATUS_POLIEY_PAID = "poliey_paid";
	public static final String STATUS_NO_PAY_POLIEY = "no_pay_poliey";
	public static final String STATUS_NO_PAY_TK = "no_pay_tk";
	public static final Map<String, String> statusTextMap;

	static {
		HashMap tmp = new HashMap();
		tmp.put("new", "�´���");
		tmp.put("insure_fail", "Ͷ��δ�ɹ�");
		tmp.put("insure_success", "Ͷ���ɹ�");
		tmp.put("insure_cancel", "��ȡ������(������)");
		tmp.put("gw_return", "��ȡ������(������)");
		tmp.put("poliey_paid", "�����������");
		tmp.put("no_pay_poliey", "���⸶����");
		tmp.put("no_pay_tk", "��ȡƱ�����⸶");
		statusTextMap = UnmodifiableMap.decorate(tmp);
	}
}