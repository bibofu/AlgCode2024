package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 上午10:32
 */
public class HJ72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 5;
        int b = 3;
        //double c= 1/3;
        for(int i=0;i<=20;i++){
            for(int j=0;j<=34;j++){
                if(((100-i-j)%3 ==0) && a*i+b*j+ (double) (100 - i - j) /3 == 100.0){
                    System.out.println(i+" "+j+" "+(100-i-j));
                }
            }
        }
    }
}
