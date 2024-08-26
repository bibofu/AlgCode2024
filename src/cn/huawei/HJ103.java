package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 上午8:25
 */
public class HJ103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        /**最长递增子序列*/
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int max = 0;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }
}
