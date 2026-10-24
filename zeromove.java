public class zeromove {
    
public static void main(String[] args) {
    int [] arr = {10,20,0,2,25,0,20,10,0,40,10,11};
    
          int j=0;
     
          int [] aarr1 = new int[arr.length];
  
            for(int i=0;i<arr.length;i++){
                 

                if(arr[i]!=0){

                    aarr1[j] = arr[i];
                    j++;
                }


                   }
                      for(int i=0;i<aarr1.length;i++){
                        System.out.println(aarr1[i]);
                      }

                   }

                  
                   
            
                
                









}

    




