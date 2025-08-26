import java.util.Scanner;

import estrategia.Crivo;
import estrategia.EstrategiaPrimo;
import estrategia.ForcaBruta;

public class Primo {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        EstrategiaPrimo estrategia = new Crivo();
        
        System.out.println((estrategia.verifica_primo(n)? "E primo" : "Nao e primo"));

        teclado.close();
    }
}
