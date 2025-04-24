package UD7_Excepciones.relacion13;

public class Ejercicio8 {
    public static void main(String[] args) {
        try{
        double[] v = new double[15];
        System.out.println(accesoPorIndice(v, 16));
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
    }

    public static double accesoPorIndice(double[] v, int j) throws Exception {
        try {
            if ((0 <= j) && (j <= v.length - 1)) {
                return v[j];
            } else {
                throw new Exception("El índice " + j + " no existe en el array.");
            }
        } catch (Exception exc) {
            throw exc;
        }
    }
}


// public static void main(String[] args) {
//     double[] v = new double[15];
//     System.out.println(accesoPorIndice(v, 16));
// }

// public static double accesoPorIndice(double[] v, int j) throws Exception {
//     try {
//         if ((0 <= j) && (j <= v.length - 1)) {
//             return v[j];
//         } else {
//             throw new Exception("El índice " + j + " no existe en el array.");
//         }
//     } catch (Exception exc) {
//         throw exc;
//     }
// }