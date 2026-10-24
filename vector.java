
  import java.util.*;

public class vector {
    
    public static void main(String[] args) {
        
        Vector v = new Vector();   // intinal capacit 10
       
        v.add( 50);
        v.add("sourabh");
        v.add("ravi");
      v.add(1, "himsahu");
          
                 System.out.println(v.capacity());

                 System.out.println(v.contains("sourabh"));
              Iterator   v1 =  v.iterator();
      //  System.out.println(v);

        while (v1.hasNext()) {
          //  System.out.println(v1.next());
            
        }
    }
}
