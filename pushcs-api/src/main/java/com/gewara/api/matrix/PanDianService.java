package com.gewara.api.matrix;


import com.gewara.api.vo.PanDianVO;
import com.gewara.api.vo.ResultCode;
/**
 * @author �ƽ
 * �̵�dubbo �ӿ�
 */
public interface PanDianService {
	/**
	 * ʹ��memberid��ȡ�û���Ӱ�ռ�
	 * @param memberid �û�id
	 * @return PandianVO����,��װ��ͳ�ƽ���������
	 */
    ResultCode<PanDianVO> getUserMovieDiaryByMemberid(Long memberid);
}
