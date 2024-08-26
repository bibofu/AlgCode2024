package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/15 下午9:07
 */
public class HJ32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        int max = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[j][i] = s.charAt(i)==s.charAt(j);
                }else{
                    dp[j][i] = dp[j+1][i-1] && (s.charAt(i)==s.charAt(j));
                }

                if(dp[j][i]){
                    max = Math.max(max,i-j+1);
                }
            }
        }

        System.out.println(max);
    }
}
