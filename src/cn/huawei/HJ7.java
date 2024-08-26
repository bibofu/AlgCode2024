package cn.huawei;

import java.util.Scanner;

public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double input = in.nextDouble();
        int res = (int) input;
        double rest = input%1.0f;
        if(rest < 0.5f){
            System.out.println(res);
        }else{
            System.out.println(res+1);
        }
    }
}
