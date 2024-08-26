package cn.huawei;

import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString());
    }
}
