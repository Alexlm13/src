package relacion12.ejercicio5;

import java.util.*;

public class Pedido {
    static int contadorPedido;
    private int numPedido;
    private TipoComida comida;
    private HashSet<String> ingredientes;

    //Constructor
    public Pedido(TipoComida comida){
        this.comida=comida;
        this.ingredientes=new HashSet<>();
        this.numPedido=contadorPedido++;
    }

    //Metodos
    public void agregarIngrediente(String ingrediente){
        if (ingredientes.add(ingrediente)) {
            System.out.println("Se ha añadido su ingrediente: "+ingrediente);
        } else {
            System.out.println("Su ingrediente ya estaba en el pedido.");
        }
    }

    public void mostrarPedido(){
        System.out.println("Pedido #"+numPedido);
        System.out.println("Tipo de comida: "+comida);
        System.out.println("Ingredientes: "+ingredientes);
        System.out.println("-------------------------------");
    }

    public static int getContadorPedido() {
        return contadorPedido;
    }
}
