package cn.huawei;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author bibofu
 * @Date 2024/9/6 上午1:24
 */
public class OD220 {
    static String res;
    static int index;
    static boolean find = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] use = new boolean[n+1];
        index = 0;

        dfs(n,k,"",use);

        System.out.println(res);
    }

    public static void dfs(int n,int k,String s,boolean[] use){
        if(s.length() == n){
            index ++;
            if(index == k){
                res = s;
                find = true;
            }
        }
        if(find){
            return;
        }

        for(int i=1;i<=n;i++){
            if(use[i]){
                continue;
            }
            use[i] = true;
            dfs(n,k,s+String.valueOf(i),use);
            use[i] = false;

        }
    }


}
