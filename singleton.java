    //// lasys apporch
    
    // public class singleton {
    
    // private static    singleton  obj;

    // private singleton(){
    //     System.out.println("constuctor call");
    // }
    //     public static singleton getobject(){

    //     if(obj==null){
    //         obj= new singleton();
    //     }
    //   return obj;
    //     }
        
    //     public static void main(String[] args) {
            
    //         singleton s1= singleton.getobject();
    //           singleton s2= singleton.getobject();
    //         System.out.println(s1);
    //           System.out.println(s2);
    //     }
    // }

////  eagar appporch  

  public class singleton {
  
    private  static singleton obj = new singleton();

    private singleton(){

        System.out.println(" construction is cdalled");
    }
      public static singleton getobj(){
       return obj;

      }

      public static void main(String[] args) {      
     singleton  s1 = singleton.getobj();   
 singleton  s2 = singleton.getobj();
    System.out.println(s1);
    System.out.println(s2);
      }
  }