package com.gewara.trace.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���������ʹ�ø�ע�⣬�÷��������������<br/>
 * ���Ϊ������ڵ�,����<b>��Ҫ����traceid</b>����������statusֵΪbegin,��{@link #status()}
 * <br>���꣺<hr>http://wk.gewara.com/pages/viewpage.action?pageId=19147575</hr>
 * @author quzhuping
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GwTrace {
	/**
	 * ���Ϊ������ڵ�,����<b>��Ҫ����traceid</b>����������ֵΪbegin
	 * <pre><code>@GwTrace(status="begin")</code></pre>
	 * @return
	 */
	String status() default "normal";
}
