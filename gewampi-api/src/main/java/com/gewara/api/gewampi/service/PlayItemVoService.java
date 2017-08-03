package com.gewara.api.gewampi.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.gewampi.vo.MovieItemVo;
import com.gewara.api.vo.ResultCode;

public interface PlayItemVoService {
	
	/**
	 * ���ݳ��У�citycode����ӰƬ��movieid����ѯ����Date playdate
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode	citycode,movieid����һ����Ϊ��
	 * @param movieid	citycode,movieid����һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:48:06
	 */
	ResultCode<List<Date>> findPlayDateByCityCodeAndMovieId(String citycode,Long movieid);
	
	/**
	 * ���ݳ��У�citycode����ӰƬ��movieid�������ڣ�playdate����ȡӰԺidLong cinemaid
	 * �÷����Ѽ��뻺�棬playdateΪ��ʱ������10���ӣ���Ϊ��ʱ������5����
	 * @param citycode	����Ϊ��
	 * @param movieid	����Ϊ��
	 * @param playdate	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:48:34
	 */
	ResultCode<List<Long>> findCinemaIdByCityCodeAndMovieIdAndPlayDate(String citycode,Long movieid,Date playdate);
	
	/**
	 * ����ӰƬ��movieid�������ڣ�playdate����ӰԺid��cinemaid����ȡ����</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param movieid	movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @param playdate	movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @param cinemaid	movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:50:35
	 */
	ResultCode<List<MovieItemVo>> findByMovieIdAndPlayDateAndCinemaId(Long movieid,Date playdate,Long cinemaid);
	
	/**
	 * 
	 * ���ݳ��У�citycode����ӰƬ��movieid�������ڣ�playdate����ӰԺid��cinemaid����ȡ����</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param citycode	citycode, cinemaid, movieid, playdate��������ͬʱΪ�գ�������һ����ֵ
	 * @param cinemaid	citycode, cinemaid, movieid, playdate��������ͬʱΪ�գ�������һ����ֵ
	 * @param movieid	citycode, cinemaid, movieid, playdate��������ͬʱΪ�գ�������һ����ֵ
	 * @param playdate	citycode, cinemaid, movieid, playdate��������ͬʱΪ�գ�������һ����ֵ
	 * @return
	 * @author leo
	 * @addTime 2015��7��1������11:12:17
	 */
	ResultCode<List<MovieItemVo>> findByCitycodeCinemaidMovieidPlaydate(String citycode, Long cinemaid, Long movieid, Date playdate);
	
	/**
	 * ���ݳ���ӰԺ��cinemaid����ѯ��Ƭ����
	 * �÷����Ѽ��뻺�棬����5����
	 * @param cinemaid	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:52:40
	 */
	ResultCode<List<Date>> findPlayDateByCinemaId(Long cinemaid);
	
	/**
	 * ���ݳ���ӰԺ��cinemaid�������ڣ�playdate����ȡӰƬid
	 * �÷����Ѽ��뻺�棬����5����
	 * @param cinemaid	����Ϊ��
	 * @param playdate	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:53:04
	 */
	ResultCode<List<Long>> findMovieIdByCinemaIdAndPlayDate(Long cinemaid,Date playdate);
	
	/**
	 * ���ݳ��У�citycode����ȡ��ӳ���ڣ�playdate��
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode	������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:53:44
	 */
	ResultCode<List<Date>> findPlayDateByCityCode(String citycode);
	
	/**
	 * ���ݳ��У�citycode����ȡ��ƱӰƬid
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode 	������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:54:32
	 */
	ResultCode<List<Long>> findMovieIdByCityCode(String citycode);
	
	/**
	 * ��ѯ����ӰƬId
	 * �˷����Զ�����20����
	 * @return
	 * @author leo
	 * @addTime 2015��7��2������4:08:35
	 */
	ResultCode<List<Long>> findAllMovieIdList();

