package com.gewara.untrans.impl;

import com.gewara.support.ErrorCode;
import com.gewara.untrans.LockCallback;
import com.gewara.untrans.LockService;

/**
 * Created by sunder on 2017/8/3.
 */
public class LockServiceImpl implements LockService {
    /**
     * @param lockKey
     * @param lc
     * @param <T>
     * @return
     */
    @Override
    public <T> ErrorCode<T> doWithWriteLock(String lockKey, LockCallback<T> lc) {
        return null;
    }

    /**
     * @param lockKey
     * @param waitSeconds �ȴ�ʱ�䣬С�� 0 ��ʾһֱ�ȴ�
     * @param lc
     * @param <T>
     * @return
     */
    @Override
    public <T> ErrorCode<T> doWithWriteLock(String lockKey, int waitSeconds, LockCallback<T> lc) {
        return null;
    }

    /**
     * @param lockKey
     * @param lc
     * @param <T>
     * @return
     */
    @Override
    public <T> ErrorCode<T> tryDoWithWriteLock(String lockKey, LockCallback<T> lc) {
        return null;
    }
}
