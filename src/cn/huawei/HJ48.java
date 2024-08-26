package cn.huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午6:26
 */
public class HJ48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int n = in.nextInt();
        int head = in.nextInt();
        list.add(head);
        for(int i=0;i<n-1;i++){
            int pre = in.nextInt();
            int cur = in.nextInt();
            list.add(list.indexOf(cur)+1,pre);
        }
        int del = in.nextInt();
        for(int i=0;i<list.size();i++){
            if(list.get(i) !=del){
                System.out.print(list.get(i) + " ");
            }
        }
    }

}
