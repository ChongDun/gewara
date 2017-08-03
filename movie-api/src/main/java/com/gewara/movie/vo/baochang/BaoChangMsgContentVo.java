package com.gewara.movie.vo.baochang;

import java.io.Serializable;

import com.gewara.api.vo.BaseVo;

public class BaoChangMsgContentVo extends BaseVo {
	private static final long serialVersionUID = -8708356666973143888L;
	
	public static final String BAOCHANG_MSG_TAG_ORDER_PURCHASER = "order_purchaser";//������
	public static final String BAOCHANG_MSG_TAG_ORDER_PUSH_PURCHASER = "order_push_purchaser";//������(push)
	public static final String BAOCHANG_MSG_TAG_PAID_PURCHASER = "paid_purchaser";//������
	public static final String BAOCHANG_MSG_TAG_PAID_PUSH_PURCHASER = "paid_push_purchaser";//������(push)
	public static final String BAOCHANG_MSG_TAG_FAIL_PURCHASER = "fail_purchaser";//������
	public static final String BAOCHANG_MSG_TAG_FAIL_PUSH_PURCHASER = "fail_push_purchaser";//������(push)
	public static final String BAOCHANG_MSG_TAG_RECEIPTOR = "receiptor";//��ȡ��
	private String id;
	private String tag;
	private String mobileType;
	private String content;

	@Override
	public Serializable realId() {
		return id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
