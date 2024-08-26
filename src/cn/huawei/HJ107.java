package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 上午8:29
 */
public class HJ107 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        double rs = -5;
        while (rs * rs * rs < num) {
            rs += 0.01;
        }
        System.out.print(String.format("%.1f",rs));
    }
}
