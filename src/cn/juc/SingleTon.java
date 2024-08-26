package cn.juc;

/**
 * @author bibofu
 * @Date 2024/8/16 下午7:02
 */
public class SingleTon {

    public SingleTon(){

    }
    private static volatile SingleTon instance;
    private static SingleTon get_instance(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){
                    instance = new SingleTon();
                    return instance;
                }
            }
        }

        return instance;

    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(()->{
                System.out.println(SingleTon.get_instance());
            }).start();
        }
    }
}
