import java.util.Map;
import java.util.HashMap;
import java.security.Key;
import java.util.*;
;
public class Hashmapdemo {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm =  new HashMap();
     
      hm.put(101,"sourabh");
    
      hm.put(102,"himanshu");
      hm.put(103,"ankit");
  hm.put(101,  "magic momments");
 // hm.put("null", "null");

   
      System.out.println(hm);
         

      // old way
  //Set set =    hm.entrySet();

 // System.out.println(set);
      
//    Iterator  itr =    set.iterator();
    
//    while (itr.hasNext()) {

//    /// System.out.println(itr.next());
   
//    Map.Entry etr = (Map.Entry) itr.next();
    
      
//    System.out.println( etr.getKey()+ " ->"+ etr.getValue());
  

//    }
   
  for(Map.Entry print : hm.entrySet()){
  System.out.println(print.getKey());
  }


      
    }
}
