package Ejercicio3;
public abstract class Comercial extends Vehiculo{
    private int cargaMax;
    private double volumen;
    private static int totalComerciales;

    public Comercial(String matricula, String marca, String modelo, int pma, double volumen){
        super(matricula, marca, modelo);
        this.cargaMax=pma;
        this.volumen=volumen;
        totalComerciales++;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    


}
