package cn.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/20 上午12:35
 */
public class OD218 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k =sc.nextInt();

        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            list.add(c);
        }
        Collections.sort(list);
        if(k>s.length()){
            char ch = list.get(list.size()-1);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ch){
                    System.out.println(i);
                    return;
                }
            }
        }
        char target = list.get(k-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == target){
                System.out.println(i);
                return;
            }
        }

    }
}
