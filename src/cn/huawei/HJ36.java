package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午5:43
 */
public class HJ36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        String s = in.nextLine();

        StringBuilder sb = new StringBuilder();
        for(char ch:key.toCharArray()){
            if(sb.indexOf(String.valueOf(ch)) == -1){
                sb.append(ch);
            }
        }
        for(char c ='a';c<='z';c++){
            if(sb.indexOf(String.valueOf(c)) == -1){
                sb.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder(s);
        for(int i=0;i<sb2.length();i++){
            sb2.setCharAt(i,sb.charAt(sb2.charAt(i)-'a'));
        }

        System.out.println(sb2.toString());

    }
}
