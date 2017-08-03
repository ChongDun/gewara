package com.gewara.movie.api.service.admin;

import java.io.Serializable;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaRoomVo;

public interface CinemaRoomAdminVoService {
	/**
	 * ����cinemaRoom����
	 * @param roomId
	 * @param seatStyle
	 * @param seatMark
	 * @return
	 */
	ResultCode<CinemaRoomVo> addOuterRingSeat(Long roomId, String seatStyle, String seatMark);
	/**
	 * �޸�cinemaRoom����ֵ
	 * @param userid ����Ϊ��
	 * @param roomid
	 * @param properties
	 * @param values
	 * @return
	 */
	ResultCode<CinemaRoomVo> updateCinemaRoomProperties(Long userid, Long roomid, String[] properties, Serializable[] values);
	/**
	 * ����cinemaRoom����
	 * @param userid ����Ϊ��
	 * @param roomid
	 * @param dataMap
	 * @return
	 */
	ResultCode<CinemaRoomVo> saveOrUpdateCinemaRoom(RequestParamVo paramVo);
	/**
	 * Ӱ����Ч��������
	 * @return
	 */
	ResultCode<String> updateCinemaRoomData();
	/**
	 * �޸�cinemaRoom����
	 * @param paramVo
	 * @return
	 */
	ResultCode<String> updateRoom(RequestParamVo paramVo);
		
	/**
	 * ����TicketRoom����CinemaRoom
	 * @param cinemaid
	 * @return
	 */
	ResultCode updateCinemaRoomByTicketRoom(Long cinemaid);
}
