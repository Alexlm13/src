package relacion12.ejemplos;
import java.util.*;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList <Integer> numeros=new ArrayList<>();
        int num;

        do{
            System.out.println("Introduce números enteros. 0 para acabar.");
            System.out.println("Número: ");
            num = entrada.nextInt();

            if(num!=0){
                numeros.add(num);
            }
        } while (num != 0);
        System.out.println("Se ha introducido: "+numeros.size()+" números: ");
        System.out.println(numeros);

        Iterator it= numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        double suma = 0;
        for (Integer i : numeros) {
            suma= suma+i;
        }

        System.out.println("La suma de los números: "+suma);
        System.out.println("la media de los números es: "+suma/numeros.size());

        entrada.close();
    }
}
