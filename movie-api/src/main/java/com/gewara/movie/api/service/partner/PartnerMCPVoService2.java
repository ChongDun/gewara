package com.gewara.movie.api.service.partner;


import java.util.Date;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaVo;
import com.gewara.movie.vo.MovieVo;
import com.gewara.movie.vo.partner.PartnerCinemaQueryReqVo;
import com.gewara.movie.vo.partner.PartnerCommonReqVo;
import com.gewara.movie.vo.partner.PartnerMovieReqVo;

/**
 * �����̵�Ӱ������WAP
 * 
 */
public interface PartnerMCPVoService2 {
	
	/**
	 * ��ӳӰƬ
	 * 
	 * @return
	 */
	ResultCode<List<MovieVo>> getHotMovies(PartnerMovieReqVo reqVo);

	/**
	 * ���ӰԺ�б�
	 * 
	 * @return
	 */	
	ResultCode<List<CinemaVo>> getCinemaList(PartnerCinemaQueryReqVo reqVo);

	/**
	 * ����ӳӰƬ
	 * 
	 * @return
	 */
	ResultCode<List<MovieVo>> getFutureMovies(String appkey, String citycode, Integer from, Integer maxnum);
	/**
	 * ӰƬ����
	 * 
	 * @return
	 */
	ResultCode<MovieVo> getMovieDetail(String appkey, Long movieId);

	/**
	 * ��Ч��
	 * 
	 * @param citycode
	 * @param movieId
	 * @return
	 */
	ResultCode<String> characteristicList(String appkey, String citycode, Long movieId);

	/**
	 * ӰԺ����
	 * 
	 * @return
	 */
	ResultCode<CinemaVo> getCinemaDetail(String appkey, Long cinemaId);
	/**
	 * ��ȡӰԺ�б��������ֵ�
	 * @param appkey
	 * @param movieidList
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieVoList(String appkey, List<Long> movieidList);
	/**
	 * ӰԺ������ӳ�ĵ�Ӱ
	 * @param appkey
	 * @param citycode
	 * @param cinemaId
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieByCinemaId(String appkey, String citycode, Long cinemaId, Long discountid, Integer from, Integer maxnum);
	/**
	 * ���ݳ��к�ӰƬ��ȡ��ƱӰԺ�б�
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCitycodeAndMovieid(PartnerCommonReqVo reqVo);
	/**
	 * ��ȡ��Ӱ��Ч��
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> getMovieCharacteristic(String citycode,Long movieId);
	/**
	 * ������Ч������ӰԺ
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<CinemaVo>> getSpecailRoomCinemaList(PartnerCommonReqVo reqVo);
	/**
	 * ��Ӱ��Ч��
	 * @param reqVo
	 * @return
	 */
	ResultCode<String> getMovieCharacteristic(PartnerCommonReqVo reqVo);
	
	ResultCode<String> getMovieCharacteristic2(PartnerCommonReqVo reqVo,Date playdate);
	
	/**
	 * ������Ч������ӰԺ
	 * @param reqVo
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCountyAndMovieidAndPlaydate(PartnerCommonReqVo reqVo);
	/**
	 * �ؼ�ģ��ӰԺ�б��ѯ����
	 * @param paramsVo
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaVoList4Advert(PartnerCinemaQueryReqVo paramsVo);
}
