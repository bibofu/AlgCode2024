package cn.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午7:56
 */
public class HJ45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s =in.next();
            Map<Character,Integer> map = new HashMap<>();
            int[] freq = new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;
            }
            int max = 26;
            int n1 = s.length();
            while(n1>0){
                for(int ii=0;ii<26;ii++){
                    if(freq[ii] == n1){
                        if(!map.containsKey((char)(ii+'a'))){
                            map.put((char)(ii+'a'),max);
                            max--;
                        }

                    }
                }
                n1--;
            }

            int res = 0;
            for(char ch:s.toCharArray()){
                res+=map.get(ch);
            }
            System.out.println(res);
        }
    }
}
