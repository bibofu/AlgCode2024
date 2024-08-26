package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午6:25
 */
public class HJ29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(incrypt(s1));
        System.out.println(decrypt(s2));
    }
    public static String incrypt(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(c == '9'){
                    sb.append('0');
                }else{
                    sb.append((char)(c+1));
                }
            }else{


                if(c =='z'){
                    sb.append('A');
                }else if(c =='Z'){
                    sb.append('a');
                }else {
                    if(c>='a' &&c<'z'){
                        sb.append((char)(c-31));
                    }else{
                        sb.append((char)(c+33));
                    }
                }
            }
        }

        return sb.toString();
    }

    public static String decrypt(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                if(c == '0'){
                    sb.append('9');
                }else{
                    sb.append((char)(c-1));
                }
            }else{


                if(c =='A'){
                    sb.append('z');
                }else if(c =='a'){
                    sb.append('Z');
                }else {
                    if(c>'a' &&c<='z'){
                        sb.append((char)(c-33));
                    }else{
                        sb.append((char)(c+31));
                    }
                }
            }
        }

        return sb.toString();

    }
}
