package relacion11.ejercicio6;

import java.util.GregorianCalendar;

public abstract class Persona {

    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNacim;
        
    // Método getNombre
    public String getNombre (){
        return nombre;
    }
    
    // Método getApellidos
    public String getApellidos (){
        return apellidos;
    }

    // Método getFechaNacim
    public GregorianCalendar getFechaNacim (){
        return this.fechaNacim;
    }

    // Método setNombre
    public void setNombre (String nombre){
        this.nombre= nombre;
    }

    // Método setApellidos
    public void setApellidos (String apellidos){
        this.apellidos= apellidos;
    }

    // Método setFechaNacim
    public void setFechaNacim (GregorianCalendar fechaNacim){
        this.fechaNacim= fechaNacim;
    }

    //metodo abstracto
    public abstract void Mostrar();
}
