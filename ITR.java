import java.util.ArrayList;
import java.util.*;
public class ITR {
    public static void main(String[] args) {
        
        List l1 = new ArrayList<>();

        l1.add("magic moments");
        l1.add("Bacardi lemon");
        l1.add("minty jamum");
           l1.add("himanshu");
           l1.add("sourabh");
         //l1.add(100);
           

Iterator itr  =l1.iterator();

    while (itr.hasNext()){

      System.out.println(itr.next());
}
      l1.remove("sourabh");
       System.out.println(l1);
 }
    
      

    }

