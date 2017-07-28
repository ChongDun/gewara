/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.cons;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class GoodsConstant {
	public static final String MANAGER_USER = "user";
	public static final String MANAGER_MEMBER = "member";
	public static final String MANAGER_ORGANIZATION = "organization";
	public static final List<String> MANAGER_LIST = Arrays.asList(new String[] { "member", "user", "organization" });
	public static final String GOODS_TYPE_GOODS = "goods";
	public static final String GOODS_TYPE_ACTIVITY = "activity";
	public static final String GOODS_TYPE_TICKET = "ticket";
	public static final String GOODS_TAG_POINT = "point";
	public static final String GOODS_TAG_GROUPON = "groupon";
	public static final String GOODS_TAG_BMH = "bmh";
	public static final String GOODS_TAG_BMH_THEATRE = "bmh_theatre";
	public static final String SMALLTYPE_PRE = "pre";
	public static final String SMALLTYPE_DERIVATIVE = "derivative";
	public static final String SMALLTYPE_POINT = "point";
	public static final String SMALLTYPE_BMH = "bmh";
	public static final String SMALLTYPE_BS_MP = "bs_maipin";
	public static final String SMALLTYPE_BS_DER = "bs_derivative";
	public static final String SMALLTYPE_BS_PART = "bs_partner";
	public static final String BS_ACTIVITYID = "bsActivityid";
	public static final String EXTRA_TYPE = "T";
	public static final List<String> SMALLTYPE_BSLIST = Arrays
			.asList(new String[] { "bs_maipin", "bs_derivative", "bs_partner" });
	public static final List<String> SMALLTYPE_PRELIST = Arrays.asList(new String[] { "pre", "derivative" });
	public static final String DELIVER_ELEC = "elec";
	public static final String DELIVER_ENTITY = "entity";
	public static final String DELIVER_ADDRESS = "address";
	public static final String GOODS_SHOPPING_COUNT = "shoppingcount";
	public static final String PERIOD_Y = "Y";
	public static final String PERIOD_N = "N";
	public static final String CHECK_GOODS_PRICE = "price";
	public static final String CHECK_GOODS_DISCOUNT = "discount";
	public static final List<String> CHECK_GOODSLIST = Arrays.asList(new String[] { "price", "discount" });
	public static final String FEETYPE_O = "O";
	public static final String FEETYPE_G = "G";
	public static final String FEETYPE_P = "P";
	public static final String FEETYPE_C = "C";
	public static final String FEETYPE_T = "T";
	public static final String GOODS_SHARE_KEY = "gsk@sWet";
	public static final String GOODS_OTHER_MOVIEORDER = "movieOrder";
	public static final String GOODS_OTHER_LASTMOVIETIME = "lastMovieTime";
	public static final String GOODS_OTHER_BUYTICKET = "buyticket";
	public static final String GOODS_OTHER_EDITION = "edition";
	public static final String GOODS_OTHER_CHARACTERISTIC = "characteristic";
	public static final String TAG_CINEMA = "cinema";
	public static final String TAG_THEATRE = "theatre";
	public static final String SERVICETYPE_MOVIE = "movie";
	public static final String SERVICETYPE_DRAMA = "drama";
	public static final String SERVICETYPE_ACTIVITY = "activity";
	public static final Map<String, String> feetypeMap;
	public static final Map<String, String> SERVICETYPEMAP;
	public static final String TEAM_MSG_FLAG = "teammsgflag";

	static {
		LinkedHashMap tmp = new LinkedHashMap();
		tmp.put("O", "��������Ʒ");
		tmp.put("G", "Gewara��Ʒ");
		tmp.put("P", "����ƽ̨");
		tmp.put("C", "Ԥ��");
		tmp.put("T", "ָ������ƽ̨");
		feetypeMap = UnmodifiableMap.decorate(tmp);
		HashMap tmpMap = new HashMap();
		tmpMap.put("movie", "��Ӱģ��");
		tmpMap.put("drama", "�ݳ�ģ��");
		tmpMap.put("activity", "�ģ��");
		SERVICETYPEMAP = UnmodifiableMap.decorate(tmpMap);
	}
}