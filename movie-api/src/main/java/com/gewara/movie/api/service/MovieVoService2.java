package com.gewara.movie.api.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieVideoVo;
import com.gewara.movie.vo.MovieVo;
import com.gewara.movie.vo.common.EntityClobVo;

public interface MovieVoService2 {
	/**
	 * ����ӰƬID���ӰƬ����
	 * 
	 * @param movieId
	 * @return MovieVo
	 */
	ResultCode<MovieVo> getMovieById(Long movieId);
	/**
	 * ����ӰƬukey���ӰƬ����
	 * 
	 * @param ukey
	 * @return MovieVo
	 */
	ResultCode<MovieVo> getMovieByUkey(String ukeyName, Serializable ukeyValue);
	/**
	 * ����ӰƬID���ϻ��ӰƬ����
	 * 
	 * @param movieIds
	 * @return List<MovieVo>
	 */
	ResultCode<List<MovieVo>> getMovieListByIdList(List<Long> idList);
	
	/**
	 * ����ӰƬID���ϻ��ӰƬ����
	 * ע�⣺�÷�������jmsͬ��movie���ݵ�avatar,ֱ�Ӳ�mysql���ݿ⣬���߻��棬���á�
	 * @param movieIds
	 * @return List<MovieVo>
	 */
	ResultCode<List<MovieVo>> getMovieListByIdListWithOutCache(List<Long> idList);
	
