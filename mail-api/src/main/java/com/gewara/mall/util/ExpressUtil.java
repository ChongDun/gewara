package com.gewara.mall.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.ResultCode;
import com.gewara.mall.vo.express.ExpressRes;
import com.gewara.util.HttpResult;
import com.gewara.util.HttpUtils;
import com.gewara.util.JsonUtils;
//��ݵ�������Ϣ�ĸ���
public class ExpressUtil {
	public static final String EXPRESS_SF = "shunfeng";
	//ʹ��lun.li@gewara.com��½showapi.com
	public static final String APPID = "2440";
	public static final String SECRET = "2703ea38b023468099941a827cb4818a";
	public static final String URL4EXP = "https://route.showapi.com/64-19";
	//��ݹ�˾��ѯ
	public static final String URL4EXPCOMPANY = "http://route.showapi.com/64-20";
	public static final Map<String, String> companyMap = new HashMap<String, String>();
	public static final Map<String,String> statusMap =  new HashMap<String,String>();
	public static ResultCode<ExpressRes> getQryRes(String nu, String com){
		if(StringUtils.isBlank(nu) || StringUtils.isBlank(com)){
			return ResultCode.getFailure("���ݲ���Ϊ�գ�");
		}
		if(StringUtils.equalsIgnoreCase(com, "ygzt") || StringUtils.length(nu)<=6 || StringUtils.startsWith(nu, "0000")){
			return ResultCode.getFailure("Ա�����᲻��ѯ��");
		}
		Map<String, String> map = new HashMap<String, String>();
		Long curtime = System.currentTimeMillis();
		map.put("com",com);
		map.put("nu", nu);
		map.put("showapi_appid", APPID);
		map.put("showapi_timestamp",curtime+"");
		map.put("showapi_sign","simple_" + SECRET);
		HttpResult code = HttpUtils.postUrlAsString(URL4EXP, map);
		if(!code.isSuccess()){
			return ResultCode.getFailure(code.getStatus()+"", code.getMsg());
		}
		String res = code.getResponse();
		ExpressRes expRes = JsonUtils.readJsonToObject(ExpressRes.class, res);
		if(!expRes.getShowapi_res_code().equals(0)){
			return ResultCode.getFailure(expRes.getShowapi_res_error());
		}
		return ResultCode.getSuccessReturn(expRes);
	}
	public static ResultCode<ExpressRes> getCompanyQryRes(){
		Map<String, String> map = new HashMap<String, String>();
		Long curtime = System.currentTimeMillis();
		map.put("showapi_appid", APPID);
		map.put("showapi_timestamp",curtime+"");
		map.put("showapi_sign","simple_" + SECRET);
		HttpResult code = HttpUtils.postUrlAsString(URL4EXPCOMPANY, map);
		if(!code.isSuccess()){
			return ResultCode.getFailure(code.getStatus()+"", code.getMsg());
		}
		String res = code.getResponse();
		ExpressRes expRes = JsonUtils.readJsonToObject(ExpressRes.class, res);
		if(!expRes.getShowapi_res_code().equals(0)){
			return ResultCode.getFailure(expRes.getShowapi_res_error());
		}
		return ResultCode.getSuccessReturn(expRes);
	}
	public static void main(String[] args) {
	/*	ResultCode<ExpressRes> code = getCompanyQryRes();
		ExpressRes res = code.getRetval();
		List<ExpressCompany> companyList = res.getShowapi_res_body().getExpressList();
		for(ExpressCompany company : companyList){
			System.out.println(company.getSimpleName()+"\t" + company.getExpName());
		}*/
		ResultCode<ExpressRes> code= getQryRes("968393787473","shentong");
		ExpressRes  exp=code.getRetval();
		System.out.println(exp.getShowapi_res_body().getStatus());
	}
	static{
		companyMap.put("ygzt", 	"Ա������");
		companyMap.put("abc", 	"���������");
		companyMap.put("ande", 	"��������");
		companyMap.put("aol", 	"AOL���");
		companyMap.put("pingyou", 	"����/�Һ���/С��");
		companyMap.put("baotongda", 	"��ͨ������");
		companyMap.put("ppbyb", 	"���ʱ�");
		companyMap.put("dida", 	"�ݴ���");
		companyMap.put("dashun", 	"��˳����");
		companyMap.put("guada", 	"�ڴ���");
		companyMap.put("bgn", 	"��������");
		companyMap.put("lanhu", 	"�������");
		companyMap.put("gdems", 	"�㶫ems���");
		companyMap.put("xlyt", 	"������ͨ");
		companyMap.put("gjbg", 	"���ʰ���");
		companyMap.put("yitongda", 	"��ͨ��");
		companyMap.put("gtsd", 	"�����ٵ�");
		companyMap.put("dada", 	"�������");
		companyMap.put("aramex", 	"Aramex");
		companyMap.put("fangfangda", 	"����������");
		companyMap.put("hebeijianhua", 	"�ӱ���������");
		companyMap.put("haimeng", 	"�����ٵ�");
		companyMap.put("haolaiyun", 	"�����˿��");
		companyMap.put("ucs", 	"�����ٵ�");
		companyMap.put("jiayunmei", 	"����������");
		companyMap.put("jinyue", 	"��Խ���");
		companyMap.put("jixianda", 	"���ȴ�����");
		companyMap.put("jiahuier", 	"�ѻݶ����");
		companyMap.put("kuaitao", 	"���Կ��");
		companyMap.put("lanbiao", 	"���ڿ��");
		companyMap.put("mingliang", 	"��������");
		companyMap.put("minsheng", 	"��ʢ����");
		companyMap.put("peixing", 	"��������");
		companyMap.put("quanjitong", 	"ȫ��ͨ���");
		companyMap.put("jppost", 	"�ձ�����");
		companyMap.put("riyu", 	"��������");
		companyMap.put("tnt", 	"TNT���");
		companyMap.put("usps", 	"USPS���");
		companyMap.put("wanjia", 	"�������");
		companyMap.put("pingyou", 	"С��");
		companyMap.put("singpost", 	"�¼�������");
		companyMap.put("hkpost", 	"�������");
		companyMap.put("yuancheng", 	"Զ������");
		companyMap.put("yuefeng", 	"Խ����");
		companyMap.put("ytfh", 	"һͳ�ɺ���");
		companyMap.put("yumeijie", 	"�����ݿ��");
		companyMap.put("pingyou", 	"�й��������");
		companyMap.put("intmail", 	"�й��������ʰ���");
		companyMap.put("zhongxinda", 	"���Ŵ���");
		companyMap.put("zhongtian", 	"�������");
		companyMap.put("zuochuan", 	"��������");
		companyMap.put("eyoubao", 	"E�ʱ�");
		companyMap.put("chengguang", 	"�̹���");
		companyMap.put("cszx", 	"����֮��");
		companyMap.put("chuanzhi", 	"��־���");
		companyMap.put("dpex", 	"DPEX���");
		companyMap.put("fkd", 	"�ɿ�����");
		companyMap.put("feibao", 	"�ɱ����");
		companyMap.put("huitong", 	"������ͨ");
		companyMap.put("tiantian", 	"������");
		companyMap.put("huiqiang", 	"��ǿ���");
		companyMap.put("jldt", 	"�����ͨ");
		companyMap.put("jiaji", 	"�Ѽ�����");
		companyMap.put("kuaijie", 	"��ݿ��");
		companyMap.put("longbang", 	"��������");
		companyMap.put("lianhaotong", 	"���ͨ���");
		companyMap.put("lejiedi", 	"�ֽݵ�");
		companyMap.put("lijisong", 	"�ɶ������Ϳ��");
		companyMap.put("minbang", 	"����ٵ�");
		companyMap.put("minhang", 	"�񺽿��");
		companyMap.put("ocs", 	"OCS���ʿ��");
		companyMap.put("quanfeng", 	"ȫ����");
		companyMap.put("quanyi", 	"ȫһ���");
		companyMap.put("quanchen", 	"ȫ�����");
		companyMap.put("quanritong", 	"ȫ��ͨ���");
		companyMap.put("shentong", 	"��ͨ���");
		companyMap.put("haihong", 	"ɽ��������");
		companyMap.put("santai", 	"��̬�ٵ�");
		companyMap.put("shenghui", 	"ʢ������");
		companyMap.put("shengfeng", 	"ʢ������");
		companyMap.put("shengan", 	"ʥ������");
		companyMap.put("saiaodi", 	"���ĵ�");
		companyMap.put("ups", 	"UPS���");
		companyMap.put("yousu", 	"���ٿ��");
		companyMap.put("xinbang", 	"�°�����");
		companyMap.put("yuantong", 	"Բͨ���");
		companyMap.put("yunda", 	"�ϴ���");
		companyMap.put("yibang", 	"һ����");
		companyMap.put("yafeng", 	"�Ƿ���");
		companyMap.put("zhongtong", 	"��ͨ���");
		companyMap.put("zhongtie", 	"��������");
		companyMap.put("zhongyou", 	"��������");
		companyMap.put("jingdong", 	"�������");
		companyMap.put("zengyi", 	"������");
		companyMap.put("huaqi", 	"������");
		companyMap.put("fanyu", 	"������");
		companyMap.put("yad", 	"Դ������");
		companyMap.put("feiyang", 	"������");
		companyMap.put("wanbo", 	"�򲩿��");
		companyMap.put("fengda", 	"�����");
		companyMap.put("xindan", 	"�µ�����");
		companyMap.put("bfdf", 	"�ٸ�����");
		companyMap.put("bgpyghx", 	"������ƽ�ʡ��Һ���");
		companyMap.put("coe", 	"�������");
		companyMap.put("ems", 	"EMS");
		companyMap.put("henglu", 	"��·����");
		companyMap.put("klwl", 	"��������");
		companyMap.put("meiguo", 	"�������");
		companyMap.put("weitepai", 	"΢���ɿ��");
		companyMap.put("yuntong", 	"��ͨ���");
		companyMap.put("ycwl", 	"Զ������");
		companyMap.put("zjs", 	"լ���Ϳ��");
		companyMap.put("zzjh", 	"֣�ݽ������");
		companyMap.put("ztwy", 	"�������˿��");
		companyMap.put("chengji", 	"�Ǽʿ��");
		companyMap.put("anneng", 	"��������");
		companyMap.put("shiyun", 	"���˿��");
		companyMap.put("yxwl", 	"��������");
		companyMap.put("meilong", 	"�������");
		companyMap.put("guangtong", 	"��ͨ�ٵ�");
		companyMap.put("ees", 	"�ٸ��������(EES)");
		companyMap.put("disifang", 	"���ķ��ٵ�");
		companyMap.put("dsu", 	"D�ٿ��");
		companyMap.put("rufeng", 	"������");
		companyMap.put("anjie", 	"���ݿ��");
		companyMap.put("anxinda", 	"���Ŵ���");
		companyMap.put("changtong", 	"��ͨ����");
		companyMap.put("chengshi100", 	"����100���");
		companyMap.put("chuanxi", 	"��ϲ����(��ϲ���");
		companyMap.put("datian", 	"��������");
		companyMap.put("dayang", 	"�����������");
		companyMap.put("feibang", 	"�ɰ�����");
		companyMap.put("gongsuda", 	"���ٴ�����");
		companyMap.put("haosheng", 	"�ʢ����");
		companyMap.put("yinsu", 	"���ٿ��(��������");
		companyMap.put("rpx", 	"RPX��ʱ��");
		companyMap.put("huaxialong", 	"����������");
		companyMap.put("jiayi", 	"��������");
		companyMap.put("kuanrong", 	"��������");
		companyMap.put("nell", 	"�������(������");
		companyMap.put("sure", 	"�ٶ����");
		companyMap.put("sutong", 	"��ͨ����");
		companyMap.put("huayu", 	"��ػ�������");
		companyMap.put("tongcheng", 	"ͨ������");
		companyMap.put("tonghe", 	"ͨ����������");
		companyMap.put("wanxiang", 	"��������");
		companyMap.put("scs", 	"ΰ����(SCS���)");
		companyMap.put("xinfeng", 	"�ŷ���");
		companyMap.put("yuanzhi", 	"Ԫ�ǽݳϿ��");
		companyMap.put("feihang", 	"ԭ�ɺ����");
		companyMap.put("zhima", 	"֥�鿪��");
		companyMap.put("nengda", 	"�����ܴ���");
		companyMap.put("ririshun", 	"��������˳����");
		companyMap.put("zhaijisong", 	"լ���Ϳ��");
		companyMap.put("anxun", 	"��Ѹ����");
		companyMap.put("debang", 	"�°���");
		companyMap.put("baiqian", 	"��ǧ�Ϲ�������");
		companyMap.put("cces", 	"CCES���");
		companyMap.put("citylink", 	"CityLink���");
		companyMap.put("chukouyi", 	"������");
		companyMap.put("diantong", 	"��ͨ���");
		companyMap.put("dajin", 	"�������");
		companyMap.put("feiyuan", 	"��Զ����");
		companyMap.put("feite", 	"��������");
		companyMap.put("pingyou", 	"�Һ���");
		companyMap.put("gnxb", 	"����С��");
		companyMap.put("gangkuai", 	"�ۿ��ٵ�");
		companyMap.put("huacheng", 	"��������");
		companyMap.put("huahan", 	"��������");
		companyMap.put("hengyu", 	"������ͨ");
		companyMap.put("huahang", 	"�������");
		companyMap.put("jiuyi", 	"���׿��");
		companyMap.put("jiete", 	"���ؿ��");
		companyMap.put("jingshi", 	"��������");
		companyMap.put("kuayue", 	"��Խ���");
		companyMap.put("mengsu", 	"���ٿ��");
		companyMap.put("nanbei", 	"�ϱ����");
		companyMap.put("pingyou", 	"ƽ�ʰ���");
		companyMap.put("pinganda", 	"ƽ������");
		companyMap.put("ruifeng", 	"����ٵ�");
		companyMap.put("rongqing", 	"��������");
		companyMap.put("suijia", 	"�������");
		companyMap.put("simai", 	"˼�����");
		companyMap.put("suteng", 	"���ڿ��");
		companyMap.put("shengbang", 	"�ɰ�����");
		companyMap.put("suchengzhaipei", 	"�ٳ�լ��");
		companyMap.put("wuhuan", 	"�廷�ٵ�");
		companyMap.put("xingchengzhaipei", 	"�ǳ�լ��");
		companyMap.put("ywfex", 	"Դΰ����");
		companyMap.put("yinjie", 	"���ݿ��");
		companyMap.put("gnxb", 	"����С��");
		companyMap.put("yanwen", 	"��������");
		companyMap.put("zongxing", 	"��������");
		companyMap.put("aae", 	"AAE���");
		companyMap.put("dhl", 	"DHL���");
		companyMap.put("fedex", 	"Fedex������(����)");
		companyMap.put("fedexcn", 	"Fedex������(����)");
		companyMap.put("feihu", 	"�ɺ����");
		companyMap.put("guotong", 	"��ͨ���");
		companyMap.put("jingguang", 	"�����ٵ�(KKE���)");
		companyMap.put("shunfeng", 	"˳����(˳������)");
		companyMap.put("spring", 	"��������");
		
		
		statusMap.put("-1", "����ѯ");
		statusMap.put("0", "��ѯ�쳣");
		statusMap.put("1", "���޼�¼");
		statusMap.put("2", "��;��");
		statusMap.put("3", "������");
		statusMap.put("4", "��ǩ��");
		statusMap.put("5", "�û���ǩ");
		statusMap.put("6", "���Ѽ�");
		statusMap.put("7", "��Ч��");
		statusMap.put("8", "��ʱ��");
		statusMap.put("9", "ǩ��ʧ��");
		statusMap.put("10", "�˻�");
		
	}
}
