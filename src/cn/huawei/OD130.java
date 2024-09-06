package cn.huawei;

import java.awt.*;
import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.StreamSupport;

/**
 * @author bibofu
 * @Date 2024/9/3 下午12:27
 */

/**
 *  动态规划
 * */
public class OD130 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(",");
        int n =strs.length;
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }

        int target = Integer.parseInt(sc.nextLine());
        int res = 0;
        int left = 0;
        int right = 0;
        int pre_sum = 0;
        while(right < n){
            if(left>right || pre_sum+nums[right] <= target){
                pre_sum += nums[right];
                right++;
            }else{
                pre_sum -= nums[left];
                left++;
            }

            if(pre_sum == target){
                res = Math.max(res,right-left);
            }


        }

        if(res == 0){
            System.out.println(-1);
        }else{
            System.out.println(res);
        }


    }


}
