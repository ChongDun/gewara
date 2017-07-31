package com.gewara.api.service.membermerge;


import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface MemberMergeVoService {
  
	ResultCode<Map<String, Object>> getBindMemberInfo(Long bindMemberId);
	
	/**
	 * ���û����Żݻ
	 * @param fromMemberid
	 * @param toMemberid
	 * @param memberMergerHisid
	 * @return
	 */
	ResultCode<String> bindSpCode(Long fromMemberid, Long toMemberid, Long memberMergerHisid);
	/**
	 * ���û����Ż�ȯ
	 * @param fromMemberid
	 * @param toMemberid
	 * @param memberMergerHisid
	 * @return
	 */
	ResultCode<String> bindElecard(Long fromMemberId, Long toMemberId, Long memberMergerHisid);
	/**
	 * �û�����ϲ��
	 * @param fromMemberid
	 * @param toMemberid
	 * @param memberMergerHisid
	 * @return
	 */
	ResultCode<String> bindTreasure(Long fromMemberId, Long toMemberId, Long memberMergerHisid);
	/**
	 * ͬ���û�ȥ��
	 * @param fromMemberid
	 * @param toMemberid
	 * @param memberMergerHisid
	 * @return
	 */
	ResultCode<String> bindMemberCount(Long fromMemberId, Long toMemberId, Long memberMergerHisid);
	/**
	 * ����΢�ſ���
	 * @param tradeNo
	 * @param memberEncode
	 * @param remoteIp
	 * @return
	 */
	ResultCode<Map<String, Object>> createCardTicket(String tradeNo, String encodeOrSessid, String remoteIp);
}
