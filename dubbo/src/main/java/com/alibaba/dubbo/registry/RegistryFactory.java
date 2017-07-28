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

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * RegistryFactory. (SPI, Singleton, ThreadSafe)
 * 
 * @see com.alibaba.dubbo.registry.support.AbstractRegistryFactory
 * @author william.liangf
 */
@SPI("dubbo")
public interface RegistryFactory {

    /**
     * ����ע������.
     * 
     * ����ע�������账����Լ��<br>
     * 1. ������check=falseʱ��ʾ��������ӣ����������Ӳ���ʱ�׳��쳣��<br>
     * 2. ֧��URL�ϵ�username:passwordȨ����֤��<br>
     * 3. ֧��backup=10.20.153.10��ѡע�����ļ�Ⱥ��ַ��<br>
     * 4. ֧��file=registry.cache���ش����ļ����档<br>
     * 5. ֧��timeout=1000����ʱ���á�<br>
     * 6. ֧��session=60000�Ự��ʱ��������á�<br>
     * 
     * @param url ע�����ĵ�ַ��������Ϊ��
     * @return ע���������ã��ܲ����ؿ�
     */
    @Adaptive({"protocol"})
    Registry getRegistry(URL url);

}
