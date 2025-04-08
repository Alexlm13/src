package relacion12.ejercicio7;

public enum Descuentos {
    ECODTO(0.10),
    SIN_DTO(0.0);

    private final double valor;

    Descuentos(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return valor;
    }
}
