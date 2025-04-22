package UD7_Excepciones.relacion13;

public class Ejercicio1 {
    public static void main(String[] args) {
        String [] array_string = new String[25];
        
        try{
            System.out.println(array_string[3].length());
        }
        catch(NullPointerException e){ // Tipo de excepcion de Puntero nulo, el índice no tiene ningún contenido de tipo String
            System.out.println("ERROR: El índice seleccionado está vacío");
        }
    }
}
