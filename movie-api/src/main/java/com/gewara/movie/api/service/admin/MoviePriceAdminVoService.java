package com.gewara.movie.api.service.admin;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MoviePriceVo;
import com.gewara.movie.vo.MovieTierPriceVo;

public interface MoviePriceAdminVoService {
	/**
	 * ����movieprice����
	 * @param paramVo
	 * @return
	 */
	ResultCode<MoviePriceVo> saveMovieLowestPrice(RequestParamVo paramVo);
	/**
	 * ����movieprice����
	 * @param paramVo
	 * @return
	 */
	ResultCode<MoviePriceVo> setMoviePrice(RequestParamVo paramVo);
	/**
	 * ���ݿ��ų���ӰƬ��ͬ��movieprice����
	 * @param curMovieIdList
	 * @param cinemaid
	 * @param synchFlag
	 * @param userid
	 * @return
	 */
	ResultCode<List<String>> syncMoviePriceByCurMovieIdList(List<Long> curMovieIdList, Long cinemaid, String synchFlag, Long userid);
	/**
	 * �޸�cinemaPrice����
	 * @param cinemaPriceList
	 * @return
	 */
	ResultCode<Integer> upgradeCinemaPrice(List<Map> cinemaPriceList);
	/**
	 * ����ͬ��movieprice����
	 * @param mids
	 * @param synchFlag
	 * @param userid
	 * @return
	 */
	ResultCode<List<String>> batchSyncMoviePriceByMids(String mids, String synchFlag, Long userid);
	/**
	 * ���ݿ��ų���ӰƬ��ͬ��movieprice����
	 * @param curMovieIdList
	 * @param synchFlag
	 * @return
	 */
	ResultCode<List<String>> syncMoviePriceToCinemaByCurMovieIdList(List<Long> curMovieIdList, String synchFlag);
	/**
	 * ���ݿ��ų���ӰƬ��ͬ��movieprice����
	 * @param mids
	 * @param synchFlag
	 * @param userid
	 * @return
	 */
	ResultCode<List<String>> batchSyncMoviePriceToCinemaByMids(String mids, String synchFlag, Long userid);
	/**
	 * ����MovieTierPrice����
	 * @param movieid
	 * @param type
	 * @return
	 */
	ResultCode<MovieTierPriceVo> saveMovieTierPrice(Long movieid, String type, Map<String, String> dataMap);
	/**
	 * ����movietierprice��starttime��endtime
	 * @param movieid
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	ResultCode<List<MovieTierPriceVo>> saveMoviePriceTierTime(Long movieid, Timestamp startTime, Timestamp endTime);
}
