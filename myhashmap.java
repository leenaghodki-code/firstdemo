
import java.util.HashMap;
import java.util.Map;
import java.util.*;
;

public class myhashmap {

         public static void main(String[] args) {
            

            HashMap<Integer,String> hm = new HashMap();

           hm.put(1, "sourabh");
           hm.put(2,"ankit");    
         hm.put(3,"himansdshu");
       //   hm.remove(2);
       System.out.println(   hm.containsKey(5));
           System.out.println(hm);
             
          for(Map.Entry me : hm.entrySet()){
         System.out.println(me.getKey()+ " ->"+ me.getValue());

           }

             }
          

          
        


    
}
