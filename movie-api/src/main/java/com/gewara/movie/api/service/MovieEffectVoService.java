package com.gewara.movie.api.service;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.EffectInfoVo;

public interface MovieEffectVoService {
	ResultCode<List<EffectInfoVo>> getEffectInfoListByMovieId(Long movieid);
	ResultCode<Long> getWatchMovieCountByMidEffect(Long movieid,String effect);
	/**
	 * ��ѯ�û��ۿ�������Ч�ļ���
	 * ע����Ч������ÿ����Ч��ͳһ��ʾ������IMAX2D,IMAX3D��ͳһ��ʾ����IMAX
	 * @param memberid
	 * @return
	 */
	ResultCode<List<String>> getEffectsByMemberid(Long memberid);
	ResultCode<List<String>> getCityEffectUnifysByCitycode(String citycode);
	ResultCode<Map<String,Map<String,String>>> getMovieEffectMap();
	
	/**
	 * ��ȡ��Ӱ��ЧͼƬ
	 * @param mobilePath
	 * @param citycode
	 * @param movieid
	 * @param isIphone
	 * @return
	 */
	ResultCode<Map<String, Object>> getMovieIcon(String mobilePath, String citycode, Long movieid, boolean isIphone);
	
}
