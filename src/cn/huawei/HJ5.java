package cn.huawei;
import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int n = input.length();
        int res = 0;
        input = input.substring(2,n);
        for(int i=n-3;i>=0;i--){
            res+=Math.pow(16,n-2-i-1)*helper(input.charAt(i));
        }
        System.out.println(res);
    }

    public static int helper(char ch){
        switch (ch){
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                break;
        }

        return 0;
    }
}
