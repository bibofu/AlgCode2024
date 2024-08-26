package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午7:16
 */
public class HJ38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double res1 = Math.round((double)23/8*n *1000000.000000)/1000000.000000;
        double res2 = Math.round((double)1/32*n *1000000.000000)/1000000.000000;
        System.out.println(res1);
        System.out.println(res2);

    }
}
