package cn.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/14 上午7:54
 */
public class HJ43 {
    private static List<int[]> list = new ArrayList<>();
    private static boolean[][] flag;
    private static boolean win = false;
    private static void dfs(int[][] arr,int i,int j){
        // 不符合条件
        if (i>=arr.length|| i<0||j>=arr[0].length||j<0||arr[i][j]==1||flag[i][j]){
            return;
        }
        // 找到出口
        if (i==arr.length-1&&j==arr[0].length-1){
            list.add(new int[]{i,j});
            win = true;
            return;
        }
        if(!win){
            list.add(new int[]{i,j});
        }
        flag[i][j] = true;
        dfs(arr,i-1,j);
        dfs(arr,i+1,j);
        dfs(arr,i,j-1);
        dfs(arr,i,j+1);
        flag[i][j] = false;

        if (!win){
            list.remove(list.size()-1);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        flag = new boolean[m][n];
        dfs(arr,0,0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("("+list.get(i)[0]+","+list.get(i)[1]+")");
        }

    }

}
