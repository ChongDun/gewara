package com.gewara.api.sns.relatedaccount;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.VoMap;

public interface RelatedAccountApiService {

	/**
	 * ��ȡ�û������˻���Ϣ
	 * @param memberid
	 * @return
	 */
	ResultCode<List<VoMap<String, String>>> getRelatedAccountVoMapList(Long memberid, String mobilePath);
}
