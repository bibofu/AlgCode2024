package cn.huawei;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author bibofu
 * @Date 2024/9/3 上午7:47
 */
public class OD232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String prefix = sc.next();
        String[] strs = text.split(" ");
        List<String> list = new ArrayList<>();
        for(String str:strs){
            str = str.trim();
            int n = str.length();
            if(str.charAt(n-1) == ','){
                str = str.substring(0,n-1);
            }
            if(allCh(str)){
                list.add(str);
            }else{
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<str.length();i++){
                    if(Character.isLetter(str.charAt(i))){
                        sb.append(str.charAt(i));
                    }else{
                        list.add((sb.toString()));
                        sb = new StringBuilder();
                    }

                }

                list.add(sb.toString());
            }
        }


        Set<String> set = new TreeSet<>();
        for(int i=0;i<list.size();i++){
            if(match(list.get(i),prefix)){
                set.add(list.get(i));
            }
        }

        if(set.isEmpty()){
            System.out.println(prefix);
            return;
        }

        for(String s:set){
            System.out.print(s+" ");
        }
    }

    public static boolean allCh(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static boolean match(String s,String prefix){
        if(prefix.length() > s.length()){
            return false;
        }
        int n = prefix.length();
        for(int i=0;i<n;i++){
            if(prefix.charAt(i) != s.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