	/**
	 * ����ӰƬ��movieid�������ڣ�playdate����ӰԺid��cinemaid����ȡ��ҹ����</br>
	 * ��ҹ���ε�ʱ���Ϊ��ӳʱ��00:00-05:00</br>
	 * openStatus ֵΪ : open</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param movieid	 	������Ϊ��
	 * @param playdate	 	������Ϊ��
	 * @param cinemaid 		������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:54:51
	 */
	ResultCode<List<MovieItemVo>> findMidNightByMovieIdAndPlayDateAndCinemaId(Long movieid,Date playdate,Long cinemaid);
		
	/**
	 * ����citycode����Ӱ��movieid����ӰԺ��cinemaid����ȡ��Ʊ����ƽ���۸���С�۸����۸�
	 * �÷����Ѽ��뻺�棬����5����
	 * ����Map�е�key���Ǽ۸��ʶ��min����Сֵ��max���ֵ��avg��ƽ��ֵ
	 * value����Ӧ�۸�
	 * 
	 * @param movieid	movieid��cinemaid��citycode����һ����Ϊ��
	 * @param cinemaid	movieid��cinemaid��citycode����һ����Ϊ��
	 * @param citycode	movieid��cinemaid��citycode����һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:46:07
	 */
	ResultCode<Map<String, Integer>> findPriceInfoByMovieIdAndCinemaIdAndCityCode(Long movieid,Long cinemaid,String citycode);

	/**
	 * ��ѯ����ӳ��ӰƬ����
	 * �÷����Ѽ��뻺�棬����10����
	 * @param citycode ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������3:10:43
	 */
	ResultCode<Integer> findMovieCountByCityCode(String citycode);
	
	/**
	 * ��ѯ����ӳ��ӰƬ����
	 * �÷����Ѽ��뻺�棬����10����
	 * @param citycode ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @param playdate ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������3:10:43
	 */
	ResultCode<Integer> findMovieCount(String citycode, Long cinemaId, Date playdate);
	
	/**
	 * ��ѯӰԺID
	 * �÷����Ѽ��뻺�棬����5����
	 * @param countycode ӰԺ���������أ�������Ϊ��
	 * @param movieId	  ����Ϊ��
	 * @param playdate   ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������3:58:14
	 */
	ResultCode<List<Long>> findCinemaIdByCountycodeAndMovieIdAndPlayDate(String countycode, Long movieId, Date playdate);
	
	/**
	 * ��ѯӰԺ����
	 * ��������������һ����Ϊ��
	 * �÷����Ѽ��뻺�棬����10����
	 * @param citycode
	 * @param movieId
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:16:57
	 */
	ResultCode<Integer> findCinemaCountByCityCodeAndMovieId(String citycode, Long movieId);
	

	/**
	 * ��ѯӰԺ����
	 * ��������������һ����Ϊ��
	 * �÷����Ѽ��뻺�棬����10����
	 * @param citycode
	 * @param movieId
	 * @param playdate
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:16:57
	 */
	ResultCode<Integer> findCinemaCount(String citycode, Long movieId, Date playdate);
	
	/**
	 * ����ӰԺ��ѯӰƬId
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬playdateΪ��ʱ������10���ӣ���Ϊ��ʱ������5����
	 * @param citycode  ����Ϊ��
	 * @param cinemaId  ����Ϊ��
	 * @param playdate  ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:25:14
	 */
	ResultCode<List<Long>> findOpiMovieIdList(String citycode, Long cinemaId, Date playdate);
	
	/**
	 * ��ѯ��ӳ����
	 * �÷����Ѽ��뻺�棬����5����
	 * @param cinemaId	cinemaId,movieid����һ����Ϊ��
	 * @param movieid	cinemaId,movieid����һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:41:33
	 */
	ResultCode<List<Date>> findPlayDateByCinemaIdAndMovieId(Long cinemaId,Long movieid);
	
