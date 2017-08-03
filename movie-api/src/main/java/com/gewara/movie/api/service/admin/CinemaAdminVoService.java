package com.gewara.movie.api.service.admin;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.CinemaRoomVo;
import com.gewara.movie.vo.CinemaVo;
/**
 * ��̨ӰԺ��ѯ����ֻ�к�̨���Ե���
 * @author gewara
 *
 */
public interface CinemaAdminVoService {
	/**
	 * ������ų���ӰԺID
	 * @return
	 */
	ResultCode<List<Long>> getBookingOpenCinemaIdListByCityCodes(List<String> cityCodes);
	/**
	 * ��ó���ӰԺ�б�(ID NAME)
	 * @return
	 */
	ResultCode<List<Map>> getCinemaNameAndIdListByCityCodes(List<String> cityCodes);
	/**
	 * ���ݳ��д����ѯӰԺ��Ϣ����ҳ��
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByCitycodeForPage(String citycode, int from, int maxnum);
	/**
	 * ���ݳ��д��롢���ƣ���ѯӰԺ��Ϣ
	 * @param citycode
	 * @param name
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaPlaceByName(String citycode, String name);
	/**
	 * ��ȡĳ�쿪�Ź�Ʊ��ӰԺ
	 * @param citycode
	 * @param cinemaid
	 * @param playdate
	 * @return
	 */
	ResultCode<List<CinemaVo>> getOpiCinemaList(String citycode, Long movieid, Date playdate);
	/**
	 * ����cinema����
	 * @param paramVo
	 * @param isPushSearchKey
	 * @return
	 */
	ResultCode<CinemaVo> saveOrUpdateCinema(RequestParamVo paramVo, boolean isPushSearchKey);
	/**
	 * �޸�cinema����
	 * @param cinemaId
	 * @param properties
	 * @param values
	 * @return
	 */
	ResultCode<CinemaVo> updateCinemaProperties(Long cinemaId, String[] properties, Serializable[] values);
	/**
	 * ��ѯӰԺ��Ϣ������key��citycode
	 * @param citycode
	 * @param key
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListByKeyAndCityCode(String citycode, String key);
	/**
	 * �޸�cinema�����У�������roomId
	 * @param cinemaId
	 * @param cinemaRoomId
	 * @param isAdd
	 * @return
	 */
	ResultCode<CinemaVo> updateRecommendRoom(Long cinemaId, Long cinemaRoomId, boolean isAdd);
	/**
	 * ��ѯӰԺ��Ϣ����ҳ��
	 * @param orderField
	 * @param asc
	 * @param from
	 * @param rows
	 * @return
	 */
	ResultCode<List<CinemaVo>> getCinemaListForPage(String orderField, boolean asc, int from, int rows);
	/**
	 * ����pcid
	 * @param pcidData
	 * @return
	 */
	ResultCode<LinkedList<String>> initImportCinemaPcid(String pcidData);
	/**
	 * ��ѯcinemaRoom��Ϣ
	 * @param cinemaid
	 * @param citycode
	 * @param provincecode
	 * @return
	 */
	ResultCode<List<CinemaRoomVo>> getReportCinemaRoomList(Long cinemaid, String citycode, String provincecode, Integer pageNo, Integer pageSize);
	
	ResultCode<CinemaVo> getCinemaById(Long cinemaId);
}
