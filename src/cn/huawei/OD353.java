package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/17 下午8:13
 */
public class OD353 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums.length;
        if(n > 8){
            System.out.println(-1);
            return;
        }
        Arrays.sort(nums);
        int left = 1;
        int right = nums[n-1];
        int res = 0;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(get_time(nums,mid) <= 8){
                res = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println(res);

    }

    public static int get_time(int[] nums,int speed){
        int cnt = 0;
        for(int i:nums){
            if(i%speed == 0){
                cnt = cnt + i/speed;
            }else{
                cnt = cnt + i/speed + 1;
            }
        }
        return cnt;
    }
}
