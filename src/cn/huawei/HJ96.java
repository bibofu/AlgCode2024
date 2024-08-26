package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午6:45
 */
public class HJ96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder();

        int n = input.length();
        if(Character.isDigit(input.charAt(0))){
            sb.append("*");
        }
        for(int i=0;i<n-1;i++){
            char ch = input.charAt(i);
            char ch2 = input.charAt(i+1);
            if((Character.isLetter(ch) ||ch =='*')&&Character.isDigit(ch2)){
                sb.append(ch);
                sb.append("*");
            }else if(Character.isDigit(ch) && !Character.isDigit(ch2)){
                sb.append(ch);
                sb.append("*");
            }else{
                sb.append(ch);
            }
        }

        if(Character.isDigit(input.charAt(n-1))){
            sb.append(input.charAt(n-1));
            sb.append("*");
        }else{
            sb.append(input.charAt(n-1));
        }

        System.out.println(sb.toString());

    }
}
