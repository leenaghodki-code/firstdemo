import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mycomportor {

    int age;
     String name;
     int rollno;
// constuctor
           mycomportor(int age,String name, int rollno){

       this.age = age;
      this.name = name;
       this.rollno = rollno;

   }

 static class  name implements Comparator<mycomportor> {
 
    public  int compare(mycomportor s1,mycomportor s2){

        return s1.name.compareTo(s2.name);
    }
}  
    static class roll implements Comparator<mycomportor>{

        public int compare(mycomportor r1,mycomportor r2){

            return r1.rollno - r2.rollno;
        }
    }
static  class a   implements Comparator<mycomportor>{

            public int  compare(mycomportor a1,mycomportor a2){

                return a1.age- a2.age;
            }
        }

    public static void main(String[] args) {
        
        ArrayList<mycomportor> li = new ArrayList<>();

        li.add(new mycomportor(20, "sourabh", 12));

        li.add(new mycomportor(28, "harsh", 60));
        li.add(new mycomportor(5, "amit", 19));

        System.out.println("roll num sorting");
   
    //  Collections.sort(li , new roll());
        
      //for(mycomportor s :li){

       //   System.out.println(s.rollno);
     // }
        
        Collections.sort(li , new a());
     
        for(mycomportor s :li){

            System.out.println(s.age);
        }
    }

    
 }
    

   


