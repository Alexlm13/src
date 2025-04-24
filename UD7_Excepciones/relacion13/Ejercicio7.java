package UD7_Excepciones.relacion13;

public class Ejercicio7 {
    public static void main(String[] args) {
        double[] v = new double[15];
        try{
            System.out.println(accesoPorIndice(v, 16));
        } catch (Exception exc) {
            System.out.println("ERROR: "+exc);
        }
    }

    public static double accesoPorIndice(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new Exception("El índice " + j + " no existe en el array.");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
    /*Elimino throws RuntimeException por un Exception cambio el RuntimeException del catch por un Exception
     * y en main creo un try catch y le añado al main un throws Exception
    */

    // public static void main(String[] args) {
    //     double[] v = new double[15];
    //     System.out.println(accesoPorIndice(v, 16));
    // }

    // public static double accesoPorIndice(double[] v, int j) throws RuntimeException {
    //     try {
    //         if ((0 <= j) && (j <= v.length - 1)) {
    //             return v[j];
    //         } else {
    //             throw new Exception("El índice " + j + " no existe en el array.");
    //         }
    //     } catch (RuntimeException exc) {
    //         throw exc;
    //     }
    // }
}
