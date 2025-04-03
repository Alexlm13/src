package relacion12.ejercicio5;

public class Restaurante {
    public static void main(String[] args) {
        Pedido pedido1=new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Pepperoni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();

        Pedido pedido2=new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();

        Pedido pedido3=new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();

        Pedido pedido4=new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();


        System.out.println("Número total de pedidos realizados: "+Pedido.getContadorPedido());
    }
}
