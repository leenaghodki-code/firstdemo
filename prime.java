public class prime {


    public static void main(String[] args) {
             
int num []= {10,20,30,40,50,60,70};
    int sum = 0;

    for(int i=0;i<num.length;i++){
     
        sum = sum +num[i];
     }
       System.out.println("the sum of arry is "+ sum);
    
       int avrage =(sum)/num.length;
      System.out.println("the avrage of this arry is "+ avrage);

    }
}
