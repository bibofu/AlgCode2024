package cn.huawei;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/13 下午8:04
 */
public class HJ50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='{'||c=='['){
                sb.append('(');
            }else if(c=='}'||c==']'){
                sb.append(')');
            }else{
                sb.append(c);
            }
        }

        System.out.println(calculate(sb.toString()));

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
