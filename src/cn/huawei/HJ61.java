package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午10:09
 */
public class HJ61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][1] = 1;
            dp[i][0] = 1;
        }

        //1.至少一个盘子空着，(m,n)问题转换为(m,n-1)问题;
        //2.不存在空盘子，每个盘子上至少有1个苹果，最多剩下m-n个苹果;
        //dp[i][j] = dp[i][j-1]+dp[i-j][j]
        for(int j=2;j<=n;j++){
            for(int i=0;i<=m;i++){
                if(i<j){
                    dp[i][j] = dp[i][j-1];
                }else{
                    dp[i][j] = dp[i][j-1]+dp[i-j][j];
                }
            }
        }

        System.out.println(dp[m][n]);
    }

}
