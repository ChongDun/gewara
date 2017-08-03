package com.gewara.movie.api.service.star;

import java.util.List;
import java.util.Map;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.MovieVo;
import com.gewara.movie.vo.star.CastPictureVo;
import com.gewara.movie.vo.star.CastProfileVo;
import com.gewara.movie.vo.star.GlossaryBaseInfoVo;
import com.gewara.movie.vo.star.WorksStaffVo;

/**
 * Ӱ����ز���dubbo
 * @author Administrator
 *
 */
public interface StarVoService {
	
	ResultCode<List<WorksStaffVo>> getWorksStaffList(String tag,Long mid,int from ,int maxnum);
	ResultCode<List<GlossaryBaseInfoVo>> getGlossaryBaseInfoListByCastIdInfoType(final Long castid, final String infotype);
	/**
	 * ��������ID�����������
	 * @return CastProfileVo
	 */
	ResultCode<CastProfileVo> getCastProfileById(Long pid);
	ResultCode<List<CastPictureVo>> getCastPictureListByRelatedid( Long relatedid, int from, int maxnum);
	/**
	 * ���������Ӧ�������б�
	 */
	ResultCode<List<GlossaryBaseInfoVo>> getPersonTypeById(Long pid);
	
	/**
	 * ��ȡ������Ӱ�ĵ�Ӱ��Ӱ�˲��ݣ�
	 */
	ResultCode<List<MovieVo>> getMovieListByCastProfileId(Long pid, String citycode);
	
	/**
	 * ��ȡӰ�˵�ϲ����
	 */
	ResultCode<Long> getPersonCollectCountsById(Long pid);
	
	/**
	 * ����Ӱ�˵�ϲ����
	 */
	ResultCode addPersonCollectCountsById(Long pid, Long num);
	/**
	 * @param staridList
	 * @return
	 */
	ResultCode<Map<Long, CastProfileVo>> getStardetail(List<Long> staridList);
	/**
	 * @param movieidList
	 * @return
	 */
	ResultCode<Map<Long,List<CastProfileVo>>> getStarByIdList(List<Long> movieidList);
	/**
	 * ��ȡpicwidth is nullӰ��ͼƬ�б�
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CastPictureVo>> getCastPictureList(int from, int maxnum);
	/**
	 * ͨ��movieid ��ȡWorksStaffVo�б�
	 * @param workstype ��Ʒ����
	 * @return
	 */
	ResultCode<List<WorksStaffVo>> getWorksStaffListByMovieId(Long movieId);
	/**
	 * �����Ӱ��ͼƬ
	 * @param paramVo
	 */
	ResultCode saveOrUpdateCastPicture(RequestParamVo paramVo);
}
