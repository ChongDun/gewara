/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.cons;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections.map.UnmodifiableMap;
import org.apache.commons.lang.StringUtils;

public abstract class PaymethodConstant implements Serializable {
	private static final long serialVersionUID = -8289964065497333210L;
	public static final String PAYMETHOD_UNKNOWN = "unknown";
	public static final String PAYMETHOD_GEWAPAY = "gewaPay";
	public static final String PAYMETHOD_FCARDPAY = "fcardPay";
	public static final String PAYMETHOD_SYSPAY = "sysPay";
	public static final String PAYMETHOD_ELECARDPAY = "elecardPay";
	public static final String PAYMETHOD_GEWARA_OFFLINEPAY = "offlinePay";
	public static final String PAYMETHOD_CHARGECARD = "ccardPay";
	public static final String PAYMETHOD_LAKALA = "lakalaPay";
	public static final String PAYMETHOD_ABCBANKPAY = "abcPay";
	public static final String PAYMETHOD_WCANPAY = "wcanPay";
	public static final String PAYMETHOD_PARTNERPAY = "partnerPay";
	public static final String PAYMETHOD_OKCARDPAY = "okcardPay";
	public static final String PAYMETHOD_SPSDOPAY1 = "spsdoPay";
	public static final String PAYMETHOD_ALIPAY = "directPay";
	public static final String PAYMETHOD_PNRPAY = "pnrPay";
	public static final String PAYMETHOD_CMPAY = "cmPay";
	public static final String PAYMETHOD_TEMPUSPAY = "tempusPay";
	public static final String PAYMETHOD_SPSDOPAY2 = "spsdo2Pay";
	public static final String PAYMETHOD_CHINAPAY1 = "chinaPay";
	public static final String PAYMETHOD_CHINAPAY2 = "china2Pay";
	public static final String PAYMETHOD_CHINAPAYSRCB = "srcbPay";
	public static final String PAYMETHOD_UNIONPAY = "unionPay";
	public static final String PAYMETHOD_UNIONPAY_JS = "unionPay_js";
	public static final String PAYMETHOD_UNIONPAY_ACTIVITY = "unionPay_activity";
	public static final String PAYMETHOD_UNIONPAY_ACTIVITY_JS = "unionPay_activity_js";
	public static final String PAYMETHOD_UNIONPAY_ZJ = "unionPay_zj";
	public static final String PAYMETHOD_UNIONPAY_SZ = "unionPay_sz";
	public static final String PAYMETHOD_UNIONPAY_BJ = "unionPay_bj";
	public static final String PAYMETHOD_UNIONPAY_GZ = "unionPay_gz";
	public static final String PAYMETHOD_UNIONPAYFAST = "unionPayFast";
	public static final String PAYMETHOD_BCPAY = "bcPay";
	public static final String PAYMETHOD_SPDPAY = "spdPay";
	public static final String PAYMETHOD_CMBPAY = "cmbPay";
	public static final String PAYMETHOD_GDBPAY = "gdbPay";
	public static final String PAYMETHOD_GDB_UNION_PAY = "gdbUnionPay";
	public static final String PAYMETHOD_PSBCPAY = "psbcPay";
	public static final String PAYMETHOD_HZBANKPAY = "hzbankPay";
	public static final String PAYMETHOD_JSBCHINA = "jsbChina";
	public static final String PAYMETHOD_SPDPAY_ACTIVITY = "spdPay_activity";
	public static final String PAYMETHOD_BOCPAY = "bocPay";
	public static final String PAYMETHOD_BOCWAPPAY = "bocWapPay";
	public static final String PAYMETHOD_BOCAGRMTPAY = "bocAgrmtPay";
	public static final String PAYMETHOD_UMPAY = "umPay";
	public static final String PAYMETHOD_UMPAY_SH = "umPay_sh";
	public static final String PAYMETHOD_TELECOM = "telecomPay";
	public static final String PAYMETHOD_MOBILE_TELECOM = "telecomMobilePay";
	public static final String PAYMETHOD_YAGAO = "yagaoPay";
	public static final String PAYMETHOD_ONETOWN = "onetownPay";
	public static final String PAYMETHOD_ALIWAPPAY = "aliwapPay";
	public static final String PAYMETHOD_CMWAPPAY = "cmwapPay";
	public static final String PAYMETHOD_CMBWAPPAY = "cmbwapPay";
	public static final String PAYMETHOD_CMBWAPSTOREPAY = "cmbwapStorePay";
	public static final String PAYMETHOD_SPDWAPPAY = "spdWapPay";
	public static final String PAYMETHOD_CMSMARTPAY = "cmSmartPay";
	public static final String PAYMETHOD_SPDWAPPAY_ACTIVITY = "spdWapPay_activity";
	public static final String PAYMETHOD_CHINASMARTMOBILEPAY = "chinaSmartMobilePay";
	public static final String PAYMETHOD_CHINASMARTJSPAY = "chinaSmartJsPay";
	public static final String PAYMETHOD_ALISMARTMOBILEPAY = "aliSmartMobilePay";
	public static final String PAYMETHOD_HZWAPPAY = "hzwapPay";
	public static final String PAYMETHOD_YEEPAY = "yeePay";
	public static final String PAYMETHOD_PAYECO_DNA = "payecoDNAPay";
	public static final String PAYMETHOD_MEMBERCARDPAY = "memberCardPay";
	public static final String PAYMETHOD_ICBCPAY = "icbcPay";
	public static final String PAYMETHOD_NJCBPAY = "njcbPay";
	public static final String PAYMETHOD_ABCHINAPAY = "abchinaPay";
	public static final String PAYMETHOD_WXAPPTENPAY = "wxAppTenPay";
	public static final String PAYMETHOD_WXAPPPAY = "wxAppPay";
	public static final String PAYMETHOD_WXMPNOPAY = "wxMPNoPay";
	public static final String PAYMETHOD_WXSCANTENPAY = "wxScanTenPay";
	public static final String PAYMETHOD_WXWCPAY = "wxWCPay";
	public static final String PAYMETHOD_CCBWAPPAY = "ccbWapPay";
	public static final String PAYMETHOD_ONECLICKTENPAY = "oneClickTenPay";
	public static final String PAYMETHOD_BESTPAY = "bestPay";
	public static final String PAYMETHOD_BFBWAPPAY = "bfbWapPay";
	public static final String PAYMETHOD_BFBPAY = "bfbPay";
	public static final String PAYMETHOD_ALISCANPAY = "aliScanPay";
	public static final String PAYMETHOD_CCBMBCPAY = "ccbMBCPay";
	public static final String PAYMETHOD_BCWAPPAY = "bcWapPay";
	public static final String PAYMETHOD_BOCWAPV2PAY = "bocWapV2Pay";
	public static final String PAYMETHOD_UNIONWAPPAYFAST = "unionWapPayFast";
	public static final String PAYMETHOD_ICBCWAPPAY = "icbcWapPay";
	public static final String PAYMETHOD_ALITVPAY = "aliTvPay";
	public static final String PAYMETHOD_WEIBOPAY = "weiboPay";
	public static final String PAYMETHOD_PINGAN1QBPAY = "pingan1qbPay";
	public static final String PAYMETHOD_CHUBAOPAY = "chubaoPay";
	public static final String PAYMETHOD_BJRCBPAY = "bjrcbPay";
	public static final String PAYMETHOD_ABCPAYFAST = "abcPayFast";
	public static final String PAYMETHOD_ABCWAPPAYFAST = "abcWapPayFast";
	public static final String PAYMETHOD_ABCPOINTPAYFAST = "abcPointPayFast";
	public static final String PAYMETHOD_HUAANPAY = "huaanPay";
	public static final String PAYMETHOD_HUAANWAPPAY = "huaanWapPay";
	public static final String PAYMETHOD_ALIAPPPAY = "aliAppPay";
	public static final String PAYMETHOD_PAYECOEPAY = "payecoEPay";
	public static final String PAYMETHOD_UNIONAPPPAY = "unionAppPay";
	public static final String PAYMETHOD_APPLEPAY = "applePay";
	public static final String PAYMETHOD_UNIONWAPPAY = "unionWapPay";
	public static final String PAYMETHOD_QQAPPPAY = "qqAppPay";
	public static final String PAYMETHOD_QQTENSCANPAY = "qqTenScanPay";
	public static final String PAYMETHOD_SPDCCCPAY = "spdcccPay";
	public static final String PAYMETHOD_SPDCCCWAPPAY = "spdcccWapPay";
	public static final String PAYMETHOD_CCBAPPPAY = "ccbAppPay";
	public static final String PAYMETHOD_CBHBPAY = "cbhbPay";
	public static final String PAYMETHOD_CBHBWAPPAY = "cbhbWapPay";
	public static final String PAYMETHOD_SFAPPPAY = "sfAppPay";
	public static final String PAYMETHOD_WLTWAPPAY = "wltWapPay";
	public static final String PAYMETHOD_YLCFWAPPAY = "ylcfWapPay";
	public static final String PAYMETHOD_JDWAPPAY = "jdWapPay";
	public static final String PAYMETHOD_JDPAY = "jdPay";
	public static final String PAYMETHOD_CCBWAPSECDPAY = "ccbWapSecdPay";
	public static final String PAYMETHOD_BOCWAPPAYFAST = "bocWapPayFast";
	public static final String PAYMETHOD_FC99BILLPAY = "foreignCard99billPay";
	public static final String PAYMETHOD_GZRCBPAY = "gzrcbPay";
	public static final String PAYMETHOD_GZRCBWAPPAY = "gzrcbWapPay";
	public static final String PAYMETHOD_CHINATELEAPPPAY = "chinaTeleAppPay";
	public static final String PAYMETHOD_CHINATELEWAPPAY = "chinaTeleWapPay";
	public static final String PAYMETHOD_SUNINGWAPPAY = "suningWapPay";
	public static final String PAYMETHOD_INTELWAPPAY = "intelWapPay";
	public static final String PAYMETHOD_SPDCCCB2CPAY = "spdcccB2cPay";
	public static final String PAYMETHOD_SPDCCCB2CWAPPAY = "spdcccB2cWapPay";
	public static final String PAYMETHOD_FQLPAY = "fqlPay";
	public static final String PAYMETHOD_FQLWAPPAY = "fqlWapPay";
	public static final String PAYMETHOD_BOSPAY = "bosPay";
	public static final String PAYMETHOD_BOSWAPPAY = "bosWapPay";
	public static final String PAYMETHOD_PINGANBANKPAY = "pinganBankPay";
	public static final String PAYMETHOD_PINGANBANKWAPPAY = "pinganBankWapPay";
	public static final String PAYMETHOD_PAYECOWAPPAY = "payecoWapPay";
	public static final String PAYMETHOD_MSQMWAPPAY = "msqmWapPay";
	public static final String PAYMETHOD_SPDCCCFASTPAYPAY = "spdcccFastPay";
	public static final String PAYMETHOD_BCOMCCFASTPAYPAY = "bcomccFastPay";
	public static final String PAYMENTOD_MASAWAPPAY = "masaWapPay";
	public static final String PAYMETHOD_TENPAY = "tenPay";
	public static final String PAYMETHOD_ALIBANKPAY = "alibankPay";
	public static final String PAYMETHOD_HANDWAPPAY = "handwapPay";
	public static final String PAYMETHOD_HANDWEBPAY = "handwebPay";
	public static final String PAYMETHOD_PNRFASTPAY = "pnrfastPay";
	public static final String PAYMETHOD_PNRFASTPAY2 = "pnrfastPay2";
	public static final String PAYMETHOD_PNRFASTABCPAY = "pnrfastabcPay";
	public static final String PAYMETHOD_YYPTPAY = "yyptPay";
	public static final String PAYMENTOD_UNICOMWOPAY = "unicomWoPay";
	public static final String PAYMENTOD_MSFPAY = "msfPay";
	public static final String PAYMETHOD_MERCHANTPAY = "merchantPay";
	public static final String PAYMENTOD_XIYINPAY = "xiyinPay";
	public static final String PAYMENTOD_CMBYWTPAY = "cmbywtPay";
	public static final String PAYMENTOD_WCFWAPPAY = "wcfWapPay";
	public static final List<String> PAYMETHOD_LIST = Arrays.asList(new String[] { "gewaPay", "fcardPay", "ccardPay",
			"pnrPay", "directPay", "aliwapPay", "alibankPay", "lakalaPay", "ccbWapSecdPay", "chinaPay", "china2Pay",
			"srcbPay", "okcardPay", "tenPay", "partnerPay", "spsdoPay", "spsdo2Pay", "cmPay", "yagaoPay", "onetownPay",
			"handwebPay", "handwapPay", "cmbPay", "cmbwapPay", "bcPay", "gdbPay", "gdbUnionPay", "elecardPay", "sysPay",
			"cmwapPay", "chinaSmartMobilePay", "chinaSmartJsPay", "aliSmartMobilePay", "umPay", "umPay_sh", "spdPay",
			"spdPay_activity", "psbcPay", "spdWapPay", "spdWapPay_activity", "hzbankPay", "abcPay", "wcanPay",
			"unionPay", "telecomPay", "telecomMobilePay", "jsbChina", "tempusPay", "pnrfastPay", "pnrfastPay2",
			"yeePay", "cmSmartPay", "pnrfastabcPay", "unionPayFast", "bocPay", "bocWapPay", "bocAgrmtPay", "hzwapPay",
			"payecoDNAPay", "memberCardPay", "icbcPay", "cmbwapStorePay", "njcbPay", "abchinaPay", "wxAppTenPay",
			"wxAppPay", "wxScanTenPay", "ccbWapPay", "wxWCPay", "oneClickTenPay", "bestPay", "bfbWapPay", "offlinePay",
			"bfbPay", "aliScanPay", "ccbMBCPay", "bcWapPay", "bocWapV2Pay", "unionWapPayFast", "icbcWapPay", "aliTvPay",
			"weiboPay", "pingan1qbPay", "chubaoPay", "bjrcbPay", "abcPayFast", "abcPointPayFast", "huaanPay",
			"huaanWapPay", "aliAppPay", "payecoEPay", "wxMPNoPay", "unionAppPay", "unionWapPay", "qqAppPay",
			"qqTenScanPay", "spdcccPay", "spdcccWapPay", "ccbAppPay", "cbhbPay", "cbhbWapPay", "abcWapPayFast",
			"sfAppPay", "wltWapPay", "ylcfWapPay", "jdWapPay", "jdPay", "bocWapPayFast", "foreignCard99billPay",
			"gzrcbPay", "gzrcbWapPay", "chinaTeleAppPay", "suningWapPay", "intelWapPay", "spdcccB2cPay",
			"spdcccB2cWapPay", "fqlPay", "fqlWapPay", "bosPay", "bosWapPay", "pinganBankPay", "pinganBankWapPay",
			"payecoWapPay", "chinaTeleWapPay", "applePay", "msqmWapPay", "spdcccFastPay", "bcomccFastPay", "yyptPay",
			"unicomWoPay", "msfPay", "xiyinPay", "masaWapPay", "cmbywtPay", "wcfWapPay" });
	public static final List<String> MOBILE_PAYMETHOD_LIST = Arrays.asList(new String[] { "aliwapPay", "cmwapPay",
			"cmbwapPay", "cmbwapStorePay", "spdWapPay", "cmSmartPay", "spdWapPay_activity", "chinaSmartMobilePay",
			"chinaSmartJsPay", "bocWapPay", "fcardPay", "aliSmartMobilePay", "hzwapPay", "wxAppTenPay", "ccbWapPay",
			"wxWCPay", "oneClickTenPay", "bfbWapPay", "ccbMBCPay", "bcWapPay", "bocWapV2Pay", "unionWapPayFast",
			"icbcWapPay", "aliTvPay", "weiboPay", "pingan1qbPay", "chubaoPay", "huaanWapPay", "aliAppPay", "payecoEPay",
			"wxMPNoPay", "unionAppPay", "unionWapPay", "qqAppPay", "spdcccWapPay", "ccbAppPay", "cbhbPay", "cbhbWapPay",
			"abcWapPayFast", "abcPayFast", "ylcfWapPay", "sfAppPay", "wltWapPay", "abchinaPay", "jdWapPay",
			"ccbWapSecdPay", "bocWapPayFast", "gzrcbWapPay", "chinaTeleAppPay", "suningWapPay", "intelWapPay",
			"spdcccB2cWapPay", "fqlWapPay", "bosWapPay", "pinganBankWapPay", "payecoWapPay", "chinaTeleWapPay",
			"applePay", "msqmWapPay", "spdcccFastPay", "yyptPay", "unicomWoPay", "msfPay", "xiyinPay", "masaWapPay",
			"cmbywtPay", "wcfWapPay" });
	public static final List<String> PARTNER_PAYMETHOD_LIST = Arrays
			.asList(new String[] { "partnerPay", "okcardPay", "spsdoPay" });
	private static Map<String, String> payTextMap;
	private static Map<String, String> merchantPaymethodMap;
	public static final String GATEWAY_CHINAPAY = "chinaPay";
	public static final String GATEWAY_CHARGETELECOMPAY = "chargeTelecomPay";
	public static final String MERCHANT_CHINA2PAY = "china2Pay";
	public static final String MERCHANT_CHINAPAY = "chinaPay";
	public static final String MERCHANT_SRCBPAY = "srcbPay";
	public static final String BANK_NONE = "0000";
	public static final String BANK_SRCB = "SRCB";
	public static final String REQSOURCE_PC = "PC";
	public static final String REQSOURCE_WAP = "WAP";
	public static final String REQSOURCE_APP = "APP";

