package com.gewara.content.api;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.content.vo.GewaCommendVo;
import com.gewara.content.vo.HeadInfoVo;

public interface GewaCommendVoService {

	ResultCode<List<Map>> getGewaCommendList(String citycode, String signname, int from, int maxnum);
	/**
	 * ��ѯ�Ƽ�����
	 * @param citycode���д���
	 * @param signname ����
	 * @param parentid 
	 * @param tag	���
	 * @param isGtZero �Ƿ����0
	 * @param from	��ʼ
	 * @param maxnum	����
	 * @param isActivity �Ƿ��ж�����Ч���� starttime>=curtime<=stoptime
	 * @return
	 */
	ResultCode<List<GewaCommendVo>> getGewaCommendListByWithActive(String citycode, String signname, Long parentid, String tag, boolean isGtZero, boolean isActivity, int from, int maxnum);
	/**
	 * ��ѯ�Ƽ�����
	 * @param citycode���д���
	 * @param signname ����
	 * @param parentid 
	 * @param tag	���
	 * @param isGtZero �Ƿ����0
	 * @param from	��ʼ
	 * @param maxnum	����
	 * @param isActivity �Ƿ��ж�����Ч���� starttime>=curtime<=stoptime
	 * @param relatedid ����ID
	 * @return
	 */
	ResultCode<List<GewaCommendVo>> getGewaCommendListByActiveRealtedid(String citycode, String signname, Long relatedid, Long parentid, String tag, boolean isGtZero, boolean isActivity, int from, int maxnum);
	/**
	 * ��ѯ�Ƽ�����
	 * @param citycode
	 * @param signname
	 * @param parentid
	 * @param tag
	 * @param isGtZero
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaCommendVo>> getGewaCommendListByTag(String citycode, String signname, Long parentid,String tag, boolean isGtZero, int from, int maxnum);
	ResultCode<List<Map>> getGewaCurCommendList(String citycode, String signname, int from, int maxnum);
	/**
	 * ��ȡ�����Ƽ�
	 * @param citycode
	 * @param signname
	 * @param parentid
	 * @param tag
	 * @param isGtZero
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<GewaCommendVo>> getAllGewaCommendList(String citycode, String signname, Long parentid, String tag, boolean isGtZero, int from, int maxnum);
	/**
	 * key=relatedid+tag value=videoCount
	 */
	ResultCode<Map<String, Integer>> getVideoCount();
	/**
	 * key=relatedid+tag value=commentCount
	 */
	ResultCode<Map<String, Integer>> getCommentCount();
	/**
	 * key=relatedid+tag value=commentCount
	 */
	ResultCode<Map<String, Integer>> getPictureCount();
	/**
	 * ��ȡ��ҳ��ͷ
	 * @param gewaCity
	 * @return
	 */
	ResultCode<HeadInfoVo> getIndexHeadInfo(String citycode);
	/**
	 * ����Id�����ͷ��Ϣ
	 * @param id
	 * @return
	 */
	ResultCode<HeadInfoVo> getHeadInfoById(Long id);
	/**
	 * ���walaCommend��Ϣ
	 * @param citycode
	 * @return
	 */
	ResultCode<GewaCommendVo> getMovieWalaGewaCommend(String citycode);
}
