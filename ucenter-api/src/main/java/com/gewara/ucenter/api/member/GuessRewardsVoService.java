package com.gewara.ucenter.api.member;

import com.gewara.api.vo.ResultCode;

public interface GuessRewardsVoService {
	/**
	 * ��Ʊ���ͻ��ֽӿ�
	 * @param memberid
	 * @param pointvalue
	 * @param tag
	 * @param reason
	 * @return
	 */
	ResultCode<String> assignGuessRewards(Long memberid, Integer pointvalue, String tag, String reason);

}
