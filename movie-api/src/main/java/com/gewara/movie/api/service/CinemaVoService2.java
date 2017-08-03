package com.gewara.movie.api.service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaProfileVo;
import com.gewara.movie.vo.CinemaRoomVo;
import com.gewara.movie.vo.CinemaVo;
import com.gewara.movie.vo.common.EntityClobVo;
import com.gewara.movie.vo.partner.SearchCinemaCommandVo;

public interface CinemaVoService2 {
	/**
	 * ��ȡӰԺ��Ϣ
	 * @param cinemaids
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByIdList(List<Long> idList);
	
	/**
	 * ���ݳ��д����ȡӰԺ�б� 
	 * @param citycode
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCitycode(String citycode);
	
	/**
	 * ����id��ѯӰԺ
	 * ע�⣺�÷���ֻ����avatar jmsͬ��Cinema�����á�����ֱ�Ӳ�ѯMysql���ݿ⣬���߻��棬����ʹ�á�
	 * @param cinemaId
	 * @return
	 */
	ResultCode<CinemaVo> getCinemaByIdWithOutCache(Long cinemaId);
	
	/**
	 * ����id��ѯӰԺ�ſ�
	 * ע�⣺�÷���ֻ����avatar jmsͬ��CinemaProfile�����á�����ֱ�Ӳ�ѯMysql���ݿ⣬���߻��棬����ʹ�á�
	 * @param cinemaId
	 * @return
	 */
	ResultCode<CinemaProfileVo> getCinemaProfileByIdWithOutCache(Long cinemaId);
	
	/**
	 * ��ȡӰԺ�ſ�
	 * @param cinemaid
	 * @return
	 */
	ResultCode<CinemaProfileVo> getCinemaProfileById(Long cinemaid);
	
	/**
	 * ��ѯӰԺ��ϸ
	 * @param cinemaid
	 * @return
	 */
	ResultCode<CinemaVo> getCinemaById(Long cinemaid);
	
	/**
	 * ��ѯӰԺ����
	 * @param cinemaid
	 * @return
	 */
	ResultCode<EntityClobVo> getCinemaEntityClob(Long cinemaId);
	
	/**
	 * ����ӰԺ����
	 * @param cinemaId
	 * @param content
	 * @return
	 * @author leo
	 * @addTime 2016��9��22������2:49:44
	 */
	ResultCode saveCinemaEntityClob(Long cinemaId, String content);
	
	/**
	 * ��ѯӰ��ID����
	 * @param cinemaid
	 * @param ctype
	 * @return
	 */
	ResultCode<List<Long>> getRoomIdListByCinemaAndCtype(long cinemaId,String ctype);
	
	/**
	 * ����Ӱ��ID��ѯӰ����ϸ
	 * @param cinemaRoomId
	 * @return
	 */
	ResultCode<CinemaRoomVo> getCinemaRoomById(long cinemaRoomId);
	/**
	 * ����Ӱ����Ų�ѯӰ��
	 * @param cinemaId
	 * @param roomnum
	 * @return
	 */
	ResultCode<CinemaRoomVo> getRoomByRoomnum(Long cinemaId, String roomnum);
	/**
	 * ����Ӱ�����Ʋ�ѯ
	 * @param cinemaId
	 * @param roomname
	 * @return
	 */
	ResultCode<CinemaRoomVo> getRoomByRoomname(Long cinemaId, String roomname);
	/**
	 * ��ȡ���������ĵ�Ӱ
	 * @param citycode	����
	 * @param movieIds	��ӰID����
	 * @return �����а���������map��Key:��ӰID��value:jianmianhui
	 */
	ResultCode<Map<Long,String>> getMovieInfoByIds(String citycode, List<Long> movieIds);
	/**
	 * ��ȡӰԺ�Ƿ����Ʊ���Զ���Ʊֽ��ȡ���ա���������Ϣ
	 * @param cinemas	ӰԺ����
	 * @param citycode	���д���
	 * @param movieid	��ӰID
	 * @return ӰԺ��ӰԺ�����ķ���MAP��key:ӰԺID��value:�����б�
	 */
	ResultCode<Map<Long,List<String>>> getCinemaOtherInfo(List<CinemaVo> cinemas,String citycode, Long movieid);
	
