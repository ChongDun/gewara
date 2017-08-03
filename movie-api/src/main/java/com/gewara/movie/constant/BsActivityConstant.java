package com.gewara.movie.constant;

public class BsActivityConstant {
	public static final String ENABLE = "Y";			// ����
	public static final String DISABLE = "N";			// ������
	
	public static final String ACTTYPE_BS="bs";			// �̻�����
	public static final String ACTTYPE_SMS="sms";		// Ӫ������
	
	public static final String PRINTPAPER_Y = "Y";		// ��Ҫ��ӡƱֽ
	public static final String PRINTPAPER_N = "N";		// ����Ҫ��ӡƱֽ
	
	public static final String TAG_BSCARD_SMS = "sms";	// Ӫ������ȯ��
	public static final String TAG_BSCARD_BS = "bs";	// Ӫ������ȯ��
	
	public static final String BS_ACTIVITYID = "bsActivityid";	// �̻����˶���otherinfo key
	
	public static final String getBsCounterKey(Long bsid){
		return "BSACTIVITYSMSSOUNTER"+bsid;
	}
}

