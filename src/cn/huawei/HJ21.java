package cn.huawei;

import java.util.Scanner;

public class HJ21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<input.length();i++){
            sb.append(trans(input.charAt(i)));
        }
        System.out.println(sb.toString());
    }
    public static char trans(char ch){
        if(ch>='A' && ch <'Z'){
            return (char)(ch+33);
        }else if (ch == 'Z'){
            return 'a';
        }else if(ch >='a' && ch<='c'){
            return '2';
        }else if(ch >='d' && ch<='f'){
            return '3';
        }else if(ch >='g' && ch<='i'){
            return '4';
        }else if(ch >='j' && ch<='l'){
            return '5';
        }else if(ch >='m' && ch<='o'){
            return '6';
        }else if(ch >='p' && ch<='s'){
            return '7';
        }else if(ch >='t' && ch<='v'){
            return '8';
        }else if(ch >='w' && ch<='z'){
            return '9';
        }
        return ch;
    }
}
