import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class A{
    
    public static void main(String[] args) { 
  

        List L = new ArrayList();
    //  INDEX POSRION
       L.add(0,10);
       L.add(20);
     L.add(15);
      L.add(null);

                          
    Iterator itr = L.iterator();
      while (itr.hasNext()) {
       System.out.println(itr.next());

      // ListIterator l1 = L.listIterator();

      // while (l1.hasNext()) {
     //  System.out.println(l1.next());
        
       }
}

 
      //  System.out.println(L);


    }

