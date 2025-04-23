package UD7_Excepciones.relacion13;

// EJERCICIO 5
public class NumeroNegativoExcepcion extends Exception{
    
    public NumeroNegativoExcepcion(){
        super();
    }

    public NumeroNegativoExcepcion(String parametro){
        super(parametro);
    }
}