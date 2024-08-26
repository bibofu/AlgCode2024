package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午5:28
 */
public class HJ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder(input);
        StringBuilder letters = new StringBuilder();
        for(char ch:input.toCharArray()){
            if(Character.isLetter(ch)){
                letters.append(ch);
            }
        }

        StringBuilder newsb = new StringBuilder();
        for(char c ='A';c<='Z';c++){
            for(int i=0;i<letters.length();i++){
                if(letters.charAt(i) ==c || Character.toUpperCase(letters.charAt(i)) ==c){
                    newsb.append(letters.charAt(i));
                }
            }
        }

        int index = 0;
        for(int i=0;i<sb.length();i++){
            if(Character.isLetter(sb.charAt(i))){
                sb.setCharAt(i,newsb.charAt(index));
                index++;
            }
        }
        System.out.println(sb.toString());
    }
}
