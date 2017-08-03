package com.gewara.api.sns.bbs;


import java.util.List;

import com.gewara.api.sns.vo.bbs.AccusationVo;
import com.gewara.api.sns.vo.bbs.BlackMemberVo;
import com.gewara.api.vo.ResultCode;

/**
 * @author <a href="mailto:acerge@163.com">gebiao(acerge)</a>
 * @since 2007-9-28����02:05:17
 */
public interface BlogApiService{
	
	/**
	 * ��ȡ�������б�
	 * @param memberId Ϊ���򷵻����к�����
	 * @return
	 */
	ResultCode<List<BlackMemberVo>> getBlackMemberList(Long memberId, int from, int maxnum);
	/**
	 * �û��Ƿ��ں�������
	 * @param memberId
	 * @return
	 */
	ResultCode<Boolean> isBlackMember(Long memberId);
	/**
	 * �������е�����
	 */
	ResultCode<Integer> getBlackMemberCount();
	/**
	 * �ٱ�����
	 * @return
	 */
	ResultCode<Integer> getAccusationCount();
	ResultCode<List<AccusationVo>> getAccusationList(int from, int maxnum);
	
	

	/**
	 * ���ݹ���memberid����ѯ����������
	 */
	ResultCode<Integer> getBlackMemberCount(Long memberId);
	
	/**
	 * ���������
	 * @param bm
	 * @return
	 */
	ResultCode<BlackMemberVo> saveBlackMember(BlackMemberVo bm);
	
	/**
	 * ɾ��������
	 * @param blackMemberId
	 */
	ResultCode removeBlackMember(Long blackMemberId);
	
	/**
	 * ����Ͷ��
	 * @param acc
	 * @return
	 */
	ResultCode<AccusationVo> saveAccusation(AccusationVo acc);
	
	/**
	 * ��ѯͶ��
	 * @param accid
	 * @return
	 */
	ResultCode<AccusationVo> getAccusation(Long accid);
	
	/**
	 * ɾ��Ͷ��
	 * @param accid
	 */
	ResultCode removeAccusation(Long accid);	
	
}
