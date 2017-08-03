package com.gewara.movie.api.service.frontend.ourplay;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.json.ourplay.ApplyVo;
import com.gewara.movie.vo.json.ourplay.CompensateLogVo;
import com.gewara.movie.vo.json.ourplay.MemberPraiseVo;


public interface OurPlayFVoService {
	/**
	 * �����Ϊ��ƬԱ���л�������
	 * @param applyVo
	 * @return
	 */
	//ResultCode<ApplyVo> saveApplyVoLimitMinPonitValue(ApplyVo applyVo,Integer minPointValue);
	//ResultCode<ApplyVo> saveApplyVo(ApplyVo applyVo,Integer minPointValue);
	
	ResultCode<ApplyVo> saveApplyVo(ApplyVo applyVo,String flag);
	ResultCode<ApplyVo> saveApplyFriendVo(ApplyVo applyVo);
	
	ResultCode<CompensateLogVo> saveCompensateLogVo(CompensateLogVo compensateLogVo);
	ResultCode<MemberPraiseVo> saveMemberPraiseWalaOrStatusById(MemberPraiseVo vo);
	ResultCode<Integer> addApplyNumByActivityId(String activityId);
}
