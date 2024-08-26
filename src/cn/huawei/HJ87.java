package cn.huawei;

import java.util.*;

public class HJ87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        HashMap<String,Integer> depth=new HashMap<>();
        //等级划分
        depth.put("length",0);
        depth.put("letter",0);
        depth.put("num",0);
        depth.put("sym",0);
        depth.put("pre",0);
        String str=in.nextLine();

        //判断密码长度
        if(str.length()<=4){
            depth.put("length",5);
        }else if(str.length()<=7){
            depth.put("length",10);
        }else{
            depth.put("length",25);
        }
        //判断字母情况和判断数字情况和符号情况
        //符号等级
        int symSum=0;
        //数字等级
        int numSum=0;
        //小写字母
        int letterLow=0;
        //大写字母
        int letterUpper=0;
        for(int i=0;i<str.length();i++){
            //有小写字母
            if(Character.isLowerCase(str.charAt(i))){
                letterLow=1;
                if(letterUpper==1&&numSum>=2&&symSum>=2){
                    break;
                }
                //有大写字母
            }else if(Character.isUpperCase(str.charAt(i))){
                letterUpper=1;
                if(letterLow==1&&numSum>=2&&symSum>=2){
                    break;
                }
            }
            if(Character.isDigit(str.charAt(i))){
                numSum++;
            }
            if(!Character.isDigit(str.charAt(i))&&!Character.isLetter(str.charAt(i))){
                symSum++;
            }

        }
        //字母
        if(letterLow==0&&letterUpper==0){
            depth.put("letter",0);
        }else if(letterLow==1&&letterUpper==1){
            depth.put("letter",20);
        }else if(letterLow==1||letterUpper==1){
            depth.put("letter",10);
        }
        //数字
        if(numSum==0){
            depth.put("num",0);
        }else if(numSum==1){
            depth.put("num",10);
        }else if(numSum>=2){
            depth.put("num",20);
        }
        //符号
        if(symSum==0){
            depth.put("sym",0);
        }else if(symSum==1){
            depth.put("sym",10);
        }else if(symSum>=2){
            depth.put("sym",25);
        }
        //奖励
        if(depth.get("letter")==20&&depth.get("num")>=10&&depth.get("sym")>=10){
            depth.put("pre",5);
        }else if(depth.get("letter")>=10&&depth.get("num")>=10&&depth.get("sym")>=10){
            depth.put("pre",3);
        }else if(depth.get("letter")>=10&&depth.get("num")>=10){
            depth.put("pre",2);
        }
        int sum=depth.get("length")+depth.get("letter")+depth.get("num")+depth.get("sym")+depth.get("pre");
        if(sum>=90){
            System.out.print("VERY_SECURE");
        }else if(sum>=80){
            System.out.print("SECURE");
        }else if(sum>=70){
            System.out.print("VERY_STRONG");
        }else if(sum>=60){
            System.out.print("STRONG");
        }else if(sum>=50){
            System.out.print("AVERAGE");
        }else if(sum>=25){
            System.out.print("WEAK");
        }else if(sum>=0){
            System.out.print("VERY_WEAK");
        }

    }
}
