package relacion11.ejercicio2;

public class IngenieroInformatico extends Ingeniero {
    public IngenieroInformatico(String nif, int altura, int edad){
        super(nif, altura, edad);
    }

    public void crearPrograma(){
        System.out.println("El ingeniero informático está creando un programa.");
    }

    @Override
    public String toString(){
        return "Ingeniero informático: "+super.toString();
    }
}