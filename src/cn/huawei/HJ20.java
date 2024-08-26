package cn.huawei;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String input = in.nextLine();

            if(check(input)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }

        }

    }
    public static boolean check(String s){
        return s.length() >8 &&check1(s)&&check2(s,0,3);
    }
    public static boolean check1(String s){
        int c1=0,c2=0,c3=0,c4=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >='0' && ch<='9'){
                c1 = 1;
            }else if(ch >='a' && ch <= 'z'){
                c2 = 1;
            }else if(ch >='A' && ch <= 'Z'){
                c3 = 1;
            }else{
                if(ch != ' '&&ch!='\n')
                    c4 = 1;
            }
            if(c1+c2+c3+c4 >=3){
                return true;
            }
        }
        return false;
    }

    public static boolean check2(String str,int start,int end){
        //题解长度不超2的字符串则采用长度为3的字符，若等于str则表示当前str不包含重复的
        if(end>=str.length()){
            return true;
        }
        //头尾校验，从头部开始 依次 按照3位长度截取出字符串与剩与长度的字符串进行校验，如果剩余中包含截取的3位字符串则表示出现了重复
        if(str.substring(end).contains(str.substring(start,end)))
            return false;
        else
            return check2(str,start+1,end+1);

    }
}
