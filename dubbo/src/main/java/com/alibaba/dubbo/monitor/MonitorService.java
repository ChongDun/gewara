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
package com.alibaba.dubbo.monitor;

import java.util.List;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;

/**
 * MonitorService. (SPI, Prototype, ThreadSafe)
 * 
 * @author william.liangf
 */
public interface MonitorService {
    
    String APPLICATION = "application";
    
    String INTERFACE = "interface";

    String METHOD = "method";

    String GROUP = "group";

    String VERSION = "version";

    String CONSUMER = "consumer";

    String PROVIDER = "provider";
    
    String TIMESTAMP = "timestamp";

    String SUCCESS = "success";

    String FAILURE = "failure";
    
    String INPUT = Constants.INPUT_KEY;

    String OUTPUT = Constants.OUTPUT_KEY;

    String ELAPSED = "elapsed";

    String CONCURRENT = "concurrent";

    String MAX_INPUT = "max.input";

    String MAX_OUTPUT = "max.output";

    String MAX_ELAPSED = "max.elapsed";

    String MAX_CONCURRENT = "max.concurrent";

    /**
     * ������ݲɼ�.
     * 1. ֧�ֵ��ô���ͳ�ƣ�count://host/interface?application=foo&method=foo&provider=10.20.153.11:20880&success=12&failure=2&elapsed=135423423
     * 1.1 host,application,interface,group,version,method ��¼�����Դ������Ӧ�ã��ӿڣ�������Ϣ��
     * 1.2 ����������߷��͵����ݣ�����provider��ַ��������֮��������Դconsumer��ַ������
     * 1.3 success,faulure,elapsed ��¼���ϴβɼ������õĳɹ�������ʧ�ܴ������ɹ������ܺ�ʱ��ƽ��ʱ�佫���ܺ�ʱ���Գɹ�������
     * 
     * @param statistics
     */
    void collect(URL statistics);

    /**
     * ������ݲ�ѯ.?
     * 1. ֧�ְ����ѯ��count://host/interface?application=foo&method=foo&side=provider&view=chart&date=2012-07-03
     * 1.1 host,application,interface,group,version,method ��ѯ������Ӧ�ã��ӿڣ�������ƥ��������ȱʧ�������ı�ʾȫ����host��0.0.0.0��ʾȫ����
     * 1.2 side=consumer,provider ��ѯ�ɵ��õ���һ�˲ɼ������ݣ�ȱʡΪ����ѯ��
     * 1.3 ȱʡΪview=summary������ȫ�������Ϣ��֧��view=chart��ʾ����ȫ������ͼ��ͼƬ��URL��ַ�����Խ���Ƕ������ϵͳ��ҳ����չʾ��
     * 1.4 date=2012-07-03 ָ����ѯ���ݵ����ڣ�ȱʡΪ���졣
     * 
     * @param query
     * @return statistics
     */
    List<URL> lookup(URL query);

}
