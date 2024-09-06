package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/5 下午9:24
 */
public class OD354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int h = Integer.parseInt(sc.nextLine());
        Arrays.sort(nums);

        int left = 1;
        int right = nums[nums.length-1];

        int res = 0;
        while(left <= right){
            int speed = left+(right-left)/2;
            if(get_time(nums,speed) <= h){
                res = speed;
                right = speed - 1;
            }else{
                left = speed + 1;
            }
        }

        System.out.println(res);

    }


    public static int get_time(int[] nums,int speed){
        int res = 0;
        for(int i:nums){
            if(i%speed == 0){
                res += i/speed;
            }else{
                res += i/speed +1;
            }
        }

        return res;
    }
}
