package cn.huawei;

import org.w3c.dom.ls.LSException;

import java.util.*;

/**
 * @author bibofu
 * @Date 2024/9/3 下午9:06
 */
public class OD124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        List<List<Character>> equal_list = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        boolean flag = false;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                if(!flag){
                    sb.append((c));
                }else{
                    temp.add(c);
                }
            }else{
                if(c == '('){
                    temp = new ArrayList<>();
                    flag = true;
                }else if(c == ')'){
                    if(!temp.isEmpty()) {
                        Collections.sort(temp);
                        equal_list.add(new ArrayList<>(temp));
                    }
                    flag = false;
                }
            }
        }

        Queue<List<Character>> q = new PriorityQueue<>(Comparator.comparingInt(o -> o.get(0)));
        for(List<Character> list:equal_list){
            q.offer(list);
        }

        Map<Character,Character> map = new HashMap<>();

        while(!q.isEmpty()){
            List<Character> list = q.poll();
            boolean find = false;
            char ch = ' ';
            for(int i=0;i<list.size();i++){
                char c = list.get(i);
                if(map.containsKey(c) || map.containsKey(brother_char(c))){
                    find = true;
                    if(map.containsKey(c)){
                        ch = map.get(c);
                    }else{
                        ch = map.get(brother_char(c));
                    }

                    break;
                }
            }

            if(find == false){
                for(int i=0;i<list.size();i++){
                    char c = list.get(i);
                    map.put(c,list.get(0));

                }
            }else{
                for(int i=0;i<list.size();i++){
                    char c = list.get(i);
                    map.put(c,ch);

                }
            }
        }

        StringBuilder res = new StringBuilder();
        for(char c:sb.toString().toCharArray()){
            if(map.containsKey(c)){
                res.append(map.get(c));
            }else{
                res.append(c);
            }
        }

        System.out.println(res.toString());
    }

    public static char brother_char(char c){
        if(c>='a' && c<='z'){
            return Character.toUpperCase(c);
        }else{
            return Character.toLowerCase(c);
        }
    }
}
