package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午6:19
 */
public class HJ100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = 2;
        int d = 3;
        int n = in.nextInt();
        System.out.println(2*n+n*(n-1)/2*d);
    }
}
