package relacion11.ejercicio6;

public class Profesor extends Persona {
    String especialidad="Matemáticas avanzadas";
    double salario=4000.0d;

    // Método getEspecialidad
    public String getEspecialidad (){
        return especialidad;
    }

    // Método getSalario
    public double getSalario (){
        return salario;
    }

    // Método setSalario
    public void setSalario (double salario){
        this.salario= salario;
    }

    // Método setEspecialidad
    public void setESpecialidad (String especialidad){
        this.especialidad= especialidad;
    }

    public void Mostrar(){
        System.out.println("El profesor esta especializado en: "+especialidad+" y cobra al año: "+salario+" Euros.");
    }
}
