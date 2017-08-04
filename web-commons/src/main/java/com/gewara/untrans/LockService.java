package com.gewara.untrans;

import com.gewara.support.ErrorCode;
import com.gewara.support.concurrent.AtomicCounter;
//import com.gewara.untrans.impl.LockServiceImpl.AtomicCounter;

public interface LockService {
	
	/**
	 * @param ticketTradeNO
	 * @return
	 */
	public AtomicCounter getAtomicCounter(String ticketTradeNO) ;

	/**
	 * @param lockKey
	 * @param lc
	 * @return
	 */
	<T> ErrorCode<T> doWithWriteLock(String lockKey, LockCallback<T> lc);

	/**
	 * @param lockKey
	 * @param waitSeconds
	 *            �ȴ�ʱ�䣬С�� 0 ��ʾһֱ�ȴ�
	 * @param lc
	 * @return
	 */
	<T> ErrorCode<T> doWithWriteLock(String lockKey, int waitSeconds, LockCallback<T> lc);

	/**
	 * �޷������ʱֱ�Ӻ���
	 * 
	 * @param lockKey
	 * @param lc
	 */
	<T> ErrorCode<T> tryDoWithWriteLock(String lockKey, LockCallback<T> lc);

}
