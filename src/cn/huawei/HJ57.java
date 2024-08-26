package cn.huawei;

import java.util.Scanner;

public class HJ57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int m = s1.length()-1;
        int n = s2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(m>=0 && n>=0){
            int cur = s1.charAt(m)-'0'+s2.charAt(n)-'0'+carry;
            carry=cur/10;
            sb.append(cur%10);
            m--;
            n--;
        }
        while(m>=0){
            int cur = s1.charAt(m)-'0'+carry;
            carry=cur/10;
            sb.append(cur%10);
            m--;
        }
        while(n>=0){
            int cur = s2.charAt(n)-'0'+carry;
            carry=cur/10;
            sb.append(cur%10);
            n--;
        }
        if(carry == 1){
            sb.append(1);
        }
        System.out.println(sb.reverse());
    }
}
