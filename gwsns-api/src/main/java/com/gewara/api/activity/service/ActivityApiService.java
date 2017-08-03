package com.gewara.api.activity.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.gewara.api.activity.domain.ActivityInterestVo;
import com.gewara.api.activity.domain.ActivityMpiVo;
import com.gewara.api.activity.domain.ActivitySpecialVo;
import com.gewara.api.activity.domain.ActivityVo;
import com.gewara.api.activity.domain.CategoryCountVo;
import com.gewara.api.activity.domain.MobileAdvertRecommendVo;
import com.gewara.api.sns.vo.RecommandData;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

public interface ActivityApiService {

	public ResultCode<ActivityVo> getActivitById(Long activityid);
	
	public ResultCode<ActivityVo> getActivitById(Long activityid, boolean checkStatus);
	
	//@RequestMapping("/api/activity/join.xhtml")
	public  ResultCode<ActivityVo> joinActivity(Long memberid,
			Long activityid, String sex, String realname, String mobile,
			Integer joinnum, Date joindate, String address, String otherinfo,
			String walaaddress);
	/**
	 * ȡ������
	 * @param activityid
	 * @param memberid
	 * @return
	 */
	public  ResultCode<ActivityVo> quitActivity(Long activityid, Long memberid);

	/**
	 * �ղػ
	@RequestMapping("/api/activity/collect.xhtml")
	 * 
	 * @param model
	 * @param activityid
	 * @param memberid
	 * @return
	 */
	public  ResultCode<String> collectActivity(Long activityid, Long memberid);

	/**
	 * ȡ���ղ�
	@RequestMapping("/api/activity/cancelcollect.xhtml")
	 * @param model
	 * @param activityid
	 * @param memberid
	 * @return
	 */
	public  ResultCode<String> cancelCollectActivity(Long activityid, Long memberid);

