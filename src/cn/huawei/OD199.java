package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/6 上午4:42
 */
public class OD199 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        Comparator<Character> comparator = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if(map.get(o1) != map.get(o2)){
                    return map.get(o2) - map.get(o1);
                }else{
                    return helper(o1,o2);
                }
            }
        };
        Queue<Character> q = new PriorityQueue<>(comparator);
        for(char c:map.keySet()){
            q.offer(c);
        }

        while (!q.isEmpty()){
            char c = q.poll();
            System.out.print(c+":"+map.get(c)+";");
        }
    }

    public static int helper(char ch1,char ch2){
        int n1 = (char)ch1;
        int n2 = (char)ch2;
        if('A'<= ch1 && ch1<='Z'){
            n1 = n1 + 100;

        }
        if('A' <= ch2 && ch2 <= 'Z'){
            n2 = n2 + 100;
        }

        return n1-n2;

    }
}
