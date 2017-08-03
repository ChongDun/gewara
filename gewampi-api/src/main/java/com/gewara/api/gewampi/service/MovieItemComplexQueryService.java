package com.gewara.api.gewampi.service;

import java.util.List;

import com.gewara.api.gewampi.vo.MovieItemBasicQueryRequest;
import com.gewara.api.gewampi.vo.MovieItemVo;
import com.gewara.api.vo.ResultCode;

@Deprecated
public interface MovieItemComplexQueryService {

	/**
	 * ���ݸ���������ѯ����
	 * ����ӳʱ��������
	 * ϵͳ�Զ����������10����
	 * �������պ�Ϊ��Ӱ���ṩר�Žӿ�
	 * @param request
	 * @return
	 * @author leo
	 * @addTime 2015��6��29������4:29:01
	 */
	@Deprecated
	ResultCode<List<MovieItemVo>> findByBasicQuery(MovieItemBasicQueryRequest request);
	
	/**
	 * ��ѯ��Ƭ����
	 * ϵͳ�Զ����������10����
	 * @param request
	 * @return
	 * @author leo
	 * @addTime 2015��6��30������4:04:34
	 */
	@Deprecated
	ResultCode<Integer> findCountByBasicQuery(final MovieItemBasicQueryRequest request);
	
	/**
	 * ����Ƭ��ĳ�����Է���
	 * ϵͳ�Զ����������10����
	 * @param request
	 * @return
	 * @author leo
	 * @see com.gewara.api.gewampi.service.PlayItemVoService#findCinemaIdByCharacteristic(String characteristic, String citycode, Long movieid, Date playdate)
	 * @addTime 2015��6��30������4:04:50
	 */
	@Deprecated
	ResultCode<List> findPropertyListByBasicQuery(final MovieItemBasicQueryRequest request);
	
	/**
	 * ����Ƭ��ĳ�����ԣ�ȥ�غ������
	 * ϵͳ�Զ����������10����
	 * @param request
	 * @return
	 * @author leo
	 * @addTime 2015��6��30������4:49:23
	 */
	@Deprecated
	ResultCode<Integer> findPropertyCountByBasicQuery(MovieItemBasicQueryRequest request);
}
