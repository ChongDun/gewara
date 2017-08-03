package com.gewara.movie.api.service.brand;


import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.brand.BSActivityVo;

public interface BSActivityVoService {
	
	/**
	 * ��ȡ�����
	 * @param id	�ID
	 * @return
	 */
	ResultCode<BSActivityVo> getActivityDataById(Long id);
	

	/**
	 * ��������
	 * @return
	 */
	ResultCode<BSActivityVo> save(BSActivityVo activity);
	
	/**
	 * ��ѯ��б�
	 * @param citycode	����code
	 * @param actType ��б�
	 * @param
	 * @param
	 */
	ResultCode<List<BSActivityVo>> getActivityListByActType(String citycode, String actType);
	
	/**
	 * ��ѯ��б�
	 * @param citycode	����code
	 * @param
	 * @param
	 * @param 
	 */
	ResultCode<List<BSActivityVo>> getActivityList(String citycode);
	
	/**
	 * ��ѯ�������
	 * @return
	 */
	ResultCode<Integer> getActivityCount();
	
	/**
	 * ��ȡ��б�
	 * @return
	 */
	ResultCode<List<BSActivityVo>> getActivityList(int from, int to, String time);
	
	/**
	 * ɾ���
	 * @param id
	 * @return
	 */
	ResultCode deleteById(Long id);
}
