/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.dubbo.rpc;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * Protocol. (API/SPI, Singleton, ThreadSafe)
 * 
 * @author william.liangf
 */
@SPI("dubbo")
public interface Protocol {
    
    /**
     * ��ȡȱʡ�˿ڣ����û�û�����ö˿�ʱʹ�á�
     * 
     * @return ȱʡ�˿�
     */
    int getDefaultPort();

    /**
     * ��¶Զ�̷���<br>
     * 1. Э���ڽ�������ʱ��Ӧ��¼������Դ����ַ��Ϣ��RpcContext.getContext().setRemoteAddress();<br>
     * 2. export()�������ݵȵģ�Ҳ���Ǳ�¶ͬһ��URL��Invoker���Σ��ͱ�¶һ��û������<br>
     * 3. export()�����Invoker�ɿ��ʵ�ֲ����룬Э�鲻��Ҫ���ġ�<br>
     * 
     * @param <T> ���������
     * @param invoker �����ִ����
     * @return exporter ��¶��������ã�����ȡ����¶
     * @throws RpcException ����¶�������ʱ�׳�������˿���ռ��
     */
    @Adaptive
    <T> Exporter<T> export(Invoker<T> invoker) throws RpcException;

    /**
     * ����Զ�̷���<br>
     * 1. ���û�����refer()�����ص�Invoker�����invoke()����ʱ��Э������Ӧִ��ͬURLԶ��export()�����Invoker�����invoke()������<br>
     * 2. refer()���ص�Invoker��Э��ʵ�֣�Э��ͨ����Ҫ�ڴ�Invoker�з���Զ������<br>
     * 3. ��url��������check=falseʱ������ʧ�ܲ����׳��쳣�����ڲ��Զ��ָ���<br>
     * 
     * @param <T> ���������
     * @param type ���������
     * @param url Զ�̷����URL��ַ
     * @return invoker ����ı��ش���
     * @throws RpcException �����ӷ����ṩ��ʧ��ʱ�׳�
     */
    @Adaptive
    <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException;

    /**
     * �ͷ�Э�飺<br>
     * 1. ȡ����Э�������Ѿ���¶�����õķ���<br>
     * 2. �ͷ�Э����ռ�õ�������Դ���������ӺͶ˿ڡ�<br>
     * 3. Э�����ͷź���Ȼ�ܱ�¶�������µķ���<br>
     */
    void destroy();

}
