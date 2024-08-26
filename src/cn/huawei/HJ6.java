package cn.huawei;

import java.util.Scanner;

public class HJ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();
        long k =(long)Math.sqrt(input);
        for(long i =2;i<=k;i++){
            while(input%i ==0){
                System.out.print(i+" ");
                input/=i;
            }
        }
        System.out.println(input == 1 ? "": input+" ");
    }
}
