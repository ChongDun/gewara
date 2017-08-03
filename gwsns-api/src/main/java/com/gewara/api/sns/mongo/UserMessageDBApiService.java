package com.gewara.api.sns.mongo;

import java.util.List;

import com.gewara.api.sns.vo.UserUploadMessage;
import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;


public interface UserMessageDBApiService {
	/**
	 * �����ϴ�ͨѶ¼
	 */
	ResultCode save(Long memberid, List<UserUploadMessage> userMessageList, String type); 
	/**
	 * �ϴ���ͨѶ¼��¼
	 */
	ResultCode<List<VoMap<String,Object>>> getMongoUserVoMapList(Long memberid, Integer from, Integer maxnum, String source);
	/**
	 * ��ȡ�Ƽ������б�
	 */
	ResultCode<List<UserUploadMessage>> getRecommendFriends(Long memberid, Integer from, Integer maxnum);
	/**
	 * ��ȡ�Ƽ���������
	 */
	ResultCode<Integer> getRecommendUserNum(Long memberid);
	/**
	 * ����ƥ���Ƽ��û��б�
	 */
	ResultCode<VoMap<Long,UserUploadMessage>> getRecommendFriendsVoMapByMemberid(Long memberid, Integer from, Integer maxnum, boolean flag,List<Long> attenList);
}
