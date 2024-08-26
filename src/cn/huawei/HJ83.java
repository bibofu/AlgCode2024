package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 上午11:10
 */
public class HJ83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            if(m>9 ||n>9){
                System.out.println(-1);
                return;
            }else{
                System.out.println(0);
            }
            int row1=in.nextInt();
            int col1=in.nextInt();
            int row2=in.nextInt();
            int col2=in.nextInt();
            if(row1>=m||row2>=m||col1>=n||col2>=n){
                System.out.println(-1);
            }else{
                System.out.println(0);
            }
            int row3 = in.nextInt();
            if(row3<m&&m<9){
                System.out.println(0);
            }else{
                System.out.println(-1);
            }

            int col3 = in.nextInt();
            if(col3<n &&n<9){
                System.out.println(0);
            }else{
                System.out.println(-1);
            }

            int row9 = in.nextInt();
            int col9 = in.nextInt();
            if(row9>=m || col9>=n){
                System.out.println(-1);
            }else{
                System.out.println(0);
            }
        }
    }
}