	/**
	 * ����CITYCODE,MOVIEID,PLAYDATE��ѯӰԺ��character
	 * @param cinemaId
	 * @return
	 */
	ResultCode<Map<Long,List<String>>> getCinemaRoomCharacter(String citycode, Long movieid, Date playdate);
	
	/**
	 * @Description: ��ѯӰԺ��Character
	* @param cinemaIds ӰԺ�б�
	* @param citycode
	* @param movieid
	* @param playdate
	* @return ResultCode<Map<Long,List<String>>>  
	*
	* @date 2016��9��22�� ����10:55:00
	 */
	ResultCode<Map<Long,List<String>>> getCinemaRoomCharacter(List<Long> cinemaIds,String citycode, Long movieid, Date playdate);
	
	/**
	 * ��ȡӰԺ���ڷ�ӳ�ֶ�
	 * @param cinemaIds	ӰԺ�б�
	 * @param mid	��ӰID
	 * @param playDate	����
	 * @return
	 */
	ResultCode<Map<Long,String>> getCinemaPlayText(List<Long> cinemaIds,Long mid,Date playDate);
	/**
	 * ��ȡӰ���б�
	 * @param roomIds
	 * @return
	 */
	ResultCode<Map<Long,CinemaRoomVo>> getCinemaRoomByRoomIds(List<Long> roomIds);
	/**
	 * ����ӰԺID��ѯ�Ƿ�֧����Ʊ
	 * @param cinemaId
	 * @return
	 */
	ResultCode cinemaCanRefund(Long cinemaId);
	/**
	 * ��ȡ��ЧӰԺ
	 * 
	 * @param citycode
	 * @return
	 * @author leo
	 * @addTime 2014��6��24������1:39:16
	 */
	ResultCode<Map<String,List<CinemaVo>>> getCharacteristicCinemaRoom(String citycode);
	ResultCode<Map<String, List<Map>>> getCinemaMapListByCitycode(String citycodes, String hasOpiCount, int from, int maxnum);
	
