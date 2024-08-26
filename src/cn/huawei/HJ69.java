package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 下午7:33
 */
public class HJ69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int[][] arr1 = new int[x][y];
        int[][] arr2 = new int[y][z];
        int[][] res = new int[x][z];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr1[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<y;i++){
            for(int j=0;j<z;j++){
                arr2[i][j]=in.nextInt();
            }
        }

        for(int i=0;i<x;i++){
            for(int j=0;j<z;j++){
                res[i][j] = helper(arr1,arr2,i,j);
            }
        }

        for(int i=0;i<x;i++){
            for(int j=0;j<z;j++){
                System.out.print(res[i][j]+" ");
            }

            System.out.println();
        }


    }
    public static int helper(int[][] arr1,int[][] arr2,int i,int j){
        int res = 0;
        for(int index = 0;index <arr2.length;index++){
            res+=arr1[i][index] *arr2[index][j];
        }

        return res;
    }
}