	/**
	 * ����ӰƬID���ӰƬ����
	 * 
	 * @param movieId
	 * @return EntityClobVo
	 */
	ResultCode<EntityClobVo> getMovieEntityClob(Long movieId);
	/**
	 * ���ݼ�����ӳ��ӰƬ
	 * 
	 * @param from
	 * @param maxnum
	 * @param order
	 * @return List<MovieVo>
	 */
	ResultCode<List<MovieVo>> getFutureMovieList(int from, int maxnum, String order);
	/**
	 * ��ѯ��ӳӰƬ
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieList();
	/**
	 * ���ݳ��в�ѯ��ӳ��Ӱ������ҳ
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieListByCitycode(String citycode, int from,int maxnum);
	/**
	 * ����releasedate��ѯ��ӰID�б�
	 * @param startDate ��ʼʱ��
	 * @param endDate ����ʱ��
	 * @return
	 */
	ResultCode<List<Long>> getMovieListByReleasedate(Date startDate, Date endDate);
	/**
	 * ���ݳ��в�ѯ��ӳ��Ӱ������clickedtimes��ASC����
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieListByCitycodeOrderClickedtimes(String citycode);
	/**
	 * ˢ��ǰ�õ�ӰID
	 * @return
	 */
	ResultCode<Long> refreshQzMovieid();
	/**
	 * ����ӰƬid��ӰƬ���ƻ��ӰƬ����
	 * @param movieid
	 * @param movieName
	 * @return
	 */
	ResultCode<Integer> getMovieCountByidAndName(Long movieid, String movieName);
	/**
	 * ����ӰƬ���Ʋ�ѯӰƬ
	 * @param moviename
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByMovieName(String moviename);
	/**
	 * ����ӰƬ���Ʋ�ѯӰƬ
	 * @param moviename
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByLikeMovieName(String moviename);
	/**
	 * ��ȡ���ߵ�ӰƬ�б�
	 * @param citycode
	 * @param order
	 * @return
	 */
	ResultCode<List<MovieVo>> getOffLineMoveList(String citycode, String order);
	/**
	 * ��̨����ӰƬ�б�
	 * @param hot
	 * @param moviename
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	ResultCode<List<MovieVo>> getAdminMovieList(String hot, String moviename, Date fromDate, Date toDate);
	/**
	 * ���ݷ�ӳ���ںͽ���ʱ���ѯӰƬ��Ϣ
	 * @param playdate
	 * @param endDate
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByDate(String playdate, String endDate);
	/**
	 * ����ӰԺID��ѯ��ǰ����ӰƬ
	 * @param cinemaId
	 * @return ��ǰ��ӰԺ�ķ�ӳӰƬ�б�
	 */
	ResultCode<List<MovieVo>> getCurMovieListByCinemaId(Long cinemaId);
	/**
	 * ĳӰԺĳ���ӰƬ
	 * @param cinemaId
	 * @param playdate
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieListByCinemaIdAndDate(Long cinemaId, Date playdate);
	/**
	 * ���յ�Ӱ�Ŀ�ʼʱ��ͽ���ʱ���ѯӰƬ��Ϣ�з�ҳ
	 * @param playdate
	 * @param endDate
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByDateAndPage(String playdate, String endDate,int from,int maxnum);
	/**
	 * ���ݷ�ӳ���ںͽ���ʱ���ѯӰƬ��
	 * @param playdate
	 * @param endDate
	 * @return
	 */
	ResultCode<Integer> countMovieListByDate(String playdate, String endDate);
	/**
	 * ��ȡ��ǰ��Ӱ��������Ƶ
	 * @param movieid
	 * @return
	 */
	ResultCode<MovieVideoVo> getMovieVideoByMovieId(Long movieid);
	/**
	 * ��ȡ��Ƶ
	 * @param videoid
	 * @return
	 */
	ResultCode<MovieVideoVo> getMovieVideoByVideoid(String videoid);
	/**
	 * У��movie�Ƿ����
	 * @param idList
	 * @return ���ز����ڵ�id
	 */
	ResultCode<List<Long>> checkMovieExist(List<Long> idList);
	/**
	 * ��ѯ��Ӱ�ڵ�Ӱ
	 * @param flag
	 * @return
	 */
	ResultCode<List<Long>> getFilmFestMovieIdList(String flag);
	/**
	 * ������ŵ�Ӱ��Ӱ��
	 * @param citycode
	 * @param cinemaid
	 * @param playdate
	 * @return
	 */
	ResultCode<Map<String,Object>> getHotMovieAndStar(String citycode,Long cinemaid, Date playdate);
	/**
	 * ��ȡӰƬ�б�
	 * @param from ��ʼ��¼��
	 * @param rows ��ȡ��¼��
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieList(Integer from, Integer rows);
	/**
	 * ӰƬ���ܼ�¼��
	 * @return
	 */
	ResultCode<Integer> getAllMovieCount();
	/**
	 * ���ݵ�ӰID��ѯ���Ǽ����
	 * @param movieid ��ӰID������Ϊ��
	 * @return ���ط��������ĳ���ID�б�
	 */
	ResultCode<List<Long>> getMpidListByMovieidAndStarmeet(final Long movieid);
	/**
	 * ���ݸ���ʱ���ȡ��Ҫ�ֶε�ListMap
	 * @param fields
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Map>> getFieldsMapByUpdate(String fields, Timestamp updatetime, int from, int maxnum);
	/**
	 * ���ݵ�ӰID��ȡӰ�˽ӿ�
	 * @param movieId
	 * @return Map<key, value> 
	 * key:startid(��ɫID),relename(���ݽ�ɫ),chinesename(������),engname(Ӣ����),headPicUrl(ͷ��),role
	 * 
	 */
	ResultCode<List<Map<String, Object>>> getStarListByMovieId(Long movieId);
	ResultCode<MovieVo> updateMovieProperties(Long movieId, String[] properties, Serializable[] values);
	// TODO ר�ⷢ���ɾ���ýӿ�
	/**
	 * ��ѯ���շ�ӳ�ĵ�Ӱ
	 * @param playdate �������� 
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieListByDate(Date playdate );
	/**
	 * ��ѯ���շ�ӳ�ĵ�Ӱ
	 * @param playdate �������� 
	 * @return
	 */
	ResultCode<List<MovieVo>> getCurMovieListByDate(String citycode, Date playdate, int from, int maxnum);
	/**
	 * ��ѯ��ӳ������ʱ����ڵ�ӰƬ
	 * @param startPlayDate ����
	 * @param endPlayDate ����
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListBetweenPlaydate(String startPlayDate, String endPlayDate);
	/**
	 * ��ѯȫ����ӳ������ʱ����ڵ�ӰƬ
	 * @param startReleasedate ����
	 * @param endReleasedate ����
	 * @param offlineDate ����Ϊ��
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListBetweenReleasedate(Date startReleasedate, Date endReleasedate, String offlineDate);
	/**
	 * ��ȡ�������ĵ�Ӱ�б�
	 * @return
	 */
	ResultCode<String> getSearchMovieOrderReleasedate();
	
	/**
	 * ��ȡ��Ӱ����
	 * @param movieId
	 * @return
	 */
	ResultCode<String> getMovieMark(Long movieId);
	/**
	 * ���ݵ�Ӱ���ƻ�ȡ��ӰID������2Сʱ
	 * @param moviename
	 * @return
	 */
	ResultCode<Long> getCacheMovieIdByMoviename(String moviename);
	
	/**
	 * ��ȡָ������ʱ��֮��ĵ�ӰID�б�
	 * @return
	 */
	ResultCode<List<Long>> getMovieListByUpdatetime(Timestamp updatetime, int from,int maxnum);
}
