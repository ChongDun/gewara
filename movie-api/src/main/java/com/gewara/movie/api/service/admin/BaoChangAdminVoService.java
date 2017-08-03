package com.gewara.movie.api.service.admin;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.baochang.BaoChangMpiInfoVo;
import com.gewara.movie.vo.baochang.BaoChangOrderInfoVo;

public interface BaoChangAdminVoService {
	/**
	 * ���������Ϣ
	 * @param cinemaid
	 * @param roomid
	 * @param params
	 * @return
	 */
	ResultCode saveOrUpdateBaoChangCinemaInfo(Long cinemaid, Long roomid, 
			Map<String, String> cinemaRoomParams, List<Map<String, String>> baoChangTimeList);
	/**
	 * ɾ������Ӱ����Ϣ
	 * @param cinemaid
	 * @param roomid
	 * @return
	 */
	ResultCode deleteBaoChangCinemaRoom(Long cinemaid, Long roomid);
	/**
	 * ɾ������ӰԺ��Ϣ
	 * @param cinemaid
	 * @return
	 */
	ResultCode<List<Long>> deleteBaoChangCinema(Long cinemaid);
	/**
	 * �����������ID��״̬
	 * @param id
	 * @param mpid
	 * @param status
	 * @return
	 */
	ResultCode<BaoChangOrderInfoVo> saveMpidToBaoChangOrder(Long id, Long mpid, String status, String remark, Integer successPrice);
	/**
	 * �����������ģ��
	 * @param tag
	 * @param content
	 * @return
	 */
	ResultCode saveBaoChangMsgContent(String mobileType, String tag, String content);
	/**
	 * ˢ�°�����Ϣ����
	 * @param cinemaid
	 * @return
	 */
	ResultCode refreshBaoChangInfoCacheByCinemaid(Long cinemaid);
	/**
	 * ˢ�°�����Ϣ����
	 * @param cinemaid
	 * @param roomid
	 * @return
	 */
	ResultCode refreshBaoChangInfoCacheByCinemaidAndRoomid(Long cinemaid, Long roomid);
	/**
	 * �������������Ϣ
	 * @param mpid
	 * @return
	 */
	ResultCode saveOrUpdateBaoChangMpiInfo(Long mpid);
	/**
	 * ɾ������������Ϣ
	 * @param cinemaid
	 * @param mpid
	 * @return
	 */
	ResultCode<BaoChangMpiInfoVo> deleteBaoChangMpiInfo(Long cinemaid, Long mpid);

}
