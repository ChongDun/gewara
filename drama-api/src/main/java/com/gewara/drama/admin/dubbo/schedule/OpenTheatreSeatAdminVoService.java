package com.gewara.drama.admin.dubbo.schedule;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.OpenDramaItemVo;
import com.gewara.drama.vo.OpenTheatreSeatVo;
import com.gewara.drama.vo.TheatreSeatPriceVo;

public interface OpenTheatreSeatAdminVoService {
	/**
	 * ���ų��θ��ƻ���������λͼ
	 * @param userid
	 * @param odi
	 * @param seatArea
	 * @param room
	 * @return
	 */
	ResultCode<List<OpenTheatreSeatVo>> copyTheatreRoomSeat(Long odid, Long areaid, Long roomid);


	/**
	 * ������λ�۸�
	 * @param priceid
	 * @param seatid
	 * @param userid
	 * @return
	 */
	ResultCode<TheatreSeatPriceVo> updateOpenTheatreSeatByPriceid(Long priceid, Long seatid);

	/**
	 * ����������λ�۸�
	 * @param priceid
	 * @param rankno
	 * @param lineno
	 * @param userid
	 * @return
	 */
	ResultCode<TheatreSeatPriceVo> batchUpdateOpenTheatreSeatByPriceid(Long priceid, String rankno, String lineno);

	ResultCode<OpenTheatreSeatVo> lockSeat(Long seatId, String locktype, String lockreason);
	ResultCode<OpenTheatreSeatVo> unLockSeat(Long seatId);
	ResultCode<OpenDramaItemVo> batchUnLockSeat(Long areaid, String lockline, String lockrank);
	ResultCode<OpenDramaItemVo> batchLockSeat(Long areaid, String locktype, String lockreason, String lockline, String lockrank);

	/**
	 * ͨ�������Ų�ѯ��λ��Ϣ
	 * @param areaid
	 * @return
	 */
	ResultCode<List<OpenTheatreSeatVo>> getOpenTheatreSeatByAreaid(Long areaid);

	/**
	 * ��ѯ��̨������λ��Ϣ
	 * @param areaid
	 * @param forceRefresh
	 * @return
	 */
	ResultCode<Map<String /*seatLine:seatRank*/, Long/*tspid*/>> getLockSeatMapByAreaid(final Long areaid);

	/**
	 * ��ѯ��λ����
	 * @param areaid
	 * @param forceRefresh
	 * @return
	 */
	ResultCode<Map<String/*seatLine:seatRank*/, Long/*tspid*/>> getSeatMapByAreaid(final Long areaid);

	ResultCode clearSeatMapByAreaid(Long areaid);
	
	ResultCode reAreaSeat(Long itemid);
}
