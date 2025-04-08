package relacion12.ejercicio7;

import java.util.*;
import relacion12.ejercicio6.Compra;

public class Supermercado {
    public static void main(String[] args) {
        HashMap<String, Double> productos = new HashMap<>();
        ArrayList<Compra> pedido = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        Descuentos descuento = Descuentos.SIN_DTO;

        productos.put("avena", 2.21);
        productos.put("garbanzos", 2.39);
        productos.put("tomate", 1.59);
        productos.put("jengibre", 3.13); // corregido (sin espacio)
        productos.put("quinoa", 4.50);
        productos.put("guisantes", 1.60);

        pedido = preguntarProductos(pedido, entrada);

        System.out.println("Introduzca el código de descuento ECODTO si quiere:");
        String codigo = entrada.nextLine();
        if (codigo.equalsIgnoreCase("ECODTO")) {
            descuento = Descuentos.ECODTO;
        }

        Ticket(pedido, productos, descuento);
        entrada.close();
    }

    public static ArrayList<Compra> preguntarProductos(ArrayList<Compra> pedido, Scanner entrada) {
        String producto = null;
        int cantidad;

        do {
            System.out.print("Producto (Ponga 'fin' para salir): ");
            producto = entrada.nextLine().toLowerCase();

            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                while (!entrada.hasNextInt()) {
                    System.out.print("Por favor, introduzca un número válido: ");
                    entrada.next();
                }
                cantidad = entrada.nextInt();
                entrada.nextLine(); // limpiar buffer

                boolean encontrado = false;
                for (Compra compra : pedido) {
                    if (compra.getProducto().equals(producto)) {
                        compra.setCantidad(compra.getCantidad() + cantidad);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    pedido.add(new Compra(producto, cantidad));
                }
            }
        } while (!producto.equals("fin"));

        return pedido;
    }

    public static void Ticket(ArrayList<Compra> pedido, HashMap<String, Double> productos, Descuentos descuento) {
        double total = 0.0;

        System.out.println("\n%-14s %8s %8s %10s".formatted("Producto", "Cantidad", "Precio", "Subtotal"));
        System.out.println("----------------------------------------------------------");

        for (Compra linea : pedido) {
            String producto = linea.getProducto();
            int cantidad = linea.getCantidad();

            if (!productos.containsKey(producto)) {
                System.out.printf("Producto no encontrado: %s (omitido)\n", producto);
                continue;
            }

            double precio = productos.get(producto);
            double subtotal = precio * cantidad;
            total += subtotal;

            System.out.printf("%-14s %8d %8.2f %10.2f\n", producto, cantidad, precio, subtotal);
        }

        double descuentoAplicado = total * descuento.getValor();
        double totalConDescuento = total - descuentoAplicado;

        System.out.println("----------------------------------------------------------");
        System.out.printf("Descuento aplicado: -%.2f\n", descuentoAplicado);
        System.out.printf("Total con descuento: %.2f\n", totalConDescuento);
    }
}
