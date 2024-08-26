package cn.huawei;

import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 上午10:48
 */
public class HJ73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        System.out.println(get_day(year,month)+day);
    }

    public static int get_day(int year,int month){
        int ans = 0;
        switch(month){
            case 1:
                ans = 0;
                break;
            case 2:
                ans = 31;
                break;
            case 3:
                ans = 31+28;
                break;
            case 4:
                ans = 31+28+31;
                break;
            case 5:
                ans = 31+28+31+30;
                break;
            case 6:
                ans = 31+28+31+30+31;

                break;
            case 7:
                ans = 31+28+31+30+31+30;
                break;
            case 8:
                ans = 31+28+31+30+31+30+31;
                break;
            case 9:
                ans = 31+28+31+30+31+30+31+31;
                break;
            case 10:
                ans = 31+28+31+30+31+30+31+31+30;
                break;
            case 11:
                ans = 31+28+31+30+31+30+31+31+30+31;
                break;
            case 12:
                ans = 31+28+31+30+31+30+31+31+30+31+30;
                break;

        }
        if(month <=2){
            return ans;
        }else{
            if(year%4==0 && year%100!=0){
                return ans + 1;
            }if(year%100 ==0 &&year%400==0){
                return ans+1;
            }else{
                return ans;
            }
        }

    }
}
