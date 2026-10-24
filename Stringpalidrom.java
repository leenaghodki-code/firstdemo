   

public class Stringpalidrom {
    public static void main(String[] args) {
        
        String str ="racecar";
        String str1="";
      

        for(int i=str.length()-1;i>=0;i--)
{
    str1 += str.charAt(i); 
}
if(str.equalsIgnoreCase(str1)){
    System.out.println("paidrom");
}else{
    System.out.println("not6 pailidrpm");
}
      }

      

    

    
}
 

