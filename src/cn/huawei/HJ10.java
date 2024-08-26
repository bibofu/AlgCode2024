package cn.huawei;

import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        String input = in.nextLine();
        int[] freq = new int[128];
        for(int i=0;i<input.length();i++){
            freq[input.charAt(i)]++;
        }
        for(int i=0;i<128;i++){
            if(freq[i]!=0){
                res++;
            }
        }

        System.out.println(res);

    }
}
