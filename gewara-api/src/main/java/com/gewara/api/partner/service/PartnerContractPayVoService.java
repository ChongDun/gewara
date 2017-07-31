package com.gewara.api.partner.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.partner.req.vo.PartnerCommonReqVo;
import com.gewara.api.vo.ResultCode;
/**
 * (ǩԼ֧��)
 * @author chunhui.wang
 *
 */
public interface PartnerContractPayVoService {
	
	/**
	 * ����ǩԼ����
	 */
	ResultCode sendSignMsg(PartnerCommonReqVo reqVo);
	
	/**
	 * ���ǩԼ
	 * @param params ��������
	 * @return
	 */
	ResultCode doSign(PartnerCommonReqVo reqVo);
	
	/**
	 * ���ٽ�Լ
	 * @param params
	 * @return
	 */
	ResultCode unSign(PartnerCommonReqVo reqVo);
	
	/**
	 * ֧������
	 * @param params ��������
	 * @return
	 */
	ResultCode sendPayMsg(PartnerCommonReqVo reqVo);
	
	/**
	 * ֧��
	 * @param tradeNo ������
	 * @return
	 */
	ResultCode doPay(PartnerCommonReqVo reqVo);
	
	/**
	 * ǩԼID��ѯ 
	 * @param merUserid �û�ID
	 * @return
	 */
	ResultCode<List<Map>> querySignContents(String merUserid,String payMethod);
}
