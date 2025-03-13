package relacion11.ejercicio7;
import java.util.*;

public class testVehiculo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String tipo="Mountain bike";
        String marca="Toyota";
        Bicicleta bici=new Bicicleta(tipo);
        Coche coche=new Coche(marca);
        int opcion;

        do {
            
            System.out.println("        VEHÍCULOS        ");
            System.out.println("=========================");
            System.out.println("1.  Anda con la bicicleta");
            System.out.println("2.  Haz el caballito con la bicicleta");
            System.out.println("3.  Anda con el coche");
            System.out.println("4.  Quema rueda con el coche");
            System.out.println("5.  Ver kilometraje de la bicicleta");
            System.out.println("6.  Ver kilometraje del coche");
            System.out.println("7.  Ver kilometraje total");
            System.out.println("8.  Arrancar coche");
            System.out.println("9.  Detener coche");
            System.out.println("10. Estado del coche");
            System.out.println("11. Salir");
            System.out.print("Elige una opción (1-11): ");
    
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    bici.andarBicicleta();
                    break;
                case 2:
                    bici.hacerCaballitoBicicleta();
                    break;
                case 3:
                    coche.andarCoche();
                    break;
                case 4:
                    coche.quemarRuedaCoche();
                    break;
                case 5:
                    System.out.println("Los kilometros totales de la bici son: "+bici.getKilometrosTotales()); 
                    break;
                case 6:
                    System.out.println("Los kilometros totales del coche son: "+coche.getKilometrosTotales());
                    break;
                case 7:
                    System.out.println("Los kilometros totales son...");
                    int kmTotal;
                    kmTotal=bici.getKilometrosTotales()+coche.getKilometrosTotales();
                    System.out.println("El total de kilometros es de: "+kmTotal+"km");
                    break;
                case 8:
                    coche.arrancar();
                    break;
                case 9:
                    coche.detener();
                    break;
                case 10:
                    coche.estaArrancado();
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 11);

        entrada.close();
    }
}
