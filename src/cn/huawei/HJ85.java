package cn.huawei;

import java.util.Scanner;

public class HJ85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = s.length();
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i-j<2){
                    dp[j][i]=s.charAt(j)==s.charAt(i);
                }else{
                    dp[j][i]=dp[j+1][i-1]&&s.charAt(j)==s.charAt(i);
                }

                if(dp[j][i]){
                    res = Math.max(res,i-j+1);
                }

            }
        }

        System.out.println(res);
    }
}
