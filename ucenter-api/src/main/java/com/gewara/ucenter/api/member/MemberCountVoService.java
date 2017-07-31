package com.gewara.ucenter.api.member;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface MemberCountVoService {
	
	ResultCode<List<Long>> getMemberOrderCinemaIdList(Long memberid, int maxnum);
	
	ResultCode<List<Long>> getMemberOrderNotCancelCinemaIdList(Long memberid, int maxnum);
	
	ResultCode<List<Long>> getMemberOrderMovieIdList(Long memberid,int maxnum);
	
	/**
	 * ��ȡ�û���Ʊ����Ч
	 * @param memberid
	 * @param movieid
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<String>> getMemberOrderMovieEffectList(Long memberid, Long movieid, int maxnum);
	
	/**
	 * ��ȡ�û���Ʊ����Ϣ
	 * @param memberid
	 * @param movieid
	 * @param maxnum
	 * @return "edition", "memberid", "tradeNo", "placeid", "relatedid", "citycode", "roomid", "addtime", "roomname", "characteristic", "playtime", "movieid"
	 */
	ResultCode<List<Map>> getMemberOrderMovieMapList(Long memberid, Long movieid, int maxnum);
	/**
	 * ��ȡ�û���Ʊ��Ϣ
	 * @param memberid
	 * @param num
	 * @return
	 */
	ResultCode<Long> getMemberOrderList(Long memberid, Integer num);
}
