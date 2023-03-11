import java.util.HashMap;

public class task4 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<>();
        hm.put(1,"red");
         hm.put(2,"blue");
          hm.put(3,"green");
         hm.put(4,"yellow");
         System.out.println(hm.isEmpty());
         hm.clear();
         System.out.println(hm.isEmpty());
         
    }
}
