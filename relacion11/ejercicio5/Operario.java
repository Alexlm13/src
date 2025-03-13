package relacion11.ejercicio5;

public abstract class Operario extends Empleado {
    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String toString(){
        return "Empleado "+nombre+" -> Operario";
    }
}
