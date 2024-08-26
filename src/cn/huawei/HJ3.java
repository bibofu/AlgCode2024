package cn.huawei;

import java.util.*;

public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int index =1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i=0;i<index;i++){
            System.out.println(nums[i]);
        }
    }
}
