package com.gewara.cons;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.collections.map.UnmodifiableMap;

public class RefundConstant {
	//public static final String STATUS_PREPAIR1 = "prepare"; 	//Ԥ����
	public static final String STATUS_APPLY = "apply"; 		//����
	public static final String STATUS_ACCEPT = "accept"; 	//����
	public static final String STATUS_REJECT = "reject"; 	//�ܾ��˿�
	public static final String STATUS_SUCCESS = "success";	//�˿�ɹ�
	public static final String STATUS_FINISHED = "finish";	//�������
	public static final String STATUS_USER_APPLY = "user_apply";			// �û�������Ʊ
	public static final String STATUS_USER_REJECT = "user_reject"; 			// �û�ȡƱ�ܾ��˿�
	//public static final String STATUS_CANCEL = "cancel";	//ȡ���˿�(prepair-->cancel)
	
	//��Ҫִ�еĲ���
	public static final String OP_CANCEL_TICKET = "cancelTicket";	//��Ʊ
	public static final String OP_ADJUST_SETTLE = "adjustSettle";	//�������
	public static final String OP_COMPENSATE = "compensate";		//�����û�����
	public static final String OP_RET2PARTNER = "ret2Partner";		//�����̼��˿�
	public static final String OP_LOCK_TICKET = "lockTicket";		//��������
	
	public static final String OP_RESULT_CANCEL_SUCCESS = "cancelSuccess"; //��Ʊ�ɹ�
	public static final String OP_RESULT_CANCEL_FAILURE = "cancelFailure"; //��Ʊʧ��
	
	//�˿����� all ȫ���˿part �����˿supplement ����
	public static final String REFUNDTYPE_FULL = "full";			//ȫ���˿�
	public static final String REFUNDTYPE_PART = "part";			//�����˿�
	public static final String REFUNDTYPE_SUPPLEMENT = "supplement";//�����˿�
	public static final String REFUNDTYPE_GEWARA = "gewara";		//�������˿�
	
	// ��������״̬ 
	public static final String LOCK_SUCCESS = "lock_success";		// �����ɹ�
	public static final String LOCK_TAKE = "lock_take";				// ��ȡƱ
	public static final String LOCK_FAILURE = "lock_failure";		// ����ʧ��
	// ��������״̬
	public static final String UN_LOCK_Y = "Y";		// �����ɹ�
	public static final String UN_LOCK_N = "N";		// ����ʧ��
	
	//�˿�ԭ��
	public static final String REASON_UNKNOWN = "unknown";				//δ֪
	public static final String REASON_USER = "user";					//�û��˿�
	public static final String REASON_GEWA = "gewa";					//Gewa�˿�
	public static final String REASON_GEWA_SYS = "gewa_sys";			//Gewaϵͳ����
	public static final String REASON_MERCHANT = "merchant";			//�̼ң�ӰԺ���˿�
	public static final String REASON_MERCHANT_OPI = "merchant_opi";	//�̼ң�ӰԺ������(���Ļ�ȡ��)�˿�
	public static final String REASON_PRICE = "price";					//�۸����
	public static final String REASON_CANCELTICKET = "cancelTicket";	//����Ʊ����������Ʊ
	public static final String REASON_BAOCHANG = "baochang_fail";	//����ʧ���˿�
	
	public static final int COUNT_MONTH_MEMBER = 3;			// �û�����Ʊ����
	public static final int COUNT_WEEK_MEMBER = 2;			// �û�����Ʊ����
	public static final int COUNT_MONTH_CINEMA = 400;		// ӰԺ����Ʊ����
	public static final int COUNT_DAY_CINEMA = 30;			// ӰԺ����Ʊ����
	
	//�˻��˿� Y����Ҫ��N������Ҫ��O��δ֪, �μ�����(Other)��S: ���ύ����(Submit) R�������Ѿ�����(Refund)��F�����񷵻�����(Failure)
	public static final String RETBACK_Y = "Y";
	public static final String RETBACK_N = "N";
	public static final String RETBACK_OTHER = "O";
	public static final String RETBACK_SUBMIT = "S";
	public static final String RETBACK_REFUND = "R";
	public static final String RETBACK_FAILURE = "F";
	
	//������
	public static final String REFUND_MANAGE_DEAL = "manageDeal";
	public static final String REFUND_FINANCE_DEAL = "financeDeal";
	public static final String REFUND_FINANCE_STATUS = "status";
	public static final String REFUND_FINANCE_RESON = "reson";
	
	public static final String TR_NORMAL_REFUND = "Y_NORMAL_R";			//������Ʊ������
	public static final String TR_MERCHANT_REFUND = "Y_MERCHANT_R";		//��������Ʊ������
	public static final String TR_MERCHANT_NO = "Y_MERCHANT_N";			//����δ��Ʊ������
	public static final String TR_SETTLE_MERCHANT_NO = "S_MERCHANT_N";	//����δ��Ʊ�����
	public static final String TR_SETTLE_GEWA_REFUND = "S_GEWA_R";		//�����������˿�
	
	// �˿����Դ
	public static final String ORIGIN_USER ="USER";			// �û���������
	public static final String ORIGIN_KF = "KF";			// �ͷ�����
	
	// �ͻ�������
	public static final String CLIENTTYPE_PC = "pc";		// pc
	public static final String CLIENTTYPE_WAP = "wap";		// wap
	public static final String CLIENTTYPE_APP = "app";		// app
	public static final String ClIENTTYPE_API = "api";      // api
	
