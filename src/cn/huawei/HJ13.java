package cn.huawei;

import java.util.Scanner;

public class HJ13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.trim();
        String[] strs = input.split(" ");
        int n = strs.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(strs[i]+" ");
        }
    }
}
