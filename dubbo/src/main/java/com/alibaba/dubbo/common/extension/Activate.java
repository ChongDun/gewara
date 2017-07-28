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
package com.alibaba.dubbo.common.extension;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Activate
 * <p />
 * ���ڿ��Ա�������Զ����������չ����Annotation����������չ���Զ��������������
 * ���磬������չ���ж��ʵ�֣�ʹ��Activate Annotation����չ���Ը����������Զ����ء�
 * <ol>
 * <li>{@link Activate#group()}��Ч��Group�����������ЩGroupֵ�ɿ��SPI������
 * <li>{@link Activate#value()}��{@link com.alibaba.dubbo.common.URL}��Key�������У�����Ч��
 * </ol>
 *
 * <p />
 * �ײ���SPI�ṩ��ͨ��{@link com.alibaba.dubbo.common.extension.ExtensionLoader}��{@link ExtensionLoader#getActivateExtension}����
 * �����������չ��
 *
 * @author william.liangf
 * @author ding.lid
 * @export
 * @see SPI
 * @see ExtensionLoader
 * @see ExtensionLoader#getActivateExtension(com.alibaba.dubbo.common.URL, String[], String)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Activate {
    /**
     * Group����������
     * <br />
     * ����{@link ExtensionLoader#getActivateExtension}��group��������ֵ���򷵻���չ��
     * <br />
     * ��û��Group���ã��򲻹��ˡ�
     */
    String[] group() default {};

    /**
     * Key��������������{@link ExtensionLoader#getActivateExtension}��URL�Ĳ���Key���У��򷵻���չ��
     * <p />
     * ʾ����<br/>
     * ע���ֵ <code>@Activate("cache,validatioin")</code>��
     * ��{@link ExtensionLoader#getActivateExtension}��URL�Ĳ�����<code>cache</code>Key������<code>validatioin</code>�򷵻���չ��
     * <br/>
     * ��û�����ã��򲻹��ˡ�
     */
    String[] value() default {};

    /**
     * ������Ϣ�����Բ��ṩ��
     */
    String[] before() default {};

    /**
     * ������Ϣ�����Բ��ṩ��
     */
    String[] after() default {};

    /**
     * ������Ϣ�����Բ��ṩ��
     */
    int order() default 0;
}
