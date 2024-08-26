package cn.huawei;

import java.util.*;

public class HJ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            int key = in.nextInt();
            int value = in.nextInt();

            if(map.containsKey(key)){
                map.put(key,map.get(key)+value);
            }else{
                map.put(key,value);
            }
        }

        for(int i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
    }
}
