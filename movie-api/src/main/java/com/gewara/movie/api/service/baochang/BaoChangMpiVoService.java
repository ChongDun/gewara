package com.gewara.movie.api.service.baochang;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.baochang.BaoChangMpiSeatPicVo;
import com.gewara.movie.vo.baochang.BaoChangOrderInfoVo;


public interface BaoChangMpiVoService {
	/**
	 * ���ݳ���id����ѯ������λ��΢��ͼƬ
	 * @param mpid
	 * @return
	 */
	ResultCode<List<BaoChangMpiSeatPicVo>> getBaoChangMpiSeatPicListByMpid(Long mpid);
	
	ResultCode<BaoChangOrderInfoVo> getBaoChangOrderByTradeNo(String tradeNo);
	ResultCode<List<BaoChangOrderInfoVo>> getSuccessOrderByMemberid(Long memberid);

}
