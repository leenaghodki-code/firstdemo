public class sec {
    
    public static void main(String[] args) {
    
    int [] arr ={12,35,15,81,8,10,1};

  int large = arr[0];
  int second= arr[0];

  for(int num:arr){
    if(num>large){
        second = large;
        large = num;
    }else if(num>second && num !=large){

        second = num;
    }
       System.out.println("second larget " +  second)  ;
    }
  }
}
