package relacion12.ejercicio6;

public class Compra {
    private String producto;
    private int cantidad;

    public Compra(String producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}
