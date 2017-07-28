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
package com.alibaba.dubbo.common;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ��չ��ӿڵı�ʶ��
 * <p />
 * ��չ�����������ļ�����ʽ�޸ġ�<br />
 * ��Protocolʾ���������ļ�META-INF/dubbo/com.xxx.Protocol���ݣ�<br />
 * ��<br/>
 * <pre><code>com.foo.XxxProtocol
 com.foo.YyyProtocol</code></pre><br/>
 * �ĳ�ʹ��KV��ʽ<br/>
 * <pre><code>xxx=com.foo.XxxProtocol
 yyy=com.foo.YyyProtocol
 * </code></pre>
 * <br/>
 * ԭ��<br/>
 * ����չ���static�ֶλ򷽷�ǩ���������������⣬
 * ��������ⲻ���ڣ��ᵼ�����ʼ��ʧ�ܣ�
 * Extension��ʶDubbo���ò����ˣ��쳣��Ϣ�ͺ����ö�Ӧ��������
 * <br/>
 * ����:
 * Extension("mina")����ʧ�ܣ�
 * ���û�����ʹ��minaʱ���ͻᱨ�Ҳ�����չ�㣬
 * �����Ǳ�������չ��ʧ�ܣ��Լ�ʧ��ԭ��
 * 
 * @deprecated ��Ϊ����㷺���������ù� {@link com.alibaba.dubbo.common.extension.SPI}
 * @author william.liangf
 * @author ding.lid
 * @export
 */
@Deprecated
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extension {

    /**
     * @deprecated
     */
    @Deprecated
	String value() default "";

}
