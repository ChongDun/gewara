package com.gewara.drama.constant;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class InsureConstant implements Serializable {

	private static final long serialVersionUID = -1000044432709835122L;
	
	public static final String STATUS_NEW = "new";							//�´���
	public static final String STATUS_INSURE_FAIL = "insure_fail";			//Ͷ��δ�ɹ�
	public static final String STATUS_INSURE_SUCCESS = "insure_success";	//Ͷ���ɹ�
	public static final String STATUS_INSURE_CANCEL = "insure_cancel";		//�����˱�
	public static final String STATUS_GW_RETURN = "gw_return";				//�������˱����
	public static final String STATUS_POLIEY_PAID = "poliey_paid";			//�����������
	public static final String STATUS_NO_PAY_POLIEY = "no_pay_poliey";		//���⸶����
	public static final String STATUS_NO_PAY_TK = "no_pay_tk";				//�Ѿ�ȡƱ�����⸶
	
	public static final Map<String, String> statusTextMap;
	static{
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put(STATUS_NEW, "�´���");
		tmp.put(STATUS_INSURE_FAIL, "Ͷ��δ�ɹ�");
		tmp.put(STATUS_INSURE_SUCCESS, "Ͷ���ɹ�");
		tmp.put(STATUS_INSURE_CANCEL, "��ȡ������(������)");
		tmp.put(STATUS_GW_RETURN, "��ȡ������(������)");
		tmp.put(STATUS_POLIEY_PAID, "�����������");
		tmp.put(STATUS_NO_PAY_POLIEY, "���⸶����");
		tmp.put(STATUS_NO_PAY_TK, "��ȡƱ�����⸶");
		statusTextMap = UnmodifiableMap.decorate(tmp);
	}
	
}
