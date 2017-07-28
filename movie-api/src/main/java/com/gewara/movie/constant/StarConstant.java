/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.movie.constant;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public class StarConstant {
	public static final String BASEINFO_TYPE_STARTYPE = "startype";
	public static final String BASEINFO_TYPE_VOLK = "volk";
	public static final String BASEINFO_TYPE_SIGN = "sign";
	public static final String BASEINFO_TYPE_HOMETOWN = "hometown";
	public static final String BASEINFO_MOVIE_TYPE = "movietype";
	public static final String BASEINFO_MOVIE_EDITION = "edition";
	public static final String BASEINFO_STATE = "state";
	public static final String BASEINFO_AGELAYER = "ageLayer";
	public static final String BASEINFO_FEATURE = "feature";
	public static final String BASEINFO_FILMTYPE = "film";
	public static final String BASEINFO_IMPORTMODE = "mode";
	public static final String BASEINFO_PERIOD = "period";
	public static final String ACHIEVEMENT_NO = "N";
	public static final String ACHIEVEMENT_YES = "Y";
	public static final Map<String, String> baseinfoMap;

	static {
		LinkedHashMap tmp = new LinkedHashMap();
		tmp.put("startype", "ְҵ");
		tmp.put("volk", "����");
		tmp.put("sign", "����");
		tmp.put("hometown", "������");
		tmp.put("movietype", "��Ӱ����");
		tmp.put("edition", "��Ӱ�汾");
		tmp.put("state", "����/����");
		tmp.put("film", "Ƭ��");
		tmp.put("mode", "����ģʽ");
		tmp.put("period", "���");
		tmp.put("ageLayer", "�����");
		tmp.put("feature", "�û�����");
		baseinfoMap = UnmodifiableMap.decorate(tmp);
	}
}