	/**
	 * ��ѯ��Ƭ����</br>
	 * ĳЩ�����ʹ�û��棺citycode��movieId��Ϊ�գ�cinemaId��playdateΪ��ʱ������10���ӣ���������²�����5����
	 * @param citycode	����Ϊ��
	 * @param cinemaId	����Ϊ��
	 * @param movieId	����Ϊ��
	 * @param playdate	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:47:29
	 */
	ResultCode<Integer> findPlayItemCount(String citycode, Long cinemaId, Long movieId, Date playdate);
	
	/**
	 * ��ѯ��Ƭ����	 * 
	 * endDate startDate��������һ����Ϊ��
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param citycode	����Ϊ��
	 * @param cinemaId	����Ϊ��
	 * @param movieId	����Ϊ��
	 * @param startDate endDate startDate��������һ����Ϊ��
	 * @param endDate 	endDate startDate��������һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������6:49:31
	 * 
     * @see     PlayItemVoService.findPlayItemCount2
     * @deprecated ������������뾡��ʹ���·�������findPlayItemCount2
	 */
	@Deprecated
	ResultCode<Integer> findPlayItemCount(String citycode, Long cinemaId, Long movieId, Date startDate, Date endDate);
	

	/**
	 * ��ѯ��Ƭ����	 * 
	 * endDate startDate��������һ����Ϊ��
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param citycode	����Ϊ��
	 * @param cinemaId	����Ϊ��
	 * @param movieId	����Ϊ��
	 * @param startDate endDate startDate��������һ����Ϊ��
	 * @param endDate 	endDate startDate��������һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������6:49:31
	 */
	ResultCode<Integer> findPlayItemCount2(String citycode, Long cinemaId, Long movieId, Date startDate, Date endDate);
	
	
	/**
	 * ��ȡӰƬ��������
	 * ����List��������Map, ÿ��map�Ľṹ���£�
	 * map.put("movieid", 111);
	 * map.put("count", 12354);
	 * ����Ƭ����count��������
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param citycode	���У�����Ϊ��
	 * @param date		��ӳ���ڣ�����Ϊ��
	 * @param cinemaId	ӰԺid������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������2:18:29
	 */
	ResultCode<List<Map<String, Long>>> findMovieMpiCountList(String citycode, Date playdate, Long cinemaId);

	/**
	 * ��ѯӰƬ����</br>
	 * status ҪΪ : Y</br>
	 * ��ӳʱ����ڵ�ǰʱ��</br>
	 * ����ӳʱ��������</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * 
	 * @param roomid Ӱ��ID ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������2:51:19
	 */
	ResultCode<List<MovieItemVo>> findOpiByRoomid(Long roomid);
	
	/**
	 * ��ѯӰƬ����</br>
	 * ��Ƭ��ӳʱ����from��to֮��</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param citycode		citycode,cinemaId,movieid�����봫һ��ֵ
	 * @param cinemaId		citycode,cinemaId,movieid�����봫һ��ֵ
	 * @param movieid		citycode,cinemaId,movieid�����봫һ��ֵ
	 * @param from			������Ϊ�գ�ӰƬ��ӳ��ʼʱ��
	 * @param to			������Ϊ�գ�ӰƬ��ӳ����ʱ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������3:49:25
	 */
	ResultCode<List<MovieItemVo>> findByCityCodeAndCinemaIdAndMovieId(String citycode, Long cinemaId, Long movieid, Timestamp from, Timestamp to);
	
	/**
	 * ��ѯ�г��ε���ЧӰ��</br>
	 * ���α����ֶ�characteristic����Ϊ������Ϊ����Ӱ��Ϊ��ЧӰ��</br>
	 * status ֵҪΪ��Y</br>
	 * ��ӳʱ��Ҫ���ڣ���ǰʱ�� + 1Сʱ��</br>
	 * 
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param cinemaid ������Ϊ��
	 * @return ����Ӱ��ID  List
	 * @author leo
	 * @addTime 2015��5��19������3:37:25
	 */
	ResultCode<List<Long>> findCharacteristicRoomIdList(Long cinemaid);
	
	
	/**
	 * ���ݳ��У�citycode����ӰƬ��movieid�������ڣ�playdate����ȡӰԺidLong cinemaid
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode	����Ϊ��
	 * @param movieid	����Ϊ��
	 * @param playdate	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:48:34
	 */
	ResultCode<List<Long>> findOpiCinemaIdList(String citycode,Long movieid,Date playdate);
	
