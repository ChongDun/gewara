package com.gewara.movie.api.service.admin;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;

public interface CinemaPriceTierAdminVoService {
	
	/**
	 * ����ӰԺid��ѯӰԺ�۸�����
	 * @param cinemaId ӰԺid
	 * @return
	 */
	ResultCode<Map> getCinemaPriceTierByCinemaId(Long cinemaId);
	
	/**
	 * ����ӰԺid��ѯӰԺ�۸������б�
	 * @param cinemaId ӰԺid
	 * @return
	 */
	ResultCode<List<Map>> getCinemaPriceTierListByCinemaId(Long cinemaId);
	
	/**
	 * ����ӰԺid�б��ѯӰԺ�۸�����
	 * @param cinemaId ӰԺid
	 * @return
	 */
	ResultCode<List<Map>> getCinemaPriceTierByCinemaIdList(List<Long> cinemaIdList);
	
	
	/**
	 * ���ݳ��б����ѯӰԺ�۸�����
	 * @param cityCode
	 * @return
	 */
	ResultCode<List<Map>> getCinemaPriceTierByCityCode(String cityCode);
	
	/**
	 *���ݳ��б����ѯӰԺ�۸����Ͳ�����
	 *@param cityCode ���б���
	 * @return
	 */
	ResultCode<List<Map>> getCinemaPriceTierByCityCodeAsc(String cityCode);
	
	/**
	 * ����cinemaIdɾ��ӰԺ�۸�����
	 * @param cinemaId
	 * @return
	 */
	ResultCode removeCinemaPriceTierByCinemaId(Long cinemaId);
	
	
	/**
	 * ����ӰԺ�۸����� CinemaId
	 * @param cinemaPriceTier
	 */
	ResultCode addCinemaPriceTierByCinemaId(Map cinemaPriceTier);
	
	/**
	 * ����ӰԺ�۸�����  _id
	 * @param cinemaPriceTier
	 */
	ResultCode addCinemaPriceTierBySystemId(Map cinemaPriceTier);
	
	/**
	 * ����/����ӰԺ�۸�����
	 */
	ResultCode saveOrUpdateByCinemaId(Map cinemaPriceTier);

}
