package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[]args){
        HashMap<String,Integer>m = new HashMap<String,Integer>();
        m.put("OS",1);
        m.put("CN",2);
        m.put("DBMS",3);
        System.out.println(m);
        System.out.println(m.size());
           for (Map.Entry<String, Integer> e : m.entrySet())
           System.out.println("Key: " + e.getKey()
           + " Value: " + e.getValue());
           

    }
}
