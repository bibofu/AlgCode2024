package cn.concurrent;

import org.junit.Test;

/**
 * @author bibofu
 * @Date 2024/8/16 下午5:36
 */
public class C3 {
    public  void test(int i){
        System.out.println(i);
    }

    @Test
    public void ssad(){
        for(int i=0;i<10;i++){
            int finalI = i;
            new Thread(()->{
                test(finalI);
            }).start();
        }
    }
}
