package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/3 下午7:38
 */
public class OD266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        boolean[] res = new boolean[n];
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String[] strs = s.split(" ");
            int[] nums = new int[strs.length];
            for(int j=0;j<nums.length;j++){
                if(strs[j].equals("absent")){
                    nums[j] = -1;
                }else if(strs[j].equals("late") || strs[j].equals("leaveearly")){
                    nums[j] = -2;
                }else{
                    nums[j] = 0;
                }
            }

            res[i] = helper(nums);
        }

        for(boolean b:res){
            System.out.print(b+" ");
        }
    }

    public static boolean helper(int[] nums){
        //absent -1 late/leave -2
        int absent_cnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == -1){
                absent_cnt++;
            }else if(nums[i] == -2 && i>=1 && nums[i-1] == -2){
                return false;
            }
        }
        if(absent_cnt > 1){
            return false;
        }

        if(nums.length <= 7){
            return check(nums);
        }

        for(int i=0;i<=nums.length-7;i++){
            if(!check(Arrays.copyOfRange(nums,i,i+7))){
                return false;
            }
        }

        return true;
    }

    public static boolean check(int[] nums){
        int cnt = 0;
        for(int i:nums){
            if(i < 0){
                cnt++;
            }
        }

        return cnt<=3;
    }
}