	/**
	 * ��ȡ�Ƽ����ö���б�
	@RequestMapping("/api/activity/topList.xhtml")
	 * 
	 * @param model
	 * @param citycode
	 * @param type
	 * @param tag
	 * @param relatedid
	 *            ��Ӧtag�Ĺ���id
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getTopActivityList(String citycode, String type, String tag, Long relatedId);
	/**
	 * ���ݻid���ϻ�ȡ��б�
	@RequestMapping("/api/activity/list/getByIds.xhtml")
	 * @param ids �ԡ�,���ָ���ids
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getActivityListByIds(String ids);

	public  ResultCode<List<ActivityVo>> getMemberJoinActivityListByTag(String tag, 
					Long memberid, int from, int maxnum);


	/**
	 * ��ѯ��ǰ�����
	@RequestMapping("/api/activity/count/get.xhtml")
	 * @param citycode
	 * @param type
	 * @param timetype
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	public  ResultCode<String> getActivityCount(String citycode,
			String type, int timetype, String tag, Long relatedId);

	/**
	 * ��ѯ�����Ϣ
	@RequestMapping("/api/activity/list/get.xhtml")
	 * @param citycode
	 * @param type
	 * @param timetype 1���Ի
	 * @param tag
	 * @param relatedid
	 * @param order
	 * @param from
	 * @param maxnum
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getActivityList(
			String citycode, String type, int timetype, String tag,
			Long relatedId, String order, int from, int maxnum);

	/**
	 * �û��Ļ�б�
	@RequestMapping("/api/activity/list/member.xhtml")
	 * @param memberid
	 * @param citycode
	 * @param timetype
	 * @param tag
	 * @param relatedid
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getMemberActivityList(
			Long memberid, String citycode, int timetype, String tag,
			Long relatedId, int from, int maxnum);

	/**
	 * ��ȡ��б��ɱ����
	@RequestMapping("/api/activity/list/allCondition.xhtml")
	 * @param model
	 * @param title 	����⣬ģ����ѯ
	 * @param cityCode 	���б���
	 * @param type 		����ͣ�"common"����ͨ�"user"���û������֤�û�"buss"���̼һ�����췽"gewa"��gewa����ٷ�
	 * @param status 	�״̬
	 * @param memberid 	�������id
	 * @param timetype 	�ʱ������ 3��δ���ڵĻ 2�����ڣ��������Ļ 1�����л
	 * @param flag 		�Ƽ����ö�
	 * @param tag 		������cinema
	 * @param relatedids tag��Ӧ��id
	 * @param startTime ��ѯ��Χ�Ŀ�ʼʱ�䣬�������ʼʱ����ڵ�ǰֵ
	 * @param endTime 	��ѯ��Χ����ʱ�䣬���������ʱ��С�ڵ�ǰֵ
	 * @param category 	��������movie
	 * @param categoryids category������id
	 * @param activityids �id���ϣ��á�,���ָ�
	 * @param sources 	���Դ�� 1��վ��2andrio��3iphone ��ʱ��������
	 * @param isFee 	�Ƿ��շ� Y �շ�
	 * @param order 	�����ֶ�
	 * @param asc 		����ʽ Y����
	 * @param from 
	 * @param maxnum
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getActivityList(
			String signname, String title, String citycode, String countycode,
			String type, String datetype, String status, String memberid,
			int timetype, String flag, String tag, String relatedids,
			Timestamp starttime, Timestamp endtime, String category,
			String categoryids, String activityids, String sources,
			String isfee, String order, String asc, int from, int maxnum);
	
	/**
	 * ��ȡ��б��ɱ����(���Ӷ������)
	 * @param model
	 * @param title 	����⣬ģ����ѯ
	 * @param cityCode 	���б���
	 * @param type 		����ͣ�"common"����ͨ�"user"���û������֤�û�"buss"���̼һ�����췽"gewa"��gewa����ٷ�
	 * @param status 	�״̬
	 * @param memberid 	�������id
	 * @param timetype 	�ʱ������ 3��δ���ڵĻ 2�����ڣ��������Ļ 1�����л
	 * @param flag 		�Ƽ����ö�
	 * @param tag 		������cinema
	 * @param relatedids tag��Ӧ��id
	 * @param startTime ��ѯ��Χ�Ŀ�ʼʱ�䣬�������ʼʱ����ڵ�ǰֵ
	 * @param endTime 	��ѯ��Χ����ʱ�䣬���������ʱ��С�ڵ�ǰֵ
	 * @param category 	��������movie
	 * @param categoryids category������id
	 * @param activityids �id���ϣ��á�,���ָ�
	 * @param sources 	���Դ�� 1��վ��2andrio��3iphone ��ʱ��������
	 * @param isFee 	�Ƿ��շ� Y �շ�
	 * @param order 	�����ֶ�
	 * @param asc 		����ʽ Y����
	 * @param from 
	 * @param maxnum
	 * @return
	 */
	public  ResultCode<List<ActivityVo>> getActivityListByOrders(
			String signname, String title, String citycode, String countycode,
			String type, String datetype, String status, String memberid,
			int timetype, String flag, String tag, String relatedids,
			Timestamp starttime, Timestamp endtime, String category,
			String categoryids, String activityids, String sources,
			String isfee, String[] order, String asc, int from, int maxnum);
	
	/**
	 * 
	@RequestMapping("/api/activity/count/allCondition.xhtml")
	 * @param title
	 * @param citycode
	 * @param countycode
	 * @param type
	 * @param datetype
	 * @param status
	 * @param memberid
	 * @param timetype
	 * @param flag
	 * @param tag
	 * @param relatedids
	 * @param starttime
	 * @param endtime
	 * @param category
	 * @param categoryids
	 * @param activityids
	 * @param sources
	 * @param isfee
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:29:15
	 */
	public  ResultCode<String> getActivityCount(String title,
			String citycode, String countycode, String type, String datetype,
			String status, Long memberid, int timetype, String flag,
			String tag, String relatedids, Timestamp starttime,
			Timestamp endtime, String category, String categoryids,
			String activityids, String sources, String isfee);


	/**
	 * 
	@RequestMapping("/api/activity/categoryMap.xhtml")
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:29:46
	 */
	public  ResultCode<List<CategoryCountVo>> getCategoryMap();

	/**
	 * 
	@RequestMapping("/api/activity/getCurActivityList.xhtml")
	 * @param citycode
	 * @param tag
	 * @param signname
	 * @param type
	 * @param relatedid
	 * @param category
	 * @param categoryid
	 * @param order
	 * @param from
	 * @param maxnum
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:30:24
	 */
	public  ResultCode<List<ActivityVo>> getActivityList(
			String citycode, String tag, String signname, String type,
			String relatedid, String category, String categoryid, String order,
			int from, int maxnum);

