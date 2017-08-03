package com.gewara.movie.api.service.admin;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gewara.api.vo.RequestParamVo;
import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.star.CastBaseRelationVo;
import com.gewara.movie.vo.star.CastPictureVo;
import com.gewara.movie.vo.star.CastProfileVo;
import com.gewara.movie.vo.star.CastWorksVo;
import com.gewara.movie.vo.star.GlossaryBaseInfoVo;
import com.gewara.movie.vo.star.MovieBaseRelationVo;
import com.gewara.movie.vo.star.WorksStaffVo;

public interface StarAdminVoService {
	
	ResultCode<CastProfileVo> saveCastProfileVoAndRelated(RequestParamVo paramVo);
	ResultCode<CastProfileVo> removeCastProfileById(Long castid);
	/**
	 * ������Ʒ���ͺ���Ʒid��ȡWorksStaffVo�б�
	 * @param workstype ��Ʒ����
	 * @param worksid ��ĿID
	 * @param castid ����ID
	 * @param stafllrole ��������Ʒ�еĽ�ɫ
	 * @param sortbyAsc �Ƿ���sortby����
	 * @return
	 */
	ResultCode<List<WorksStaffVo>> getWorksStaffList(String workstype,Long worksid,Long castid,Long stafllrole,Boolean sortbyAsc);
	
	/**
	 * ������Ʒ���ͺ���Ʒid��ȡWorksStaffVo�б�
	 * @param workstype ��Ʒ����
	 * @param worksid ��ĿID
	 * @param castid ����ID
	 * @param stafllrole ��������Ʒ�еĽ�ɫ
	 * @param sortbyAsc �Ƿ���sortby����
	 * @return
	 */
	ResultCode<List<Long>> getWorksStaffIdList(String workstype,Long worksid,Long castid,Long stafllrole,Boolean sortbyAsc);
	/** 
	 * ����
	 */
	ResultCode saveWorksStaff(RequestParamVo paramVo);
	/**
	 * ��������id�б�ɾ��������Ϣ��������
	 * @return
	 */
	ResultCode removeProfileAffiliated(List<Long> castidList);
	/**
	 * ������Ʒ���ͺ���Ʒid��ȡWorksStaffVo�б�
	 * @param castidList ����ID�б�
	 * @return
	 */
	ResultCode<List<CastProfileVo>> getCastProfileListByIdList(List<Long> castidList);
	/**
	 * ʱ���������
	 */
	ResultCode<List<CastProfileVo>> getCastProfileListFromMtime();
	
	/**
	 * ����ʱ��id
	 * @param mtimeid
	 */
	ResultCode<List<CastProfileVo>> getCastProfileListByMtimeID(String mtimeid);
	/**
	 * ��ѯcastWorks �б�
	 * @param workstype ��Ʒ����
	 * @param worksid ��ĿID
	 * @param castid ����ID
	 * @param achievement �Ƿ�ɾ���Ʒ 
	 * @return
	 */
	ResultCode<List<CastWorksVo>> getCastWorksVoList(Long castid,Long worksid,String workstype,String achievement);
	/**
	 * ����CastBaseRelation
	 * @param castid ����ID
	 * @param baseinfoid ������ϢID
	 * @param infotype ��Ϣ����
	 * @return
	 */
	ResultCode saveCastBaseRelation(Long castid,Long baseinfoid,String infotype);
	/**
	 * ��ѯCastBaseRelation
	 * @param castid ����ID
	 * @param baseinfoid ������ϢID
	 * @param infotype ��Ϣ����
	 * @return
	 */
	ResultCode<List<CastBaseRelationVo>> getBaseRelationList(Long castid,Long baseinfoid,String infotype);
	
	//avatar starService 
	
	/**
	 * ��ѯ������Ϣ�б�
	 * @param infotype
	 * @return
	 */
	ResultCode<List<GlossaryBaseInfoVo>> getGlossaryBaseInfoList(String infoname, String infotype);
	
