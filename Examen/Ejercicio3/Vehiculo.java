package Ejercicio3;
public abstract class Vehiculo {
    private String matricula, marca, modelo;
    protected long kmRecorridos;
    protected boolean alquilado;
    private static int totalVehiculos;

    public Vehiculo(String matricula, String marca, String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.alquilado=false;
        this.kmRecorridos=0;
        totalVehiculos++;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public long getKmRecorridos() {
        return kmRecorridos;
    }

    public static int getTotalVehiculos() {
        return totalVehiculos;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public void setKmRecorridos(long kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void setTotalVehiculos(int totalVehiculos) {
        Vehiculo.totalVehiculos = totalVehiculos;
    }

    public boolean estaAlquilado(){
        return alquilado;
    }

    public void alquilar(){
        if (estaAlquilado()) {
            System.out.println("El vehiculo "+matricula+" no se puede alquilar en este momento");
        } else {
            System.out.println("Vehículo "+matricula+" alquilado, gracias por su alquiler");
            alquilado=true;
        }
    }

    public abstract void devolver();


    @Override
    public String toString() {
        return "Vehículo {"+"Matrícula= "+matricula+", Marca= "+marca+", Modelo="+modelo+", Alquiler= "+(alquilado ? "Sí":"No")+"}";
    }
}
