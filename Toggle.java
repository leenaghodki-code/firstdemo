public class Toggle {
 
    
    public static void main(String[] args) {
   

   togglstring("hEeLO");
    }
                

    public static void  togglstring(String str){
 
          String str1="";
         for(int i=0;i<str.length();i++){
         if(str==str.toUpperCase()){

             str1= str.toUpperCase();
         }else{

            str1=str;
         }
        }
              System.out.println(str1);
          }
    }
  
