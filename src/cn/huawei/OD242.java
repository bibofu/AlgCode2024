package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/3 下午8:08
 */
public class OD242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        System.out.println(helper(nums));
    }

    public static int helper(int[] nums){
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 4){
                nums[i]--;
            }
            res += (int) (nums[i] * Math.pow(9,nums.length-i-1));
        }

        return res;
    }


}
