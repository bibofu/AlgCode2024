package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/4 上午12:38
 */
public class OD394 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k =sc.nextInt();

        int[] dp = new int[n];
        Arrays.fill(dp,-100000);
        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            for(int j=Math.max(0,i-k);j<i;j++){
                dp[i] = Math.max(dp[i],dp[j]+nums[i]);
            }
        }

        System.out.println(dp[n-1]);
    }
}
