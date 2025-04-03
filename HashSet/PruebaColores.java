package HashSet;
import java.util.*;

public class PruebaColores {
    public static void main(String[] args) {
        HashSet<String> arcoiris = new HashSet<>();

        //Añadiendo colores
        arcoiris.add("Rojo");
        arcoiris.add("Naranja");
        arcoiris.add("Amarillo");
        arcoiris.add("Verde");
        arcoiris.add("Azul");
        arcoiris.add("Morado");
        arcoiris.add("Violeta");

        //Recorriendo el arcoiris
        System.out.println("Atravesando el arcoiris");
        for (String i : arcoiris) {
            System.out.println("Color: "+i);
        }

        //Comprobando si un color está dentro del arcoiris
        System.out.println("\n-------Usando método Contains-------");
        System.out.println("arcoiris.contains(\"Amarillo\"): \t"+arcoiris.contains("Amarillo"));
        System.out.println("arcoiris.contains(\"Blanco\"): \t"+arcoiris.contains("Blanco"));
        System.out.println("arcoiris.contains(\"Lavanda\"): \t"+arcoiris.contains("Lavanda"));
        System.out.println("arcoiris.contains(\"Rojo\"): \t"+arcoiris.contains("Rojo"));
    
        //Borrando un color
        System.out.println("");
        System.out.println("Borramos el rojo.");
        arcoiris.remove("Rojo");

        //Comprobando de nuevo si un color esta dentro del arcoiris
        System.out.println("arcoiris.contains(\"Rojo\"): \t"+arcoiris.contains("Rojo"));
        
        System.out.println("\nDespués de borrar el Rojo: "+arcoiris);
    }
}
