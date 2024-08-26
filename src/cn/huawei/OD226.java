package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/8/17 下午8:27
 */
public class OD226 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ability = sc.nextInt();
        int cnt = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = n-1;
        if(nums[left] >= ability){
            System.out.println(n);
            return;
        }
        while(left < right){
            if(nums[right] >=ability){
                cnt++;
                right--;
            }else if(nums[left]+nums[right] >=ability){
                cnt++;
                left++;
                right--;
            }else if(nums[left] + nums[right] < ability){
                left++;
            }
        }

        System.out.println(cnt);
    }
}
