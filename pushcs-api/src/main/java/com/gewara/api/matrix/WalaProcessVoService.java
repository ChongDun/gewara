package com.gewara.api.matrix;

import com.gewara.api.vo.ResultCode;



public interface WalaProcessVoService {

	/***
	 * �ж�wala�Ƿ��ǹ��
	 * @param wala
	 * @return true:���,false:����
	 */
    public ResultCode<Boolean> recogniseWala(String wala);
    /***
	 * ���wala 
	 * @param walaId,walaSpam (��滹������,ham����,spam���),walaContent(wala����),data_from(e.g.:����ϵͳ��:activi,wap .etc)
	 * @return true:��ӳɹ�,false:���ʧ��
	 */
    public ResultCode<Boolean> addWalaSpam(Long walaId, String walaSpam, String walaContent,String data_from);
    
}
