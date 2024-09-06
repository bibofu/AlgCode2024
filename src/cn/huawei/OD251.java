package cn.huawei;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author bibofu
 * @Date 2024/9/3 上午7:18
 */
public class OD251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        if(k <= 0){
            System.out.println(-1);
            return;
        }
        Map<Character,Integer> map = new HashMap<>();
        char temp = s.charAt(0);
        int time = 1;
        for(int i=1;i<s.length();i++){
            char c = s.charAt(i);
            if(c == temp){
                time++;
            }else{
                if(map.containsKey(temp)){
                    int val = map.get(temp);
                    map.put(temp,Math.max(val,time));
                }else{
                    map.put(temp,time);
                }

                temp = c;
                time = 1;
            }
        }
        map.put(temp,time);

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i:map.values()){
            if(k > map.values().size()){
                System.out.println(-1);
                return;
            }
            if(q.size() < k){
                q.offer(i);
            }else{
                if(i > q.peek()){
                    q.poll();
                    q.offer(i);
                }
            }
        }

        System.out.println(q.peek());

    }
}
