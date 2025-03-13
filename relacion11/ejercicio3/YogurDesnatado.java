package relacion11.ejercicio3;

public class YogurDesnatado extends Yogur{
    public YogurDesnatado(){
        super();
    }

    @Override
    public double getCalorias() {
        return super.getCalorias() / 2;
    }
}
