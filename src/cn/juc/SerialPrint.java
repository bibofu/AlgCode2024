package cn.juc;

/**
 * @author bibofu
 * @Date 2024/8/16 下午7:12
 */

/**
 * 按序打印
 */
public class SerialPrint {
    public static void main (String[] args) throws Exception{
        Thread t1 = new Thread(()->{
            System.out.println("111");
        });
        Thread t2 = new Thread(()->{
            System.out.println("222");
        });
        Thread t3 = new Thread(()->{
            System.out.println("333");
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();


    }
}
