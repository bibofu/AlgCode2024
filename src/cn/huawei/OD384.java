package cn.huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/8/17 下午7:11
 */
public class OD384 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        //List<Integer> list = new ArrayList<>();

        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(nums);
        int n = nums.length;
        int left = nums[n-1];
        int right = nums[n-1]*2;
        int res = 0;
        System.out.println(left+" "+right);
        while(left <= right){
            int mid = left+(right-left)/2;
            if(get_people(nums,mid) <= m){
                res = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        System.out.println(res);
    }

    /* 每天干h,需要几天*/
    public static int get_people(int[] nums,int h){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int cnt = 0;
        while(left <=right){
            if(nums[left] + nums[right] <= h){
                cnt++;
                left++;
                right--;
            }else{
                cnt++;
                right--;
            }
        }

        return cnt;
    }
}
