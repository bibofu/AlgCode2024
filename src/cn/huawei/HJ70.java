package cn.huawei;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author bibofu
 * @Date 2024/8/14 下午8:37
 */
public class HJ70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }
        String s = in.next();
        System.out.println(cal(arr,s));

    }
    public static int cal(int[][] arr,String s){
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                continue;
            }else if(c ==')'){
                int x = stack.pop();
                int y = stack.pop();
                res+=arr[y][0]*arr[y][1]*arr[x][1];
                arr[y][1] = arr[x][1];
                stack.add(y);
            }else{
                int i=c-'A';
                stack.add(i);
            }
        }

        return res;
    }
}
