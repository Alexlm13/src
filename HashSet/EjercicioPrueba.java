package HashSet;
import java.util.*;

public class EjercicioPrueba {
   public static void main(String[] args) {

       
       HashSet digits = new HashSet();

       digits.add(0);
       digits.add(1);
       digits.add(2);
       digits.add(3);
       digits.add(4);
       digits.add(5);
       digits.add(null);
       System.out.println("All elements in hashset:\t" + digits);

       
       digits.add(5);
       digits.add(2);
       System.out.println("After adding duplicates: \t" + digits);

       System.out.println("\n-------Using Contains Method-------");
       
       System.out.println("digits.contains(0) : " + digits.contains(0));
       System.out.println("digits.contains(2) : " + digits.contains(2));
       System.out.println("digits.contains(3) : " + digits.contains(7));
       System.out.println("digits.contains(null) : " + digits.contains(null));
   }
}
