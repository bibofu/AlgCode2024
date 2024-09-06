package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/3 上午10:06
 */
public class OD154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        String[] strs = s.split("-");

        StringBuilder res = new StringBuilder();

        StringBuilder sb= new StringBuilder();
        res.append(strs[0]);
        if(strs.length == 1){
            System.out.println(res);
            return;
        }
        res.append("-");
        for (int i = 1; i < strs.length; i++) {
            sb.append(strs[i]);
        }

        int index = 0;
        while(index < sb.length()){
            if(index + k >= sb.length()){
                String temp = sb.substring(index);
                res.append(helper(temp));
                break;
            }else{
                String temp = sb.substring(index,index+k);
                res.append(helper(temp));
                res.append("-");
                index+=k;
            }
        }

        System.out.println(res.toString());

    }

    public static String helper(String s){
        int lower = 0;
        int upper = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                lower++;
            }else if(c >= 'A' && c <= 'Z'){
                upper++;
            }
        }

        if(lower == upper){
            return s;
        }else if(lower > upper){
            char[] arr = s.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= 'A' && arr[i] <= 'Z'){
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }

            return String.valueOf(arr);
        }else {
            char[] arr = s.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i] >= 'a' && arr[i] <= 'z'){
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
            return String.valueOf(arr);
        }
    }

}
