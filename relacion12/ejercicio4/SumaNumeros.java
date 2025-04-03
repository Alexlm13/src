/*(HashSet). Realiza un pequeño programa que pregunte al usuario 5 números diferentes
(almacenándolos en un HashSet), y que DESPUÉS calcule la suma de los mismos (usando un bucle
for-each) */

package relacion12.ejercicio4;
import java.util.*;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        HashSet<Integer> numeros = new HashSet<>();
        int sumaTotal=0;
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número por favor: ");
            System.out.print(">>");
            num=entrada.nextInt();
            numeros.add(num);
        }

        for (Integer suma : numeros) {
            sumaTotal+=suma;
        }

        System.out.println("La suma total de los números es: "+sumaTotal);
    }
}
