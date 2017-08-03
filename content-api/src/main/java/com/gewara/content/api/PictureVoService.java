package com.gewara.content.api;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.content.vo.PictureVo;

public interface PictureVoService {
	
	ResultCode<List<PictureVo>> getPictureList(String tag, Long relatedid, int from, int maxnum);
	/**
	 * ʹ�û���(����ͬ������getPictureList )
	 * @param tag
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<PictureVo>> getPictureListUseCache(String tag, Long relatedid, int from, int maxnum);
	/**
	 * ��ѯͼƬ����
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode<Integer> getPictureCount(String tag, Long relatedid);
	
	/**
	 * ������Ŀ����ͼƬ��Ϣ
	 * @param memberid
	 * @param activityid
	 * @param fileName
	 * @param realName
	 * @return
	 */
	ResultCode saveActivityPicture(Long memberid, Long activityid, String fileName, String realName);
	
	ResultCode<PictureVo> getPicture(Long pid);
	
	/**
	 * ��ȡͼƬ����
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	ResultCode<Integer> getPictureCountByRelatedid(String tag, Long relatedid);
	
	/**
	 * �õ����������ͼƬ�б� ʹ��10���ӻ���
	 * @param tag
	 * @param relatedid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<PictureVo>> getPictureListByRelatedidUseCache(String tag, Long relatedid, int from, int maxnum);
}
