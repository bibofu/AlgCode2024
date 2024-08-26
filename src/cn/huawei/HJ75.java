package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 上午8:39
 */
public class HJ75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        int max = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(j);
                if(ch1 == ch2){
                    if(i==0 || j==0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i-1][j-1]+1;
                    }
                }else{
                    dp[i][j] = 0;
                }

                max = Math.max(max,dp[i][j]);
            }
        }

        System.out.println(max);
    }
}