	// ֧��API�˿�����ش���
	public static final String REFUND_API_METHOD_ALISCANPAY ="aliScanPay";			     // ֧����ɨ��֧��
	public static final String REFUND_API_METHOD_ALISMARTMOBILEPAY ="aliSmartMobilePay"; // ֧�����ֻ���-��ȫ֧��
	public static final String REFUND_API_METHOD_ALIWAPPAY ="aliwapPay";			     // ֧�����ֻ���-WAP֧��
	public static final String REFUND_API_METHOD_DIRECTPAY ="directPay";			     // ֧����PC��

	// ũ���˿��ʶ
	public static final String ABC_OTHERINFO_AMOUNT ="amount";			     // ���
	public static final String ABC_OTHERINFO_POINT ="point";			     // ����
	
	public static final Map<String, String> textMap;
	public static final Map<String, String> refundTypeMap;
	public static final Map<String, String> reasonTypeMap;
	public static final Map<String, String> supplementReasonMap;
	public static final Map<String, String> retbackMap;
	public static final Map<String, String> ticketRefundTextMap;
	public static final Map<String, String> refundApiPayMethodMap;
	static{
		Map<String, String> tmp = new HashMap<String, String>();
		tmp.put(STATUS_APPLY, "������");
		tmp.put(STATUS_REJECT, "�������˿�");
		tmp.put(STATUS_SUCCESS, "�˿�ɹ�");
		textMap = UnmodifiableMap.decorate(tmp);
		
		Map<String, String> tmpRefund = new HashMap<String, String>();
		tmpRefund.put(REFUNDTYPE_FULL, "ȫ���˿�");
		tmpRefund.put(REFUNDTYPE_PART, "�����˿�");
		tmpRefund.put(REFUNDTYPE_SUPPLEMENT, "�����˿�");
		tmpRefund.put(REFUNDTYPE_GEWARA, "�������˿�");
		refundTypeMap = UnmodifiableMap.decorate(tmpRefund);
		
		Map<String, String> tmpReason = new LinkedHashMap<String, String>();
		tmpReason.put(REASON_CANCELTICKET, "����Ʊ����������Ʊ");
		tmpReason.put(REASON_USER, "�û�ԭ��Ҫ���˿�");
		tmpReason.put(REASON_MERCHANT, "���ݷ�ӳ�й�����Ʊ");
		tmpReason.put(REASON_MERCHANT_OPI, "����֪ͨ���θ��Ļ�ȡƱ��Ʊ");
		tmpReason.put(REASON_PRICE, "����֪ͨ�۸����");
		tmpReason.put(REASON_GEWA, "Gewa�������ô���");
		tmpReason.put(REASON_GEWA_SYS, "Gewaϵͳ����");
		tmpReason.put(REASON_BAOCHANG, "����ʧ���˿�");
		tmpReason.put(REASON_UNKNOWN, "����ԭ��");
		reasonTypeMap = UnmodifiableMap.decorate(tmpReason);
		
		Map<String, String> tmpSupplementMap = new LinkedHashMap<String, String>();
		tmpSupplementMap.put(REASON_PRICE, "����֪ͨ�۸����");
		tmpSupplementMap.put(REASON_GEWA, "Gewa�������ô���");
		supplementReasonMap = UnmodifiableMap.decorate(tmpSupplementMap);
		
		Map<String, String> tmpRetack = new LinkedHashMap<String, String>();
		tmpRetack.put(RETBACK_Y, "��Ҫ");
		tmpRetack.put(RETBACK_N, "����Ҫ");
		tmpRetack.put(RETBACK_OTHER, "�μ�����");
		tmpRetack.put(RETBACK_SUBMIT, "���ύ����");
		tmpRetack.put(RETBACK_REFUND, "����ɹ�");
		tmpRetack.put(RETBACK_FAILURE, "����ʧ��");
		retbackMap = UnmodifiableMap.decorate(tmpRetack);
		
		Map<String, String> settleTmpMap = new LinkedHashMap<String, String>();
		settleTmpMap.put(TR_NORMAL_REFUND, "������Ʊ������");
		settleTmpMap.put(TR_MERCHANT_REFUND, "ӰԺ����Ʊ������");
		settleTmpMap.put(TR_MERCHANT_NO, "ӰԺδ��Ʊ������");
		settleTmpMap.put(TR_SETTLE_MERCHANT_NO, "ӰԺδ��Ʊ�����");
		settleTmpMap.put(TR_SETTLE_GEWA_REFUND, "������������Ʊ");
		ticketRefundTextMap = UnmodifiableMap.decorate(settleTmpMap);
		
		Map<String, String> payMethodMap = new HashMap<String, String>();
		payMethodMap.put(REFUND_API_METHOD_ALISCANPAY, "֧����ɨ��֧��");
		payMethodMap.put(REFUND_API_METHOD_ALISMARTMOBILEPAY, "֧�����ֻ���-��ȫ֧��");
		payMethodMap.put(REFUND_API_METHOD_ALIWAPPAY, "֧�����ֻ���-WAP֧��");
		payMethodMap.put(REFUND_API_METHOD_DIRECTPAY, "֧����PC��");
		refundApiPayMethodMap = UnmodifiableMap.decorate(payMethodMap);
	}
}
