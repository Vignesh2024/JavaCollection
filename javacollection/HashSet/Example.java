package HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class Example {
    public static void main(String[]args){
        HashSet<String>h = new HashSet<>();
        h.add("OS");
        h.add("CN");
        h.add("DBMS");
        System.out.println(h);
        System.out.println(h.contains("CN"));
        Iterator<String>itr = h.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(h.size());
        h.remove("OS");
        System.out.println(h.size());
        for(String s:h){
            System.out.println(s);
        }
        System.out.println(h.isEmpty());
        h.clear();
        System.out.println(h.isEmpty());
    }
}
