package UD7_Excepciones.relacion13;

public class Ejercicio6 {
    
    public static double accesoPorIndice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new RuntimeException("El índice " + j + " no existe en el array.");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}
