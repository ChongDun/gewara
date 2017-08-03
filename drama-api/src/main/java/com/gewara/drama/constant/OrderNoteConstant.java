package com.gewara.drama.constant;

import java.util.Arrays;
import java.util.List;

public abstract class OrderNoteConstant {
	public static String STATUS_P = "P";
	public static String STATUS_R = "R";
	
	public static String RESULT_S = "S";	//��ͬ��
	
	public static final String CONVERTTYPE_INIT = "init";
	public static final String CONVERTTYPE_CONVERT = "convert";
	public static final String CONVERTTYPE_REFUND = "refund";		//�˿�
	
	public static final String CONVERTTICKET_PEOPLE = "people";		//�˹��һ�
	public static final String CONVERTTICKET_POS = "pos";				//POS���һ�
	
	public static final List<String> VALID_CONVERTTYPELIST = Arrays.asList(CONVERTTYPE_REFUND, CONVERTTICKET_PEOPLE, CONVERTTICKET_POS); //��֤��������
	
	
}
