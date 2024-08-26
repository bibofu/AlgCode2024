package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午6:28
 */
public class HJ99 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        for(int i=0;i<=n;i++){
            if(is_zishou(i)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    public static boolean is_zishou(int n){
        int len = 0;
        int temp=n;
        while(temp>0){
            len++;
            temp/=10;
        }
        return (n*n)%Math.pow(10,len) ==n;
    }
}
