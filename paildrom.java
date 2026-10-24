public class paildrom {
    

    public static void main(String[] args) {
        
        int n1 = 121;
          int number = n1;
        int revers =0;

        while (n1 !=0) {
                                                                      
            int digit = n1%10;
            revers = (revers*10) + digit;
            n1= n1/10;
            
        } if(number==revers){
            System.out.println(" number is paildrom");
        }else{
            System.out.println(" number is not pailderom");
        }
    }
}
