package relacion11.ejercicio8;

public class Publicacion {
    private int ISBN;
    private String titulo;
    private int año;

    public Publicacion(int ISBN, String titulo, int año){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.año=año;
    }

    @Override
    public String toString(){
        return "ISBN: "+ISBN+" Título: "+titulo+" año de publicación: "+año;
    }
}
