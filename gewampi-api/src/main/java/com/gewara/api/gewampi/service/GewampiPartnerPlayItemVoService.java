package com.gewara.api.gewampi.service;

import java.util.Date;
import java.util.List;

import com.gewara.api.gewampi.vo.MovieItemVo;
import com.gewara.api.vo.ResultCode;

public interface GewampiPartnerPlayItemVoService {
	/**
	 * ��ȡ�����б�
	 * @param appkey
	 * @param cinemaId
	 * @param movieId
	 * @param playdate
	 * @param discountId
	 * @return
	 */
	ResultCode<List<MovieItemVo>> getMpiVoList(String appkey, Long cinemaId, Long movieId, Date playdate, Long discountId);
	/**
	 * ��ȡ��������
	 * @param citycode
	 * @param appkey
	 * @param movieId
	 * @param cinemaId
	 * @param discountid
	 * @return
	 */
	ResultCode<List<Date>> openDateList(String citycode, String appkey, Long movieId, Long cinemaId, Long discountid);
	/**
	 * ӰԺ������ӳ�ĵ�Ӱ
	 * @param appkey
	 * @param citycode
	 * @param cinemaId
	 * @param from
	 * @param maxnum
	 * @return ��ӰID�б�
	 */
	ResultCode<List<Long>> getCurMovieByCinemaId(String appkey, String citycode, Long cinemaId, Long discountid);
	/**
	 * ��ȡ0�㳡�ĳ���
	 * @param spid
	 * @param cinemaId
	 * @param movieId
	 * @param playdate
	 * @return
	 */
	ResultCode<List<MovieItemVo>> get0AmOpiList(Long spid, Long cinemaId, Long movieId, Date playdate);
}
