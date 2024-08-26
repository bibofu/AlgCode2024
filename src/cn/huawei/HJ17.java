package cn.huawei;

import java.util.Scanner;
public class HJ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] strs = input.split(";");
        int row = 0;
        int col = 0;
        for(String s:strs){
            if(is_valid(s)){
                if(s.charAt(0) == 'A'){
                    row -= Integer.valueOf(s.substring(1));
                }else if(s.charAt(0) == 'D'){
                    row += Integer.valueOf(s.substring(1));
                }else if(s.charAt(0) == 'W'){
                    col += Integer.valueOf(s.substring(1));
                }else if(s.charAt(0) == 'S'){
                    col -= Integer.valueOf(s.substring(1));
                }
            }
        }

        System.out.println(row+","+col);
    }

    public static boolean is_valid(String s){
        if(s==null || s.length()<= 1||s.length()>3){
            return false;
        }
        s = s.trim();
        if(s.charAt(0) < 'A' ||s.charAt(0) > 'Z'){
            return false;
        }
        if(s.charAt(1) <'1' || s.charAt(1)>'9'){
            return false;
        }
        if(s.length()>2 &&(s.charAt(2) < '0'||s.charAt(2)>'9')){
            return false;
        }
        return true;
    }
}
