package Ejercicio1;
/* Crea las clases Punto y Linea, De un punto se tienen que saber sus coordenadas x e y,
 * mientras que una linea está definida por dos puntos. Define las clases y los metodos necesarios
 * para que el siguiente código mueste la salida que se indica.
 */

public class Linea{

    Punto p1;
    Punto p2;

    public Linea(Punto p1, Punto p2){
        this.p1=p1;
        this.p2=p2;
    }

    @Override
    public String toString() {
        return "La línea formada por los puntos("+p1.getX()+", "+p1.getY()+") y ("+p2.getX()+", "+p2.getY()+")";
    }
}
