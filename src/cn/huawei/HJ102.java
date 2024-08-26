package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 上午11:18
 */
public class HJ102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] array = s.toCharArray();
        int[] a = new int[128];
        for (char c : array) {
            a[c]++;
        }
        int max = s.length();
        while (max > 0) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == max) {
                    System.out.print((char) i);
                }
            }
            max--;
        }
    }
}
