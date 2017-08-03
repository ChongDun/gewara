package com.gewara.movie.api.service.highlightentry;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.movie.vo.highlightentry.HighlightEntryVo;


/**
 * ������ڹ���
 * @author weihua.wang
 *
 */
public interface HighlightEntryVoService {
	/**
	 * ��ȡ��������б�
	 * @return
	 */
	ResultCode<List<HighlightEntryVo>> getHighlightEntryVoList(int from ,int maxnum);
	
	/**
	 * �����������
	 */
	ResultCode<HighlightEntryVo> updateHighlightEntryVo(HighlightEntryVo entry);
	
	/**
	 * ����������
	 */
	ResultCode<HighlightEntryVo> saveHighlightEntryVo(HighlightEntryVo entry);
	
	/**
	 * ��ȡ�������
	 * @param entryId
	 * @return
	 */
	ResultCode<HighlightEntryVo> getHighlightEntryVoById(Long entryId);
	
	
	/**
	 * ɾ���������
	 * @param entryId
	 */
	ResultCode<HighlightEntryVo> removeHighlightEntryVoById(Long entryId);
}
