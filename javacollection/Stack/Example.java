package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class Example {
    public static void main(String[]args){
       Stack<String>s = new Stack<>();
       //another way to create stack
       //ArrayDeque<String>d = new ArrayDeque<>();
       s.push("OS");
       s.push("CN");
       s.push("DBMS");
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println(s.size());
       System.out.println(s.isEmpty());

    }
}
