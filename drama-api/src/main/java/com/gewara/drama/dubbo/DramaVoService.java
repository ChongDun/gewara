package com.gewara.drama.dubbo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaProfileVo;
import com.gewara.drama.vo.DramaRaidersVo;
import com.gewara.drama.vo.DramaVo;
import com.gewara.drama.vo.OpenDramaItemVo;
import com.gewara.drama.vo.TheatreVo;

public interface DramaVoService {
	
	/**
	 * ���ݳ���id��ȡ�ݳ��б�
	 * @param placeId
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaList (Long placeId);
	
	/**
	 * ����id��ȡ�ݳ���Ŀ
	 * @param placeId
	 * @return
	 */
	ResultCode<DramaVo> getDramaById(Long id);
	
	/**
	 * ����id��ȡ�ݳ���Ŀ
	 * @param placeId
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByIdList(Long ... id);
	
	/**
	 * ��ĿID�Ƿ�ɹ�Ʊ
	 * @param dramaid
	 * @return
	 */
	ResultCode<Boolean> getDramaBooking(Long dramaid);
	
	/**
	 * ��ѯ��Ŀ�ļ۸�
	 * @param dramaid
	 * @return
	 */
	ResultCode<List<Integer>> getDramaPriceListByDramaid(Long dramaid);
	
	/**
	 * ����ʱ���ѯ�ݳ���Ŀ
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByUpdatetime(Timestamp updatetime, int from, int maxnum);
	
	/**
	 * �����ݳ����������ݳ�����
	 * @param dramaid
	 * @return
	 */
	ResultCode<List<DramaRaidersVo>> getDramaRaidersListByDramaid(Long dramaid);
	
	/**
	 * ��ȡ��Ŀ������Ϣ
	 * @param dramaid
	 * @return
	 */
	ResultCode<DramaProfileVo> getDramaProfileByDramaid(Long dramaid);
	
	/**
	 * ��ȡ��Ŀ������Ϣ�б�
	 * @param dramaids
	 * @return
	 */
	ResultCode<List<DramaProfileVo>> getDramaProfileByDramaidList(Long... dramaids);
	
	ResultCode<List<DramaVo>> getHotDrama(String citycode, String order, int from,int maxnum);
	
	/**
	 *  ��ѯĳ���ǹ����Ļ���
	 *  starid : ����ID
	 *  isCurrent: �Ƿ�������ӳ
	 */
	ResultCode<List<DramaVo>> getDramaListByStarid(Long starid, boolean isCurrent, int from, int maxnum);
	
	ResultCode<Integer> getDramaCountByStarid(Long starid, boolean isCurrent);
	
	ResultCode<List<DramaVo>> getFutureDramaList(String citycode, Date fromDate, int from, int maxnum);
	
	/**
	 * ��Ŀ���ƾ�ȷ��ѯ��Ŀ
	 * @param dramaName
	 * @return
	 */
	ResultCode<DramaVo> getDramaByName(String dramaName);
	
	/**
	 * ��Ŀ����ģ����ѯ��Ŀ
	 * @param dramaName
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByName(String dramaName);
	
	
	ResultCode<List<Long>> getDramaIdListByReserve();
	
	/**
	 * 
	* @Description: ���ݳ���code��ĳһ�����ڻ�ȡ��Ŀ
	* @param citycode
	* @param someDay
	* @param from maxnum
	 */
	ResultCode<List<DramaVo>> getDramaSomeDayCalendar(String citycode,Date someDay,int from,int maxnum);

	ResultCode<TheatreVo> getTheatreVoById(Long theatreid);

	ResultCode<OpenDramaItemVo> getOpenDramaItemVoById(Long dpid);

}
