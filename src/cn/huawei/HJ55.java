package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午7:26
 */
public class HJ55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 0;
        for(int i=1;i<=n;i++){
            if(relevant_7(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean relevant_7(int n){
        if(n%7 == 0){
            return true;
        }
        while(n>0){
            int temp = n%10;
            if(temp == 7){
                return true;
            }
            n/=10;
        }
        return false;
    }
}
