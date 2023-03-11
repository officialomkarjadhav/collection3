import java.util.HashMap;

public class task8 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<>();
        hm.put(1,"red");
         hm.put(2,"blue");
          hm.put(3,"green");
         hm.put(4,"yellow");
         String val=(String)hm.get(3);
           System.out.println("value for key 3 is :"+val);
    }
}
