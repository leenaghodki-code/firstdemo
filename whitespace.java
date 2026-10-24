public class whitespace {
    
    public static void main(String[] args) {
        
     String str ="ab cd ef";
     char[]  arr= str.toCharArray();
     int left =0;
     int right =arr.length-1;
     while (left<right){
      if (arr[left] ==' ' ){  
        left++;
      }else if (arr[right] == ' '){
        right--;
      }else{
 char temp;
        temp = arr[right];
        arr[right] = arr[left];
         arr[left] = temp;
         left++;
         right--;
      } 
      }  
           System.out.println(new String(arr));
    }
     }
       
     
  