	/**
	 * 
	 * ���ݳ��У�citycode����ӰƬ��movieid�������ڣ�playdate����ʱ��Σ�timeRange��am,pm,night����ȡӰԺidLong cinemaid
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param citycode ������Ϊ��
	 * @param movieid   ����Ϊ��
	 * @param playdate  ����Ϊ��
	 * @param timeRange ����Ϊ�գ� am,pm,night
	 * @return
	 */
	ResultCode<List<Long>> findOpiCinemaIdList(String citycode, Long movieid, Date playdate, String timeRange);
	
	/**
	 * ���ݳ��У�citycode����ӰƬ��movieid����ѯ����Date playdate
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode	citycode,movieid����һ����Ϊ��
	 * @param movieid	citycode,movieid����һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:48:06
	 */
	ResultCode<List<Date>> findOpiPlayDateByCityCodeAndMovieId(String citycode,Long movieid);
	
	/**
	 * ��ѯ��ӳ����
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬����5����
	 * @param cinemaId	cinemaId,movieid����һ����Ϊ��
	 * @param movieid	cinemaId,movieid����һ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:41:33
	 */
	ResultCode<List<Date>> findOpiPlayDateByCinemaIdAndMovieId(Long cinemaId,Long movieid);
	
	/**
	 * ���ݳ��У�citycode����ȡ��ƱӰƬid
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷���ʹ���˻��棬����10����
	 * @param citycode 	������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��18������5:54:32
	 */
	ResultCode<List<Long>> findOpiMovieIdByCityCode(String citycode);

	/**
	 * ��ѯ��Ƭ����</br>
	 * ���ѿ��ŵĳ��Σ���ѯ�ۺϱ�OpiCount
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode	����Ϊ��
	 * @param cinemaId	����Ϊ��
	 * @param movieId	����Ϊ��
	 * @param playdate	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��5��15������4:47:29
	 */
	ResultCode<Integer> findOpiPlayItemCount(String citycode, Long cinemaId, Long movieId, Date playdate);
	
	/**
	 * ��ѯÿ���ӳ����Ƭ����
	 * 
	 * ���ص�Map�ṹ��key:value
	 * playdate:java.util.Date
	 * count:Integer
	 * 
	 * �÷����Ѽ��뻺�棬����5����
	 * 
	 * @param citycode	����Ϊ��
	 * @param cinemaid	����Ϊ��
	 * @param movieid	����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��6��17������6:51:58
	 */
	ResultCode<List<Map<String, Object>>> findMpiCountGroupByPlaydate(String citycode, Long cinemaid, Long movieid);
	
	/**
	 * ��ѯ����
	 * @param mpid mpid
	 * @return
	 * @author leo
	 * @addTime 2015��6��19������6:18:51
	 */
	ResultCode<MovieItemVo> findByMpid(Long mpid);
	
	/**
	 * ��ѯ����</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param mpidList
	 * @return
	 * @author leo
	 * @addTime 2015��6��23������5:06:48
	 */
	ResultCode<List<MovieItemVo>> findByMpidList(List<Long> mpidList);
	
	/**
	 * ��ѯ��ЧӰ��
	 * �������20����
	 * @param citycode ������Ϊ��
	 * @param movieid
	 * @param playdate
	 * @return
	 * @author leo
	 * @addTime 2015��6��25������11:37:50
	 * 
     * @see     PlayItemVoService.findCharacteristicRoomIdList2
     * @deprecated ������������뾡��ʹ���·�������findCharacteristicRoomIdList2
	 */
	@Deprecated
	ResultCode<List<Long>> findCharacteristicRoomIdList(String citycode, Long movieid, Date playdate);
	
