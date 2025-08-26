package letraA;

import java.util.Scanner;

public class ProcurarString {
    public static void main(String[] args) throws Exception {
        
        Scanner s = new Scanner(System.in);

        System.out.print("String 1:");
        String frase1 = s.nextLine();
        String aux1 = frase1;

        System.out.print("String 2(string repetida na 1):");
        String frase2 = s.nextLine();

        System.out.println("String 3(trocar as repetidas por ela):");
        String frase3 = s.nextLine();
        int qnt_repetidas = 0;

        while(aux1.indexOf(frase2) != -1){
            int aux = aux1.indexOf(frase2);
            aux1 = aux1.substring(aux + frase2.length());
            qnt_repetidas++;
        }
        System.out.println("A string " + frase2 + " repetiu " + qnt_repetidas + " vezes");

        frase1 = frase1.replaceAll(frase2, frase3);
        System.out.println("Nova string: " + frase1);
        
        s.close();
    }


}
