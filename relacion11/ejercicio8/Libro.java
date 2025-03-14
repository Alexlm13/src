package relacion11.ejercicio8;

public class Libro extends Publicacion implements Prestable {
    boolean prestado;
    public Libro(int ISBN, String titulo, int año){
        super(ISBN,titulo,año);
        this.prestado=false;
    }

    @Override
    public void presta() {
        this.prestado=true;
    }

    @Override
    public void devuelve() {
        this.prestado=false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
