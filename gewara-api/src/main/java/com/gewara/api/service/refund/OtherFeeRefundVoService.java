package com.gewara.api.service.refund;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.pay.OtherFeeRefundVo;

public interface OtherFeeRefundVoService {
	/**
	 * ��ѯ�������������˿���Ϣ
	 * @param origin	����������Դ(�ο�OtherFeeRefundConstant��)
	 * @param tradeno	������
	 * @param status	�˿�״̬
	 * @param memberid	�û�ID
	 * @param mobile	�ֻ���
	 * @param from		
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<OtherFeeRefundVo>> getOtherFeeRefundList(String origin, String tradeno, String status, Long memberid, String mobile, int from, int maxnum);
	
	/**
	 * ��ѯ�������������˿�����
	 * @param origin	����������Դ(�ο�OtherFeeRefundConstant��)
	 * @param tradeno	������
	 * @param status	�˿�״̬
	 * @param memberid	�û�ID
	 * @param mobile	�ֻ���
	 * @return
	 */
	ResultCode<Integer> getOtherFeeRefundCount(String origin, String tradeno, String status, Long memberid, String mobile);
	
	/**
	 * ��ѯ�������������˿���Ϣ
	 * @param origin	����������Դ(�ο�OtherFeeRefundConstant��)
	 * @param tradeno	������
	 * @return
	 */
	ResultCode<OtherFeeRefundVo> getOtherFeeRefund(String origin, String tradeno);
}
