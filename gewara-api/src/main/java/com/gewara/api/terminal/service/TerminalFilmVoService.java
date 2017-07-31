package com.gewara.api.terminal.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.order.GewaOrderVo;

public interface TerminalFilmVoService {
	/**
	 * ��ѯ��Ӱ���εĴ�ӡ����
	 * @param mpid
	 * @return
	 */
	ResultCode<Map<String, Object>> getMpiLayoutVoByMpid(Long mpid);
	
	ResultCode<String> getMpiLayoutVo(Long mpid);
	/**
	 * ��ѯ��Ӱ�ڶ�������
	 * @param cinemaid
	 * @param playtime
	 * @param addtime
	 * @return
	 */
	ResultCode<List<String>> getSuccessFilmOrderList(Long cinemaid, Timestamp playtime, Timestamp addtime);
	/**
	 * ����ӰԺ��ȡ����
	 * @param cinemaid
	 * @param addtime
	 * @return
	 */
	ResultCode<List<String>> getMovieSuccessTradenoList(Long cinemaid, Timestamp addtime);
	/**
	 * ��ѯ��Ӱ����
	 * @param tradeno
	 * @return
	 */
	ResultCode<GewaOrderVo> getTicketOrderByTradeno(String tradeno);
}
