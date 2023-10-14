import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list1 {
    public static void main(String[]args){
     /*  List<Integer>l = new ArrayList<>();
      l.add(10);
      l.add(20);
      l.add(30);
      l.remove(1);
      for(Integer i:l){
        System.out.println(i);
      }
      l.clear();
      System.out.println(l);
    }*/
     List<Integer>a = new ArrayList<>();
     a.add(10);
     a.add(20);
     a.add(30);
     a.add(40);
     a.add(50);
     a.add(1);
     a.add(2);
     a.add(3);
     for(Integer i:a){
        System.out.println(i);
     }
     Collections.sort(a);
     System.out.println("!!!Sort the array!!!");
     for(Integer x:a){
        System.out.println(x);
    }
     Collections.reverse(a);
     System.out.println("!!!Reverse Order Print!!!");
     for(Integer y:a){
        System.out.println(y);
    }
  }
}