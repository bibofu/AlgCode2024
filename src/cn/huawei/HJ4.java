package cn.huawei;

import java.io.FilterOutputStream;
import java.util.*;

public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int n = input.length();
        String[] strs;
        if(n%8!=0){
            strs = new String[n/8+1];
        }else{
            strs = new String[n/8];
        }

        int index = 0;
        while(index*8 +8 <=n){
            strs[index] = input.substring(index*8,index*8+8);
            index++;
        }
        if(n%8!=0){
            strs[index] = helper(input.substring(index*8,n));
        }

        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
    }

    public static String helper(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while(sb.length() < 8){
            sb.append(0);
        }

        return sb.toString();
    }
}
