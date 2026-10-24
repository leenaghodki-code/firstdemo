import java.util.*;

public class  reversary{


 public static void main(String[] args) {
    
   int arrys[] = {20,10,40,50,20,40,12,3,5};
    
         reversary.revers(arrys);

          for(int i=0;i<arrys.length;i++){
             
            System.out.println(arrys[i]);
          }

 }

     public static void revers(int arrys[]){

         int first = 0; int last = arrys.length-1;
         int temp;
          
         while (first<last){

             temp =  arrys[last];

               arrys[last] = arrys[first];

                   arrys[first] = temp;
                
                   first++;
                   last--;


         }
            
         }


     }

