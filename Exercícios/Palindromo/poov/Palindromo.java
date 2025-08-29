package poov;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        String palavra;
        String invertida;
        
        palavra = n.nextLine().toLowerCase();
        StringBuilder inversa  = new StringBuilder(palavra); 

        invertida = inversa.reverse().toString().toLowerCase();

        if(palavra.equals(invertida))
            System.out.println("E palindromo");
        else
            System.out.println("Nao e palindromo");
    }
    n.close();
}
