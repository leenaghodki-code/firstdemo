import java.util.*;
public class Setdemo{
public static void main(String[] args) {



    Set s= new HashSet<>();


 s.add(100);
 s.add(200);
 s.add(215);
 s.add(50);
 s.add(50);
 s.add(null);
// System.out.println(s);
Iterator itr = s.iterator();
while (itr.hasNext()) {
       System.out.println(itr.next());
}
}
}

