package cn.huawei;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class HJ54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(calculate(input));
    }

    public static int calculate(String s) {
        Queue<Character> queue = new ArrayDeque<>();
        for(char ch:s.toCharArray()){
            queue.offer(ch);
        }
        queue.offer(' ');
        return helper(queue);

    }
    public static int helper(Queue<Character> queue){
        int num =0,prev =0,sum=0;
        char preOp ='+';
        while(!queue.isEmpty()){
            char c = queue.poll();
            if(Character.isDigit(c)){
                num = num*10+c-'0';
            }else if(c == '('){
                num = helper(queue);
            }else{
                switch(preOp){
                    case '+':
                        sum+=prev;
                        prev = num;
                        break;
                    case '-':
                        sum+=prev;
                        prev=-num;
                        break;
                    case '*':
                        prev*=num;
                        break;
                    case '/':
                        prev/=num;
                        break;
                }
                if(c ==')'){
                    break;
                }
                preOp =c;
                num=0;
            }
        }

        return sum + prev;
    }
}
