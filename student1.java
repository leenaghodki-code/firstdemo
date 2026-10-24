import java.util.Comparator;
import java.util.*;
public class student1{

   String name;
     student1(String name){
        
        this.name = name;
     }
     
     static class namecomapartor implements Comparator<student1>{

        public int compare (student1 s1, student1 s2){

            return s1.name.compareTo(s2.name);
        }
     }
    


    public static void main(String[] args) {
      ArrayList<student1>  li = new ArrayList<>();
     
       li.add(new student1("himanshu"));
      li.add(new student1("sourabh"));
    li.add(new student1("kunal"));
    li.add(new student1("ankit"));


     Collections.sort(li,new namecomapartor());
      
       
     for(student1 s :li){

        System.out.println(s.name);
     }


    }
}
