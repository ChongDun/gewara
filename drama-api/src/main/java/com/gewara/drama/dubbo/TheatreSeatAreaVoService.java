package com.gewara.drama.dubbo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DisQuantityVo;
import com.gewara.drama.vo.OpenTheatreSeatVo;
import com.gewara.drama.vo.TheatreFieldVo;
import com.gewara.drama.vo.TheatreSeatAreaVo;
import com.gewara.drama.vo.TheatreSeatPriceVo;
import com.gewara.drama.vo.cmd.AreaSeatParamsVo;
import com.gewara.drama.vo.cmd.ItemSeatMapVo;

public interface TheatreSeatAreaVoService {
	
	ResultCode<TheatreFieldVo> getTheatreFieldById(Long id);
	
	ResultCode<TheatreSeatPriceVo> getTheatreSeatPriceById(Long id);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByIds(Long ... ids);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByIdList(Collection<Long> idList);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByDpid(Long dpid);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByAreaid(Long areaid);
	
	ResultCode<TheatreSeatAreaVo> getTheatreSeatAreaListById(Long id);
	
	ResultCode<List<TheatreSeatAreaVo>> getTheatreSeatAreaListByIds(Long ... ids);
	
	ResultCode<List<TheatreSeatAreaVo>> getTheatreSeatAreaListByIdList(List<Long> idList);
	
	ResultCode<List<TheatreSeatAreaVo>> getTheatreSeatAreaListByDpid(Long dpid);
	
	ResultCode<List<DisQuantityVo>> getDisQuantityListByDpid(Long dpid);
	
	ResultCode<DisQuantityVo> getDisQuantityById(Long id);
	
	ResultCode<Map<Long, List<String>>> getAreaRemainRemotePriceByDpid(Long dpid);

	ResultCode<ItemSeatMapVo> getChooseSeat(AreaSeatParamsVo paramsVo);
	
	/**
	 * ��֤����
	 * @param areaid
	 * @param seatLabel
	 * @return
	 */
	ResultCode<List<OpenTheatreSeatVo>> checkSeatLableByAreaid(Long areaid, String seatLabel);
	
	/**
	 * ���ݼ۸�ID�Զ�ѡ��
	 * @param tspid �۸�ID
	 * @param num ����
	 * @param reverse �Ƿ���ѡ��
	 * @param best	�Ƿ��ÿ���м�ѡ��
	 * @return
	 */
	ResultCode<List<OpenTheatreSeatVo>> getAutoSeat(Long tspid, Integer num, boolean serial);
}
