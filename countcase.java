public class countcase {
    public static void main(String[] args) {
        
        String str ="JAVA proGRAMMing";
     int large =0;
    int small = 0;

    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        if(ch>='A'&& ch<= 'Z'){
            large++;
        }else if(ch>='a'&& ch<= 'z'){

            small++;
        }

    }
        System.out.println(small);
        System.out.println(large);

          }
      
        } 

