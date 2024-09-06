package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/2 下午6:53
 */
public class OD445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] flag = new boolean[n];


        int pairs = sc.nextInt();
        int end_index = 0;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        Map<Integer, ArrayList<Integer>> start_map = new HashMap<>();

        int cnt = n;
        for(int i=0;i<pairs;i++){
            int key = sc.nextInt();
            int value = sc.nextInt();
            if(map.containsKey(key)){
                ArrayList<Integer> l =map.get(key);
                l.add(value);
                map.put(key,l);
            }else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(value);
                map.put(key,l);
            }
        }

        for(int i=0;i<n;i++){

            ArrayList<Integer> temp = new ArrayList<>();
            //主动启动
            if(map.containsKey(i)){
                ArrayList<Integer> l = map.get(i);

                for(int a=0;a<l.size();a++){
                    int index = l.get(a);
                    if(!flag[index]){
                        temp.add(index);
                        flag[index] = true;
                        cnt --;
                    }
                }
                if(temp.size() > 0){
                    start_map.put(i,temp);
                }

            }

            //被动启动
            if(start_map.containsKey(i-1)){
                ArrayList<Integer> start_list = start_map.get(i-1);

                for(int num:start_list){
                    if(num == 0){
                        int first = n-1;
                        int second = 1;
                        if(!flag[first]){
                            temp.add(first);
                            cnt--;
                            flag[first] = true;
                        }
                        if(!flag[second]){
                            temp.add(second);
                            flag[second] = true;
                            cnt--;
                        }
                    }else if(num == n-1){
                        int first = n-2;
                        int second = 0;
                        if(!flag[first]){
                            temp.add(first);
                            flag[first] = true;
                            cnt--;
                        }
                        if(!flag[second]){
                            temp.add(second);
                            flag[second] = true;
                            cnt--;
                        }
                    }else{
                        int first = num - 1;
                        int second = num + 1;
                        if(!flag[first]){
                            temp.add(first);
                            flag[first] = true;
                            cnt--;
                        }
                        if(!flag[second]){
                            temp.add(second);
                            flag[second] = true;
                            cnt--;
                        }
                    }
                }

                if(temp.size() > 0){
                    start_map.put(i,temp);
                }
            }

            if(cnt <=0){
                end_index = i;
                break;
            }

        }

        int s = start_map.get(end_index).size();
        System.out.println(s);
        for(int e:start_map.get(end_index)){
            System.out.print(e+" ");
        }



    }
}
