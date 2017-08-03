package com.gewara.movie.constant;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public class StarConstant {
	public static final String BASEINFO_TYPE_STARTYPE = "startype";		//����ְҵ����
	public static final String BASEINFO_TYPE_VOLK = "volk";				//����
	public static final String BASEINFO_TYPE_SIGN = "sign";				//����
	public static final String BASEINFO_TYPE_HOMETOWN = "hometown";		//������
	public static final String BASEINFO_MOVIE_TYPE = "movietype";			//��Ӱ����
	public static final String BASEINFO_MOVIE_EDITION = "edition";			//��Ӱ�汾
	public static final String BASEINFO_STATE = "state";					//����/����
	public static final String BASEINFO_AGELAYER = "ageLayer";			// �����
	public static final String BASEINFO_FEATURE = "feature";	// �û�����
	/*
	 * pengdi 2014��10��20��  ��Ӱ���������ֶ����
	 */
	public static final String BASEINFO_FILMTYPE= "film";	                // Ƭ��
	public static final String BASEINFO_IMPORTMODE = "mode";	                // ����ģʽ
	public static final String BASEINFO_PERIOD = "period";	                // ���
	
	public static final String ACHIEVEMENT_NO = "N";						//�Ƿ�ɾ���Ʒ:��
	public static final String ACHIEVEMENT_YES = "Y";						//�Ƿ�ɾ���Ʒ:��
	
	public static final Map<String, String> baseinfoMap;
	static{
		Map<String, String> tmp = new LinkedHashMap<String, String>();
		tmp.put(BASEINFO_TYPE_STARTYPE, "ְҵ");
		tmp.put(BASEINFO_TYPE_VOLK, "����");
		tmp.put(BASEINFO_TYPE_SIGN, "����");
		tmp.put(BASEINFO_TYPE_HOMETOWN, "������");
		tmp.put(BASEINFO_MOVIE_TYPE, "��Ӱ����");
		tmp.put(BASEINFO_MOVIE_EDITION, "��Ӱ�汾");
		tmp.put(BASEINFO_STATE, "����/����");				
		tmp.put(BASEINFO_FILMTYPE, "Ƭ��");
		tmp.put(BASEINFO_IMPORTMODE, "����ģʽ");
		tmp.put(BASEINFO_PERIOD, "���");		
		tmp.put(BASEINFO_AGELAYER, "�����");
		tmp.put(BASEINFO_FEATURE, "�û�����");
		baseinfoMap = UnmodifiableMap.decorate(tmp);
	}
	
}
