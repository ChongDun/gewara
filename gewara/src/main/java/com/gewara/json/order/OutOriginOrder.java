package com.gewara.json.order;

import com.gewara.mongo.support.MGObject;

import lombok.Data;

/**
 * 360CPS�����Ķ���������ο� http://union.360.cn/help/apidocnew#cxjk
 * 
 */
@Data
public class OutOriginOrder extends MGObject {

	private static final long serialVersionUID = 6892151540714821316L;
	private String outOrigin;
	// ��������
	private Long id;
	// ������վ���
	private String bid;
	// 360�û�ID
	private String qid;
	// 360ҵ����
	private String qihoo_id;
	// ��չ�ֶΣ�
	private String ext;
	// ������
	private String order_id;
	// �µ�ʱ��
	private String order_time;
	// ����������ʱ��
	private String order_updtime;
	// ��Ӷ��
	private String total_comm;
	// Ӷ����ϸ
	private String commission;
	// ������Ʒ����ϸ��Ϣ
	private String p_info;
	// �������
	private String server_price;
	// ����Ӧ���ܶ�
	private Integer total_price;
	// ��Ʒ�ŻݵĽ��
	private String coupon;
	// ����������״̬
	private String status;
	// ӰƬID
	private Long movieid;

	private String description2;
	private String quantity;
	private String unitprice;
	private Integer amount;

}
