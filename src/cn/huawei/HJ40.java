package cn.huawei;

import java.util.Scanner;

public class HJ40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int letter =0,space = 0,digit=0,other=0;
        int n = input.length();
        for(int i=0;i<n;i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                letter++;
            }else if(Character.isDigit(ch)){
                digit++;
            }else if(Character.isSpaceChar(ch)){
                space++;
            }else{
                other++;
            }
        }
        System.out.println(letter);
        System.out.println(space);
        System.out.println(digit);
        System.out.println(other);
    }
}
