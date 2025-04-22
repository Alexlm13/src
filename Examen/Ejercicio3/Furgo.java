package Examen.Ejercicio3;
public class Furgo extends Comercial {
    public Furgo(String matricula, String marca, String modelo, int pma, double volumen) {
        super(matricula, marca, modelo, pma, volumen);
        //TODO Auto-generated constructor stub
    }

    int nPlazas;
    boolean baca;
    boolean puertaLateral;
    static int totalFugornetas;
    static final int KMLIMITE=2000;

    //public Furgo(){

    //}


    @Override
    public void devolver(){

    }

    @Override
    public String toString() {
        return super.toString()+"Tipo Furgo { Plazas: "+nPlazas+", Carga Maxima"+getCargaMax();
    }
}
