package cn.huawei;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/4 下午11:34
 */
public class OD46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] nums = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                nums[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j] = get_distance(nums,i,j);
            }
        }

        System.out.println(Arrays.deepToString(res));
    }

    public static int get_distance(int[][] nums,int i,int j){
        int distance = Integer.MAX_VALUE;
        for(int a=0;a<nums.length;a++){
            for(int b=0;b<nums[0].length;b++){
                if(nums[a][b] == nums[i][j] && not_same(i,j,a,b)){
                    distance = Math.min(distance,Math.abs(i-a)+Math.abs(j-b));
                }
            }
        }

        return distance== Integer.MAX_VALUE?-1:distance;
    }

    public static boolean not_same(int i,int j,int a,int b){
        if(i == a && j ==b){
            return false;
        }else{
            return true;
        }
    }
}
