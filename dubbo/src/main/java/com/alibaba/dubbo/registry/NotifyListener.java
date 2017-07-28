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
 * NotifyListener. (API, Prototype, ThreadSafe)
 * 
 * @see com.alibaba.dubbo.registry.RegistryService#subscribe(URL, NotifyListener)
 * @author william.liangf
 */
public interface NotifyListener {

    /**
     * ���յ�������֪ͨʱ������
     * 
     * ֪ͨ�账����Լ��<br>
     * 1. �����Է���ӿں���������Ϊά��ȫ��֪ͨ��������֪ͨһ�������ͬ���͵Ĳ������ݣ��û�����Ҫ�Ա���һ��֪ͨ�����<br>
     * 2. ����ʱ�ĵ�һ��֪ͨ��������һ������������������ݵ�ȫ��֪ͨ��<br>
     * 3. ��;���ʱ������ͬ���͵����ݷֿ�֪ͨ�����磺providers, consumers, routers, overrides������ֻ֪ͨ����һ�����ͣ��������͵����ݱ�����ȫ���ģ����������ġ�<br>
     * 4. ���һ�����͵�����Ϊ�գ���֪ͨһ��emptyЭ�鲢��category�����ı�ʶ��URL���ݡ�<br>
     * 5. ֪ͨ��(��ע������ʵ��)�豣֤֪ͨ��˳�򣬱��磺���߳����ͣ����д��л������汾�Աȡ�<br>
     * 
     * @param urls ��ע����Ϣ�б��ܲ�Ϊ�գ�����ͬ{@link com.alibaba.dubbo.registry.RegistryService#lookup(URL)}�ķ���ֵ��
     */
    void notify(List<URL> urls);

}
