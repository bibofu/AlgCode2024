package cn.huawei;

import java.util.Scanner;

public class HJ84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int cnt = 0;
        for(char ch:s.toCharArray()){
            if(ch <='Z'&&ch>='A'){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