	/**
	 * ��ѯ��ЧӰ��
	 * �������20����
	 * @param citycode ������Ϊ��
	 * @param movieid
	 * @param playdate
	 * @return
	 * @author leo
	 * @addTime 2015��6��25������11:37:50
	 */
	ResultCode<List<Long>> findCharacteristicRoomIdList2(String citycode, Long movieid, Date playdate);
	
	/**
	 * ��ѯ�ѿ��ų���
	 * openid��Ϊ��</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param movieid  movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @param playdate movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @param cinemaid movieid,playdate,cinemaid��������ͬʱΪ�գ�������һ����ֵ
	 * @return
	 * @author leo
	 * @addTime 2015��6��25������5:49:55
	 */
	ResultCode<List<MovieItemVo>> findOpiList(Long movieid, Date playdate, Long cinemaid);

	/**
	 * ��ѯ�ѿ��ŵĳ��Σ���ӳʱ�����startPlaytime
	 * openid��Ϊ��</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param cinemaid		������Ϊ��
	 * @param startPlaytime	������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��7��2������11:31:42
	 * 
     * @see     PlayItemVoService.findOpiListByCinemaidAndStartPlaytime
     * @deprecated ������������뾡��ʹ���·�������findOpiListByCinemaidAndStartPlaytime
	 */
	@Deprecated
	public ResultCode<List<MovieItemVo>> findOpiList(Long cinemaid, Timestamp startPlaytime);
	
	/**
	 * ��ѯ�ѿ��ŵĳ��Σ���ӳʱ�����startPlaytime
	 * openid��Ϊ��</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param cinemaid		������Ϊ��
	 * @param startPlaytime	������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��7��2������11:31:42
	 */
	public ResultCode<List<MovieItemVo>> findOpiListByCinemaidAndStartPlaytime(Long cinemaid, Timestamp startPlaytime);
	
	/**
	 * ��ȡĳ���������ʺϸ��ؼۻ��ӰԺid�б�
	 * @author qilun
	 * Jul 23, 2015
	 * @param sdid ����Ϊ��
	 * @param citycode ����Ϊ��
	 * @return
	 */
	ResultCode<List<Long>> getCinemaidListByCitycode(Long sdid, String citycode);
	/**
	 * ��ȡ�ڸ�ӰԺ�ʺϸ��ؼۻ��ӰƬid�б�
	 * @author qilun
	 * Jul 23, 2015
	 * @param sdid ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @return
	 */
	ResultCode<List<Long>> getMovieidListByCinemaid(Long sdid, Long cinemaId);
	/**
	 * ��ȡ�ؼۻ��ӰԺ�·�ӳĳ����Ӱ������
	 * @author qilun
	 * Jul 23, 2015
	 * @param sdid ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @param movieid ����Ϊ��
	 * @return
	 */
	ResultCode<List<Date>> getPlaydatedListByCinemaidAndMovieid(Long sdid, Long cinemaId, Long movieid);
	
	/**
	 * �����޸�ʱ���ѯ�����޸�ʱ�����updateTime��������Ƭ</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * 
	 * @param cinemaid   ������Ϊ��
	 * @param updateTime ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��8��14������4:07:18
	 */
	ResultCode<List<MovieItemVo>> findListByUpdateTime(Long cinemaid, Timestamp updateTime);
	
	/**
	 * ��ѯ������ЧӰ����ӰԺID</br>
	 * �������10����
	 * @param characteristic    ������Ϊ��
	 * @param citycode   		������Ϊ��
	 * @param movieid			����Ϊ��
	 * @param playdate			����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��15������3:50:02
	 */
	ResultCode<List<Long>> findCinemaIdByCharacteristic(String characteristic, String citycode, Long movieid, Date playdate);
}
