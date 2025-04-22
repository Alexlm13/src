package Examen.Ejercicio1;
/* Crea las clases Punto y Linea, De un punto se tienen que saber sus coordenadas x e y,
 * mientras que una linea está definida por dos puntos. Define las clases y los metodos necesarios
 * para que el siguiente código mueste la salida que se indica.
 */

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

}
