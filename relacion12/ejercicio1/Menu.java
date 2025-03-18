package relacion12.ejercicio1;
import java.util.*;

public class Menu {
    //clase
    private ArrayList<String> opciones;

    //constructor
    public Menu(){
        opciones=new ArrayList<>();
    }

    //métodos
    public void creaOpcion(String opcion){
        opciones.add(opcion); //Agregará una opción a la lista
    }

    public void muestraMenu(){
        System.out.println("===== MENÚ =====");
        for (int i = 0; i < opciones.size(); i++) {
              System.out.println((i+1)+". "+opciones.get(i)); //Muestra el número del indice y la opción
        }
    }

    public int capturaOpcion(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;

        do{
            System.out.println("Introduce una opción (1-"+opciones.size()+"): ");
            opcion=entrada.nextInt();
            
        }while(opcion <1 || opcion>opciones.size());


        entrada.close();
        return opcion;
    }
}
