package com.gewara.ucenter.api.member;

import java.util.List;

import com.gewara.api.vo.ResultCode;
import com.gewara.ucenter.cmd.UsefulAddressVo;
import com.gewara.ucenter.vo.member.ExpressProvinceVo;
import com.gewara.ucenter.vo.member.MemberUsefulAddressVo;

/**
 * ��������Ϣ��ѯ
 */
public interface MemberUsefullVoService {

	ResultCode<MemberUsefulAddressVo> checkCreanteUsefulAddress(UsefulAddressVo userAddress);
	
	/**
	 * ����id��ȡMemberUsefulAddressVoʵ��
	 * @param id
	 * @return
	 */
	ResultCode<MemberUsefulAddressVo> getMemberUsefulAddressById(Long id);
	/**
	 * ��ȡ�û����õ�ַ
	 * @param memberid
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<MemberUsefulAddressVo>> getMemberUsefulAddressByMeberid(Long memberid, int from, int maxnum);
	/**
	 * �����û��ֻ��Ż�ȡ���õ�ַ
	 * @param mobile
	 * @param from
	 * @param maxnum
	 * @return
	 */
	ResultCode<List<MemberUsefulAddressVo>> getMemberUsefulAddressByMobile(String mobile, int from, int maxnum);
	/**
	 * ��ȡ�ÿ�ݷ�ʽ��ĳһʡ�ݵ��ʷѵ���Ϣ
	 * @param expressid
	 * @param provincecode
	 * @return
	 */
	ResultCode<ExpressProvinceVo> getExpressProvince(String expressid, String provincecode);
	
	/**
	 * ��ȡ�ÿ�ݷ�ʽ������ʡ�ݵ��ʷѵ���Ϣ
	 * @param expressid
	 * @return
	 */
	ResultCode<List<ExpressProvinceVo>> getExpressProvinceList(String expressid);
	/**
	 * �����ջ���ַ
	 * @param usefulAddress
	 * @return
	 */
	ResultCode<MemberUsefulAddressVo> addOrUpdateUsefulAddress(UsefulAddressVo usefulAddress);
	/**
	 * ���������õ�ַ
	 * @param idList
	 * @return
	 */
	ResultCode<List<MemberUsefulAddressVo>> getMemberUsefulAddressByIdList(List<Long> idList);
	/**
	 * �û�ɾ����ַ
	 * @param id ��ַid
	 * @param memberid �û�id
	 * @return
	 */
	ResultCode delOldAddress(Long id, Long memberid);
	/**
	 * �޸�Ĭ�ϵ�ַ
	 * @param id	��ַid
	 * @param memberid	�û�id
	 * @param defaultAddress ״̬
	 * @return
	 */
	ResultCode changeDefaultAddress(Long id, Long memberid, String defaultAddress);
	ResultCode<MemberUsefulAddressVo> saveMemberUsefulAddress(Long id, Long memberid, String realname, String provincecode, String provincename,
			String citycode, String cityname, String countycode, String countyname, String address, String mobile, String postalcode, String IDcard);
}
