package Ejercicio2;
/*Implementa la clase FichaDomino. Una ficha de dominó tiene dos lados y en cada lado hay un número del 1 al 6
 * o bien ningún número (blanco). Cuando se crea una ficha, proporcionan ambos valores. Dos fichas encajan si se 
 * pueden colocar una al lado de la otra según el juego del dominó, por ejemplo , las fichas [2|5] y [4|5] encajan
 * porque se pueden colocar de la forma [2|5][5|4].
 */
public class FichaDomino {
    private int x, y;

    public FichaDomino(int x, int y){
        this.x=x;
        this.y=y;
    }
    

    public boolean encaja(FichaDomino f1){
        if (f1.x==x || f1.y==x || f1.y==x || f1.y==y){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "["+x+"|"+y+"]";
    }
    
}