	public static String getPaymethodText(String paymethod) {
		return payTextMap.get(paymethod) != null ? (String) payTextMap.get(paymethod)
				: (StringUtils.equals("card", paymethod) ? "�һ�ȯ" : "δ֪");
	}

	public static final boolean isValidPayMethod(String paymethod) {
		return StringUtils.isNotBlank(paymethod) && PAYMETHOD_LIST.contains(paymethod);
	}

	public static Map<String, String> getPayTextMap() {
		return payTextMap;
	}

	public static String getPaymethodByMercdoe(String merchantCode) {
		return StringUtils.isBlank(merchantCode) ? null : (String) merchantPaymethodMap.get(merchantCode);
	}

	static {
		LinkedHashMap tmp = new LinkedHashMap();
		tmp.put("sysPay", "ϵͳ");
		tmp.put("gewaPay", "�������");
		tmp.put("fcardPay", "�㿨֧��");
		tmp.put("elecardPay", "����ȯ");
		tmp.put("offlinePay", "��̨����֧��");
		tmp.put("ccardPay", "���߳�ֵ��");
		tmp.put("lakalaPay", "������");
		tmp.put("abcPay", "ũ�к���");
		tmp.put("wcanPay", "΢�ܿƼ����ֶһ�");
		tmp.put("pnrPay", "�㸶����PC��");
		tmp.put("directPay", "֧����PC��");
		tmp.put("cmPay", "�ƶ��ֻ�֧��PC��");
		tmp.put("chinaPay", "��������");
		tmp.put("china2Pay", "ChinapayPC��");
		tmp.put("spsdo2Pay", "ʢ��ͨPC��");
		tmp.put("payecoDNAPay", "����DNA֧��");
		tmp.put("cmbPay", "����ֱ��PC��");
		tmp.put("cmbwapPay", "����ֱ���ֻ���");
		tmp.put("cmbwapStorePay", "�����ֻ���-STORE");
		tmp.put("bcPay", "����ֱ��PC��");
		tmp.put("gdbPay", "�㷢ֱ��PC��");
		tmp.put("gdbUnionPay", "�㷢����ֱ��PC��");
		tmp.put("bocPay", "�й�����ֱ��PC��");
		tmp.put("bocAgrmtPay", "�й�����Э��֧��");
		tmp.put("spdPay", "�ַ�ֱ��PC��");
		tmp.put("spdPay_activity", "�ַ�ֱ��PC��-�");
		tmp.put("spdWapPay_activity", "�ַ�ֱ���ֻ���-�");
		tmp.put("psbcPay", "�ʴ�ֱ��PC��");
		tmp.put("hzbankPay", "��������");
		tmp.put("hzwapPay", "��������WAP");
		tmp.put("jsbChina", "��������ֱ��PC��-���ÿ�");
		tmp.put("tempusPay", "�ڸ�ͨPC��");
		tmp.put("yeePay", "�ױ�֧��PC��");
		tmp.put("icbcPay", "��������ֱ��֧��PC��");
		tmp.put("njcbPay", "�Ͼ�����ֱ��֧��PC��");
		tmp.put("abchinaPay", "ũҵ����ֱ��֧��PC��");
		tmp.put("aliwapPay", "֧�����ֻ���-WAP֧��");
		tmp.put("bocWapPay", "�й�����ֱ��WAP��");
		tmp.put("cmwapPay", "�ƶ��ֻ�֧���ֻ���-WAP֧��");
		tmp.put("spdWapPay", "�ַ�ֱ���ֻ���-WAP");
		tmp.put("chinaSmartMobilePay", "�����ֻ�����֧��");
		tmp.put("chinaSmartJsPay", "���������ֻ���-���������յ�");
		tmp.put("aliSmartMobilePay", "֧�����ֻ���-��ȫ֧��");
		tmp.put("cmSmartPay", "�ƶ��ֻ�֧����׿��");
		tmp.put("unionPay", "unionPay����֧��");
		tmp.put("unionPay_js", "unionPay����");
		tmp.put("unionPay_activity", "unionPay�");
		tmp.put("unionPay_activity_js", "unionPay���ջ");
		tmp.put("unionPay_zj", "unionPay�㽭");
		tmp.put("unionPay_sz", "unionPay����");
		tmp.put("unionPay_bj", "unionPay����");
		tmp.put("unionPay_gz", "unionPay����");
		tmp.put("unionPayFast", "unionPayFast�������֧��");
		tmp.put("pnrfastPay", "�㸶���֧��--�������ÿ�");
		tmp.put("pnrfastPay2", "�㸶���֧��--�������ÿ�");
		tmp.put("pnrfastabcPay", "�㸶���֧��--ũ�����ÿ�");
		tmp.put("telecomPay", "���Ź̻�����֧��");
		tmp.put("telecomMobilePay", "�����ֻ�����֧��");
		tmp.put("umPay", "�ƶ�����֧��(��������)");
		tmp.put("umPay_sh", "�ƶ�����֧��(��������)_�Ϻ�");
		tmp.put("yagaoPay", "�Ÿ߿�֧��(�������)");
		tmp.put("onetownPay", "һ�ǿ�֧��(�»���ý)");
		tmp.put("partnerPay", "������");
		tmp.put("okcardPay", "����OK");
		tmp.put("spsdoPay", "ʢ�����");
		tmp.put("srcbPay", "Chinapayũ����");
		tmp.put("memberCardPay", "��Ա��֧��");
		tmp.put("wxAppTenPay", "�Ƹ�ͨ΢��֧����App��֧����");
		tmp.put("wxAppPay", "΢�ſͻ���֧��");
		tmp.put("wxScanTenPay", "�Ƹ�ͨ΢��֧����WEBɨ�룩");
		tmp.put("wxWCPay", "΢�Ź��ں�֧��");
		tmp.put("wxMPNoPay", "΢�Ź��ں�JS֧��");
		tmp.put("ccbWapPay", "�����ֻ�wap֧��");
		tmp.put("oneClickTenPay", "�Ƹ�ͨ�ƶ��ն�һ��֧��");
		tmp.put("bestPay", "��֧��");
		tmp.put("bfbWapPay", "�ٶ�Ǯ��wap֧��");
		tmp.put("bfbPay", "�ٶ�Ǯ��֧��");
		tmp.put("aliScanPay", "֧����ɨ��֧��");
		tmp.put("ccbMBCPay", "�����ֻ�����֧��");
		tmp.put("bcWapPay", "����Wap֧��");
		tmp.put("bocWapV2Pay", "�й�����ֱ��WAP֧����V2��");
		tmp.put("unionWapPayFast", "�����޿�WAP֧��");
		tmp.put("icbcWapPay", "����e֧��");
		tmp.put("aliTvPay", "����TV֧��");
		tmp.put("weiboPay", "΢��֧��");
		tmp.put("pingan1qbPay", "ƽ��ҼǮ��֧��");
		tmp.put("chubaoPay", "����֧��");
		tmp.put("bjrcbPay", "����ũ������֧��");
		tmp.put("abcPayFast", "ũҵ���п��֧��");
		tmp.put("abcWapPayFast", "ũҵ���п��WAP֧��");
		tmp.put("abcPointPayFast", "ũҵ���л���֧��");
		tmp.put("huaanPay", "��������֧��");
		tmp.put("huaanWapPay", "����΢Ǯ���ֻ�֧��");
		tmp.put("aliAppPay", "֧����App֧��");
		tmp.put("payecoEPay", "�����ֻ�WAP֧��");
		tmp.put("spdcccPay", "�ַ����ÿ�֧��");
		tmp.put("spdcccWapPay", "�ַ����ÿ�WAP֧��");
		tmp.put("gzrcbPay", "����ũ������");
		tmp.put("gzrcbWapPay", "����ũ������WAP֧��");
		tmp.put("masaWapPay", "�⿨֧��");
		tmp.put("unionAppPay", "�����ֻ�APP֧��");
		tmp.put("applePay", "ƻ��֧��");
		tmp.put("msqmWapPay", "��������֧��");
		tmp.put("unionWapPay", "�����ֻ�WAP֧��");
		tmp.put("qqAppPay", "QQǮ��");
		tmp.put("qqTenScanPay", "QQɨ��֧��");
		tmp.put("ccbAppPay", "����APP֧��");
		tmp.put("cbhbPay", "��������֧��");
		tmp.put("cbhbWapPay", "��������WAP֧��");
		tmp.put("sfAppPay", "˳��APP֧��");
		tmp.put("ylcfWapPay", "һ·�Ƹ�WAP֧��");
		tmp.put("jdWapPay", "�������¿��֧��");
		tmp.put("jdPay", "����֧��");
		tmp.put("ccbWapSecdPay", "�����˺�֧��");
		tmp.put("bocWapPayFast", "�й����п��֧��");
		tmp.put("foreignCard99billPay", "��Ǯ�⿨֧��");
		tmp.put("yyptPay", "Ǯ���ƹ�֧��");
		tmp.put("unicomWoPay", "��ͨ��֧��");
		tmp.put("msfPay", "������");
		tmp.put("xiyinPay", "�������ߣ���������֧��ƽ̨��");
		tmp.put("cmbywtPay", "����һ��ͨ");
		tmp.put("wcfWapPay", "΢�Ƹ�");
		tmp.put("chinaTeleAppPay", "������֧��");
		tmp.put("chinaTeleWapPay", "������֧��WAP");
		tmp.put("suningWapPay", "�����׸���֧��");
		tmp.put("intelWapPay", "Intel���ֱ�֧��");
		tmp.put("spdcccB2cPay", "�ַ�B2C���ÿ�֧��");
		tmp.put("spdcccB2cWapPay", "�ַ�B2C���ÿ�WAP֧��");
		tmp.put("fqlPay", "������֧��PC��");
		tmp.put("fqlWapPay", "������Wap֧��");
		tmp.put("bosPay", "�Ϻ�����B2C֧��");
		tmp.put("bosWapPay", "�����츶");
		tmp.put("pinganBankPay", "ƽ��֧��");
		tmp.put("pinganBankWapPay", "ƽ��WAP֧��");
		tmp.put("payecoWapPay", "����WAP֧��");
		tmp.put("spdcccFastPay", "�ַ����֧��");
		tmp.put("alibankPay", "֧������������WAP");
		tmp.put("tenPay", "�Ƹ�ͨ");
		tmp.put("handwebPay", "����WEB");
		tmp.put("handwapPay", "����WAP");
		payTextMap = UnmodifiableMap.decorate(tmp);
		tmp = new LinkedHashMap();
		tmp.put("union_jsa", "unionPay_activity_js");
		tmp.put("union_gz", "unionPay_gz");
		tmp.put("union_sh", "unionPay");
		tmp.put("union_sha", "unionPay_activity");
		tmp.put("union_js", "unionPay_js");
		tmp.put("union_zj", "unionPay_zj");
		tmp.put("union_sz", "unionPay_sz");
		tmp.put("union_bj", "unionPay_bj");
		tmp.put("unionfast", "unionPayFast");
		tmp.put("unionfast_bj", "unionPayFast_activity_bj");
		tmp.put("unionfast_js", "unionPayFast_activity_js");
		tmp.put("unionfast_gz", "unionPayFast_activity_gz");
		tmp.put("unionfast_zj", "unionPayFast_activity_zj");
		tmp.put("unionfast_sz", "unionPayFast_activity_sz");
		tmp.put("spd", "spdPay");
		tmp.put("spd_a", "spdPay_activity");
		tmp.put("spdwap", "spdWapPay");
		tmp.put("spdwap_a", "spdWapPay_activity");
		tmp.put("cmbwap", "cmbwapPay");
		tmp.put("cmbstore", "cmbwapStorePay");
		tmp.put("china2Pay", "china2Pay");
		tmp.put("srcbPay", "srcbPay");
		tmp.put("chinaPay", "chinaPay");
		tmp.put("um_sh", "umPay_sh");
		tmp.put("um", "umPay");
		tmp.put("chinasm", "chinaSmartMobilePay");
		tmp.put("chinasm_js", "chinaSmartJsPay");
		merchantPaymethodMap = UnmodifiableMap.decorate(tmp);
	}
}