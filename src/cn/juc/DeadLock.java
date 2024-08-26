package cn.juc;

/**
 * @author bibofu
 * @Date 2024/8/16 下午7:06
 */
public class DeadLock {
    private final static String a = "a";
    private final static String b = "b";

    public static void dead1(){
        new Thread(()->{
            synchronized(a){
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (b){
                    System.out.println("a");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (b){
                synchronized (a){
                    System.out.println("b");
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        dead1();
    }
}
