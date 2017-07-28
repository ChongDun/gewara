/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.api.sns.constant;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public class AddressConstant {
	public static final String ADDRESS_WEB = "web";
	public static final String ADDRESS_WAP = "wap";
	public static final String ADDRESS_GEWAP = "gewap";
	public static final String ADDRESS_MOBILE = "mobile";
	public static final String ADDRESS_IPHONE = "iphone";
	public static final String ADDRESS_ANDROID = "android";
	public static final String ADDRESS_SYMBIAN = "symbian";
	public static final String ADDRESS_DRAMAANDROID = "dramaandroid";
	public static final String ADDRESS_DRAMAIPHONE = "dramaiphone";
	public static Map<String, String> addressMap;
	public static Map<Long, String> partnerAddressMap;
	public static final String ADDRESS_ALL = "all";

	static {
		HashMap map = new HashMap();
		map.put("web", "��ҳ��");
		map.put("wap", "WAP��");
		map.put("gewap", "WAP��");
		map.put("iphone", "iPhone��");
		map.put("android", "Android��");
		map.put("symbian", "Symbian��");
		map.put("mobile", "�ֻ�����");
		map.put("dramaiphone", "iPhone��");
		map.put("dramaandroid", "Android��");
		addressMap = UnmodifiableMap.decorate(map);
	}
}