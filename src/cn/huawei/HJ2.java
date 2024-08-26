package cn.huawei;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int res = 0;
        char ch = in.nextLine().charAt(0);
        for(int i=0;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(ch)){
                res++;
            }
        }
        System.out.println(res);

    }
}
