package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/20 上午1:08
 */
public class OD219 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }


        System.out.println(helper(nums,k));

    }

    public static int helper(int[] nums,int k){
        int remain = 0;
        int times = 0;
        for(int i:nums){
            if(remain + i > k){
                remain = remain + i - k;
            }else{
                remain = 0;
            }
            times++;
        }

        while(remain > 0){
            remain-=k;
            times++;
        }

        return times;
    }
}