	/**
	 * ����filedname��filedvalue��ѯӰԺ��Ϣ
	 * @param fieldname
	 * @param fieldvalue
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByFiled(String fieldname, Serializable fieldvalue);
	/**
	 * ��������ģ��ƥ�䣬��ѯӰԺ��Ϣ
	 * @param name
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListLikeName(String name);
	/**
	 * ��ѯӰ����Ϣ
	 * @param roomIdList
	 * @return
	 */
	ResultCode<List<CinemaRoomVo>> getCinemaRoomListByIdList(List<Long> roomIdList);
	/**
	 * ������ƱӰԺ�б���̨��
	 * @param citycode
	 * @return
	 */
	ResultCode<List<CinemaVo>> getBookingCinemaListByCitycodeNoCache(String citycode);
	/**
	 * ����ӰԺid����ѯӰ����Ϣ
	 * @param cinemaid
	 * @return
	 */
	ResultCode<List<CinemaRoomVo>> getCinemaRoomListByCinemaId(Long cinemaid);
	/**
	 * ����filedname��filedvalue��ѯӰ����Ϣ
	 * @param fieldname
	 * @param fieldvalue
	 * @return
	 */
	ResultCode<List<CinemaRoomVo>> getCinemaRoomListByFiled(String fieldname, Serializable fieldvalue);
	/**
	 * ����filedname��filedvalue��ѯӰԺ��Ϣ
	 * @param fieldname
	 * @param fieldvalue
	 * @return
	 */
	ResultCode<List<CinemaProfileVo>> getCinemaProfileListByFiled(String fieldname, Serializable fieldvalue);
	/**
	 * ����idList����ѯCinemaProfile
	 * @param idList
	 * @return
	 */
	ResultCode<List<CinemaProfileVo>> getCinemaProfileListByIdList(List<Long> idList);
	/**
	 * ��ѯ�رյ�Ӱ����Ϣ
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CinemaRoomVo>> getCloseCinemaRoomListForPage(int from, int maxnum);
	/**
	 * ���ݳ��д�����ӰԺid��ӰԺ����
	 * @param citycode
	 * @return
	 */
	ResultCode<List<Map>> getCinemaidAndNameDataListMapByCityData(String citycode);
	/**
	 * �������ӰԺid��ӰԺ����
	 * @return
	 */
	ResultCode<List<Map>> getAllCinemaidAndNameDataListMap();
	/**
	 * ����cinemaProfile��status��ѯCinemaList
	 * @param status
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCPStatus(String status);
	/**
	 * ����cinemaProfile��opentype��ѯCinemaList
	 * @param opentype
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCPOpenType(String opentype);
	/**
	 * ���ӰԺ��Ч�ͳ���
	 * @return
	 */
	ResultCode<List<Map>> getCinemaCharacteristicAndcitycodeDataMap();
	/**
	 * ����ӰԺ���ƣ���ѯӰԺid
	 * @param cinemaname
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListLikeName(String cinemaname);
	/**
	 * ���ӰԺid
	 * @param openPriority
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByOpenPriority(String openPriority);
	/**
	 * ���ӰԺid
	 * @param openPriority
	 * @param citycodeList
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByOpenPriorityAndCityCodeList(String openPriority, List<String> citycodeList);
	/**
	 * ���ӰԺid
	 * @param bookingStatus
	 * @param cidList ����Ϊ��
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByBooking(String bookingStatus, List<Long> cidList);
	/**
	 * ���ݳ���code����ѯcinema
	 * @param citycode
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCityCodeListProfileNotNull(List<String> citycodeList);
	/**
	 * ��ѯӰԺidList
	 * @param bookingStatus
	 * @param citycodeList
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByCitycodeAndBookingStatus(String bookingStatus, List<String> citycodeList);
	/**
	 * ���profileIdList
	 * @param openProiorityList
	 * @return
	 */
	ResultCode<List<Long>> getCinemaProfileIdListByOpenProiorityList(List<String> openProiorityList);
	
