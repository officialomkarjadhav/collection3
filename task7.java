import java.util.HashMap;
import java.util.Set;

public class task7 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<>();
        hm.put(1,"red");
         hm.put(2,"blue");
          hm.put(3,"green");
         hm.put(4,"yellow");
         System.out.println(hm);
         Set Set=hm.entrySet();
         System.out.println("Set values: "+Set);
    }
}
