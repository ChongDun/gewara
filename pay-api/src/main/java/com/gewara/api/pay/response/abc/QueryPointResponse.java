package com.gewara.api.pay.response.abc;



public class QueryPointResponse extends AbcResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1164293328300492123L;

	/**
	 * ���׿���
	 */
	private String cardno;
	
	/**
	 * �ܻ���
	 */
	private String totalpoint;
	
	/**
	 * ��λ�һ���
	 */
	private String point;
	
	/**
	 * ��Ҵ���
	 */
	private String curr;
	
	/**
	 * ��һ���
	 */
	private String currpoint;
	
	/**
	 * ��������
	 */
	private String trandate;
	
	/**
	 * ����ʱ��
	 */
	private String trantime;

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getTotalpoint() {
		return totalpoint;
	}

	public void setTotalpoint(String totalpoint) {
		this.totalpoint = totalpoint;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getCurrpoint() {
		return currpoint;
	}

	public void setCurrpoint(String currpoint) {
		this.currpoint = currpoint;
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
	
}
