package cn.huawei;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/5 下午5:58
 */
public class OD289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i] = sc.nextInt();
        }
        //int[] nums1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //int[] nums2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k = sc.nextInt();

        Queue<Integer> q = new PriorityQueue<>(((o1, o2) -> o1-o2));
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                q.offer(nums1[i] + nums2[j]);
            }
        }

        int res = 0;
        for(int i=0;i<k;i++){
            if(!q.isEmpty())
                res+= q.poll();
        }
        System.out.println(res);
    }
}
