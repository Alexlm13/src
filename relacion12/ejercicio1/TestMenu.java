package relacion12.ejercicio1;

public class TestMenu {
    public static void main(String[] args) {
        Menu menu=new Menu();
        
        menu.creaOpcion("Opción1");
        menu.creaOpcion("Opción2");
        menu.creaOpcion("Opción3");
        menu.creaOpcion("Opción4");
        menu.creaOpcion("Opción5");

        menu.muestraMenu();

        int opc=menu.capturaOpcion();
        System.out.println("Has seleccionado: "+opc+".");

    }
}
