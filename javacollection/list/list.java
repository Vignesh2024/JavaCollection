import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class list{
    public static void main(String[]args){
          List<String>ls = new ArrayList<>();
          ls.add("Hello");
          ls.add("Hi");
          ls.add("I am vignesh");
          ls.add("full stack developer");
          ls.add(0,"Hey");
          Iterator itr =ls.iterator();
          while(itr.hasNext()){
            System.out.println(itr.next());
          }
          for(String s:ls){
            System.out.println(s);
          }
          System.out.println("first word will be print:"+ls.get(1));
          ls.set(2, "Vicky");
          for(String s:ls){
            System.out.println(s);
          }
        List<Integer>l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(5);
        l.add(50);
        Collections.sort(l);
        for(Integer s:l){
            System.out.println(s);
        }
    System.out.println("----------------------------------------");
     ListIterator<Integer>list1 = l.listIterator(l.size());
     while(list1.hasPrevious()){
        Integer i = list1.previous();
        System.out.println(i);
     }
     //using loop
     System.out.println("loop print");
     for(int i = 0;i<l.size();i++){
          System.out.println(l.get(i));
     }
       //lambda expression
       System.out.println("Lambda expression");
       l.forEach(a->{
        System.out.println(a);
       });  
    }
}