package Deque;
import java.util.*;
import java.util.LinkedList;

public class example {
    public static void main(String[]args){
        Deque<String>d = new LinkedList<>();
        d.addFirst("Hi");
        d.addLast("Hi2");
        d.addFirst("Hi1");
        d.addLast("Hi");
        d.addLast("Hey");
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        System.out.println("----------------------------");
        for(String s:d){
            System.out.println(s);
        }
        Iterator i = d.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
