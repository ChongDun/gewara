package com.gewara.drama.admin.dubbo.schedule;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.TheatreSeatPriceVo;
import com.gewara.drama.vo.cmd.TspExtCommandVo;
import com.gewara.drama.vo.schedule.TheatreSeatPriceExtVo;

public interface TheatreSeatPriceAdminVoService {
	
	ResultCode<TheatreSeatPriceVo> getTheatreSeatPriceById(Long id);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByDpid(Long dpid);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceListByAreaid(Long areaid);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceByField(String fieldname, Serializable fieldvalue);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceByIdList(List<Long> idList);
	
	/**
	 * ��̨������Ա��������
	 * @param tsp
	 * @param command
	 * @param user
	 * @return
	 * @throws ServiceException
	 */
	ResultCode correctPrice(Long tspid, TspExtCommandVo command);
	
	/**
	 * ������޸ļ۸�
	 * @param id
	 * @param dpid
	 * @param areaid
	 * @param price
	 * @param request
	 * @param user
	 * @return
	 * @throws ServiceException
	 */
	ResultCode<TheatreSeatPriceVo> updateTheatreSeatPrice(RequestParamVo paramVo);

	ResultCode<TheatreSeatPriceVo> updateTheatreSeatPrice(Long tspid, String status, Timestamp updatetime);
	
	ResultCode updateTheatreSeatPriceList(Collection<Long> tspidList, String status, Timestamp updatetime);
	
	ResultCode<Integer> getTheatreSeatPriceExtCountByDramaid(Long dramaid, Long theatreid, String correcttype, Timestamp starttime, Timestamp endtime);
	
	ResultCode<List<TheatreSeatPriceExtVo>> getTheatreSeatPriceExtList(RequestParamVo paramVo);
	
	/**
	 * ��ѯ����ʵƱ��ʱ�����δ��������Ŀ
	 * @param starttime
	 * @param endttime
	 * @return
	 */
	ResultCode<List<Long>> getOpenDramaidByPriceExt(Timestamp endttime);
	
	/**
	 * ���ݼ۸�ID��ѯ�������
	 * @param tspid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreSeatPriceExtVo>> getTheatreSeatPriceExtListByTspid(Long tspid, String correcttype, int from, int maxnum);
	
	ResultCode<Integer> getTheatreSeatPriceExtCount(Long tspid, String correcttype);
	
	ResultCode<List<TheatreSeatPriceVo>> getTheatreSeatPriceList(Long dramaid, int from, int maxnum);
	
	ResultCode<TheatreSeatPriceVo> setShowPrice(Long id, String showprice);
	
	ResultCode<TheatreSeatPriceVo> setShowRemark(Long tspid, String showremark);
	
	/**
	 * ��������򶩵���Ʊ���
	 * @param tradeno
	 * @param correcttype
	 * FIXME:��������
	 */
	ResultCode asynchCreatePriceExt(String tradeno, String correcttype);
	
	ResultCode<Map<Long /*dpid*/, List<TheatreSeatPriceVo>>> getTheatreSeatPriceMap(List<Long> dpidList, String sortFieldname);
	
	ResultCode<Map<Long /*areaid*/, List<TheatreSeatPriceVo>>> getTheatreSeatPriceMapByAreaid(List<Long> areaidList, String sortFieldname);
	
}
