package com.gewara.trace;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ������<br>
 * ������ÿ��100<br>
 * ����100��10%����
 * @author quzhuping
 *
 */
public class Sampler {
	private AtomicInteger count = new AtomicInteger();
    private int baseNumber = 100;
    private Long lastTime = -1L;

    public Sampler(){
        lastTime = System.currentTimeMillis();
    }

    /**
     * �Ƿ����
     * @return true����
     */
    public boolean isSample(){
       boolean isSample = true;
       long n = count.incrementAndGet();
       if(System.currentTimeMillis() - lastTime  < 1000){
           if(n > baseNumber){
               n = n%10;
               if(n != 0){
                   isSample = false;
               }
           }
       }else{
           count.getAndSet(0);
           lastTime = System.currentTimeMillis();//
       }
       return isSample;
    }
}