	ResultCode<CinemaVo> getCinemaByUkey(String ukeyName, Serializable ukeyValue);
	/**
	 * �����Ƿ񿪷Ų�ѯӰԺ�б�����mark����
	 * @param booking
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByBookingOrderMark(String booking);
	/**
	 * ��������countycode ���Ƿ񿪷Ź�Ʊ��ѯ�б�
	 * @param booking
	 * @param countycode
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCountycode(String countycode);
	/**
	 * ������ɫӰ�����Ͳ�ѯ��ɫӰ��ӰԺid�б�
	 * @param cType
	 * @param citycode
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByRoomCharacteristic(String cType,String citycode);
	/**
	 * ��ѯ�ɶ�ƱӰԺ����
	 * @param citycode
	 * @param countycode
	 * @param indexareacode
	 * @param cname
	 * @return
	 */
	ResultCode<Integer> getTicketCinemaCount(String citycode, String countycode,String indexareacode, String cname);
	/**
	 * ���ݳ��к������ѯ����ӰԺ
	 * @param citycode
	 * @param countycode
	 * @return
	 */
	ResultCode<List<Long>> getBookingCinemaIdList(String citycode, String countycode);
	/**
	 * ��ɫӰ����ӰԺͳ��
	 * IMAX��10��   4D 11�� ������
	 * @param citycode
	 * @return
	 */
	ResultCode<Map<String,Integer>> getRoomFeatureCinema(String citycode);
	/**
	 * ��ѯ����ӰԺ����
	 * @param citycode
	 * @return
	 */
	ResultCode<Integer> getCinemaCountByCitycode(String citycode);
	/**
	 * �������� ��ʶ��ȡӰԺ�б�
	 * @param citycode
	 * @param countycode
	 * @param filmtag
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCitycodeAndCitycodeForFilm(String citycode, String countycode, String filmtag);
	/**
	 * ��ȡ����Ӱ������Ч����Ӧ
	 * @param ridList
	 * @return
	 */
	ResultCode<Map<Long, String>> getCtypeMapByRoomIdList(List<Long> ridList);
	ResultCode<List<Long>> getCinemaIdListBySearchCmd(SearchCinemaCommandVo cmdVo, String citycode);
	/**
	 * ĳ��ӰԺ����ɫӰ������
	 * @param cinemaId
	 * @return
	 */
	ResultCode<Map<Long, String>> getCharacteristicCinemaRoomByCinema(Long cinemaId);
	/**
	 * ���Թ����յ�ӰԺID
	 * @return
	 */
	ResultCode<List<Long>> getBuyInsureCinemaIdList();
	/**
	 * ���ݸ���ʱ���ѯӰԺ
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getCinemaListByUpdatetime(Timestamp updatetime, int from, int maxnum);
	/**
	 * �����ȶȲ�ѯӰԺ
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByHotvalue(String citycode, int from, int maxnum);
	/**
	 * ���������ѯӰԺ�б����յ����������
	 * @param countycode
	 * @param orderField
	 * @param asc
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCountyCodeOrderClick(String countycode,String orderField, boolean asc);
	/**
	 * ���ݸ���ʱ���ȡ��Ҫ�ֶε�ListMap
	 * @param fields
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Map>> getFieldsMapByUpdate(String fields, Timestamp updatetime, int from, int maxnum);
	/**
	 * ���ݳ��д����ѯӰԺ��Ϣ����ҳ��
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCitycodeForPage(String citycode, int from, int maxnum);
	ResultCode<CinemaVo> updateCinemaProperties(Long cinemaId, String[] properties, Serializable[] values);
	/**
	 * ��ȡӰԺ��Ч
	 * @param cinemaId
	 * @return
	 */
	ResultCode<String> getCinemaCharacteristicByCinemaId(Long cinemaId);
	/**
	 * ���ݳ��л�ȡ��������ӰԺ
	 * @param citycode
	 * @return
	 */
	ResultCode<String> getSearchCinemaByCitycode(String citycode);
	/**
	 * ���������ѯӰԺ�б�
	 * @param countycode
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByCountycode(String countycode);
	/**
	 * ������Ȧ��ѯӰԺ�б�
	 * @param indexareacode
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByIndexareacode(String indexareacode);
	/**
	 * ���ݵ�����·��ѯӰԺ�б�
	 * @param citycode
	 * @param lineId
	 * @return
	 */
	ResultCode<List<Long>> getCinemaIdListByLineId(String citycode, String lineId);
		
	/**
	 * ��ȡ��Ҫ������λͼ��Ӱ��</br>
	 * updateEmpty,from���봫һ��ֵ�����򷵻ؿ�
	 * @param updateEmpty
	 * @param from
	 * @param citycode
	 * @return
	 * @author leo
	 * @addTime 2016��9��19������11:46:15
	 */
	public ResultCode<List<CinemaRoomVo>> getBatchUpdateRoomList(String updateEmpty, Date from, String citycode);
		
	/**
	 * ˢ��Ӱ������</br>
	 * only refreshRoomList
	 * @param cinemaId
	 * @param updateTime
	 * @return
	 * @author leo
	 * @addTime 2016��9��18������6:55:39
	 */
	ResultCode refreshRoomList(Long cinemaId);
	
	/**
	 * ��ѯ����ӰԺ����
	 * @return
	 */
	ResultCode<Integer> getCinemaCount();
	
	/**
	 * @param userid 0LΪϵͳ����
	 * @param roomid
	 * @param properties
	 * @param values
	 * @return
	 */
	public ResultCode<CinemaRoomVo> updateCinemaRoomProperties(Long userid, Long roomid, String[] properties, Serializable[] values);
	
	/**
	 * ����ָ��ʱ���ȡID�б�
	 * @param updatetime
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<Long>> getCinemaProfileIdListByUpdatetime(Timestamp updatetime, int from, int maxnum);
	
	/**
	 * ��ѯ����CinemaProfile����
	 * @return
	 */
	ResultCode<Integer> getCinemaProfileCount();
}
