package com.gewara.api.terminal.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang.StringUtils;

import com.gewara.api.vo.BaseVo;

public class MachineVo extends BaseVo {
	private static final long serialVersionUID = -5104357767286680035L;
	private Long id;				
	private String macno;				//�������
	private String macname;				//��������
	private String openfireName;		//opfire��¼��
	private String openfirepwd;			//opfire����
	private Long placeid;				//����id
	private String placeName;			//��������
	private String placeAddress;		//��������
	private String citycode;			//���д���
	private String cityname;			//��������
	private String tag;					//��������
	
	private String privatekey;			//У����
	
	private String ticketNum;			//��ǰʣ��Ʊֽ����
	private Timestamp chgTickettime;	//��Ʊʱ��
	
	private Timestamp lastSynchtime;
	private Timestamp synchtime;
	
	private Timestamp lastSuctime;
	private Timestamp suctime;
	
	private String macType;
	private String mainMac;
	
	private String description;
	private Timestamp addtime;			//���ʱ��
	
	private Integer unitTime;			//��λʱ��
	private String defClosetime;		//�ػ�ʱ��
	
	private String monitor;				//�Ƿ���
	private String ip;
	
	private Long selfcityid;
	private String systag;
	private String filmtag;				//��Ӱ�ڻ�����ר��ȡ��Ӱ�ڵ�Ʊ����ͨ������ȡ  film,film_vip��
	private String orderType;	// ȡƱ����Y���У�Y_M����Ӱ��Y_G:��Ʒ,N��ʲô����ȡ
	/**
	 * ʣ��Ʊֽ����(��̨����)
	 */
	private Integer remainTicketNum;
	// ����װ����Ʊֽ��
	private Integer totalTicketNum;
	private String synTicketNumFlg;
	/**
	 * �ֹ����Ʊֽ��ʱ��
	 */
	private Timestamp  manualTicketnumTime;
	
	/**
	 * ����״̬
	 */
	private String macStatus;
	
	/**
	 * �����汾
	 */
	private String screenVersion;
	
	/**
	 * ��ǰϵͳ�汾��
	 */
	private String systemVersion;
	private Timestamp barcodeTime;
	// ά������(ӰԺȫ��ȡƱ��������ά����ӰԺЭ��ά��)
	private String maintain_type;
	// ȡƱ������(1������1.5������2������3������3.5������4������5����)
	private String machine_type;
	// �Ƿ���(������ء��ȴ����ա���ͣ���)
	private String monitor_type;

	public MachineVo(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMacno() {
		return macno;
	}
	public void setMacno(String macno) {
		this.macno = macno;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public Serializable realId() {
		return id;
	}
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public Long getPlaceid() {
		return placeid;
	}
	public void setPlaceid(Long placeid) {
		this.placeid = placeid;
	}
	public String getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(String ticketNum) {
		this.ticketNum = ticketNum;
	}
	public Timestamp getChgTickettime() {
		return chgTickettime;
	}
	public void setChgTickettime(Timestamp chgTickettime) {
		this.chgTickettime = chgTickettime;
	}
	public Timestamp getAddtime() {
		return addtime;
	}
	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}
	public Timestamp getLastSynchtime() {
		return lastSynchtime;
	}
	public void setLastSynchtime(Timestamp lastSynchtime) {
		this.lastSynchtime = lastSynchtime;
	}
	public Timestamp getSynchtime() {
		return synchtime;
	}
	public void setSynchtime(Timestamp synchtime) {
		this.synchtime = synchtime;
	}
	public Timestamp getLastSuctime() {
		return lastSuctime;
	}
	public void setLastSuctime(Timestamp lastSuctime) {
		this.lastSuctime = lastSuctime;
	}
	public Timestamp getSuctime() {
		return suctime;
	}
	public void setSuctime(Timestamp suctime) {
		this.suctime = suctime;
	}
	public String getMacType() {
		return macType;
	}
	public void setMacType(String macType) {
		this.macType = macType;
	}
	public String getMainMac() {
		return mainMac;
	}
	public void setMainMac(String mainMac) {
		this.mainMac = mainMac;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlaceAddress() {
		return placeAddress;
	}

	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public Integer getUnitTime() {
		return unitTime;
	}

	public void setUnitTime(Integer unitTime) {
		this.unitTime = unitTime;
	}

	public String getDefClosetime() {
		return defClosetime;
	}

	public void setDefClosetime(String defClosetime) {
		this.defClosetime = defClosetime;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getMacname() {
		return macname;
	}

	public void setMacname(String macname) {
		this.macname = macname;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Long getSelfcityid() {
		return selfcityid;
	}

	public void setSelfcityid(Long selfcityid) {
		this.selfcityid = selfcityid;
	}

	public String getOpenfireName() {
		return openfireName;
	}

	public void setOpenfireName(String openfireName) {
		this.openfireName = openfireName;
	}

	public String getSystag() {
		return systag;
	}

	public void setSystag(String systag) {
		this.systag = systag;
	}

	public Integer getRemainTicketNum() {
		return remainTicketNum;
	}

	public void setRemainTicketNum(Integer remainTicketNum) {
		this.remainTicketNum = remainTicketNum;
	}

	public String getMacStatus() {
		return macStatus;
	}

	public void setMacStatus(String macStatus) {
		this.macStatus = macStatus;
	}

	public String getScreenVersion() {
		return screenVersion;
	}

	public void setScreenVersion(String screenVersion) {
		this.screenVersion = screenVersion;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getFilmtag() {
		return filmtag;
	}

	public void setFilmtag(String filmtag) {
		this.filmtag = filmtag;
	}
	public boolean hasFilmtag(String ft){
		return StringUtils.equals(filmtag, ft);
	}

	public String getOpenfirepwd() {
		return openfirepwd;
	}

	public void setOpenfirepwd(String openfirepwd) {
		this.openfirepwd = openfirepwd;
	}

	public Timestamp getManualTicketnumTime() {
		return manualTicketnumTime;
	}

	public void setManualTicketnumTime(Timestamp manualTicketnumTime) {
		this.manualTicketnumTime = manualTicketnumTime;
	}

	public Timestamp getBarcodeTime() {
		return barcodeTime;
	}

	public void setBarcodeTime(Timestamp barcodeTime) {
		this.barcodeTime = barcodeTime;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Integer getTotalTicketNum() {
		return totalTicketNum;
	}

	public void setTotalTicketNum(Integer totalTicketNum) {
		this.totalTicketNum = totalTicketNum;
	}

	public String getSynTicketNumFlg() {
		return synTicketNumFlg;
	}

	public void setSynTicketNumFlg(String synTicketNumFlg) {
		this.synTicketNumFlg = synTicketNumFlg;
	}


	public String getMachine_type() {
		return machine_type;
	}

	public void setMachine_type(String machine_type) {
		this.machine_type = machine_type;
	}

	public String getMonitor_type() {
		return monitor_type;
	}

	public void setMonitor_type(String monitor_type) {
		this.monitor_type = monitor_type;
	}

	public String getMaintain_type() {
		return maintain_type;
	}

	public void setMaintain_type(String maintain_type) {
		this.maintain_type = maintain_type;
	}
}
