package com.gewara.api.matrix;

import java.util.List;

import com.gewara.api.vo.ResultCode;

/**
 * Matrix��Ӱҵ��ӿ�
 * @author jeremylei
 * @date 2016/05/16
 */
public interface MatrixMoviceService {
	
	/**
	 * ���ݵ�Ӱid����ȡ�Ƽ��ĵ�Ӱ�б�
	 * @param movieid
	 * @param topN
	 * @return
	 */
	public ResultCode<List<Long>> recommendMoviesTopN(Long movieid,Integer topN);
	
	/**
	 * ���ݵ�Ӱid����ȡ�Ƽ��ĵ�Ӱ�б�
	 * @param movieid
	 * @return
	 */
	public ResultCode<List<Long>> recommendMoviesTop10(Long movieid);
}
