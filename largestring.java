public class largestring {
    

    public static void main(String[] args) {
       String str[] = {"apple","mango","graps","banana","zamun"} ; 
       
       String large = str[0];
       for(int i=0;i<str.length;i++)
       if(large.compareToIgnoreCase(str[i])<0){
         large = str[i];

       }
    System.out.println(large);
    }}
