package ENUMERADOS.Ejemplos;

public class TestDemarcacion {
    public static void main(String[] args) {
        Demarcacion delantero=Demarcacion.DELANTERO;
        Demarcacion portero=Demarcacion.PORTERO;
        delantero.name();
        delantero.toString();
        delantero.ordinal();
        delantero.compareTo(portero);

        for (Demarcacion e : Demarcacion.values()) {
            System.out.println(e.toString());
        }
       // System.out.println(delantero.compareTo(portero));
    }
}
