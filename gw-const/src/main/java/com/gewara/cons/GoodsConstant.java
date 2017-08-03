package com.gewara.cons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class GoodsConstant {
	public static final String MANAGER_USER = "user";					//����Ա
	public static final String MANAGER_MEMBER = "member";				//��ͨ�û�
	public static final String MANAGER_ORGANIZATION = "organization";	//��֯
	public static final List<String> MANAGER_LIST = Arrays.asList(MANAGER_MEMBER, MANAGER_USER, MANAGER_ORGANIZATION);
	
	public static final String GOODS_TYPE_GOODS = "goods";		
	public static final String GOODS_TYPE_ACTIVITY = "activity";					//��շ�
	public static final String GOODS_TYPE_TICKET = "ticket";							//ͨƱ
	
	//��շѵ�TAG
	public static final String GOODS_TAG_POINT = "point"; 							//���ֶһ���Ʒ
	public static final String GOODS_TAG_GROUPON = "groupon";						//�Ź�
	public static final String GOODS_TAG_BMH = "bmh";								//ӰԺ������Ʒ�����׻�	
	public static final String GOODS_TAG_BMH_THEATRE= "bmh_theatre";				//����
	
	//Ԥ�ۡ�����Ʒ
	public static final String SMALLTYPE_PRE = "pre";								//Ԥ��������Ʒ
	public static final String SMALLTYPE_DERIVATIVE = "derivative";					//����Ʒ
	public static final String SMALLTYPE_POINT = "point"; 							//���ֶһ���Ʒ
	public static final String SMALLTYPE_BMH = "bmh";									//ӰԺ������Ʒ�����׻�	
	public static final String SMALLTYPE_BS_MP = "bs_maipin";						//�̻����ˣ���Ʒ
	public static final String SMALLTYPE_BS_DER = "bs_derivative";					//�̻����ˣ�����Ʒ
	public static final String SMALLTYPE_BS_PART = "bs_partner";					//�̻����ˣ���������Ʒ
	
	public static final String BS_ACTIVITYID = "bsActivityid";						//�̻����ˣ��ID

	public static final String EXTRA_TYPE = "T";	//�ݳ�����

	public static final List<String> SMALLTYPE_BSLIST = Arrays.asList(SMALLTYPE_BS_MP, SMALLTYPE_BS_DER, SMALLTYPE_BS_PART);
	
	public static final List<String> SMALLTYPE_PRELIST = Arrays.asList(SMALLTYPE_PRE, SMALLTYPE_DERIVATIVE);
	
	public static final String DELIVER_ELEC = "elec"; 			//����ȯ
	public static final String DELIVER_ENTITY= "entity"; 		//ʵ��
	public static final String DELIVER_ADDRESS= "address"; 		//��ַ
	public static final String GOODS_SHOPPING_COUNT = "shoppingcount";	//������Ʒ����
	
	public static final String PERIOD_Y = "Y";		//��ʱ��
	public static final String PERIOD_N = "N";		//��ʱ��
	
	public static final String CHECK_GOODS_PRICE = "price";
	public static final String CHECK_GOODS_DISCOUNT = "discount";
	public static final List<String> CHECK_GOODSLIST = Arrays.asList(CHECK_GOODS_PRICE, CHECK_GOODS_DISCOUNT);
	
	
	public static final String FEETYPE_O = "O"; //��������Ʒ���������շ���ѣ�
	public static final String FEETYPE_G = "G";	//Gewara��Ʒ�������Լ����
	public static final String FEETYPE_P = "P";	//����ƽ̨����������Ӷ��
	public static final String FEETYPE_C = "C";	//Ԥ��(��Ʒ��ȯ��ʽʵ��)
	public static final String FEETYPE_T = "T";	//ָ������ƽ̨
	
	
	public static final String GOODS_SHARE_KEY = "gsk@sWet";
	
	public static final String GOODS_OTHER_MOVIEORDER = "movieOrder";
	public static final String GOODS_OTHER_LASTMOVIETIME = "lastMovieTime";
	public static final String GOODS_OTHER_BUYTICKET = "buyticket";
	public static final String GOODS_OTHER_EDITION = "edition";
	public static final String GOODS_OTHER_CHARACTERISTIC = "characteristic";

	public static final String TAG_CINEMA = "cinema";				//��������-cinema
	public static final String TAG_THEATRE = "theatre";				//��������-theatre
	
	public static final String SERVICETYPE_MOVIE = "movie";					//��Ӱģ��
	public static final String SERVICETYPE_DRAMA = "drama";					//�ݳ�ģ��
	public static final String SERVICETYPE_ACTIVITY = "activity";			//�ģ��
	
	public static final Map<String, String> feetypeMap;
	public static final Map<String, String> SERVICETYPEMAP;
	public static final String TEAM_MSG_FLAG = "teammsgflag";	//ƴ�Ŷ���״̬
	static{
		Map<String, String> tmp = new LinkedHashMap<String, String>();
		tmp.put(FEETYPE_O, "��������Ʒ");
		tmp.put(FEETYPE_G, "Gewara��Ʒ");
		tmp.put(FEETYPE_P, "����ƽ̨");
		tmp.put(FEETYPE_C, "Ԥ��");
		tmp.put(FEETYPE_T, "ָ������ƽ̨");
		feetypeMap = UnmodifiableMap.decorate(tmp);
		
		Map<String, String> tmpMap = new HashMap<String, String>();
		tmpMap.put(SERVICETYPE_MOVIE, "��Ӱģ��");
		tmpMap.put(SERVICETYPE_DRAMA, "�ݳ�ģ��");
		tmpMap.put(SERVICETYPE_ACTIVITY, "�ģ��");
		SERVICETYPEMAP = UnmodifiableMap.decorate(tmpMap);
	}
}
