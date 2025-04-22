package UD7_Excepciones.prueba;

public class Aritmetica {
    public static int division(int dividendo, int divisor) {
        if (dividendo==0) {
            throw new RuntimeException("División entre cero");
        }
        return dividendo/divisor;
    }
}
