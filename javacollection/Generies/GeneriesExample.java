package Generies;

import java.util.ArrayList;
import java.util.*;  
public class GeneriesExample {
    public static void main(String[]args){
        ArrayList<String>list = new ArrayList<String>();
        list.add("Hi");
        list.add("Hii");
        list.add("Hii*");
        String s = list.get(1);
        System.out.println(s);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
