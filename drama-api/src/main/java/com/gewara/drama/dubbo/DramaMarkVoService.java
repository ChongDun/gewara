package com.gewara.drama.dubbo;

import com.gewara.api.vo.ResultCode;

public interface DramaMarkVoService {
	
	/**
	 * ����tag�����ݳ���ض�������
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode saveOrUpdateMark(String tag, Long relatedid, String markname, Integer diffmark, boolean update);
	
	/**
	 * ����tag�����ݳ���ض����ͼ����
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode saveOrUpdatePoint(String tag, Long relatedid, String pointx, String pointy, String pointType);
	
	/**
	 * ����tag�����ݳ���ض����ͼ����
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode updateFirstPicture(String tag, Long relatedid, String picPath);

}
