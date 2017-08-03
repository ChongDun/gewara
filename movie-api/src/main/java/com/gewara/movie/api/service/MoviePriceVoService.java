package com.gewara.movie.api.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MoviePriceVo;
import com.gewara.movie.vo.MovieTierPriceVo;
import com.gewara.movie.vo.MovieVo;

public interface MoviePriceVoService {
	/**
	 * ����movieIdList����ѯmovieprice
	 * @param midList
	 * @return
	 */
	ResultCode<List<MoviePriceVo>> getMoviePriceListByMovieIdList(List<Long> midList);
	/**
	 * ����cinemaid��movieIdList����ѯmovieprice
	 * @param cinemaid
	 * @param midList
	 * @return
	 */
	ResultCode<List<MoviePriceVo>> getMoviePriceListByCinemaIdAndMovieIdList(Long cinemaid, List<Long> midList);
	/**
	 * ����movieidList����ѯMovieTierPrice
	 * @param movieidList
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListAndCheckMovieTierPriceIsNotNull(List<Long> movieidList);
	/**
	 * ����movieidList����ѯMovieTierPrice
	 * @param movieidList
	 * @return
	 */
	ResultCode<Map> getMovieTierPriceTypeMapByMovieidList(List<Long> movieidList);
	/**
	 *	���ݳ��л�ȡ��ǰ�۸�ͬ�ĵ�Ӱ��ͼ۸�
	 *	@param ���д���
	 * @return ��Ӱ��ͼ۸�
	 */
	ResultCode<List<MoviePriceVo>> getDiffMoviePriceList(String citycode);
	/**
	 * ����movieidList����ѯMovieTierPrice
	 * @param movieidList
	 * @return
	 */
	ResultCode<Map<Long, MovieTierPriceVo>> getMovieTierPriceMapByCitycode(String citycode);
	/**
	 * ����movieid��cinemaid����ѯmovieprice
	 * @param movieid
	 * @param cinemaid
	 * @return
	 */
	ResultCode<MoviePriceVo> getMoviePriceByMovieidAndCinemaId(Long movieid, Long cinemaid);
	/**
	 * 
	 * @param paramsList
	 * @return
	 */
	ResultCode<Map<String, MoviePriceVo>> getMoviePriceDataMap(List<Map<String, Long>> paramsList);
	
	
	/**
	 * ����movieid ��citycode��ѯMoviePriceVo
	 * @param movieid
	 * @param citycode
	 * @return
	 */
	ResultCode<MoviePriceVo> getMoviePriceByMovieIdAndCityCode(Long movieid, String citycode);
	
	/**
	 * @param movieid
	 * @return
	 */
	ResultCode<List<MovieTierPriceVo>> getMovieTierPriceList(Long movieid);
	
	/**
	 * ͨ����ӰID������ѯ�۸�
	 * @param movieid	��ӰID
	 * @param type	�۸����
	 * @return	��Ӱ���ļ۸�
	 */
	ResultCode<MovieTierPriceVo> getMovieTierPriceByMovieIdAndType(Long movieid, String type);
	
	/**
	 * �����ӰmovieTierPrice
	 * @param movieTierPrice
	 */
	ResultCode saveMovieTierPrice(MovieTierPriceVo movieTierPrice);
	
	/**
	 * �����ӰmovieTierPriceList
	 * @param movieTierPriceList
	 */
	ResultCode saveMovieTierPriceList(List<MovieTierPriceVo> movieTierPriceList);
	
	/**
	 * �����ӰMoviePrice
	 */
	ResultCode saveMoviePrice(MoviePriceVo moviePrice);

	ResultCode<List<String>> syncMoviePriceToCinema(MovieVo movie, List<Map> cityTierMapList, String synchFlag, Long userid);
	
	ResultCode<List<String>> synchMoviePrice(MovieVo movie, List<Map> cityTierMapList, String synchFlag, Long userid);
}
