package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 上午8:15
 */
public class HJ92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) { // 注意 while 处理多个 case
            String s = in.next();
            int n = s.length();
            int[] dp = new int[n];
            int max =0;
            dp[0] = Character.isDigit(s.charAt(0))?1:0;
            for(int i=1;i<n;i++){
                if(Character.isDigit(s.charAt(i))){
                    dp[i] = dp[i-1]+1;
                }else{
                    dp[i] = 0;
                }
                if(dp[i] >max){
                    max = dp[i];
                }
            }
            for(int i=0;i<n;i++){
                if(dp[i] ==max){
                    System.out.print(s.substring(i+1-max,i+1));
                }
            }
            System.out.println(","+max);
        }
    }
}
