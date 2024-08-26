package cn.huawei;

import java.util.Scanner;

public class HJ59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            if(freq[ch-'a'] == 1){
                System.out.println(ch);
                return;
            }
        }

        System.out.println(-1);
    }
}