	/**
	 * 
	@RequestMapping("/api/activity/getRecommendActivityBySignNameList.xhtml")
	 * @param signname
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:30:37
	 */
	public  ResultCode<List<ActivityVo>> getRecommendActivityBySignNameList(
			String signname, String citycode, int from, int maxnum);

	/**
	 * 
	@RequestMapping("/api/activity/getActivityMpi.xhtml")
	 * @param activityid
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:30:44
	 */
	//���ݻID��ѯ����
	public  ResultCode<String> getActivityMpi(Long activityid);


	/**
	 * @RequestMapping("/api/activity/getJoinInfo.xhtml")
	 * @param memberid
	 * @param relatedid
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:30:55
	 */
	public  ResultCode<String> getJoinInfo(Long memberid, Long relatedid);

	/**
	 * @RequestMapping("/api/activity/getMpiGuest.xhtml")
	 * @param activityid
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:31:03
	 */
	public  ResultCode<List<ActivityMpiVo>> getMpiGuest(Long activityid);


	/**
	 * @RequestMapping("/api/activity/getActivityRelatedidByTag.xhtml")
	 * @param citycode
	 * @param timetype
	 * @param tag
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:31:19
	 */
	public  ResultCode<String> getActivityRelatedidByTag(
			String citycode, Integer timetype, String tag);

	/**
	 * @RequestMapping("/api/activity/getMobileAdvertList.xhtml")
	 * @param citycode
	 * @param from
	 * @param maxnum
	 * @param model
	 * @return
	 * @author leo
	 * @addTime 2014��6��25������5:31:24
	 */
	public  ResultCode<List<MobileAdvertRecommendVo>> getMobileAdvert(
			String citycode, int from, int maxnum);
	
	public ResultCode<Long> addActivity(ActivityVo activityVo, Map map);

	public ResultCode<Long> applyActivityStatus(Long activityid, Long memberid);
	
	/**
	 * ��ȡ�Ƽ�����
	 * @return
	 */
	public  ResultCode<List<RecommandData>> getRecommendData();
	
	
	/**
	 * ͬ��ר������
	 * @param   ztid   ר��ID
	 * @param   title  ר�����
	 * @param   url    ר�����ӵ�ַ(����·��)
	 * @param   logo    ר�����ͼƬ��ַ(����·��)
	 * @param   support  ר��֧�ַ�ʽ��PC��WAP��ALL��
	 * @param   starttime ר�ⷢ��ʱ��   
	 * @param  	otherMap  ������ϢMap<String,String>
	 */
	public ResultCode synchronActivitySpecial(Long ztid,String title,String url,String logo,String support,Timestamp starttime,Map<String,String> otherMap);
	
	/**
	 * ��ȡ���Ȥ�����������
	 * @param sign ���ʶ  starmeet -->���Ǽ���� ��cinephiles -->Ӱչ �� filmreviews --->дӰ����cinema -->ӰԺ�
	 * @return
	 */
	public ResultCode<ActivityInterestVo> getActivityInterestBySign(String sign);
	
	
	/**
	 * ��ȡר������(������10����)
	 * @param starttime ������ʼʱ��ʱ�䷶Χ
	 * @param endtime ������ʼʱ��ʱ�䷶Χ
	 * @param from
	 * @param maxnum
	 * @return
	 */
	public ResultCode<List<ActivitySpecialVo>> getActivitySpecialList(Timestamp starttime,Timestamp endtime,int from,int maxnum);
	/**
	 * ��ȡ֧���ɹ�������
	 * @param activityid
	 * @param virtualcount
	 * @param quantity
	 * @return
	 */
	public ResultCode<Integer> getOrderNumForSuccess(Long activityid);
	
	/**
	 * ��ѯmongo�б���ĵ�Ӱ�˳����Ϣ
	 * @param category
	 * @param categoryid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	public  ResultCode<VoMap<Long,Integer>> getMongoActivityVoMap(String category, Long categoryid, int from, int maxnum);

}
