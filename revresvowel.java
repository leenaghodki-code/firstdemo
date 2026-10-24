public class revresvowel {
    
    static boolean isvowel(char ch){

        return ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u';
    }


    public static void main(String[] args) {
         
String str= "leetcode";
 char[] arr= str.toCharArray();
 int left =0;
 int right = arr.length-1;
 while (left<right){
   if(! isvowel(arr[left])){
       left++;
   }else if(! isvowel(arr[right])){
    right--;
   }else{
      char temp ; 
      temp = arr[right];
      arr[right] = arr[left];
      arr[left] =  temp ;
      left++;
      right--;
   }
 }
 System.out.println(new String(arr));
 }      
    }

