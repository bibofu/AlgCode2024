package cn.huawei;

import java.util.*;

public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        StringBuilder sb = new StringBuilder();
        List<Integer> set = new ArrayList<>();
        while(input>0){
            int num = input%10;
            if(!set.contains(num)){
                set.add(num);
            }

            input = input/10;
        }
        for(int i:set){
            sb.append(i);
        }

        System.out.println(Integer.valueOf(sb.toString()));
    }
}
