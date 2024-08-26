package cn.huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/21 下午6:41
 */
public class OD397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer,Integer> map =new HashMap<>();
        int res = 0;
        for(int i:nums){
            if(map.containsKey(i+1)){
                if(map.get(i+1) == 0){
                    res += i+1;
                    map.put(i+1,i);
                }else{
                    map.put(i+1,map.get(i+1)-1);
                }
            }else{
                map.put(i+1,i);
            }
        }
        for(int i:map.keySet()){
            res +=i;
        }
        System.out.println(res);
    }
}
