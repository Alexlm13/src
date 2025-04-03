package HashSet;
import java.util.*;

public class prueba {
    public static void main(String[] args) {
        //No se repiten valores del conjunto, case sensitive
        HashSet<String> coches=new HashSet<String>();
        coches.add("Renault");
        coches.add("Seat");
        coches.add("Mini");
        coches.add("Volvo");
        coches.add("Seat");

        System.out.println(coches);
        //comprueba si el conjunto tiene el valor que le hemos dado
        System.out.println(coches.contains("Mazda"));
        //elimina del conjunto el valor que le demos
        System.out.println(coches.remove("Mini"));
    }
    
}
