package com.gewara.ucenter.api.member;


import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.vo.member.MemberPointVo;
/*
 * pengdi 
 * 2014��10��29��
 * ��ȡ���ֵĶ���Ľӿ�
 */
public interface MemberPointVoService {
	ResultCode<MemberPointVo> getWapPointType(String encodeOrSessid, String remoteIp);
	
	ResultCode<List<MemberPointVo>> getLuckPoint(Integer topnum);
	
	ResultCode<List<MemberPointVo>> getMyPointList(String encodeOrSessid, String remoteIp, Integer pageno, Integer pagesize, Integer datenum);

	ResultCode<String> checkSharePointByWeixin(String encodeOrSessid, String remoteIp, String pointType); 
	
	ResultCode<MemberPointVo> getDayPoint(String encodeOrSessid, String remoteIp, String pointType);
	
	ResultCode<Integer> getOrderPointByMemberIdAndTradeNo(Long memberId,String tradeNo);

	ResultCode getPointGiftByDay(Long memberid, Timestamp cur);
	//��ÿ�յ�¼����
	ResultCode<Integer> addLoginPointNew(Long memberid);
	/**
	 * ÿ�մ������
	 */
	ResultCode<Integer> getAnswerPoint(Long memberid, Timestamp cur);
	/**
	 * ���û����ٻ���
	 * @param memberid
	 * @param pointvalue  һ���Ǹ���
	 * @param reason
	 * @return
	 */
	ResultCode<String> reducePoint(Long memberid, Integer pointvalue, String tag, String reason);
	/**
	 * ��ӻ���
	 * 
	 * @param memberid
	 * @param pointvalue
	 * @param tag
	 * @param reason
	 * @return
	 */
	ResultCode<String> addPoint(Long memberid, Integer pointvalue, String tag, String reason);
}
