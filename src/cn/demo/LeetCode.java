package cn.demo;

import org.junit.Test;

import java.util.*;

class ListNode {
     int val;
     ListNode next;
    ListNode() {}
  ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class LeetCode {
    @Test
    public void test1(){
        int[][] arrays = {{14,20,5},{2,18,7},{6,14,1},{3,16,3}};
        Arrays.sort(arrays, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[o1.length-1]-o2[o2.length-1];
            }
        });
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i][1]);
        }
    }

    @Test
    public void test2(){
        /*a ascii码97*/
        char ch ='a';
        String s = "adsadasd";

        int n = ch;
        char ch2 = (char)(n+'0');
        System.out.println(ch2);
    }

    @Test
    public void test3(){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);

        queue.poll();
        System.out.println(queue.peek());
        String a = "aeaea";

        double pow = Math.pow(-1, 2);
        System.out.println(pow==1);

    }

    @Test
    public void test4(){
        System.out.println(is_match(7,1));
    }
    public boolean is_match(int num,int k){
        int count = 0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num = num>>1;
        }

        System.out.println("count is"+count);

        return count==k;
    }

    @Test
    public void test11(){
//        String s = " sadf asdf ";
//        String trim = s.trim();
//        System.out.println(trim.substring(0,0));
//        StringBuilder sb =new StringBuilder();
        boolean c = Character.isLetter('A');
        System.out.println(c);
        char ch ='A';
        boolean is_upperCase = Character.isUpperCase(ch);
        System.out.println(is_upperCase);
        char lowerCase = Character.toLowerCase(ch);
        System.out.println(lowerCase);

        boolean letter = Character.isLetter('1');
        System.out.println(letter);

        Map<Integer,Integer> map = new HashMap<>();
//        map.getOrDefault()
//        map.containsValue()

    }

    @Test
    public void aaa(){
        String s = " hello     world ";
        s=s.trim();
        String[] split = s.split(" ");
        for(String a:split){
            System.out.println(a);
        }
        String a = "   ";
        System.out.println(a.length());
        System.out.println(a==" ");

    }

    @Test
    public void asas(){
        char ch = '1';
        int a = ch - '0';
        System.out.println(a);
        String aa = "adsafdsa";


        aa.charAt(0);
        StringBuilder sb =new StringBuilder(aa);
        String string = sb.reverse().toString();
        System.out.println(string);
    }

    @Test
    public void test121(){

        System.out.println(1&1);
        System.out.println(1|1);
        System.out.println(1^1);

        System.out.println(1>>1);


    }

    public int trailingZeroes(int n) {
        int five_cnt = 0;
        int two_cnt = 0;
        for(int i=1;i<=n;i++){
            int temp = i;
            while(temp%2 == 0){
                two_cnt++;
                temp = temp/2;
            }
            while(temp%5 == 0){
                five_cnt++;
                temp = temp/5;
            }
        }

        return Math.min(five_cnt,two_cnt);

    }

    @Test
    public void test32(){
        //System.out.println(Math.pow(2,20));
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);

        String s = "aasfsajhfidsh";
        //s.substring()

        double sqrt = Math.sqrt(24)%1;
        System.out.println(sqrt);

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode head1 = head;
        for(int i=1;i<left-1;i++){
            head1 = head1.next;
        }
        ListNode head2 = head1.next;
        ListNode tail1 = head;
        for(int i=1;i<right;i++){
            tail1 = tail1.next;
        }
        ListNode tail2 = tail1.next;
        head1.next = helper(head2,tail1);
        head2.next = tail2;
        return head;


    }

    public ListNode helper(ListNode left,ListNode right){
        ListNode pre = new ListNode();
        ListNode cur = left;
        while(pre!=right){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return right;
    }

    @Test
    public void testadsad(){
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode node1 = reverseBetween(node, 2, 4);
        System.out.println(node1.val);
        System.out.println(node1.next.val);
        System.out.println(node1.next.next.val);
        System.out.println(node1.next.next.next.val);
        System.out.println(node1.next.next.next.next.val);
    }

    @Test
    public void daghsdui(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        boolean contains = set.contains(1);
        set.remove(1);
        Random rd = new Random();
        int nextInt = rd.nextInt(10);
        Object[] array = set.toArray();
        List<Integer> list = Arrays.asList(1, 2, 3);

        int[][] num = new int[10][10];
        Arrays.sort(num, (o1, o2) -> o1[1]-o2[1]);

    }

    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(o1,o2)->o1[1]-o2[1]);
        int i=0;
        int count = 0;
        while(i<points.length){
            count++;
            int j=i+1;
            while(j<points.length && points[j][0]<=points[i][1]){
                System.out.println("i is: "+i+"j is: "+j);
                System.out.println(points[j][0]);
                System.out.println(points[i][1]);
                System.out.println(points[j][0]<=points[i][1]);
                System.out.println("aaa");
                j++;
            }
            i=j;
        }

        return count;
    }

    @Test
    public void statdusa(){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(2147483647 <=(-2147483645));
        int[][] nums = {{0,3},{1,2}};
        Arrays.sort(nums,(o1,o2)->o1[1]-o2[1]);
        System.out.println(nums[0][0]);
        System.out.println(nums[0][1]);
    }


    @Test
    public void gdsuai(){
        int[][] test = {{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(test[0][0]);
        System.out.println(test[1][1]);
        Arrays.sort(test,(Comparator.comparingInt(o -> o[1])));
        System.out.println(test[0][0]);
        System.out.println(test[1][1]);

    }


    @Test
    public void dasjod(){
//        String s = "/a//b./c///d";
//        for (String string : s.split("/")) {
//            System.out.println(string);
//        }

        int parseInt = Integer.parseInt("13");
        System.out.println(parseInt);

    }


    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String s:operations){
            if(s.equals("C")){
                stack.pop();
            }else if(s.equals("D")){
                int val = stack.peek();
                stack.push(val*2);
            }else if(s.equals("+")){
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(val2);
                stack.push(val1);
                stack.push(val1+val2);
            }else{
                stack.push(Integer.valueOf(s));
            }
        }
        while(!stack.isEmpty()){
            res +=stack.pop();
        }

        return res;
    }

    public boolean my_isDigit(String a){
        return Character.isDigit(a.charAt(0));
    }

    @Test
    public void dhasio(){
        String[] a = {"5","-2","4","C","D","9","+","+"};
        //int parseInt = Integer.parseInt(a);
        System.out.println(calPoints(a));

    }

    @Test
    public void djais(){
        double a = 5;

        System.out.println(Math.round(a*10.0)/10.0);
    }


    public int minEatingSpeed(int[] piles, int h) {
        int min = 0;
        for(int speed=1000000000;speed>=1;speed/=2){
            //System.out.println(time_cost(piles,speed));
            if(time_cost(piles,speed) > h){
//                System.out.println(speed);
//                System.out.println(time_cost(piles,speed));
                min = speed;
                break;
            }
        }
        //System.out.println(min);
        for(int speed=min+1;speed<=min*2;speed++){
            if(time_cost(piles,speed) <=h){
                return speed;
            }
        }

        return -1;
    }

    public int time_cost(int[] piles,int speed){
        int cost = 0;
        for(int i:piles){
            if(i%speed ==0){
                cost+=i/speed;
            }else{
                cost+=i/speed+1;
            }
        }

        return cost;
    }

    @Test
    public void dhasdio(){
        int[] piles = {1000000000,1000000000};
        int h = 3;
        System.out.println(minEatingSpeed(piles,h));
    }

    @Test
    public void dhsaidas(){
        String s = " dsa 'dfsa' ";
        s=s.trim();
        System.out.println(s);



    }

    public int[] twoSum(int[] price, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<price.length;i++){
            if(map.containsKey(target-price[i]) && map.get(target-price[i])!=i){
                return new int[]{price[i],target-price[i]};
            }else{
                map.put(price[i],i);
            }
        }

        return null;

    }

    @Test
    public void dsadsad(){
        String s = "fdsahfiousa";
        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            list.add(c);
        }
        Collections.sort(list);
        for(Character c:list){
            System.out.println(c.charValue());
        }
    }

    @Test
    public void dahsid(){
        String s = "dhsaiodhsa";
        s= s+'a';
        System.out.println(s);

        PriorityQueue<Integer> q  =new PriorityQueue<>(((o1, o2) -> o2-o1));

        int ad = Integer.valueOf(125);

    }

    @Test
    public void dasdsa(){
        String s = "Mt2--";
        String[] strs = s.split("-");
        System.out.println(strs.length);
        for(String str:strs){
            System.out.println(str);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        Stack<String> stack = new Stack<>();
        stack.push("dsad");
        stack.push("dsadds");
        System.out.println(stack.toString());

    }

    @Test
    public void dashdsa(){
        char ch1 ='A';
        char ch2 = 'z';
        System.out.println(helperr(ch1,ch2));
    }



    public  int helperr(char ch1,char ch2){
        System.out.println(ch1);
        System.out.println(ch2);
        int n1 = (char)ch1;
        int n2 = (char)ch2;
        if('A'<= ch1 && ch1<='Z'){
            n1 = n1 + 100;

        }
        if('A' <= ch2 && ch2 <= 'Z'){
            n2 = n2 + 100;
        }
        System.out.println(n1);
        System.out.println(n2);
        return n1-n2;

    }








}
