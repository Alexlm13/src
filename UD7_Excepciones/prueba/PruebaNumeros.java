package UD7_Excepciones.prueba;

import java.rmi.server.ExportException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaNumeros {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int [] array={4,2,6,7};
        int n;
        boolean repetir=false;
        do{
            try{
                repetir=false;
                System.out.print("Introduce un número entero > 0 < "+array.length+": ");
                n=entrada.nextInt();
                System.out.println("Valor en la posición "+n+": "+array[n]);
            }
            catch(InputMismatchException e){ // Tipo de excepcion Entrada, no se añadió un número entero.
                entrada.nextLine(); // Limpiamos buffer
                n=0;
                System.out.println("Debe de introducir un número entero.");
                repetir=true;
            }
            catch(IndexOutOfBoundsException e){ // Tipo de excepcion Sobrepasar limites
                System.out.println("Debe de introducir un número entero > 0 y < "+array.length+" ");
                repetir=true;
            }

        }while(repetir);
    }
}
