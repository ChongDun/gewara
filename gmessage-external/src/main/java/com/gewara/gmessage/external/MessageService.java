package com.gewara.gmessage.external;

import java.util.Collection;

import com.gewara.api.vo.ResultCode;
import com.gewara.gmessage.external.constant.MCategory;
import com.gewara.gmessage.external.entity.MUser;
import com.gewara.gmessage.external.entity.Message;
import com.gewara.gmessage.external.entity.ReceiverMessage;
import com.gewara.gmessage.external.entity.ReceiverQueryParam;
import com.gewara.gmessage.external.entity.SendStateQueryParam;
import com.gewara.gmessage.external.entity.SendStateQueryResult;
import com.gewara.gmessage.external.entity.UnReadCountResult;
import com.gewara.gmessage.external.entity.UpdateMStateParam;

/**
 * ��Ϣ����ӿڡ�
 * @author ����
 * @createDate 2015��3��9��
 */
public interface MessageService {

	/**
	 * ������Ϣ
	 * 
	 * @param source ϵͳ��Դ
	 * @param message ��Ϣ��
	 * @param version ָ�����ݰ汾����ָ����Ĭ��Ϊ 0.0
	 * @return �ɹ� ������ϢID��ʧ�ܣ�����ʧ�ܴ��롣
	 */
	ResultCode<String> sendMessage(String source,Message message,String version);
	
	/**
	 * �û���������Ϣ���ѹ�����Ϣ����ɾ����Ϣ���������ڣ������շ���ʱ��ʱ�䵹��������С�
	 * �����ѯ���е���Ϣ��δ����Ϣ������ǰ�档 
	 * NOTE��reciveTimes ��������ã�Ĭ�ϻ�ʹ����һ�β�ѯʱ�䣬��ʱ������ֵΪ�����ڡ�
	 * @param source ϵͳ��Դ
	 * @param query ��ѯ����
	 * @param version ָ����Ͱ汾�� ���ڻ��ߵ��ڸð汾�����ݲŻ᷵�ء�
	 * @return ������Ϣ�б�
	
	 * @return
	 */
	ResultCode<Collection<ReceiverMessage>> findMessageListByReceiver(String source,ReceiverQueryParam query,String version);
	
	/**
	 * ��ѯ������Ϣ
	 * @param category
	 * @param messageID
	 * @return
	 */
	ResultCode<ReceiverMessage> findMessageByReceiver(MCategory category, Long messageID);
	
	
	/**
	 * ͳ��δ����Ϣ
	 * @param source ϵͳ��Դ
	 * @param receiver �������û���Ϣ
	 * @return ������Ϣ����ͳ�ƽ��
	 */
	ResultCode<UnReadCountResult> countUnReadMessage(String source,MUser receiverID);
	
	
	/**
	 * �����û���Ϣ״̬��
	 * @param source
	 * @param param
	 * @return
	 */
	ResultCode<String> updateMessageState(String source,UpdateMStateParam param);
	
	/**
	 * ��ȡ��Ϣ�ķ������.
	 * ��ϵͳ�޷���ȡpush��sms�ȵķ���״̬��
	 * @param source  ϵͳ��Դ 
	 * @param messageID  ��ϢID
	 * @return ������Ϣ�������
	 */
	ResultCode<Collection<SendStateQueryResult>> findMessageStateByRelateID(String source,SendStateQueryParam query);
	
	/**
	 * �����汾��ȡ�û���δ����Ϣ����
	 * @param source
	 * @param query
	 * @param version
	 * @return
	 */
	ResultCode<UnReadCountResult> getUserUnReadCount(String source, ReceiverQueryParam query, String version);
	
	/**
	 * ����ĳһ����Ϣ������ĳһ�����ߵ���Ϣ�����߱�����дһ����ռ��
	 * ������ID�ͷ���������
	 * @param source ϵͳ��Դ
	 * @param messageType ��Ϣ����
	 * @param sender  ������
	 * @return 
	 */
	//OperateResult shieldMessage(String source,Short messageType,MUser sender);
	
	/**======================================================*/
	/**
	 * �û���������Ϣ�����շ���ʱ�䵹��������С�
	 * @param source ϵͳ��Դ
	 * @param query ��ѯ����
	 * @return ����ָ�������ߵ���Ϣ�б�
	 */
	//Collection<SenderMessage> findMessageListBySender(String source,SenderQueryParam query);
	
	/**
	 * ������Ϣ�����κ����н����߶������ܲ�������Ϣ
	 * @param messageID
	 * @return
	 * 
	 */
	//updateResult shieldMessage(long messageID);
}
