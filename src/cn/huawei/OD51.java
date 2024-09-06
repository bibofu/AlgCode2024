package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/4 下午9:57
 */
public class OD51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] strs = s1.split(",");

        String s2 = sc.nextLine();
        String[] strs2 = s2.split(",");

        List<String> res = new ArrayList<>();
        for(String str:strs){
            String astr1 = helper(str);
            boolean flag = false;
            for(String str2:strs2){
                String astr2 = helper(str2);
                if(astr1.equals(astr2)){
                    res.add(str2);
                    flag = true;
                }
            }
            if(!flag){
                res.add("not found");
            }
        }

        System.out.println(String.join(",",res));
    }


    public static String helper(String s){
        Set<Character> set = new TreeSet<>();
        for(char c:s.toCharArray()){
            set.add(c);
        }
        return set.toString();
    }
}
