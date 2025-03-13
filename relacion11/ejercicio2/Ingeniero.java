package relacion11.ejercicio2;
import relacion11.ejercicio1.*;

public class Ingeniero extends Persona{
    public Ingeniero(String nif, int altura, int edad){
        super(nif, altura, edad);
    }

    public void razonar(){
        System.out.println("El ingeniero razona.");
    }

    public void trabajarEnGrupo(){
        System.out.println("El ingeniero trabaja en grupo.");
    }

    @Override
    public String toString(){
        return "Ingeniero: "+super.toString();
    }
}
