package com.gewara.drama.dubbo;

import java.sql.Timestamp;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.TheatreProfileVo;
import com.gewara.drama.vo.TheatreRoomVo;
import com.gewara.drama.vo.TheatreToDramaVo;
import com.gewara.drama.vo.TheatreVo;

public interface TheatreVoService {
	
	/**
	 * ͨ�����д����ѯ�ǳ�����Ϣ
	 * @param citycode
	 * @param order
	 * @param asc
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreList(String citycode, String order, boolean asc, int from, int maxnum);
	
	/**
	 * ���ݳ��д����ȡ�ɹ�Ʊ�����б�(�ɹ�Ʊ)
	 * @param citycode
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreList(String citycode);
	
	/**
	 * ����id��ȡ�ݳ�����
	 * @param placeId
	 * @return
	 */
	ResultCode<TheatreVo> getTheatreById(Long id);
	
	ResultCode<List<TheatreVo>> getTheatreListByIdList(Long ... id);

	/**
	 * ����ʱ���ѯ��������
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreListByUpdatetime(Timestamp updatetime, int from, int maxnum);
	
	/**
	 * ���ݳ��б�������Ŀ�����ѯ�����ڵĳ���
	 * @param citycode
	 * @param dramaid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreListByCitycodeAndDramaid(String citycode, Long dramaid, int from, int maxnum);
	
	/**
	 * ��ѯ�����ݳ���Ŀ��Ϣ
	 * @param theatreid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreToDramaVo>> getTheatreToDramaListByTheatreid(Long theatreid, int from, int maxnum);
	
	ResultCode<List<TheatreToDramaVo>> getTheatreToDramaListByDramaid(Long dramaid);
	
	/**
	 * ����hotvalue��ѯtheatre�б�
	 * @param hotvalue
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreListByHotvalue(String citycode, Integer hotvalue, int from, int maxnum);
	
	ResultCode<TheatreVo> getTheatreByName(String theatreName);
	
	ResultCode<Integer> getTheatreCountByBooking(String booking);
	
	ResultCode<TheatreRoomVo> getTheatreRoomById(Long id);
	
	ResultCode<TheatreProfileVo> getTheatreProfileById(Long theatreid);
	
	/**
	 * ����citycode���ݳ�����ʱ���offsetDaysƫ��������ѯtheatre�б�
	 * @param citycode
	 * @param offsetDays
	 * @return
	 */
	ResultCode<List<TheatreVo>> getTheatreListByCityCodeAndEndTime(String citycode, int offsetDays);
	
	ResultCode<List<Long>> getTheatreIdList(String citycode, Long dramaid, boolean isBooking);
}
