package UD7_Excepciones.relacion13.prueba;

public class prueba {
    public static void main(String[] args) {
        System.out.println("Estoy en main");

        //uno();

        try{
            uno();    
            System.out.println("Estoy en main despues de la llamada de uno()");
        } catch (Exception e){ // Tipo de Error Aritmetico
            System.out.println("ERROR: División por 0");
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void uno(){
        System.out.println("Estoy en Uno");

        dos();

        System.out.println("Estoy en Uno después de usar Dos");
    }

    public static void dos(){
        int i=10, j=0;
        System.out.println("Estoy en Dos");

        i=i/j;

        System.out.println("Estoy en Dos despued de ejecutar la division");
    }
}
