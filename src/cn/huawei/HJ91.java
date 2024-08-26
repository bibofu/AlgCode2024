package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午6:51
 */
public class HJ91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt()+1;
        int n = in.nextInt()+1;
        int[][] dp = new int[m][n];
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}
