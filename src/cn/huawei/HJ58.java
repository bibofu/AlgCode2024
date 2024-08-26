package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

public class HJ58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
