package com.gewara.drama.dubbo;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.drama.vo.DramaVo;

public interface DramaOdiVoService {

	/**
	 * ���пɹ�Ʊ�ݳ���Ŀ��
	 * @param citycode
	 * @return
	 */
	ResultCode<Integer> getDramaCountByCitycode(String citycode);
	
	/**
	 * 
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByCitycode(String citycode, int from, int maxnum);
	
	ResultCode<List<Long>> getDramaIdListByCitycode(String citycode, String opentype);
	
	/**
	 * ���ݱ�Ų�ѯ�ɹ�Ʊ��Ŀ
	 * @param theatreid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<DramaVo>> getDramaListByTheatreid(Long theatreid, int from, int maxnum);
}
