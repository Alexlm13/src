package relacion11.ejercicio7;

import relacion11.ejercicio9.*;

public abstract class Vehiculo{
    private int vehiculosCreados=0;
    private int kilometrosTotales=0;
    private int kilometrosRecorridos=0;

    public Vehiculo(){
        this.kilometrosRecorridos=0;
        vehiculosCreados++;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public int getKilometrosTotales() {
        return kilometrosTotales;
    }
    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

}
