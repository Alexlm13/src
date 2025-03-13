package relacion11.ejercicio3;

public class TestYogures{
    public static void main(String[] args) {
        Yogur yogurnormal= new Yogur();
        YogurDesnatado yogurDesnatado= new YogurDesnatado();

        System.out.println("Calorías del yogur normal: "+yogurnormal.getCalorias());
        System.out.println("Calorías del yogur desnatado: "+yogurDesnatado.getCalorias());
    }
}