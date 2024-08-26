package cn.huawei;

import java.util.Scanner;

/**
 * 描述
 * 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 * 输入描述：
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 *
 * 输出描述：
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 */
public class HJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = 0;
        s = s.trim();
        int i = s.length()-1;
        while(i>=0 && Character.isLetter(s.charAt(i))){
            i--;
            length++;
        }
        System.out.println(length);
    }
}
