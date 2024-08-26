package cn.huawei;

import java.util.Scanner;

public class HJ37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=2){
            System.out.println(1);
            return;
        }
        int[] dp = new int[n];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-2]+dp[i-1];
        }

        System.out.println(dp[n-1]);
    }
}
