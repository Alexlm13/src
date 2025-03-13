package relacion11.ejercicio4;

public abstract class Empleado {
    //atributos
    protected String nombre;

    //constructores
    //por defecto
    public Empleado(){
        this.nombre="nombre";
    }

    //con parametros
    public Empleado(String nombre){
        this.nombre=nombre;
    }

    //getters y setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //metodo toString
    @Override
    public String toString(){
        return "Empleado "+nombre;
    };
}
