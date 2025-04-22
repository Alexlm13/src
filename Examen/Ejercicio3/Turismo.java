package Examen.Ejercicio3;
public abstract class Turismo extends Vehiculo {
    private String color;
    private int nPuertas, nPlazas;
    private static int totalTurismos;
    private static final  double KMLIMITE=10000;

    public Turismo(String matricula, String marca, String modelo, String color, int nPuertas, int nPlazas){
        super(matricula, marca, modelo);
        this.color=color;
        this.nPlazas=nPlazas;
        this.nPuertas=nPuertas;
        totalTurismos++;
    }

    public String getColor() {
        return color;
    }

    public int getNumPlazas(){
        return nPlazas;
    }

    public int getNumPuertas(){
        return nPuertas;
    }

    
    @Override
    public void devolver() {
       if (this.estaAlquilado()){
        this.kmRecorridos+=100;
        if (this.kmRecorridos>KMLIMITE) {
            
        }
       }
    }

    @Override
    public String toString() {
        return super.toString()+" Tiopo turismo";
    }
}
