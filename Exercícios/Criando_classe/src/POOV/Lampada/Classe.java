package POOV.Lampada;
import java.util.Scanner;

public class Classe {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Lampada lampada = new Lampada();
        Lampada lampada2 = new Lampada(127, 60);
        
        lampada2.mostrar();
        lampada.mostrar();

        teclado.close();
    }
}
