package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/15 下午9:46
 */
public class HJ24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }

        int max_val = 0;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j] < nums[i]){
                    dp1[i] = Math.max(dp1[i],dp1[j]+1);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i] > nums[j]){
                    dp2[i] = Math.max(dp2[i],dp2[j]+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            int cnt = dp1[i] + dp2[i] -1;
            max_val = Math.max(max_val,cnt);
        }

        System.out.println(n-max_val);
    }
}
