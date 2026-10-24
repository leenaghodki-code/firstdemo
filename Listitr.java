import java.util.*;
public class Listitr {
    public static void main(String[] args) {
        
        List l= new ArrayList<>();

l.add(10);
l.add("sourabh");
l.add("rahul");
    
   ListIterator l1 = l.listIterator();
    
     while (l1.hasNext()){
        System.out.println(l1.next());
        
     }
   System.out.println("============================");
   while (l1.hasPrevious()){


      System.out.println(l1.previous());

   }
      l1.set(500);
      System.out.println(l );
        

      
    }
      

}


