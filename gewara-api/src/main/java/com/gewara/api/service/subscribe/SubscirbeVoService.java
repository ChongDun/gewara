package com.gewara.api.service.subscribe;


import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.api.vo.movie.SubscribeVo;

/**
 * ��ȡԤԼ
 * @author pengdi
 *
 */
public interface SubscirbeVoService {
  
	ResultCode<String>getSubscribeList(String startTime,String endTime,int from,int maxnum);

	/**
	 * ��ѯ�û���ЧԤԼ�б�</br>
	 * addtime���ڵ��ڵ�ǰ���ڣ�����addtime��������
	 * @param memberId �û�ID
	 * @param from
	 * @param maxnum
	 * @return
	 * @author leo
	 * @addTime 2016��10��14������11:31:31
	 */
	ResultCode<List<SubscribeVo>> getSubscribeList(Long memberId, int from, int maxnum);
	
	
}
