package com.gewara.weixin.friendcard;

import java.io.Serializable;

public class FriendCard implements Serializable{
	private static final long serialVersionUID = -6183884043365444307L;
	private String card_type;	//ȯ���ͣ��ֽ�֧�ִ���ȯ���ͺ���Ʒȯ���ͣ���дCASH����GIFT 
	private FriendCash cash;
	public FriendCard(){
		
	}
	public FriendCard(String card_type, FriendCash cash){
		this.card_type = card_type;
		this.cash = cash;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public FriendCash getCash() {
		return cash;
	}
	public void setCash(FriendCash cash) {
		this.cash = cash;
	}
}
