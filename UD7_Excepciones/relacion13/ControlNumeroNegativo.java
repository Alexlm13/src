package UD7_Excepciones.relacion13;

import java.util.Scanner;

public class ControlNumeroNegativo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        try{
            System.out.println("Introduce un número positivo.");
            int num=entrada.nextInt();

            if (num<0) {
                throw new NumeroNegativoExcepcion("El número no puede ser negativo.");
            }
            System.out.println("Has introducido el número: "+num);
        } catch (NumeroNegativoExcepcion e){
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error inesperado: "+e.getMessage());
        } finally{
           entrada.close();
        }
    }
    
}
