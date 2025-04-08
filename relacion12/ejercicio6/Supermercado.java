package relacion12.ejercicio6;

import java.util.*;

public class Supermercado {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        ArrayList<Compra> pedido = new ArrayList<>();

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre ", 3.13);
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        pedido=preguntarProductos(pedido);
        Ticket(pedido, productos);
        
    }


    public static ArrayList<Compra> preguntarProductos(ArrayList<Compra> pedido){
        Scanner entrada = new Scanner(System.in);
        String producto=null;
        int cantidad = 0;

        do{
            System.out.print("Producto (Ponga 'fin' para salir.): ");
            producto = entrada.nextLine().toLowerCase();

            if (!producto.equals("fin")) {
                System.out.println("Cantidad: ");
                cantidad = entrada.nextInt();
                Compra linea=new Compra(producto, cantidad);
                pedido.add(linea);
                entrada.nextLine();//Limpiar buffer
            }

        } while (!producto.equals("fin"));
        entrada.close();
        return pedido;
    }


    public static void Ticket(ArrayList<Compra> pedido, HashMap<String, Double> productos){
        double total=0.0;

        System.out.println("");
        System.out.printf("%s %8s %6s %8s\n", "Producto", "Cantidad", "Precio", "Subtotal");
        System.out.println("..............................................");

        for (Compra linea : pedido) {
            String producto=linea.getProducto();
            int cantidad=linea.getCantidad();
            double precio=productos.get(producto);
            double subtotal=precio*cantidad;
            total += subtotal;
            System.out.printf("%-14s %2d %6.2f %8.2f\n", producto, cantidad, precio, subtotal);    
        }
        System.out.println("..............................................");
        System.out.printf("Total: %.2f\n", total);
    }
}
