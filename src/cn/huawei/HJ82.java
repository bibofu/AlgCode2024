package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/15 下午9:17
 */
public class HJ82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] sa = scanner.nextLine().split("/");
            int f1 = Integer.parseInt(sa[0]);
            int f2 = Integer.parseInt(sa[1]);
            for (int i = 0; i < f1; i++) {
                if (i + 1 < f1) {
                    System.out.print("1/" + f2 + "+");
                } else {
                    System.out.println("1/" + f2);
                }
            }
        }
    }
}
