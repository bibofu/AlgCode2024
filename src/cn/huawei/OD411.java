package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/5 下午2:28
 */


class APP{
    String name;
    int priority;
    String start_time;
    String end_time;

    public APP(String name,int priority,String start_time,String end_time){
        this.name = name;
        this.priority = priority;
        this.start_time = start_time;
        this.end_time = end_time;

    }

}

public class OD411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        APP[] apps = new APP[n];

        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            String[] strs = s.split(" ");
            String name = strs[0];
            int priority = Integer.parseInt(strs[1]);
            String start_time = strs[2];
            String end_time = strs[3];
            apps[i] = new APP(name,priority,start_time,end_time);
        }

        String target_time = sc.nextLine();

        List<APP> list = new ArrayList<>();
        for(APP a:apps){
            boolean can_add = true;
            boolean conflict_happen = false;
            List<Integer> conflict_index = new ArrayList<>();
            if(list.isEmpty()){
                list.add(a);
            }else{
                for(int i=0;i<list.size();i++){
                    APP temp = list.get(i);
                    if(conflict(a,temp)){
                        conflict_happen = true;
                        if(a.priority <= temp.priority){
                            can_add = false;
                            break;
                        }else{
                            conflict_index.add(i);
                        }
                    }
                }

                if(can_add == true){
                    if(conflict_happen == false){
                        list.add(a);
                    }else{
                        for(int i=list.size()-1;i>=0;i--){
                            if (conflict_index.contains(i)){
                                list.remove(i);
                            }
                        }
                        list.add(a);
                    }
                }
            }
        }

        for(APP a:list){
            if(hit(a,target_time)){
                System.out.println(a.name);
                return;
            }
        }

        System.out.println("NA");

    }

    public static boolean hit(APP a,String time){
        int start = parseTime(a.start_time);
        int end = parseTime(a.end_time);
        if(start<parseTime(time) && parseTime(time) <end){
            return true;
        }

        return false;
    }

    public static boolean conflict(APP a1,APP a2){
        String start_time1 = a1.start_time;
        String end_time1 = a1.end_time;
        String start_time2 = a2.start_time;
        String end_time2 = a2.end_time;


        int s1 = parseTime(start_time1);
        int e1 = parseTime(end_time1);
        int s2 = parseTime(start_time2);
        int e2 = parseTime(end_time2);
        if(e1 <= s2 || e2 <= s1){
            return false;
        }else{
            return true;
        }
    }

    public static int parseTime(String time){
        String[] strs = time.split(":");
        int hour = Integer.parseInt(strs[0]);
        int minute = Integer.parseInt(strs[1]);

        return hour*60+minute;
    }
}
