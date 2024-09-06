package cn.huawei;

import java.util.Map;
import java.util.Scanner;

/**
 * @author bibofu
 * @Date 2024/9/5 下午4:28
 */

class Node{
    int val;
    Node left;
    Node mid;
    Node right;
    public Node(int val){
        this.val = val;
        this.left = null;
        this.mid = null;
        this.right = null;
    }
}
public class OD360 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Node root = new Node(nums[0]);
        //Node cur = root;
        for(int i=1;i<nums.length;i++){
            Node node = new Node(nums[i]);
            insert(root,node);
        }

        System.out.println(get_depth(root));
    }

    public static void insert(Node root,Node node){
        if(node.val < root.val-500){
            if(root.left == null){
                root.left = node;
            }else{
                insert(root.left,node);
            }
        }else if(node.val > root.val +500){
            if(root.right == null){
                root.right = node;
            }else{
                insert(root.right,node);
            }
        }else{
            if(root.mid == null){
                root.mid = node;
            }else{
                insert(root.mid,node);
            }
        }


    }

    public static int get_depth(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null && node.mid == null){
            return 1;
        }
        int left = get_depth(node.left);
        int mid = get_depth(node.mid);
        int right = get_depth(node.right);

        return Math.max(Math.max(left,mid),right) + 1;
    }
}
