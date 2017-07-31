package com.gewara.ucenter.constant;

import java.util.Arrays;
import java.util.List;

public class MemberConstant {
	// ע����Դ
	public static final String REGISTER_EMAIL = "email"; //����ע��
	public static final String REGISTER_MOBLIE = "mobile"; // �ֻ�ע��
	public static final String REGISTER_CODE = "code"; //��̬��
	public static final String REGISTER_APP = "app"; //������¼

	public static final String NEWTASK = "newtask";
	//����
	public static final String TASK_CONFIRMREG = "confirmreg";		//ע�������ȷ��
	public static final String TASK_SENDWALA = "sendwala";			//����һ������
	public static final String TASK_UPDATE_HEAD_PIC= "headpic"; 	//����ͷ��
	public static final String TASK_BINDMOBILE = "bindmobile";		//���ֻ�

	public static final String TASK_BUYED_TICKET = "buyticket"; 	//�ɹ������ӰƱ
	public static final String MODIFY_NICKNAME = "modify_nickname";	//�û��޸����ǳ�
	
	public static final List<String> TASK_LIST = Arrays.asList(
			TASK_UPDATE_HEAD_PIC, TASK_BUYED_TICKET, TASK_BINDMOBILE, TASK_CONFIRMREG, TASK_SENDWALA);
	
	//~~~~~~~~~~~~������¼~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public static final String TAG_SOURCE = "bindstatus"; //���Զ�ע���û���otherinfo��ʶ
	public static final String TAG_MOBILE_BINDTIME = "mblbindtime";
	public static final String TAG_EMAIL_BINDTIME = "emlbindtime";
	public static final String TAG_DANGER = "danger";
	
	public static final String SOURCE_ALIPAY = "alipay";	//֧����
	public static final String SOURCE_SDO = "sdo";
	public static final String SOURCE_SINA = "sina";
	public static final String SOURCE_QQ ="qq";
	public static final String SOURCE_TENCENT = "tencent"; //��ѶQQ
	public static final String SOURCE_CHINAPAY = "chinapay"; //����
	public static final String SOURCE_DYNCODE = "dyncode"; //�ֻ���̬���¼
	public static final String SOURCE_TAOBAO = "taobao";
	public static final String SOURCE_BAIDU = "baidu";
	public static final String SOURCE_FILMFEST = "filmfest"; //��Ӱ��
	
	public static final String SOURCE_WEIXIN = "weixin";
	public static final String SOURCE_WEIXIN_DELETE = "weixin_delete";
	public static final String SOURCE_PINGANFU = "pinganfu";	// ƽ����
	
	//��������app
	public static final String SOURCE_CMBCQM = "cmbcqm";
	
	// ����
	public static final String SOURCE_BANKCOMM = "bankcomm";
	public static final String SOURCE_CHUBAO = "chubao";
	
	public static final String SHORT_ALIPAY = "a";
	public static final String SHORT_SINA = "S";
	public static final String SHORT_QQ ="q";
	public static final String SHORT_TENCENT = "t";
	public static final String SHORT_CHINAPAY = "c";
	public static final String SHORT_FILMFEST = "f";
	
	public static final String CATEGORY_ALIKUAIJIE = "alikuaijie";
	public static final String CATEGORY_ALIWALLET = "aliwallet";
	
	//~~~~~~~~~~~~~~~~~~~~�û���Ϊ��¼~~~~~~~~~~~~~~~
	public static final String ACTION_REGCARD = "regcard";		//�󶨿�
	public static final String ACTION_MODPWD = "modpwd";		//�޸�����
	public static final String ACTION_NEWTASK = "newtask";		//�����������
	public static final String ACTION_SETPAYPWD = "setpaypwd";	//����֧������
	public static final String ACTION_GETPAYPWD = "getpaypwd";	//�һ�֧������
	public static final String ACTION_MDYPAYPWD = "mdypaypwd";	//�޸�֧������
	public static final String ACTION_MODEMAIL = "modemail";	//�޸�����
	public static final String ACTION_BINDMOBILE = "bindmobile";//���ֻ�
	public static final String ACTION_VDDRAWMOBILE = "validdrawmobile";//��֤�齱�ֻ�
	public static final String ACTION_CHGBINDMOBILE = "chgbindmobile";//�޸İ��ֻ�
	public static final String ACTION_RELIEVEMOBILE = "relievemobile";//����ֻ�
	public static final String ACTION_TOWABI = "towabi";		//�˻����תwabi
	public static final String ACTION_DROPMESS = "drpmessage";	//ɾ��˽��
	public static final String ACTION_LOGIN = "login";	//��¼
	
	
	public static final String OM_MOBILE = "mobile";			//�������ֻ���
	public static final String OPENMEMBER = "openMember";		//��¼�ǵ������û���½
	
	public static final String ALIWALLET_SHORTTOKEN = "aliwallet_shorttoken";	//֧����Ǯ����token
	public static final String ALIWALLET_LONGTOKEN = "aliwallet_longtoken";		//֧����Ǯ����token
	public static final String ALIWALLET_EXPIRESIN = "aliwallet_expiresIn";		//֧����Ǯ����token
	public static final String ALIWALLET_REEXPIRESIN = "aliwallet_reExpiresIn";		//֧����Ǯ����token
	public static final String ALIWALLET_SHORTVALIDTIME = "aliwallet_shortvalidtime";	//֧����Ǯ����token
	public static final String ALIWALLET_LONGVALIDTIME = "aliwallet_longvalidtime";
	public static final String ALIWALLET_EXTERN_TOKEN = "extern_token";
	
	public static final String PINGAN1QBPAY_LOGINKEND = "loginToken";
	public static final String PINGAN1QBPAY_REFRESHTOKEN = "refreshToken";
	
	public static final String BINDMOBILE_STATUS_Y = "Y";	//��
	public static final String BINDMOBILE_STATUS_N = "N";	//δ��
	public static final String BINDMOBILE_STATUS_YS = "Y_S";	//�ֻ���ͨ����֤��
	//public static final String BINDMOBILE_STATUS_X = "X";	//δ֪
	public static final String TYPE_MEMBER_BAND = "member_band_type";	//�˻���
	public static final String TYPE_MEMBER_BAND_AND_GET_HEAD_PIC = "member_band_type_and_get_head_pic";	//�˻��󶨲���ȡͷ�񷵻�
	
	public static final String NEEDVALID_Y = "Y";	//��Ҫ������֤
	public static final String NEEDVALID_N = "N";	//����Ҫ������֤
	public static final String NEEDVALID_U = "U";	//��ʱ����Ҫ������֤
	public static final String NEEDVALID_MSG = "Ϊ��֤�����˺Ű�ȫ���밴����ָʾ��֤�˺ţ������֤�������ԣ�";
	public static final String RESET_PASSWORD = "mustResetPass";	//��������
	public static final String RESET_PASS_ERROR_MSG = "�����˻����ڰ�ȫ���գ��������������롱�������룡";
	public static final String RELOGIN_MSG = "��ȡ��¼��Ϣʧ�ܣ���ˢ�����Ի����µ�¼��";
}
