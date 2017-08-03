package com.gewara.api.gewampi.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.gewampi.vo.MovieItemVo;
import com.gewara.api.vo.ResultCode;

/**
 * ��Ӱ�ڳ��νӿ�
 * @author leo
 * @addTime 2015��9��11������2:58:21
 *
 */
public interface FilmfestMovieItemVoService {
	
	/**
	 * ��ѯ������ӳ��ӰƬ����</br>
	 * �÷����Ѽ��뻺�棬����5����</br>
	 * <b>����������ȫ��<b>
	 * @param citycode ����Ϊ��
	 * @param movieId  ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @param playdate ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������2:58:21
	 */
	ResultCode<Integer> findMovieCountByCitycodeMovieIdCinemaIdPlaydate(String citycode, Long movieId, Long cinemaId, Date playdate);
	
	/**
	 * ��ѯӰƬID</br>
	 * �÷����Ѽ��뻺�棬����5����</br>
	 * <b>����������ȫ��<b>
	 * @param citycode ����Ϊ��
	 * @param movieId  ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @param playdate ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������3:16:05
	 */
	ResultCode<List<Long>> findMovieIdByCitycodeMovieIdCinemaIdPlaydate(String citycode, Long movieId, Long cinemaId, Date playdate);

	/**
	 * ��ѯӰԺID</br>
	 * �÷����Ѽ��뻺�棬����5����
	 * @param countycode ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������3:16:31
	 */
	ResultCode<List<Long>> findCinemaIdByCountycode(String countycode);
	
	/**
	 * ��ѯӰԺID</br>
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������4:04:23
	 */
	ResultCode<List<Long>> findCinemaIdByCitycode(String citycode);
	
	/**
	 * ��ѯӰ��ID</br>
	 * �÷����Ѽ��뻺�棬����5����
	 * @param citycode ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������4:04:23
	 */
	ResultCode<List<Long>> findRoomIdByCitycode(String citycode);
	
	/**
	 * ��ѯ������ӳ�ĳ�������</br>
	 * �÷����Ѽ��뻺�棬����5����</br>
	 * <b>����������ȫ��<b>
	 * @param citycode ����Ϊ��
	 * @param movieId  ����Ϊ��
	 * @param cinemaId ����Ϊ��
	 * @param playdate ����Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������2:58:21
	 */
	ResultCode<Integer> findCountByCitycodeMovieIdCinemaIdPlaydate(String citycode, Long movieId, Long cinemaId, Date playdate);
	
	/**
	 * ��ѯĳ���е�Ӱ�����г���</br>
	 * ���صĳ��μ�����ӳʱ����������</br>
	 * @param citycode ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������3:55:56
	 */
	ResultCode<List<MovieItemVo>> findByCitycode(String citycode);
	
	/**
	 * ��ѯĳ���е�Ӱ�ڳ���</br>
	 * ���صĳ��μ�����ӳʱ����������</br>
	 * @param citycode     ������Ϊ��
	 * @param playtimeGte  ������Ϊ�� ��ӳʱ����ڵ��ڸ�ʱ��
	 * @param playtimeLt   ������Ϊ�� ��ӳʱ��С�ڸ�ʱ��	
	 * @return
	 * @author leo
	 * @addTime 2015��9��11������3:59:02
	 */
	ResultCode<List<MovieItemVo>> findByCitycodePlaytime(String citycode, Timestamp playtimeGte, Timestamp playtimeLt);
	
	/**
	 * ��ѯĳ��Ӱ�ڳ���</br>
	 * ���صĳ��μ�����ӳʱ����������
	 * @param citycode ������Ϊ��
	 * @param movieid  ������Ϊ��
	 * @return
	 * @author leo
	 * @addTime 2015��9��15������3:10:37
	 */
	ResultCode<List<MovieItemVo>> findByCitycodeMovieid(String citycode, Long movieid);	
	
	/**
	 * ��ѯӰԺ����</br>
	 * @param citycode citycode��movieid��playdate������ȫΪ��
	 * @param movieid  citycode��movieid��playdate������ȫΪ��
	 * @param playdate citycode��movieid��playdate������ȫΪ��
	 * @return
	 * @author leo
	 * @addTime 2016��3��18������2:38:09
	 */
	ResultCode<Integer> findCinemaCount(String citycode, Long movieid, Date playdate);
	
	/**
	 * ���ҵ�Ӱ�����е�ӰID���Լ���Ӧ�����翪�ŵĳ���</br>
	 * @param citycode ������Ϊ��
	 * @return Mp<key, value> : "movieid" -> movieid; "earliestOpentime" -> opentime;
	 * @author leo
	 * @addTime 2016��3��29������2:51:58
	 */
	ResultCode<List<Map<String, Object>>> findMoiveidAndOpentime(String citycode);
}
