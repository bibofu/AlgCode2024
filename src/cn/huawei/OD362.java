package cn.huawei;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/4 下午2:57
 */
public class OD362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] subjects = new String[m];
        for(int i=0;i<m;i++){
            subjects[i] = sc.next();
        }
        Map<String, List<Integer>> students= new TreeMap<>();

        for(int i=0;i<n;i++){
            String name = sc.next();
            List<Integer> l = new ArrayList<>();
            int total = 0;
            for(int j=0;j<m;j++){
                int temp = sc.nextInt();
                total += temp;
                l.add(temp);
            }
            l.add(total);
            students.put(name,l);
        }

        String target_subject = sc.next();
        int target_index = get_index(subjects,target_subject);

        Comparator<String> comparator = (o1, o2) -> {
            if(students.get(o2).get(target_index)-students.get(o1).get(target_index) !=0){
                return students.get(o2).get(target_index)-students.get(o1).get(target_index);
            }else{
                return My_compare(o1,o2);
            }
        };
        Queue<String> q = new PriorityQueue<>(comparator);


        for(String s:students.keySet()){
            q.offer(s);
        }
        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }

    public static int get_index(String[] strs,String s){
        for(int i=0;i< strs.length;i++){
            if(strs[i].equals(s)){
                return i;
            }
        }

        return strs.length;
    }

    public static int My_compare(String s1,String s2){
        List<String> l = Arrays.asList(s1,s2);
        Collections.sort(l);
        if(l.get(0).equals(s1)){
            return -1;
        }else{
            return 1;
        }
    }

}
