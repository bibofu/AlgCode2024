package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/3 上午11:27
 */
public class OD179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        s = s.trim();
        int n = s.length();
        s = s.substring(1,n-1);
        String[] strs = s.split(",");
        int[] nums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            nums[i] = Integer.valueOf(strs[i]);
        }

        int target = Integer.parseInt(sc.nextLine());

        int[] res = new int[2];

        int index_cnt = 2*n;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                int cur_index_cnt = i + map.get(target-nums[i]);
                if(cur_index_cnt < index_cnt){
                    res[0] = target - nums[i];
                    res[1] = nums[i];
                    index_cnt = cur_index_cnt;
                }
            }else{
                //putIfAbsent??如果key已经存在,不执行put
                map.putIfAbsent(nums[i], i);
            }
        }

        System.out.println(Arrays.toString(Arrays.stream(res).toArray()));

    }
}
