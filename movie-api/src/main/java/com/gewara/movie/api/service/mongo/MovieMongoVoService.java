package com.gewara.movie.api.service.mongo;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.FilmFestTicketOrderVo;
import com.gewara.movie.vo.MovieDetailTabVo;
import com.gewara.movie.vo.SeatTypeVo;

public interface MovieMongoVoService {
	
	/**
	 * ��ѯFilmfestDateList�б�
	 * @param filmfestCode ����
	 * @param dayNumber ��Ϊnull
	 * @return
	 */
	ResultCode<List<Map>> getFilmfestDateListByFilmfestCodeAndDayNumber(String filmfestCode,Integer dayNumber);
	
	/**
	 * ����recordId��ѯFilmfestDateList
	 * @param recordId
	 * @return
	 */
	ResultCode<Map> getFilmfestDateListByRecordId(String recordId);
	
	/**
	 * ����/���� FilmfestDateList
	 * @param param
	 * @return
	 */
	ResultCode saveOrUpdateFilmfestDateList(Map param);
	
	/**
	 * ����recordIdɾ��FilmfestDateList
	 * @param recordId
	 * @return
	 */
	ResultCode removeFilmfestDateListByRecordId(String recordId);
	
	
	/**
	 * ����recordId��ѯFilmfest_MovieIds
	 * @param recordId
	 * @return
	 */
	ResultCode<Map> getFilmfestMovieIdsByRecordId(String recordId);
	
	/**
	 * ����/����Filmfest_MovieIds
	 * @param param
	 * @return
	 */
	ResultCode saveOrUpdateFilmfestMovieIds(Map param);
	
	
	/**
	 * ���ݵ�ӰID��ѯ MovieDetailTab�б�
	 * @param movieId
	 * @return
	 */
	ResultCode<List<MovieDetailTabVo>> getMovieDetailTabListByMovieId(Long movieId);
	
	/**
	 * ����ID��ѯ MovieDetailTab
	 * @param id
	 * @return
	 */
	ResultCode<MovieDetailTabVo> getMovieDetailTabById(String id);
	
	/**
	 * ����IDɾ��MovieDetailTab
	 * @param id
	 * @return
	 */
	ResultCode removeMovieDetailTabById(String id);
	
	/**
	 * ���� MovieDetailTab
	 * @param detailTab
	 * @return
	 */
	ResultCode saveOrUpdateMovieDetailTab(MovieDetailTabVo detailTab);
	
	/**
	 * ��ѯFilmFestTicketOrder����
	 * @param memberId
	 * @param relatedId
	 * @return
	 */
	ResultCode<Integer> getFilmFestTicketOrderCount(Long memberId, Long relatedId);
	
	
	/**
	 * ����FilmFestTicketOrder
	 * @param order
	 * @return
	 */
	ResultCode saveFilmFestTicketOrder(FilmFestTicketOrderVo order);
	
	/**
	 * ����ID��ѯSeatType
	 * @param id
	 * @return
	 */
	ResultCode<SeatTypeVo> getSeatTypeById(String id);
	
	/**
	 * ����/���� SeatType
	 * @param seatType
	 * @return
	 */
	ResultCode saveOrUpdateSeatType(SeatTypeVo seatTypeVo);
}
