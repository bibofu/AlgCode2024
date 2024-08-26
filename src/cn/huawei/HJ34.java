package cn.huawei;

import java.util.Scanner;

public class HJ34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int[] freq = new int[126];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<126;i++){
            while(freq[i] !=0 ){
                System.out.print((char)i);
                freq[i]--;
            }
        }
    }
}