	/**
	 * �����û����Ͳ�ѯ������Ϣ�б�
	 * @param starid
	 * @param infotype
	 * @return
	 */
	ResultCode<List<GlossaryBaseInfoVo>> getGlossaryBaseInfoListByStarId(Long castid, String infotype);
	/**
	 * �������/���͹�ϵ��
	 * @param starTypes
	 * @param starid
	 */
	ResultCode batchAddCastBaseRelation(String starTypes, Long starid, String infotype);
	/**
	 * ��ѯ�����б�(����) ģ����ѯ
	 * @param starname
	 */
	ResultCode<Integer> getCastProfileCount(String starname);
	/**
	 * ģ����ѯ�����б�(��ҳ)
	 * @param starname
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CastProfileVo>> getCastProfileList(String starname,int from, int maxnum);
	/**
	 * �������ͺ����Ʋ�ѯ��Ա������Ϣ
	 * @param infoname
	 * @param infotype
	 * @return
	 */
	ResultCode<Long> getGlossaryBaseInfoByTypeAndName(String infoname, String infotype);
	/**
	 * ��ѯ������Ϣ����
	 * @param infotype
	 * @return
	 */
	ResultCode<Integer> getGlossaryBaseInfoCount(String infotype);
	/**
	 * ��ѯ������Ϣ��ҳ
	 * @param infotype
	 * @return
	 */
	ResultCode<List<GlossaryBaseInfoVo>> getGlossaryBaseInfoListByPage(String infotype, int from, int maxnum);
	/**
	 * ɾ��������Ϣ
	 * @param id
	 */
	ResultCode deleteGlossaryBaseInfo(Long id);
	/**
	 * ��ѯ��Ӱ������Ϣ
	 * @param movieid
	 * @param infotype
	 * @return
	 */
	ResultCode<List<MovieBaseRelationVo>> getMovieBaseRelation(Long movieid,String infotype);
	/**
	 * ��ѯ��Ӱ�汾��Map={id:value,name:value}
	 * @param movieid
	 * @param infotype
	 * @return
	 */
	ResultCode<List<Map>> getMovieEditionList(Long movieid,String infotype);
	
	// avatar CastBatchService
	ResultCode associateMovie(String batchid);
	ResultCode associateMovieBatch(String batchid, String recordIds);
	/**
	 * ��������Ϣ����ʱ��ͬ������ʽ��
	 * @param profileTmpJson ��ʱ����Ϣjson
	 */
	ResultCode<CastProfileVo> syncProfile(String profileTmpJson, String batchId) throws Exception;
	/**
	 * ������ͼƬ����ʱ��ͬ������ʽ��
	 * @param castId	��ʱ���Ӧ�������ʶ
	 * @param castIdPerm	��ʽ��������ʶ
	 */	
	ResultCode syncPicture(Long castId, Long castIdPerm);
	/**
	 * ���� castProfileId��ȡ����infoname������Զ��ţ��ָ�
	 * @param castId
	 */
	ResultCode<String> getStarInfonameByCastId(Long castId);
	/**
	 * �޳������������Ϣ����������
	 * @return msgList ��Ϣ��Ϣ
	 */
	ResultCode<List<String>> removeRedutantProfiles();
	/**
	 * ��ȡpicwidth is nullӰ��ͼƬ�б�
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<CastPictureVo>> getCastPictureList(int from, int maxnum);
	/**
	 * �����Ӱ��ͼƬ
	 * @param paramVo
	 */
	ResultCode saveOrUpdateCastPicture(RequestParamVo paramVo);
	/**
	 * ɾ��Ӱ��ͼƬ��Ϣ
	 * @param picid
	 */
	ResultCode removeCastPictureById(Long picid);
	/**
	 * ����Ӱ��id��ȡӰ��ͼƬ�б�
	 * @param castid
	 */
	ResultCode<List<CastPictureVo>> getCastPictureListByCastid(Long castid);
	/**
	 * ��������batchInsertBaseInfo
	 * @param state ����
	 * @param nation ����
	 * @param sign ����
	 * @return
	 */
	ResultCode batchInsertBaseInfo(String[] state,String[] nation,String[] sign);
	/**
	 * @param baseinfoid
	 * @param infoname
	 * @param infotype
	 * @return
	 */
	ResultCode saveGlossaryBaseInfo(Long baseinfoid, String infoname, String infotype);
	/**
	 * @param baseInfoIdSet
	 * @return
	 */
	ResultCode<Map<Long, String>> getGlossaryBaseInfoByBaseInfoIdSet(Set<Long> baseInfoIdSet);
	/**
	 * @param baseinfoid
	 * @return
	 */
	ResultCode<GlossaryBaseInfoVo> getGlossaryBaseInfoById(Long baseinfoid);
	ResultCode updateCastProfileIntro(Long id,String mtimeid);
	ResultCode<CastProfileVo> saveCastProfile(RequestParamVo paramVo);
}
