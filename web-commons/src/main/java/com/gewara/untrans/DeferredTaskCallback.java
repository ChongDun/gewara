package com.gewara.untrans;

import com.gewara.support.ErrorCode;

/**
 * spring mvc Deferred�ص�
 * @author quzhuping
 *
 * @param <R> ��DeferredResult����һ��
 */
public interface DeferredTaskCallback<R> {

	ErrorCode<R> doTask();
}
