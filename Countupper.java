/**
 * Countupper
 */
public class Countupper {


    public static void main(String[] args) {
    
        String str = "AnKiTa";

       int count = 0;
       int lower = 0;
       for(int i= 0;i<str.length();i++){
       
        char ch = str.charAt(i);
       
        if(Character.isUpperCase(ch)){
            count++;
        }else if(Character.isLowerCase(ch)){
             lower++;
        }
       }
         System.out.println(count);
         System.out.println(lower);
    }
    
}
