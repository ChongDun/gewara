package com.gewara.drama.dubbo;

import com.gewara.api.vo.ResultCode;


public interface TheatreSeatPriceVoService {
	
	/**
	 * ��������򶩵���Ʊ���
	 * @param tradeno
	 * @param correcttype
	 * FIXME:��������
	 */
	ResultCode createPriceExt(String tradeno, String correcttype);
}
