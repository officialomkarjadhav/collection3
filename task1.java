import java.util.HashMap;
import java.util.Map;

class task1{
public static void main(String[] args) {
    HashMap <Integer,String> hm= new HashMap<>();
     hm.put(1,"red");
      hm.put(2,"blue");
       hm.put(3,"green");
      hm.put(4,"yellow");
      for(Map.Entry x:hm.entrySet()){
        System.out.println(x.getKey()+" "+x.getValue());
      }
}
}