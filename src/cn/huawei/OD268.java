package cn.huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/20 上午1:52
 */
public class OD268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> list = new ArrayList<>();
        char[] char_array = s.toCharArray();
        for(char c:char_array){
            list.add(c);
        }
        Collections.sort(list);
        for(int i=0;i<char_array.length;i++){
            if(char_array[i] != list.get(i)){
                int index = helper(char_array,list.get(i));
                swap(char_array,i,index);
                break;
            }
        }

        System.out.println(new String(char_array));
    }

    public static int helper(char[] chars ,char c){
        for(int i=chars.length-1;i>=0;i--) {
            if(chars[i] == c){
                return i;
            }
        }
        return 0;
    }

    public static void swap(char[] chars,int i,int j){
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

}
