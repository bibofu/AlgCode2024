package cn.huawei;

import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int input = in.nextInt();
            if(input == 0){
                break;
            }else{
                System.out.println(helper(input));
            }
        }
    }
    public static int helper(int n){
        int res = 0;
        while(n>1){
            res += n/3;
            n=n/3+n%3;
            if(n ==2){
                n = n+1;
            }
        }
        return res;
    }
}
