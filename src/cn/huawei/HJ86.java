package cn.huawei;

import java.util.Scanner;

public class HJ86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cur = 0;
        int max = 0;
        while(n>0){
            if((n&1) == 1){
                cur++;
            }else{
                cur = 0;
            }
            n>>=1;
            max = Math.max(max,cur);
        }

        System.out.println(max);
    }
}
