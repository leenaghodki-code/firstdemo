

public class vowel{
public static void main(String[] args) {
int count =0;
int consoent = 0;
 String str = "Educationxvwqrtlzio";

 for(int i=0;i<str.length();i++){
 char ch = Character.toLowerCase((str.charAt(i)));

    if( (ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u')){

           count ++;
    }else{
      consoent++;
    }
 }
  System.out.println(" total  conent is prient is=" +consoent);
    System.out.println("totyal vowel is present is ="+count);
 }

}



