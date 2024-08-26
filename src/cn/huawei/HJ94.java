package cn.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 上午11:30
 */
public class HJ94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int invalid = 0;
        String[] strs = new String[n];
        //String[] strs = s.split(" ");
        for(int i=0;i<n;i++){
            strs[i] = in.next();
        }
        Map<String,Integer> map = new HashMap<>();
        int m = in.nextInt();
        String[] ss = new String[m];
        for(int i=0;i<m;i++){
            ss[i] = in.next();
        }

        for(String s2:ss){
            if(is_in(strs,s2)){
                if(map.containsKey(s2)){
                    map.put(s2,map.get(s2)+1);
                }else{
                    map.put(s2,1);
                }
            }else{
                invalid++;
            }
        }

        for(String s5:strs){
            if(map.containsKey(s5)){
                System.out.println(s5+" : "+map.get(s5));
            }else{
                System.out.println(s5+" : "+0);
            }
        }

        System.out.println("Invalid : "+invalid);
    }

    public static boolean is_in(String[] strs,String s){
        for(String s1:strs){
            if(s1.equals(s)){
                return true;
            }
        }

        return false;
    }
}
