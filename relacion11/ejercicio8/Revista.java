package relacion11.ejercicio8;

public class Revista extends Publicacion {
    int numero;

    public Revista(int ISBN, String titulo, int año, int numero){
        super(ISBN, titulo, año);
        this.numero=numero;
    }
}
