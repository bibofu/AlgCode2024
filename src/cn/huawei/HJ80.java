package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午7:21
 */
public class HJ80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] num1 = new int[m];
        for(int i=0;i<m;i++){
            num1[i] = in.nextInt();
        }
        int n = in.nextInt();
        int[] num2 = new int[n];
        for(int i=0;i<n;i++){
            num2[i] = in.nextInt();
        }

        int[] res = new int[m+n];
        Arrays.sort(num1);
        Arrays.sort(num2);
        int index1=0;
        int index2=0;
        int index = 0;
        while(index1<m&&index2<n){
            if(num1[index1] <num2[index2]){
                res[index] = num1[index1];
                index++;
                index1++;
            }else{
                res[index] = num2[index2];
                index++;
                index2++;
            }
        }
        while(index1<m){
            res[index] = num1[index1];
            index++;
            index1++;
        }
        while(index2<n){
            res[index] = num2[index2];
            index++;
            index2++;
        }

        System.out.print(res[0]);
        for(int i=1;i<m+n;i++){
            if(res[i]!=res[i-1]){
                System.out.print(res[i]);
            }
        }
    }
}
