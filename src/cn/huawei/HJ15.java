package cn.huawei;

import java.util.Scanner;

public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int cnt = 0;
        while(input>0){
            if((input & 1) == 1){
                cnt++;
            }
            input >>=1;
        }
        System.out.println(cnt);
    }
}
