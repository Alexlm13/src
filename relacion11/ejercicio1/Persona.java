package relacion11.ejercicio1;

public class Persona {
    private String nif;
    private int altura;
    private int edad;


    //Constructor por defecto
    public Persona(){
        this.nif="11111111A";
        this.altura=175;
        this.edad=25;
    }

    //Constructor con parámetros

    public Persona(String nif, int altura, int edad){
        this.nif=nif;
        this.altura=altura;
        this.edad=edad;
    }

    //GETTERS

    String getNif(){
        return nif;
    }

    int getAltura(){
        return altura;
    }

    int getEdad(){
        return edad;
    }

    //SETTERS

    void setNif(String nif){
        this.nif=nif;
    }

    void setAltura(int altura){
        this.altura=altura;
    }

    void setEdad(int edad){
        this.edad=edad;
    }

    public void hablar(){
        System.out.println("La persona está hablando.");
    }

    public void comer(){
        System.out.println("La persona está comiendo.");
    }

    @Override
    public String toString(){
        return " NIF: "+nif+", Altura: "+altura+"cm y Edad: "+edad+".";
        
    }
}
