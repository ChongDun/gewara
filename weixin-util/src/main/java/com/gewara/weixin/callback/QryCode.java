package com.gewara.weixin.callback;

public class QryCode extends WxBack{
	/**
	 * ����code��openid��ѯ�������鷵��
	 */
	private static final long serialVersionUID = 4995725043605140159L;
	private String openid;
	private WxCard card;
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public WxCard getCard() {
		return card;
	}
	public void setCard(WxCard card) {
		this.card = card;
	}
	
}
