package com.gewara.movie.api.service.admin;

import java.io.Serializable;
import java.util.List;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaProfileVo;

public interface CinemaProfileAdminVoService {
	/**
	 * ����CinemaProfile����
	 * @param userid
	 * @param cinemaId
	 * @param dataMap
	 * @return
	 */
	ResultCode<CinemaProfileVo> saveOrUpdateCinemaProfile(RequestParamVo paramVo);
	/**
	 * �޸�cinemaprofile����
	 * @param userid
	 * @param movieId
	 * @param properties
	 * @param values
	 * @return
	 */
	ResultCode<CinemaProfileVo> updateCinemaProfileProperties(Long userid, Long cinemaId, String[] properties, Serializable[] values);
	/**
	 * ��������Insure
	 * @param userid
	 * @param cityCode
	 * @param status
	 * @return
	 */
	ResultCode<List<CinemaProfileVo>> batchSetCinemaInsureStatus(Long userid, String cityCode, String status);
	/**
	 * ����Insure
	 * @param userid
	 * @param cinemaId
	 * @param status
	 * @return
	 */
	ResultCode<CinemaProfileVo> setCinemaInsureStatus(Long userid, Long cinemaId, String status);
	/**
	 * ���cinemaprof ��opentype
	 * @param cinemaid
	 * @return
	 */
	ResultCode<CinemaProfileVo> cleanCinemaInfo(Long cinemaid);
	
	/**
	 * ����id��ȡCinemaProfileVo
	 * @param cinemaid
	 * @return
	 */
	ResultCode<CinemaProfileVo> getCinemaProfileById(Long cinemaId);
}
