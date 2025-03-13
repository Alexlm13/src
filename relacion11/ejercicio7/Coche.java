package relacion11.ejercicio7;

import relacion11.ejercicio9.Arrancable;

public class Coche extends Vehiculo implements Arrancable{
    private String marca;
    boolean estado=false;

    public Coche(String marca){
        super();
        this.marca=marca;
    }

    void andarCoche(){
        if (estado==false) {
            System.out.println("El coche de la marca "+marca+" no está arrancado, no puedes avanzar.");
        }else{
        System.out.println("El coche está avanzando");
        }
    }

    void quemarRuedaCoche(){
        if (estado==false) {
            System.out.println("El coche no está arrancado, no puedes quemar rueda.");
        }else{
        System.out.println("El coche está quemando rueda");
        }
    }

    @Override
    public void arrancar() {
        System.out.println("Estás arrancando el coche.");
        estado=true;
    }
    @Override
    public void detener() {
        estado=false;
        System.out.println("Has detenido el coche.");
    }

    @Override
    public void estaArrancado() {
        if (estado==false) {
            System.out.println("El coche está sin arrancar.");
        } else {
            System.out.println("El coche está arrancado.");
        }
    }
}
