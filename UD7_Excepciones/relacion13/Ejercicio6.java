package UD7_Excepciones.relacion13;

public class Ejercicio6 {
    
    // public static double accesoPorIndice(double[] v, int j) throws RuntimeException {
    //     try {
    //         if ((0 <= j) && (j <= v.length - 1)) {
    //             return v[j];
    //         } else {
    //             throw new RuntimeException("El índice " + j + " no existe en el array.");
    //         }
    //     } catch (RuntimeException exc) {
    //         throw exc;
    //     }
    // }

    // public static void main(String [] args){
    //     double[] v = new double[15];
    //     System.out.println(accesoPorIndice(v, 16));
    // }

    public static double accesoPorIndice(double[] v, int j){
        try {
            if ((j >= 0) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new RuntimeException("El índice " + j + " no existe en el array.");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    public static void main(String [] args){
        double[] v = new double[15];
        
        try{
            System.out.println(accesoPorIndice(v, 16));
        } catch (RuntimeException exc){
            System.out.println("ERROR: "+exc);
        }
    }
}
