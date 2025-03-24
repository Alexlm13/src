package relacion12.ejercicio3;

import java.util.*;

public class SumaHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros=new HashSet<>();
        Scanner entrada=new Scanner(System.in);

        while (numeros.size()<5) {
            System.out.println("Ingrese un número diferente: ");

            if (entrada.hasNextInt()) {
                int num=entrada.nextInt();

                if (numeros.contains(num)) {
                    System.out.println("El número ya ha sido ingresado, intente otro.");
                } else {
                    numeros.add(num);
                }
            }else{
                System.out.println("Entrada no válida, ingrese solo números.");
                entrada.next();
            }
        }

        int suma=0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("Números ingresados: "+numeros);
        System.out.println("Suma de los números: "+suma);

        entrada.close();
    }
}
