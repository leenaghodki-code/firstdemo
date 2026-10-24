public class twosum {
    

public static void main(String[] args) {
    

      int []arr ={2,7,11,15};///9

      int  first =0;
      int last = arr.length-1;
        int traget =13;
      while (first<last){
    
   int sum = arr[first]+ arr[last];

      if(sum==traget){
      
        System.out.println("indecis" + first + " "+last);
     break;

      }  else if(sum<traget){

        first ++;
      }else{
        last--;
      }

      }
     
      }
          

            
            }
    
       
      
      






    

