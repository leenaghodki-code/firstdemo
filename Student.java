import java.util.*;
 
public class Student implements Comparable<Student> {


    int age ;
     Student(int age){
        this.age= age;

     }
    public   int  compareTo(Student s){

        return this.age - s.age;
    }



    public static void main(String[] args) {
        
        ArrayList<Student> li = new ArrayList<>();
    
        li.add(new  Student(22));
        li.add(new Student(20));
     li.add(new  Student(50));
     li.add(new  Student(42));
           li.add(new  Student(22));
         li.add(new  Student(10));

         Collections.sort(li);

         for(Student s :li){

            System.out.println(s.age);
         }
    }
}