package com.gewara.api.activity.service;

import java.util.List;

import com.gewara.api.activity.domain.ActivityInfoVo;
import com.gewara.api.activity.domain.ActivityJoinFormVo;
import com.gewara.api.activity.domain.ApplyJoinVo;
import com.gewara.api.vo.ResultCode;

public interface ApplyJoinApiService {


	/**
	 * ��ȡ��Ĳ�����Ϣ
	@RequestMapping("/api/applyjoin/list/byActivityId.xhtml")
	 * @param activityid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	public ResultCode<List<ApplyJoinVo>> getApplyJoinListByActivityid(
			Long activityid, int from, int maxnum);


	/**
	 * ��ȡ�û��μӵĻ��Ϣ
	@RequestMapping("/api/applyjoin/getByMemberIdAndActivityId.xhtml")
	 * @param memberid
	 * @param activityid
	 * @return
	 */
	public ResultCode<ApplyJoinVo> getApplyJoin(Long memberid, Long activityid);

	/**
	 * ������ַ��Ϣ
	 * @param applyJoinVo
	 * @return
	 */
	public ResultCode saveApplyJoin(Long activityid,Long memberid, String mobile,String realName,String sex,String address,String birthData,Integer joinnum, String TradeNo,String jsonString);
	
	/**
	 * ��ӻ����������Ϣ
	 * @param activityInfo
	 * @return
	 */
	public void addActivityInfo(ActivityInfoVo activityInfo);
	/**
	 * �޸Ļ����������Ϣ
	 * @param activityInfo
	 * @return
	 */
	public void updateActivityInfo(ActivityInfoVo activityInfo);
	/**
	 * �����û���Ż�ȡ�û��������Ϣ
	 * @param memberid
	 * @return
	 */
	public ResultCode<ActivityInfoVo> getActivityInfoByMemberid(Long memberid);
	/**
	 * ��ȡ�������Ϣѡ��
	 * @param activityid
	 * @return
	 */
	public ResultCode<ActivityJoinFormVo> getJoinFormByActivityId(Long activityid);
}