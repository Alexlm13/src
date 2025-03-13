package relacion11.ejercicio1;
import relacion11.ejercicio2.*;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        Persona persona2=new Persona("12345678A", 200, 28);
        Ingeniero ingeniero=new Ingeniero("15236487A", 186, 30);
        IngenieroInformatico ingenieroinformatico=new IngenieroInformatico("21365847A", 171, 29);

        System.out.println(ingeniero);
        ingeniero.comer();
        ingeniero.hablar();
        ingeniero.razonar();
        ingeniero.trabajarEnGrupo();

        System.out.println(ingenieroinformatico);
        ingenieroinformatico.comer();
        ingenieroinformatico.hablar();
        ingenieroinformatico.razonar();
        ingenieroinformatico.trabajarEnGrupo();
        ingenieroinformatico.crearPrograma();

        System.out.println("Los datos de la primera persona son: ");
        System.out.println(persona1);

        System.out.println("Los datos de la segunda persona son: ");
        System.out.println(persona2);
    }
}
