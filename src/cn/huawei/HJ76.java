package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午10:20
 */
public class HJ76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2 == 0){
            int mid = n*n-1;
            for(int i=0;i<n/2-1;i++){
                mid -=2;
            }
            for(int i=0;i<n;i++){
                if(i ==n-1){
                    System.out.print(mid+i*2);
                }else{
                    System.out.print(mid+i*2 + "+");
                }
            }
        }else{
            int mid = n*n;
            for(int i=0;i<n/2;i++){
                mid -=2;
            }

            for(int i=0;i<n;i++){
                if(i ==n-1){
                    System.out.print(mid+i*2);
                }else{
                    System.out.print(mid+i*2 + "+");
                }
            }
        }
    }
}
