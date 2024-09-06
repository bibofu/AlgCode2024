package cn.huawei;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/2 下午9:33
 */
public class OD147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int sum = 0;
        int temp = 0;
        for(int i:nums){
            sum+=i;
            temp^=i;
        }

        if(temp!=0){
            System.out.println(-1);
        }else{
            System.out.println(sum-nums[0]);
        }

    }
}
