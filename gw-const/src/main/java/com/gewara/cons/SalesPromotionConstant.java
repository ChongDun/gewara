package com.gewara.cons;

import java.util.ArrayList;
import java.util.List;

public class SalesPromotionConstant {
	//�ۿۿ�ʹ�õİ��SpecialDiscount
	public static final String APPLY_TAG_MOVIE = "movie";
	public static final String APPLY_TAG_DRAMA = "drama";
	public static final String APPLY_TAG_MALL = "mall";
	public static final String APPLY_TAG_BAOCHANG = "baoChang";
	public static final String APPLY_TAG_GOODS = "goods";
	public static final String APPLY_TAG_GENERAL = "general";	//ͨ�ã��ر��ӵĹ���ʹ�ã����������Ա���
	public static final String APPLY_TAG_GOODSBINDMOBIE = "goodsbindmovie";

	
	public static final String TAG_MOVIE = "movie";
	public static final String TAG_GOODS = "goods";
	public static final String TAG_DRAMA = "drama";
	public static final String TAG_MALL = "mall";
	public static final String TAG_BAOCHANG = "baoChang";
	public static final String TAG_GOODSBINDMOVIE = "goodsbindmovie";
	public static final String TAG_GENERAL = "general";	
	public static final List<String> TAG_LIST = new ArrayList<String>();
	static {
		TAG_LIST.add(TAG_MOVIE);
		TAG_LIST.add(TAG_GOODS);
		TAG_LIST.add(TAG_DRAMA);
		TAG_LIST.add(TAG_MALL);
		TAG_LIST.add(TAG_GOODSBINDMOVIE);
		TAG_LIST.add(TAG_GENERAL);
	}
	
	public static final String DISCOUNT_TYPE_PERORDER = "order";			//ÿ�ʶ����ۿ�
	public static final String DISCOUNT_TYPE_PERTICKET = "uprice";			//ÿ����Ʒ�ۿ�
	public static final String DISCOUNT_TYPE_PERCENT = "percent";			//�����ܶ�ٷֱ�
	public static final String DISCOUNT_TYPE_BUYONE_GIVEONE = "one2one";	//��1��1
	public static final String DISCOUNT_TYPE_FIXPRICE = "fprice";			//fix priceͳһ���ۣ����۹̶���
	public static final String DISCOUNT_TYPE_EXPRESSION = "exp";				//���ʽ
	
	public static final String WEBVIEW_SIMPLE_TYPE = "sType";   //��Ƭ�б���ʾ
	public static final String WEBVIEW_SIMPLE_TEXT = "sText";   //��Ƭ�б���ʾ
	public static final String WEBVIEW_SIMPLE_ISHOW = "mpiIsShow";   //�Ƿ�����Ƭ�б���ʾ
	public static final String WEBVIEW_SIMPLE_INDEX = "mpiIndex";   //��Ƭ�б�����ʾ��˳��
	
	public static final String EXP_MINNUM = "exp_minnum";   	//��ʽ�е���С��������
	public static final String EXP_MAXNUM = "exp_maxnum";   	//��ʽ�е����������
	
	public static final String UNCHECKCARDNUM = "unCheckCardnum";	//��У�鿨bin������ţʹ�ÿ������ƣ���Ϊ��֧������΢�ţ����Կ��Բ���У�飩
	public static final String ITEM_MAX_SELLNUM = "item_max_sellnum";//ÿ����������������ٸ���λ
	public static final String APP_OPI_SHOW = "app_opi_show";	// APP �ؼ۳�����ʾ��
	
	public static final String DISCOUNT_PERIOD_A = "A";				//�Զ�������
	public static final String DISCOUNT_PERIOD_D = "D";				//��Ȼ��
	public static final String DISCOUNT_PERIOD_W = "W";				//��Ȼ������(һ��)
	public static final String DISCOUNT_PERIOD_DW = "DW";			//��Ȼ������(����)
	public static final String DISCOUNT_PERIOD_M = "M";				//��Ȼ������(һ����)
	
	public static final String REBATES_CASH = "Y";		//�ֽ�
	public static final String REBATES_CARDA = "A";		//A��
	public static final String REBATES_CARDC = "C";		//C��
	public static final String REBATES_CARDD = "D";		//D��
	public static final String REBATES_POINT = "P";		//����
	
	public static final String OPENTYPE_GEWA = "G"; 	//GewaPC 
	public static final String OPENTYPE_WAP = "W";		//GewaPC �ֻ���app+wap����ptnids����
	public static final String OPENTYPE_PC_WAP = "M";	//GewaPC + �ֻ�
	public static final String OPENTYPE_PARTNER = "P";	//�̼��������ο���
	public static final String OPENTYPE_SPECIAL = "S";	//�ر����õĲſ���
	public static final List<String> OPENTYPELIST = new ArrayList<String>();
	static {
		OPENTYPELIST.add(SalesPromotionConstant.OPENTYPE_SPECIAL);
		OPENTYPELIST.add(SalesPromotionConstant.OPENTYPE_WAP);
		OPENTYPELIST.add(SalesPromotionConstant.OPENTYPE_PARTNER);
		OPENTYPELIST.add(SalesPromotionConstant.OPENTYPE_GEWA);
		OPENTYPELIST.add(SalesPromotionConstant.OPENTYPE_PC_WAP);
	}
	
	public static final String ENABLE = "Y";
	public static final String DISABLE = "N";
	
	
	public static final String ENCODE_KEY = "KE3a&h@";
	
	//����֧����ʽ
	public static final String VERIFYTYPE_FIXED = "fixed";		//�̶��룬���˶���ظ�ʹ��
	public static final String VERIFYTYPE_ONLYONE = "onlyone";	//ֻ��һ��

	//������Ϣ��Ӧkey
	public static final String MSG_REENTER_CARD_NO = "reenter_card_no";				//���û�����Ŀ��Ų��ڴ˴��Ż��У���ʾ�û��������뿨��ʱ����Ҫ��ʾ����Ϣ��
	public static final String MSG_CHECK_PAY_METHOD = "check_pay_method";			//���û�֧����ʽѡ�����ʱ����Ҫ��ʾ����Ϣ��
	public static final String MSG_INPUT_RIGHT_BANK_NO = "input_right_bank_no";		//���û���������п���λ������ʱ����Ҫ��ʾ����Ϣ��
	public static final String MSG_WRONG_BANK_NO = "wrong_bank_no";					//���û���������п��Ŵ���ʱ������Ҫ��ʾ����Ϣ��
	public static final String MSG_NOT_SUPPORT_DISCOUNT = "not_support_discount";	//���û�����Ŀ��Ų��ڴ˴��Ż��У���Ҫ��ʾ����Ϣ��
	
	public static final String SEATTYPE_ALL = "A";		// ������λ���ؼۻ���õ���λ���ͣ�
	public static final String SEATTYPE_NORMAL = "N";	// ��ͨ��λ������������
	public static final String SEATTYPE_LOVESEAT = "L";	// ������
	
}
