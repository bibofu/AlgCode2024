package cn.huawei;

import java.util.Scanner;

public class HJ60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n/2;i>=1;i--){
            if(is_zhishu(i) &&is_zhishu(n-i)){
                System.out.println(i);
                System.out.println(n-i);
                break;
            }
        }
    }
    public static boolean is_zhishu(int n){
        if(n == 1||n==2){
            return true;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
}
