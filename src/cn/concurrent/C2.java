package cn.concurrent;

/**
 * @author bibofu
 * @Date 2024/8/15 下午11:34
 */
public class C2 {
    private static String a = "A";
    private static String b = "B";
    public static void main(String[] args) {
        dead_lock();
    }

    public static void dead_lock(){
        Thread t1 = new Thread(()->{
            synchronized (a){
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (b){
                    System.out.println("1");
                }
            }
        });

        Thread t2 = new Thread(()->{
            synchronized (b){
                synchronized (a){
                    System.out.println("2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
