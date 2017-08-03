package com.gewara.api.pay.response.abc;


public class MoneyAndPointPayResponse extends AbcResponse {

	private static final long serialVersionUID = -1978543463407522584L;
	
	private String cardno			;//���׿���
	private String trandate			;//���ѽ�������
	private String trantime			;//���ѽ���ʱ��
	private String sysdef			;//����ϵͳ�ο���
	private String settleno			;//����ũ�����κ�
	private String termserial		;//�����ն���ˮ��
	private String vouserial		;//����ƾ֤��
	private String ptrandate		;//���ֽ�������
	private String ptrantime		;//���ֽ���ʱ��
	private String psysdef			;//����ϵͳ�ο���
	private String psettleno		;//����ũ�����κ�
	private String ptermserial		;//�����ն���ˮ��
	private String pvouserial		;//����ƾ֤��
	
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getTrandate() {
		return trandate;
	}
	public void setTrandate(String trandate) {
		this.trandate = trandate;
	}
	public String getTrantime() {
		return trantime;
	}
	public void setTrantime(String trantime) {
		this.trantime = trantime;
	}
	public String getSysdef() {
		return sysdef;
	}
	public void setSysdef(String sysdef) {
		this.sysdef = sysdef;
	}
	public String getSettleno() {
		return settleno;
	}
	public void setSettleno(String settleno) {
		this.settleno = settleno;
	}
	public String getTermserial() {
		return termserial;
	}
	public void setTermserial(String termserial) {
		this.termserial = termserial;
	}
	public String getVouserial() {
		return vouserial;
	}
	public void setVouserial(String vouserial) {
		this.vouserial = vouserial;
	}
	public String getPtrandate() {
		return ptrandate;
	}
	public void setPtrandate(String ptrandate) {
		this.ptrandate = ptrandate;
	}
	public String getPtrantime() {
		return ptrantime;
	}
	public void setPtrantime(String ptrantime) {
		this.ptrantime = ptrantime;
	}
	public String getPsysdef() {
		return psysdef;
	}
	public void setPsysdef(String psysdef) {
		this.psysdef = psysdef;
	}
	public String getPsettleno() {
		return psettleno;
	}
	public void setPsettleno(String psettleno) {
		this.psettleno = psettleno;
	}
	public String getPtermserial() {
		return ptermserial;
	}
	public void setPtermserial(String ptermserial) {
		this.ptermserial = ptermserial;
	}
	public String getPvouserial() {
		return pvouserial;
	}
	public void setPvouserial(String pvouserial) {
		this.pvouserial = pvouserial;
	}	
}
