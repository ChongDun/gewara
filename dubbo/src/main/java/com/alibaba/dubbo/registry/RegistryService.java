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
package com.alibaba.dubbo.registry;

import java.util.List;

import com.alibaba.dubbo.common.URL;

/**
 * RegistryService. (SPI, Prototype, ThreadSafe)
 * 
 * @see com.alibaba.dubbo.registry.Registry
 * @see com.alibaba.dubbo.registry.RegistryFactory#getRegistry(URL)
 * @author william.liangf
 */
public interface RegistryService {

    /**
     * ע�����ݣ����磺�ṩ�ߵ�ַ�������ߵ�ַ��·�ɹ��򣬸��ǹ��򣬵����ݡ�
     * 
     * ע���账����Լ��<br>
     * 1. ��URL������check=falseʱ��ע��ʧ�ܺ󲻱����ں�̨��ʱ���ԣ������׳��쳣��<br>
     * 2. ��URL������dynamic=false����������־ô洢�����򣬵�ע���߳��ֶϵ������쳣�˳�ʱ�����Զ�ɾ����<br>
     * 3. ��URL������category=routersʱ����ʾ����洢��ȱʡ���Ϊproviders���ɰ����ಿ��֪ͨ���ݡ�<br>
     * 4. ��ע���������������綶�������ܶ�ʧ���ݣ����������Զ�ɾ�����ݡ�<br>
     * 5. ����URI��ͬ��������ͬ��URL���棬���ܸ��ǡ�<br>
     * 
     * @param url ע����Ϣ��������Ϊ�գ��磺dubbo://10.20.153.10/com.alibaba.foo.BarService?version=1.0.0&application=kylin
     */
    void register(URL url);

    /**
     * ȡ��ע��.
     * 
     * ȡ��ע���账����Լ��<br>
     * 1. �����dynamic=false�ĳ־ô洢���ݣ��Ҳ���ע�����ݣ�����IllegalStateException��������ԡ�<br>
     * 2. ��ȫURLƥ��ȡ��ע�ᡣ<br>
     * 
     * @param url ע����Ϣ��������Ϊ�գ��磺dubbo://10.20.153.10/com.alibaba.foo.BarService?version=1.0.0&application=kylin
     */
    void unregister(URL url);

    /**
     * ���ķ�����������ע�����ݣ�����ע�����ݱ��ʱ�Զ�����.
     * 
     * �����账����Լ��<br>
     * 1. ��URL������check=falseʱ������ʧ�ܺ󲻱����ں�̨��ʱ���ԡ�<br>
     * 2. ��URL������category=routers��ָֻ֪ͨ����������ݣ���������ö��ŷָ����������Ǻ�ͨ�䣬��ʾ�������з������ݡ�<br>
     * 3. ������interface,group,version,classifier��Ϊ������ѯ���磺interface=com.alibaba.foo.BarService&version=1.0.0<br>
     * 4. ���Ҳ�ѯ���������Ǻ�ͨ�䣬�������нӿڵ����з�������а汾����interface=*&group=*&version=*&classifier=*<br>
     * 5. ��ע���������������綶�������Զ��ָ���������<br>
     * 6. ����URI��ͬ��������ͬ��URL���棬���ܸ��ǡ�<br>
     * 7. �����������Ĺ��̣��ȵ�һ��֪ͨ����ٷ��ء�<br>
     * 
     * @param url ����������������Ϊ�գ��磺consumer://10.20.153.10/com.alibaba.foo.BarService?version=1.0.0&application=kylin
     * @param listener ����¼���������������Ϊ��
     */
    void subscribe(URL url, NotifyListener listener);

    /**
     * ȡ������.
     * 
     * ȡ�������账����Լ��<br>
     * 1. ���û�ж��ģ�ֱ�Ӻ��ԡ�<br>
     * 2. ��ȫURLƥ��ȡ�����ġ�<br>
     * 
     * @param url ����������������Ϊ�գ��磺consumer://10.20.153.10/com.alibaba.foo.BarService?version=1.0.0&application=kylin
     * @param listener ����¼���������������Ϊ��
     */
    void unsubscribe(URL url, NotifyListener listener);

    /**
     * ��ѯ������������ע�����ݣ��붩�ĵ���ģʽ���Ӧ������Ϊ��ģʽ��ֻ����һ�ν����
     * 
     * @see com.alibaba.dubbo.registry.NotifyListener#notify(List)
     * @param url ��ѯ������������Ϊ�գ��磺consumer://10.20.153.10/com.alibaba.foo.BarService?version=1.0.0&application=kylin
     * @return ��ע����Ϣ�б�����Ϊ�գ�����ͬ{@link com.alibaba.dubbo.registry.NotifyListener#notify(List<URL>)}�Ĳ�����
     */
    List<URL> lookup(URL url);

}
