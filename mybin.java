public class mybin {
    

    public static void main(String[] args) {
         int arr [] = {10,20,30,40,50,60};
       int key = 50;
        
   int index =  mybin.bin(arr, 50);
      
       System.out.println(index);
        
    }


     public static int bin (int arr[],int key){

        int first = 0; int last = arr.length;

        int mid = (first+last)/2;

          while (first<=last) {
            
          {

            if(arr[mid]==key){
                return mid;
               
            } else if ( arr[mid]<key){
                first = mid+1;
            }
             else {
                 last = mid-1;
        } 
    }
     } 
     
               return -1; 
}
}