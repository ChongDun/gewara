package com.gewara.api.gworder.service;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;

public interface GwOrderQueryVoService {
	/**
	 * ��ѯPostorder���̳Ƕ���
	 * @param memberid
	 * @param startTime
	 * @param endTime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getMallPostOrderListByMemberId(Long memberid, Timestamp startTime, Timestamp endTime, int from, int maxnum);
	/**
	 * ��ѯGewaOrder�е��̳Ƕ���
	 * @param memberid
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getMallOrderListByMemberId(Long memberid, Timestamp startTime, Timestamp endTime);
	
	/**
	 * ��ѯ�û�������������ǰ��
	 * @param memberId
	 * @param from
	 * @param maxnum
	 * @return
	 * @author leo
	 * @addTime 2016��3��23������11:22:59
	 */
	ResultCode<List<GewaOrderVo>> getOrderScheduleList(Long memberId, int from, int maxnum);
	
	/**
	 * ��ѯ�û�����Ķ���
	 * @param memberId
	 * @param from
	 * @param maxnum
	 * @return
	 * @author leo
	 * @addTime 2016��3��23������11:23:15
	 */
	ResultCode<List<GewaOrderVo>> getCurrentTicketOrderByMemberId(Long memberId, int from, int maxnum);
	
	/**
	 * �����û�ID��ӰԺIDlist����ѯ�û�����Ʒ����
	 * @param memberId
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getCurrentGoodsOrderList(Long memberId, List<Long> cinemaIdList, Timestamp addTime);
	/**
	 * �����û�ID��ѯ�û�����Ʒ����
	 * @param memberId
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getCurrentGoodsOrderByMemberId(Long memberId, int from, int maxnum);


	ResultCode<List<GewaOrderVo>> getCurrentBaoChangOrderByMemberId(Long memberId, int from, int maxnum);

	
	/**
	 * ���ݺ�����id��ѯ������ֻ��ѯһ��֮�ڵĳɹ�����
	 * @param memberid
	 * @param partnerid
	 * @param startTime
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getOrderListByPartnerId(Long memberid, Long partnerid, Timestamp startTime, Integer from, Integer maxnum);
	
	/**
	 * 
	 * ��ѯ�û����죬�ڷ�ӳʱ��playtime�Ժ�Ķ�����ֻ��PostOrder�в�ѯ
	 * @param memberId
	 * @param playtime	��ӳʱ��
	 * @return
	 * @author leo
	 * @addTime 2016��5��26������11:41:13
	 */
	ResultCode<List<GewaOrderVo>> getCurrentTicketOrderByMemberId(Long memberId, Timestamp playtime);
	
	ResultCode<List<GewaOrderVo>> getNewGewaOrderListToMovieApp(Long memberId);
	
	/**
	 * 
	 * @param memberId
	 * @param isM5V
	 * @param orderType, �������","�Ÿ���
	 * @param days
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaOrderVo>> getOrderListByMemberId(Long memberId, boolean isM5V, String orderType, int days, int from, int maxnum);
}
