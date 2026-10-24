 import java.util.TreeMap;
   import java.util.*;


public class Treemap {
    public static void main(String[] args) {
        
        TreeMap map = new TreeMap<>();
        
        map.put(160, "abhcoijdo");
        map.put(100,"deerk");
       map.put(101, "sourabh");
       map.put(104,"himasshusj");
         map.put(109,"ravi");
System.out.println(map);
         System.out.println(map.headMap(104));
        //  map.put("sourbh",101);
        //  map.put("himashu",102);
        //  map.put("amit",103);
      // System.out.println(map);
   //   System.out.println( map.ceilingEntry(105));               
      // System.out.println(map.ceilingKey(101));

  /// System.out.println( map.firstEntry());
     System.out.println(map.floorKey(112));
   System.out.println(map.higherEntry(109));
   System.out.println(map.keySet());}
}