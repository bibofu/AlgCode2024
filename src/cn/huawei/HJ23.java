package cn.huawei;

import java.util.Scanner;

public class HJ23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int[] freq = new int[26];
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            freq[ch-'a']++;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i] >=1 && freq[i] <= min){
                min = freq[i];
            }
        }
        String s = "";
        for(int i=0;i<input.length();i++){
            if(freq[input.charAt(i)-'a'] !=min){
                s+=input.charAt(i);
            }
        }
        System.out.println(s);
    }
}
