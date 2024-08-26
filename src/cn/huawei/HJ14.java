package cn.huawei;

import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = in.next();
            list.add(s);
        }
        Collections.sort(list);
        for(int i=0;i<n;i++){
            System.out.println(list.get(i));
        }
    }
}
