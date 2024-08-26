package cn.huawei;

import java.util.Scanner;
public class HJ35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        int cur = 1;
        for(int i=0;i<n;i++){
            int temp = i;
            for(int j=0;j<=i;j++){
                nums[temp][j] = cur;
                cur++;
                temp--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();
        }
    }


}
