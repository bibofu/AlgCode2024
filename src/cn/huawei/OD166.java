package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/6 上午1:49
 */
public class OD166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(helper(n));
    }

    public static long helper(long n){
        if(n == 1){
            return 0;
        }
        if(n%2 == 1){
            return Math.min(helper(n-1),helper(n+1)) + 1;
        }else{
            long times = 0;
            while(n % 2 == 0){
                times++;
                n/=2;
            }
            return times + helper(n);
        }
    }
}
