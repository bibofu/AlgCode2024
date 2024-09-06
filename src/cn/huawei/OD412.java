package cn.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/6 上午1:02
 */
public class OD412 {

    static int res;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int target_len = Integer.parseInt(sc.next());

        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c < 'a' || c > 'z'){
                System.out.println(0);
                return;
            }
            list.add(c);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(char ch:list){
            sb.append(ch);
        }

        int n = sb.length();
        boolean[] use = new boolean[n];
        res = 0;

        dfs(sb.toString(),target_len,"",use,0);
        System.out.println(res);
    }

    public static void dfs(String s,int target_len,String temp,boolean[] use,int cur_len){
        if(cur_len == target_len){
            res++;
            return;
        }

        for(int i=0;i<s.length();i++){
            if(use[i]){
                continue;
            }
            if(temp.length() >=1 && s.charAt(i) == temp.charAt(temp.length()-1)){
                continue;
            }

            /* 这一行是关键！！！ */
            if(i>0 && s.charAt(i) == s.charAt(i-1) && !use[i-1]){
                continue;
            }
            use[i] = true;
            dfs(s,target_len,temp+s.charAt(i),use,cur_len+1);
            use[i] = false;
        }
    }


}
