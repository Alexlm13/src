package UD7_Excepciones.relacion13;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner entrada=new Scanner(System.in);

        String cadena=entrada.nextLine();
        
        try{
            Ejercicio3.caracterEn(cadena, 7);
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }


    }
}
