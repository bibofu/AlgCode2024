package cn.huawei;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/5 下午3:25
 */
public class OD372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int money = sc.nextInt();
        int max_risk = sc.nextInt();
        int[] repay = new int[n];
        for(int i=0;i<n;i++){
            repay[i] = sc.nextInt();
        }
        int[] risk = new int[n];
        for(int i=0;i<n;i++){
            risk[i] = sc.nextInt();
        }
        int[] e_du = new int[n];
        for(int i=0;i<n;i++){
            e_du[i] = sc.nextInt();
        }

        int max_profit = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int total_risk = risk[i] + risk[j];
                if(total_risk > max_risk){
                    continue;
                }
                if(e_du[i] + e_du[j] > money){
                    continue;
                }

                if(repay[i]*e_du[i] + repay[j]*e_du[j] > max_profit){
                    max_profit = repay[i]*e_du[i] + repay[j]*e_du[j];
                    list = Arrays.asList(i,j);
                }

            }
        }

        for(int i=0;i<n-1;i++){
            if(list.contains(i)){
                System.out.print(e_du[i]+" ");
            }else{
                System.out.print(0+" ");
            }
        }
        if(list.contains(n-1)){
            System.out.print(e_du[n-1]);
        }else{
            System.out.print(0);
        }
    }
}
