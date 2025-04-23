package UD7_Excepciones.relacion13;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        try{
            String cadena=entrada.nextLine();
            Ejercicio3.caracterEn(cadena, 2);
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }
}
