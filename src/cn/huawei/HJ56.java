package cn.huawei;

import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int res = 0;
        for(int i=1;i<=input;i++){
            if(is_perfect(i)){
                res++;
            }
        }

        System.out.println(res);
    }

    public static boolean is_perfect(int n){
        int cnt = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                cnt+=i;
            }
        }

        return cnt == n;
    }
}
