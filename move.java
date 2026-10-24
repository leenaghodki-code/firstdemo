
/**
 * move
 */
public class move {

    public static void main(String[] args) {
        // move zero
    //   int arr [] ={0,1,0,3,12};

    //     int j=0;
       
    //     for(int i=0;i<arr.length;i++){
    //           int temp;
    //         if(arr[i]!=0){
            
    //            if(i!=j);
    //              temp= arr[i];
    //              arr[i] = arr[j];
    //              arr[j]= temp;
    //              j++;
    //         }



    //     } for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]);
    //     }

              int arr [] ={0,1,0,3,12};
             
              int j =0;
              for(int i=0;i<arr.length;i++){
                int temp;
                if(arr[i]!=0){
                 if(i!=j){
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                 
                 }
                
                 }

                }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
                 }  
              }

    }
    

