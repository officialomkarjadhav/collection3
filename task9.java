import java.util.HashMap;
import java.util.Set;

public class task9 {
    private static HashMap hashMap;

    public static void main(String[] args) {
        HashMap  <Integer,String> hm= new HashMap<>();
        hm.put(1,"red");
         hm.put(2,"blue");
          hm.put(3,"green");
         hm.put(4,"yellow");
         Set val=hm.keySet();
         System.out.println(val);
           System.out.println("key set values are :"+val);
    }
}
