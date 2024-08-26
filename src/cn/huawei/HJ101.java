package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午6:15
 */
public class HJ101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        int op = in.nextInt();
        Arrays.sort(nums);
        if(op == 0){
            for(int i=0;i<n;i++){
                System.out.print(nums[i]+" ");
            }
        }else if(op == 1){
            for(int i=n-1;i>=0;i--){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
