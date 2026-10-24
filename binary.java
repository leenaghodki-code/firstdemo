 

public class binary {

    
public static void main(String[] args) {
    
    int number []= {10,20,30,40,50,60,70,80};

    int key  = 555;

    int index=  binary.binaryserch(number,  5555);
      System.out.println(index);

      if(index==-1){
         System.out.println("key is not foun");
      }
}


   public static int binaryserch(int number[],int key){


        int first = 0;   int last = number.length-1;

           while (first<=last){

            int mid = (first+last)/2;

              if(number[mid]==key){
                return mid;

              }
              if(number[mid]<key){
                 first=mid+1;
              }else{
                  last= mid-1;
              }


           }
               return -1;
           }
       

         }
            
         



   







