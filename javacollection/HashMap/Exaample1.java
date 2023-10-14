package HashMap;

import java.util.HashMap;

public class Exaample1 {
    public static void main(String[]args){
        HashMap<String,Integer>m = new HashMap<>();
        m.put("OS", 1);
        m.put("DBMS", 2);
        m.put("CN", 3);
        if(m.containsKey("OS")&&m.containsValue(2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(m.size());
        m.remove("OS");
        System.out.println(m.size());
        System.out.println(m.get("CN"));
    }
}
