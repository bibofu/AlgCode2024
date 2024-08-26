package cn.huawei;

import java.util.Scanner;

public class HJ81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String short_s = in.nextLine();
        String long_s = in.nextLine();
        int[] freq = new int[26];
        for(char ch:long_s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:short_s.toCharArray()){
            //freq[ch-'a']--;
            if(freq[ch-'a'] <= 0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
