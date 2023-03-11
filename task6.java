import java.util.HashMap;

public class task6 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm= new HashMap<>();
        hm.put(1,"red");
         hm.put(2,"blue");
          hm.put(3,"green");
         hm.put(4,"yellow");
         System.out.println("1. Is value \'Green\' exists?");
         if(hm.containsValue("green")){
            System.out.println("yes!");
         } else {
            System.out.println("no !");
        } 
        System.out.println("\n2. Is value \'orange\' exists?");
        if (hm.containsValue("orange")) {
            {
                System.out.println("yes!");
            }
        } else {
            System.out.println("no !");
        } 
    }
}
