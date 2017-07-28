/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.ucenter.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public class BindConstant {
	public static final String KEY_BINDTIME = "bindTime";
	public static final String TAG_REGISTERCODE = "registercode";
	public static final String TAG_DYNAMICCODE = "dynamiccode";
	public static final String TAG_BINDMOBILE = "bindMobile";
	public static final String TAG_CHGBINDMOBILE = "chgbindMobile";
	public static final String TAG_CHGBINDMOBILE2 = "chgbindN";
	public static final String TAG_ACCOUNT_BACKPASS = "account_backpass";
	public static final String TAG_DYNAMICCODE_CARD = "dynamiccode_card";
	public static final String TAG_BACKPASS = "backpass";
	public static final String TAG_MODIFYPASS = "modifypass";
	public static final String TAG_SETPAYPASS = "setpaypass";
	public static final String TAG_MDYPAYPASS = "mdypaypass";
	public static final String TAG_DRAWMOBILE = "drawMobile";
	public static final String TAG_GETPAYPASS = "getpaypass";
	public static final String TAG_CCBANKCODE = "ccbankcode";
	public static final String TAG_SECURITYVERIFY = "securityVerify";
	public static final String TAG_VDEMAIL_BY_UPDATEPWD = "vdemailbyuppwd";
	public static final String TAG_UNICOM_REGISTERCODE = "unicom_registercode";
	public static final String TAG_UNICOM_BACKPASS = "unicom_backpass";
	public static final String TAG_MESSAGE_CHECK = "message_check";
	public static final String TAG_PRE_MES = "pre_mes";
	public static final String TAG_SMSVALID = "smsvalid";
	public static final List<String> VALID_TAG_LIST = Arrays.asList(new String[] { "registercode", "dynamiccode",
			"bindMobile", "account_backpass", "dynamiccode_card", "backpass", "modifypass", "setpaypass", "mdypaypass",
			"chgbindMobile", "chgbindN", "drawMobile", "ccbankcode", "getpaypass", "vdemailbyuppwd",
			"unicom_registercode", "unicom_backpass", "message_check", "pre_mes", "smsvalid", "securityVerify" });
	public static final String DEFAULT_TEMPLATE = "checkpass(��������̬��֤�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068";
	public static final String ADMIN_MOBILE_TEMPLATE = "checkpass(�������绰��ƱУ���룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068";
	public static final int VALID_MIN = 30;
	public static final int MAX_CHECKNUM = 5;
	public static final int MAX_SENDNUM = 99999;
	private static final Map<String, Integer> SENDNUM_MAP;
	private static final Map<String, Integer> MAXCHECK_MAP;
	private static final Map<String, String> TEMPLATE_MAP;

	public static String getMsgTemplate(String tag) {
		return TEMPLATE_MAP.containsKey(tag) ? (String) TEMPLATE_MAP.get(tag)
				: "checkpass(��������̬��֤�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068";
	}

	public static int getMaxSendnum(String tag) {
		return SENDNUM_MAP.containsKey(tag) ? ((Integer) SENDNUM_MAP.get(tag)).intValue() : 99999;
	}

	public static int getMaxCheck(String tag) {
		return MAXCHECK_MAP.containsKey(tag) ? ((Integer) MAXCHECK_MAP.get(tag)).intValue() : 5;
	}

	public static String getChangeBindOldKey(Long memberid) {
		return "chgbindMobile" + memberid;
	}

	static {
		HashMap tmp = new HashMap();
		tmp.put("registercode", "checkpass(������ע�ᶯ̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("ccbankcode", "checkpass(������֧����̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("unicom_backpass", "checkpass(��Ӱ�㶯̬��֤�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("unicom_registercode", "���ڵ�Ӱ��ע��Ķ�̬���ǣ�checkpass�� 30��������Ч��ʹ�ú�ʧЧ��");
		tmp.put("bindMobile", "checkpass(�������󶨶�̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("chgbindMobile", "checkpass(���������Ķ�̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("chgbindN", "checkpass(���������Ķ�̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("pre_mes", "checkpass(��������̬�룬����й©),30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("smsvalid", "Ϊ���������˺Ű�ȫ����ظ�checkpass��֤�����˺�,15��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		tmp.put("securityVerify", "checkpass(��������ȫ��̬�룬����й©)��30��������Ч���Ǳ��˻���Ȩ���������µ�1010-1068");
		TEMPLATE_MAP = UnmodifiableMap.decorate(tmp);
		HashMap tmp2 = new HashMap();
		tmp2.put("registercode", Integer.valueOf(20));
		tmp2.put("unicom_registercode", Integer.valueOf(20));
		tmp2.put("modifypass", Integer.valueOf(20));
		tmp2.put("bindMobile", Integer.valueOf(20));
		SENDNUM_MAP = UnmodifiableMap.decorate(tmp2);
		tmp2 = new HashMap();
		tmp2.put("modifypass", Integer.valueOf(8));
		tmp2.put("setpaypass", Integer.valueOf(8));
		MAXCHECK_MAP = UnmodifiableMap.decorate(tmp2);
	}
}