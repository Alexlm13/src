package UD7_Excepciones.relacion13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("Indica 6 números: ");
        int[] numeros= new int[6];
        int contador=0;

        while (contador < 6) {
            System.out.println("Introduce un número "+(contador+1)+": ");
            try {
                int numero=entrada.nextInt();
                numeros[contador]=numero;
                contador++;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debes de introducir un número entero.");
                entrada.next();
            }
        }
        
        int maximo=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>maximo)
            maximo=numeros[i];
        }

        System.out.println("El número máximo es: "+maximo);
    }
}
