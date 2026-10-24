public class removedupicate {
    

    public static void main(String[] args) {
    
      int  number[] = {1,2,2,2,3,3};

      int j= 0;
        for(int i=1;i<number.length;i++){

           if(number[i]!=number[j]){
           j++;
             number[j] = number[i];  
           
         }
         
         
        }
   
                System.out.println("arrrys after removing dupicates");
             for(int i=0;i<=j; i++){
                System.out.print(number[i] + " "
 
                );
             }

       }
       
   }



     
        


    



