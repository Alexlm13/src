package UD7_Excepciones.relacion13;

public class Ejercicio2 {
    public static void main(String[] args) {
        String aux="Hola";
        
        try{
            int aux2= Integer.parseInt(aux);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: El formato númerico es erroneo.");
        }
    }
}
