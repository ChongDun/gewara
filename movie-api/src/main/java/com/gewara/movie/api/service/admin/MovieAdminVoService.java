package com.gewara.movie.api.service.admin;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieVo;

public interface MovieAdminVoService {
	/**
	 * ��ȡĳ�쿪�Ź�Ʊ��ӰƬ
	 * @param citycode
	 * @param cinemaid
	 * @param playdate
	 * @return
	 */
	ResultCode<List<MovieVo>> getOpiMovieList(String citycode, Long cinemaid, Date playdate);
	/**
	 * �������ĸ�����ӰƬ
	 * @param movieid
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListFirstLetterSort(Long movieid);
	/**
	 * ����ӰƬ����
	 * @param paramVo
	 * @return
	 */
	ResultCode<MovieVo> saveOrUpdateMovie(RequestParamVo paramVo, boolean isPushSearchKey);
	/**
	 * �޸�movie����
	 * @param userid
	 * @param movieId
	 * @param properties
	 * @param values
	 * @return
	 */
	ResultCode<MovieVo> updateMovieProperties(Long movieId, String[] properties, Serializable[] values);
	/**
	 * ����movie���󣬼����������
	 * @param paramVo
	 * @return
	 */
	ResultCode<MovieVo> saveMovieAndRelatedObject(RequestParamVo paramVo);
	/**
	 * ��ѯ��updateTimeС�ڵ���datatime��ӰƬ
	 * @param dateTime
	 * @return
	 */
	ResultCode<List<MovieVo>> getMovieListByUpdateTimeLeDateTime(Timestamp dateTime);
	/**
	 * ��Ӱ�ڷ��񣬸���id�޸�flag
	 * @param paramVo
	 * @return
	 */
	ResultCode updateOtherInfoByMovieIds(String ids, String type);
	
}
