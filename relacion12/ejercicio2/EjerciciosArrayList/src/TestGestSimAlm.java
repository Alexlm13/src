package relacion12.ejercicio2.EjerciciosArrayList.src;

import java.util.*;

public class TestGestSimAlm {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        GetSimAlm gestion=new GetSimAlm();
        int opc;

        do {
            System.out.println("====== MENÚ ======");
            System.out.println("0. Entrada automatizada");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Entrada de mercancía");
            System.out.println("5. Salida de mercancía");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opc=entrada.nextInt();
            entrada.nextLine();

            switch (opc) {
                case 0:
                    gestion.entradaAutomatizada();
                    System.out.println("Artículos de prueba creados.");
                    break;
                case 1:
                    gestion.lista();
                    break;            
                case 2:
                    gestion.alta();
                    break;
                case 3:
                    gestion.baja();
                    break;
                case 4:
                    gestion.entradaMercancia();
                    break;
                case 5:
                    gestion.salidaMercancia();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;      
                default:
                System.out.println("Opción no válida");
                    break;
            }
        } while (opc!=6);
    }
}
