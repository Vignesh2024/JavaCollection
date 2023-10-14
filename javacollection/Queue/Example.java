package Queue;
import java.util.*;
import java.util.ArrayDeque;

public class Example {
    public static void main(String[]args){
        Queue<String>q = new ArrayDeque<>();
        q.offer("OS");
        q.offer("DBMS");
        q.offer("CN");
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        while(!q.isEmpty()){
         System.out.println(q.peek());
          q.poll();
        }
        System.out.println(q.isEmpty());
    }
}
