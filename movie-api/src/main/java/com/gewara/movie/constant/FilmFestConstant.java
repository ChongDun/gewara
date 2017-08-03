package com.gewara.movie.constant;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.lang.StringUtils;


public class FilmFestConstant {
	
	public static final String MPITYPE_FILMFEST = "filmfest";
	
	// ������Ӱ��CODE
	public static final String CODE_BEIJING5 = "beijing5";
	
	// ����֮ѡ
	public static final String CODE_BEIJING5_RQZX = "beijing5_rqzx";
	// Ϊ�㶨��
	public static final String CODE_BEIJING5_DINGZHI = "beijing5_dingzhi";
	// ������Ԫ
	public static final String CODE_BEIJING5_JSDY = "beijing5_jsdy";
	// ��Ӱ�ڱ�ʶ
	public static final String MPITYPE_FILMFEST5 = "filmfest";
	
	// ������Ӱ��CODE
	public static final String CODE_BEIJING6 = "beijing6";
	// ����֮ѡ
	public static final String CODE_BEIJING6_RQZX = "beijing6_rqzx";
	// Ϊ�㶨��
	public static final String CODE_BEIJING6_DINGZHI = "beijing6_dingzhi";
	// ������Ԫ
	public static final String CODE_BEIJING6_JSDY = "beijing6_jsdy";
	// ��Ӱ�ڱ�ʶ
	public static final String MPITYPE_FILMFEST6 = "filmfest";
	
	
	
	
	
	
	
	
	
	
	
	public static final String TAG_FILMFEST_16 = "16film";	//��16���Ӱ��
	public static final String TAG_FILMFEST_17 = "17film";
	public static final String GEWARA_FILMFEST = "gewara_filmfest_";
	
	public static final String MESSAGES_EN = "en";
	public static final String MESSAGES_ZH = "ZH";
	public static boolean isValidMessagesEn(String local){
		if(StringUtils.isBlank(local)){
			return false;
		}
		return StringUtils.equals(local, MESSAGES_EN);
	}
	
	public static final String MESSAGE_CODE_MOVIEID = "100001";
	public static final String MESSAGE_CODE_PLAYTIME = "100002";
	public static final String MESSAGE_CODE_QUANTITY = "100003";
	public static final String MESSAGE_CODE_NOSEAT = "100004";
	public static final String MESSAGE_CODE_ONESEAT = "100005";
	public static final String MESSAGE_CODE_CAPTCHA = "100006";
	
	public static final Map<String, String> MESSAGE_MSG_EN;
	public static final Map<String, String> MESSAGE_MSG_ZH;
	static{
		Map<String, String> tmpEnMap = new HashMap<String, String>();
		tmpEnMap.put(MESSAGE_CODE_MOVIEID, "You have reserved the same movie, please choose other movies.");
		tmpEnMap.put(MESSAGE_CODE_PLAYTIME, "You have reserved the other movie in the same time & date, please choose other movies.");
		tmpEnMap.put(MESSAGE_CODE_QUANTITY, "You have reserved 10 movies.");
		tmpEnMap.put(MESSAGE_CODE_NOSEAT, "Please choose a seat first.");
		tmpEnMap.put(MESSAGE_CODE_ONESEAT, "You can only choose one seat.");
		tmpEnMap.put(MESSAGE_CODE_CAPTCHA, "Wrong Captcha.");
		MESSAGE_MSG_EN = UnmodifiableMap.decorate(tmpEnMap);
		
		Map<String, String> tmpZhMap = new HashMap<String, String>();
		tmpZhMap.put(MESSAGE_CODE_MOVIEID, "����ԤԼ����ͬӰƬ����ѡ������ӰƬ��");
		tmpZhMap.put(MESSAGE_CODE_PLAYTIME, "����ԤԼ����ͬ����ʱ�������ӰƬ����ѡ������ʱ���ӰƬ��");
		tmpZhMap.put(MESSAGE_CODE_QUANTITY, "����ԤԼ��ӰƬ�����Ѵ�10����");
		tmpZhMap.put(MESSAGE_CODE_NOSEAT, "��ѡ����λ��");
		tmpZhMap.put(MESSAGE_CODE_ONESEAT, "��ֻ��ѡ��һ����λ��");
		tmpZhMap.put(MESSAGE_CODE_CAPTCHA, "��֤�����");
		MESSAGE_MSG_ZH = UnmodifiableMap.decorate(tmpZhMap);
	}
	
	public static Map<String, String> getMessageMap(String local){
		if(isValidMessagesEn(local)){
			return MESSAGE_MSG_EN;
		}
		return MESSAGE_MSG_ZH;
	}
}
