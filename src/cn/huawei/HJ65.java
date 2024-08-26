package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午8:26
 */
public class HJ65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        if(s1.length()>s2.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int m =s1.length();
        int n = s2.length();

        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = s1.charAt(i)==s2.charAt(0)?1:0;
        }
        for(int i=1;i<n;i++){
            dp[0][i] = s1.charAt(0)==s2.charAt(i)?1:0;
        }
        int max = 0;
        int index = 0;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = 0;
                }
                if(dp[i][j] > max){
                    max = dp[i][j];
                    index = i;
                }
            }
        }
        System.out.println(s1.substring(index+1-max,index+1));
    }

}
