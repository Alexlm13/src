package UD7_Excepciones.relacion13;

public class Ejercicio3 {
    
    // public static char caracterEn(String cadena, int entero) throws Exception{
    //     if (entero>=0 && entero<=cadena.length()-1) {
    //         return cadena.charAt(entero);
    //     } else {
    //         throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
    //     }
    // }

    public static char caracterEn(String cadena, int entero) throws Exception{
        if (entero>=0 && entero<=cadena.length()-1) {
            return cadena.charAt(entero);
        } else if (entero<0){
            throw new NumeroNegativoExcepcion("Su número es negativo.");
        } else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}
