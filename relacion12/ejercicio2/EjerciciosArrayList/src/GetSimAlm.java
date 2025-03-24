package relacion12.ejercicio2.EjerciciosArrayList.src;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSimAlm {
    private ArrayList<Articulo> almacen;

    public GetSimAlm(){
        almacen = new ArrayList<>();
    }
    public void entradaAutomatizada(){
        Articulo art1=new Articulo("A001", "Laptop HP",500.0,700.0,6);
        art1.setPrecioCompra(500.0);
        art1.setPrecioVenta(700.0);
        art1.setStock(2);

        Articulo art2=new Articulo("A520", "Monitor",600.0,890.0,6);
        art2.setPrecioCompra(600.0);
        art2.setPrecioVenta(890.0);
        art2.setStock(6);

        Articulo art3=new Articulo("A521", "Teclado",92.0,100.0,3);
        art2.setPrecioCompra(92.0);
        art2.setPrecioVenta(100.0);
        art2.setStock(3);

        Articulo art4=new Articulo("A522", "Ratón",70.0,90.0,7);
        art2.setPrecioCompra(70.0);
        art2.setPrecioVenta(90.0);
        art2.setStock(7);

        almacen.add(art1);
        almacen.add(art2);
        almacen.add(art3);
        almacen.add(art4);
    }

    public void lista(){
        System.out.println("Lista de artículos en el almacén");
        for (Articulo art : almacen) {
            System.out.println(art);
        }
    }

    public void alta(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Código del artículo: ");
        String codigo= entrada.nextLine();

        for (Articulo articulo : almacen) {
            if (articulo.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("El código existe.");
                return;
            }
        }
        System.out.println("Ingrese descripción: ");
        String descripcion=entrada.nextLine();

        System.out.println("Ingrese precio de compra: ");
        double precioCompra=entrada.nextDouble();

        System.out.println("Ingrese precio de venta: ");
        double precioVenta=entrada.nextDouble();

        System.out.println("Ingrese el stock");
        int stock=entrada.nextInt();

        Articulo nuevoArticulo=new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
        nuevoArticulo.setPrecioCompra(precioCompra);
        nuevoArticulo.setPrecioVenta(precioVenta);
        nuevoArticulo.setStock(stock);

        almacen.add(nuevoArticulo);
        System.out.println("Artículo agregado con éxito.");
    }

    public void baja(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el código del artículo a eliminar: ");
        String codigo = entrada.nextLine();

        for (Articulo articulo : almacen) {
            if (articulo.getCodigo().equalsIgnoreCase(codigo)){
                almacen.remove(articulo);
                System.out.println("Artículo eliminado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró un artículo con ese código.");
    }

    public void entradaMercancia(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Código del artículo: ");
        String codigo=entrada.nextLine();

        for (Articulo art: almacen){
            if (art.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ingrese cantidad a añadir: ");
                int cantidad=entrada.nextInt();
                art.setStock(art.getStock()+cantidad);
                System.out.println("Stock actualizado.");
                return;
            }
        }
        System.out.println("No se encontró un articulo con ese código.");
    }

    public void salidaMercancia(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el código del artículo");
        String codigo=entrada.nextLine();

        for (Articulo art : almacen) {
            if (art.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Ingrese la cantidad a retirar: ");
                int cantidad=entrada.nextInt();

                if (cantidad>art.getStock()) {
                    System.out.println("No hay suficiente stock disponible.");
                } else {
                    art.setStock(art.getStock()-cantidad);
                    System.out.println("Stock actualizado");
                }
                return;
            }   
        }
        System.out.println("No se encontró el artículo con ese código.");
    }
}

