import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ListMethods {
    public static void main(String[]args){
        /*
         equals()-two list == or check
         removeAll()-two list remove common elements and return uncommon element
         retainAll()-return common elements
         ArrayList.contains() 
         contentEquals() 
         Stream interface
         */
        ArrayList<Integer>l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        List<Integer>l1  =new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
       Boolean Check  = l.equals(l1);
         System.out.print(Check);
       l1.add(100);
       System.out.println();
       Boolean Check1 = l1.equals(l);
       System.out.println(Check1);
       l1.removeAll(l);
       System.out.println(l1);
       ArrayList<Integer>a = new ArrayList<Integer>(Arrays.asList(10,20,30));
       System.out.println(a);
       ArrayList<Integer>b = new ArrayList<Integer>(Arrays.asList(10,20,30));
       System.out.println(b);
       a.retainAll(b);
       System.out.println("Print Common elements:");
       System.out.println(b);
       ArrayList<String> firstList  = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));  
       System.out.println("First List: "+firstList);   
       ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go", "Perl"));  
       System.out.println("Second List: "+secondList);  
       // Finds common elements   
       System.out.print("Common elements: " +firstList.stream().filter(secondList::contains).collect(Collectors.toList())); 
    }
}
