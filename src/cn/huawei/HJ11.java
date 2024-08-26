package cn.huawei;

import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if(input ==0){
            System.out.println(0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        while(input>0){
            int num = input%10;
            sb.append(num);
            input/=10;
        }
        System.out.println(sb.toString());
    }
}
