package com.gewara.api.vo.pay;

import java.io.Serializable;
import java.sql.Timestamp;

import com.gewara.api.vo.BaseVo;

public class ElecCardBatchVo extends BaseVo {

	private static final long serialVersionUID = 8738747879676531874L;
	public static String COSTTYPE_MINADD = "minadd"; 		//ӰƬ��׼ۼ�xԪ
	public static String COSTTYPE_FIXED = "fixed"; 			//�̶��۸�
	public static String ACTIVATION_Y = "Y"; 				//��Ҫ����
	public static String ACTIVATION_N = "N";				//���輤��
	public static String EXCHANGETYPE_A = "A";				//�һ�ȯ��𣺳�ȯ
	public static String EXCHANGETYPE_B = "B";				//�һ�ȯ�����ȯ
	public static String EXCHANGETYPE_D = "D";				//�һ�ȯ��𣺶һ�ȯ
	public static String EXCHANGETYPE_E = "E";				//�һ�ȯ���IMAXȯ
	public static String SOLD_TYPE_P = "P";					//P ��ȯ  S����
	public static String SOLD_TYPE_S = "S";					//����
	public static String OTHERINFO_CINEMA = "validcinema";
	public static String OTHERINFO_MOVIE = "validmovie";
	public static String OTHERINFO_ITEM = "validitem";
	private Long id;				//ID
	private Long pid;				//������ID
	private String tag;				//��ʶ��movie drama
	private Integer amount;			//���ý��
	private String addtime1;		//�µ�ʱ���޶�1��0000
	private String addtime2;		//�µ�ʱ���޶�2��2400
	private String addweek;			//�µ��ܼ�
	private String opentime;		//����ʱ�Σ���ʼ 0600
	private String closetime;		//����ʱ�Σ����� 2300
	private String weektype;		//�����ܼ�
	private String validcinema;		//����ӰԺ
	private String validmovie;		//����ӰƬ
	private String validitem;		//���ó���
	private String validprice;		//���ó����µļ۸�id
	private String bindpay;			//��֧����ʽ
	private String remark;			//˵��
	private Timestamp timefrom;		//����Ч��ʼʱ��
	private Timestamp timeto;		//����Ч����ʱ��
	private String cardtype;		//������
	private String notifymsg;		//����ģ��
	private Integer daynum;			//��Ч���������ͽ�Ʒ֮�������Ч������
	private String citycode;		//���ó���
	private String citypattern;		//���������ų���
	private String validpartner;	//�����̼�
	private Long bindgoods;			//���ײ�
	private Integer bindratio;		//�ײͶһ�������X��ȯ�һ�1��
	private String costtype;		//�ɱ������ͣ�ӰƬ��׼ۼ�xԪ������ۼ�xԪ
	private Integer costnum;		//�ɱ�������
	private Integer costnum3D;		//3D�汾��Ӧ�ɱ���
	private String edition;			//����ӰƬ�汾��2D��3D��All(2D+3D)��IMAX��4D��4D+IMAX
	private String limitdesc;		//A�������޶������û���ʾ
	private String activation;		//�Ƿ���Ҫ����
	private String exchangetype;	//�һ�ȯ���
	private String channelinfo;		//����˵��
	private Integer appoint;		//��������
	private String soldType;   //�������ͣ� P ��ȯ  S����
	private Integer delayDays; //��������������
	private Integer delayUseDays;  // ����ͨ����ʹ������
	private Integer delayFee;   // ���ڷ���
	private String otherinfo; // ����validcinema validmovie validitem �ǿ��û��ǲ�������
	private String bindmobile;		//�Ƿ���Ҫ���ֻ���
	@Override
	public Serializable realId() {
		return id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getAddtime1() {
		return addtime1;
	}

	public void setAddtime1(String addtime1) {
		this.addtime1 = addtime1;
	}

	public String getAddtime2() {
		return addtime2;
	}

	public void setAddtime2(String addtime2) {
		this.addtime2 = addtime2;
	}

	public String getAddweek() {
		return addweek;
	}

	public void setAddweek(String addweek) {
		this.addweek = addweek;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public String getWeektype() {
		return weektype;
	}

	public void setWeektype(String weektype) {
		this.weektype = weektype;
	}

	public String getValidcinema() {
		return validcinema;
	}

	public void setValidcinema(String validcinema) {
		this.validcinema = validcinema;
	}

	public String getValidmovie() {
		return validmovie;
	}

	public void setValidmovie(String validmovie) {
		this.validmovie = validmovie;
	}

	public String getValiditem() {
		return validitem;
	}

	public void setValiditem(String validitem) {
		this.validitem = validitem;
	}

	public String getValidprice() {
		return validprice;
	}

	public void setValidprice(String validprice) {
		this.validprice = validprice;
	}

	public String getBindpay() {
		return bindpay;
	}

	public void setBindpay(String bindpay) {
		this.bindpay = bindpay;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getTimefrom() {
		return timefrom;
	}

	public void setTimefrom(Timestamp timefrom) {
		this.timefrom = timefrom;
	}

	public Timestamp getTimeto() {
		return timeto;
	}

	public void setTimeto(Timestamp timeto) {
		this.timeto = timeto;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getNotifymsg() {
		return notifymsg;
	}

	public void setNotifymsg(String notifymsg) {
		this.notifymsg = notifymsg;
	}

	public Integer getDaynum() {
		return daynum;
	}

	public void setDaynum(Integer daynum) {
		this.daynum = daynum;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCitypattern() {
		return citypattern;
	}

	public void setCitypattern(String citypattern) {
		this.citypattern = citypattern;
	}

	public String getValidpartner() {
		return validpartner;
	}

	public void setValidpartner(String validpartner) {
		this.validpartner = validpartner;
	}

	public Long getBindgoods() {
		return bindgoods;
	}

	public void setBindgoods(Long bindgoods) {
		this.bindgoods = bindgoods;
	}

	public Integer getBindratio() {
		return bindratio;
	}

	public void setBindratio(Integer bindratio) {
		this.bindratio = bindratio;
	}

	public String getCosttype() {
		return costtype;
	}

	public void setCosttype(String costtype) {
		this.costtype = costtype;
	}

	public Integer getCostnum() {
		return costnum;
	}

	public void setCostnum(Integer costnum) {
		this.costnum = costnum;
	}

	public Integer getCostnum3D() {
		return costnum3D;
	}

	public void setCostnum3D(Integer costnum3d) {
		costnum3D = costnum3d;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getLimitdesc() {
		return limitdesc;
	}

	public void setLimitdesc(String limitdesc) {
		this.limitdesc = limitdesc;
	}

	public String getActivation() {
		return activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	public String getExchangetype() {
		return exchangetype;
	}

	public void setExchangetype(String exchangetype) {
		this.exchangetype = exchangetype;
	}

	public String getChannelinfo() {
		return channelinfo;
	}

	public void setChannelinfo(String channelinfo) {
		this.channelinfo = channelinfo;
	}

	public Integer getAppoint() {
		return appoint;
	}

	public void setAppoint(Integer appoint) {
		this.appoint = appoint;
	}

	public String getSoldType() {
		return soldType;
	}

	public void setSoldType(String soldType) {
		this.soldType = soldType;
	}

	public Integer getDelayDays() {
		return delayDays;
	}

	public void setDelayDays(Integer delayDays) {
		this.delayDays = delayDays;
	}

	public Integer getDelayUseDays() {
		return delayUseDays;
	}

	public void setDelayUseDays(Integer delayUseDays) {
		this.delayUseDays = delayUseDays;
	}

	public Integer getDelayFee() {
		return delayFee;
	}

	public void setDelayFee(Integer delayFee) {
		this.delayFee = delayFee;
	}

	public String getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(String otherinfo) {
		this.otherinfo = otherinfo;
	}

	public String getBindmobile() {
		return bindmobile;
	}

	public void setBindmobile(String bindmobile) {
		this.bindmobile = bindmobile;
	}

}
