import java.net.Socket;
import java.util.ArrayList;
import java.util.Collection;

public class collction {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();

        al.add(100);
        al.add("sourabh");
        al.add(('A'));
         

        al.remove('A');
       //al.remove(0);
         // System.out.println(al.size());
         //ystem.out.println(al.contains(100));
      System.out.println(al);
  // System.out.println(al.isEmpty());
     ArrayList al2 = new ArrayList<>();

     al2.add("aa");
     al2.add("bbbb");
     al2.add("ccc");
   //System.out.println(al2);

     al.add(al2);
    //System.out.println(al);
      
    }
}