package relacion12.ejercicio2.EjerciciosArrayList.src;

public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    //constructor
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock){
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.precioCompra=0.0;
        this.precioVenta=0.0;
        this.stock=0;
    }

    //GETTERS
    public String getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecioCompra(){
        return precioCompra;
    }

    public double getPrecioVenta(){
        return precioVenta;
    }

    public int getStock(){
        return stock;
    }

    //SETTERS

    public void setPrecioCompra(double precioCompra){
        if (precioCompra>=0) {
            this.precioCompra=precioCompra;
        } else {
            System.out.println("El precio de compra no puede ser negativo.");
        }
    }

    public void setPrecioVenta(double precioVenta){
        if(precioVenta>=precioCompra){
            this.precioVenta=precioVenta;
        }else{
            System.out.println("El precio de venta no puede ser menor que el precio de compra.");
        }
    }

    public void setStock(int stock){
        if (stock>=0) {
            this.stock=stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    public void mostrarArticulo(){
        System.out.println("Código: "+codigo);
        System.out.println("Descripción: "+descripcion);
        System.out.println("Precio de compra: "+precioCompra);
        System.out.println("Precio de venta: "+precioVenta);
        System.out.println("Stock: "+stock);
    }

    @Override
    public String toString(){
        return "Código: "+codigo+" | Descripción: "+descripcion+
        " | Precio Compra: "+precioCompra+
        " | Precio Venta: "+precioVenta+
        " | Stock: "+stock;
    }
}
