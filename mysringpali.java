public class mysringpali {
    
    public static void main(String[] args) {
        

    String str = "racecar";
     boolean ispalidrom = true;
    int left = 0;
    int right = str.length()-1;

    while(left<right){
  
         if(str.charAt(left)!=str.charAt(right)){
          ispalidrom = false;
          break;

         }
         
         left ++;
         right--;

    }
      System.out.println(ispalidrom);

    }
}
