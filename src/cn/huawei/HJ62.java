package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午7:11
 */
public class HJ62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int cnt = 0;
            while(n>0){
                if((n&1) == 1){
                    cnt++;
                }
                n>>=1;
            }

            System.out.println(cnt);
        }

    }
}
