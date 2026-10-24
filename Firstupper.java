public class Firstupper {
    
    public static void main(String[] args) {
        String str = "we are learninh automation";
      String[] words =str.split(" ");
     
      for(String word:words){

        System.out.println(word.substring(0, 01).toUpperCase()+word.substring(1)+" ");
      }
    }
}
