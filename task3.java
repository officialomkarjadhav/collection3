import java.util.HashMap;

public class task3 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm1= new HashMap<>();
        hm1.put(1,"red");
         hm1.put(2,"blue");
          hm1.put(3,"green");
         hm1.put(4,"yellow");
         System.out.println("hashmap 1 "+hm1);
         HashMap <Integer,String> hm2= new HashMap<>();
         hm2.put(5,"black");
          hm2.put(6,"white");
           hm2.put(7,"pink");
          hm2.put(8,"orange");
          System.out.println("hashmap 2 "+hm2);
          hm2.putAll(hm1);
          System.out.println(hm2);
    }
}
