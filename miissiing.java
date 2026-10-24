public class miissiing {


    public static void main(String[] args) {
        
        int arr [] = {1,2,3,5};
     int miss=   miissiing.Number(arr, 05);
       System.out.println(miss);
    }


  public  static int  Number(int arr[],int n){
      int sum =0;
       int total = (n*(n+1))/2;
     
       for(int i=0;i<arr.length;i++){
         sum = sum + arr[i];
       }
       return total-sum;
   }
  

}
