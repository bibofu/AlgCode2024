package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/12 下午7:08
 */
public class HJ97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        int cnt = 0;
        int cnt_num = 0;
        for(int i=0;i<n;i++){
            int input = in.nextInt();
            if(input<0){
                num++;
            }else if(input > 0){
                cnt+=input;
                cnt_num++;
            }
        }

        double res = cnt/(double)cnt_num;

        System.out.println(num+" "+Math.round(res*10.0)/10.0);

    }
}
