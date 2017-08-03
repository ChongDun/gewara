package com.gewara.weixin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.gewara.support.ErrorCode;
import com.gewara.util.GewaLogger;
import com.gewara.util.HttpResult;
import com.gewara.util.HttpUtils;
import com.gewara.util.JsonUtils;
import com.gewara.util.LoggerUtils;

public class WeixinMenuUtil {
	private static final transient GewaLogger dbLogger = LoggerUtils.getLogger(WeixinUtil.class);
	public final static String CREATEMENU_URL = "https://api.weixin.qq.com/cgi-bin/menu/create";
	//��ע�˺�
	public final static String EVENT_LOCATION= "location";
	public final static String EVENT_SUBSCRIBE = "subscribe";
	public final static String EVENT_UNSUBSCRIBE = "unsubscribe";
	public final static String EVENT_SCAN = "SCAN";
	//�¼�����
	public final static String KEY_BOOKING = "booking";
	public final static String KEY_DISCOUNT = "discount";
	public final static String KEY_HOTMOVIE = "hotMovie";
	public final static String KEY_NEARCINEMA = "nearCinema";
	public final static String KEY_DAYWALA = "dayWala";
	public final static String KEY_WALAALL = "walaAll";
	public final static String KEY_MYORDER = "myOrder";
	public final static String KEY_TICKETPWD = "ticketPwd";
	public final static String KEY_MYACCOUNT = "myAccount";
	public final static String KEY_WEIKEFU = "weiKefu";
	public final static String KEY_KEFUTEL = "kefuTel";
	public final static String KEY_DOWNAPP = "downApp";
	public final static String KEY_UPMOVIE = "upMovie";
	public final static String KEY_BAGUA = "baGua";
	public final static String KEY_NEWACT = "newAct";
	public final static String KEY_ZXKEFU = "zxKefu";
	//��ȯͨ�����
	public final static String KEY_CARD_PASS_CHECK = "card_pass_check";
	public final static String KEY_USER_GET_CARD = "user_get_card";
	public final static String KEY_USER_DEL_CARD = "user_del_card";
	public final static String KEY_SCAN_QCODE = "qrscene_"; //δ��עʱɨ���������ά���¼�
	public static final List<String> getEventList(){
		List<String> eventList = new ArrayList();
		eventList.add(KEY_MYORDER);
		eventList.add(KEY_BOOKING);
		eventList.add(KEY_TICKETPWD);
		eventList.add(KEY_MYACCOUNT);
		return eventList;
	}
	//�����˵�
	public Map<String, List<Button>> getButtonList(){
		List<SubButton> subList1 = getSubButton(new String[]{"���ŵ�Ӱ,hotMovie","������ӳ,upMovie","��Ӱָ��,dayWala","�������Ѷ�,baGua"});
		List<SubButton> subList2 = getSubButton(new String[]{"Ҫ��Ҫ,newAct","˽�˶���,booking"});
		List<SubButton> subList3 = getSubButton(new String[]{"ӰԺ�״�,nearCinema","�ҵĶ���,myOrder","ȡƱ����,ticketPwd","�ҵ��˻�,myAccount","����APP,downApp"});
		Button b1 = new Button("�ǳ����", subList1);
		Button b2 = new Button("�������", subList2);
		Button b3 = new Button("������", subList3);
		List<Button> buttonList = new ArrayList();
		buttonList.add(b1);
		buttonList.add(b2);
		buttonList.add(b3);
		Map<String, List<Button>> map = new HashMap<String, List<Button>>();
		map.put("button", buttonList);
		return map;
	}
	
	
	
	public Map<String, List<Button>> getButtonList_weixinCard(){
		List<SubButton> subList1 = getSubButton(new String[]{"��Ӱ��ʿ,dayWala","������ӳ,upMovie","���ŵ�Ӱ,hotMovie"});
		List<SubButton> subList2 = getSubButton(new String[]{"������ӳ,hotMovie","����APP,downApp"});
		List<SubButton> subList3 = getSubButton(new String[]{"ȡƱ����,ticketPwd","�ҵ��˻�,myAccount","���߿ͷ�,zxKefu"});
		Button b1 = new Button("��Ӱָ��", subList1);
		Button b2 = new Button("��Ʊ", subList2);
		Button b3 = new Button("�ҿͷ�", subList3);
		List<Button> buttonList = new ArrayList();
		buttonList.add(b1);
		buttonList.add(b2);
		buttonList.add(b3);
		Map<String, List<Button>> map = new HashMap<String, List<Button>>();
		map.put("button", buttonList);
		return map;
	}
	
	private List<SubButton> getSubButton(String[] str ){
		List<SubButton> subList = new ArrayList<SubButton>();
		for(String ss : str){
			SubButton sb = new SubButton();
			String[] s = StringUtils.split(ss, ",");
			String key = s[1];
			if(StringUtils.equals(key, "booking")){
				sb.setType("view");
				sb.setUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxaa6b64035a2dcb4c&redirect_uri=http://m.gewara.com/weixin/authRes.xhtml&response_type=code&scope=snsapi_base&state=123");
				//sb.setUrl("http://m.gewara.com/touch/movie/index.xhtml");
			} else if (StringUtils.equals(key, "dayWala")){
				sb.setType("view");
				sb.setUrl("http://mp.weixin.qq.com/s?__biz=MjM5NTIzNzgyNA==&mid=401043217&idx=1&sn=ea1b64aaa4d490c2defd4f18aa9de018&scene=4#wechat_redirect");
			}else if(StringUtils.equals(key, "upMovie")){
				sb.setType("view");
				sb.setUrl("http://m.gewara.com/touch/movie/futureMovieList.xhtml");
			}else if(StringUtils.equals(key, "weiquan")){
				sb.setType("view");
				sb.setUrl("http://");
			}else if(StringUtils.equals(key, "hotMovie")){
				sb.setType("view");
				sb.setUrl("http://m.gewara.com/touch/movie/index.xhtml");
			}else {
				sb.setType("click");
				sb.setUrl("");
			}
			sb.setName(s[0]);
			sb.setKey(s[1]);
			subList.add(sb);
		}
		return subList;
	}
	//�����˵�	
	public static ErrorCode<String> createMenu(String access_token, String body) {
		HttpResult result = HttpUtils.postBodyAsString(CREATEMENU_URL + "?access_token=" + access_token, body);
		String response = result.getResponse();
		dbLogger.warn(result.getResponse() + "," + result.getMsg());
		if(result.isSuccess()){
			return ErrorCode.getFailure(result.getMsg());
		}
		Map<String, String> map = JsonUtils.readJsonToMap(response);
		String errmsg = map.get("errmsg");
		if(!StringUtils.equalsIgnoreCase(errmsg, "ok")){
			return ErrorCode.getFailure(errmsg);
		}
		return ErrorCode.SUCCESS;
	}
}
