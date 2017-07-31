package com.gewara.api.service.zhuanti;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.common.RedEnvelopeManagerVo;
import com.gewara.api.vo.order.GewaOrderVo;




public interface NewYearRedEnvelopeVoService {
	/**
	 * 
	 * ���ݶ�����Ϣ ��ѯ �Ƿ������ɺ��
	 * @param GewaOrderVo  gewaOrder
	 * @return
	 */
	ResultCode<RedEnvelopeManagerVo> findRedEnvelopeManager(GewaOrderVo gewaOrder);
	/**
	 * ���ݵ�ӰID��ѯ���TAG
	* @remark
	* @param relatedId
	* @return
	*/
	ResultCode<String> findRedEnvelopeByRelatedId(Long relatedId);
}
