package com.gewara.api.pay.response.abc;


public class MoneyPayResponse extends AbcResponse {

	private static final long serialVersionUID = -1682608891737106050L;

	private String cardno		;//���׿���
	private String trandate		;//��������
	private String trantime		;//����ʱ��
	private String sysdef		;//ϵͳ�ο���
	private String settleno		;//ũ�����κ�
	private String termserial	;//�ն���ˮ��
	private String vouserial	;//ƾ֤��
	
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
}
