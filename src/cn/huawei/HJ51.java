package cn.huawei;
import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class HJ51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            ListNode dummy = new ListNode(-1);
            ListNode cur = dummy;
            for(int i=0;i<n;i++){
                int val = in.nextInt();
                ListNode node = new ListNode(val);
                cur.next = node;
                cur = cur.next;
            }

            int pos = in.nextInt();
            ListNode fast = dummy;
            ListNode slow = dummy;
            for(int i=0;i<pos;i++){
                fast = fast.next;
            }
            while(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }

            System.out.println(slow.val);
        }

    }
}
