import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        ArrayList<Integer> vet = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            vet.add(r.nextInt(10));  
        }

        System.out.println("Vetor normal: ");
        for(int i : vet)
            System.out.print("[" + i + "]");
        System.out.println();

        System.out.println("Vetor invertido: ");
        for(int i = vet.size() - 1; i >= 0; i--)
            System.out.print("[" + vet.get(i) + "]");
        System.out.println();

        int media = 0;
        for(int i : vet)
            media+=i;
        System.out.println("A media dos numeros e: " + media/10);

        int menor = vet.get(0);
        int maior = vet.get(0);

        for(int i : vet)
            if(i < menor)
                menor = i;
        
        for(int i : vet)
            if(i > maior)
                maior = i;
        
        System.out.println("O maior valor e: " + maior);
        System.out.println("O menor valor e: " +menor);

        System.out.println("Posicoes pares:");
        for(int i = 0; i < 10; i+=2)
            System.out.print("[" + vet.get(i) + "]");
        System.out.println();

        System.out.println("Posicoes impares:");
        for(int i = 1; i <= 10; i+=2)
            System.out.print("[" + vet.get(i) + "]");
        System.out.println();

        System.out.println("Numeros pares:");
        for(int i : vet)
            if(i % 2 == 0)
                System.out.print("[" + i + "]");
        System.out.println();

        System.out.println("Numeros impares:");
        for(int i : vet)
            if(i % 2 != 0)
                System.out.print("[" + i + "]");
        System.out.println();  

        boolean repetiu = false;
        for(int i = 0; i < 10; i++){
            for(int j = i+1; j < 10; j++){
                if(vet.get(i) == vet.get(j)){
                    repetiu = true;
                    break;
                }
            }
            if(!repetiu){
                for(int j = i-1; j > 0; j--){
                    if(vet.get(i) == vet.get(j)){
                        repetiu = true;
                        break;
                    }
                }
            }
        }
        if(repetiu)
            System.out.println("Ha numeros repetidos");
        else
            System.out.println("Nao ha numeros repetidos");

        System.out.print("Digite o numero que deseja verificar se exise repetido:");
        int n = teclado.nextInt();

        boolean rep = false;
        for(int i = 0 ; i < 10 && !rep ; i++){
            if(vet.get(i) == n){
                rep = true;
                System.out.println("O numero " + n + " repetiu e esta na posicao " + i);
            }
        }
        
        boolean crescente = true;
        for(int i = 0; i < vet.size() - 1; i++){
            if(vet.get(i) > vet.get(i+1)){
                crescente = false;
            }
        }
        if(crescente)
            System.out.println("E crescente");
        else
            System.out.println("Nao e crescente");
        teclado.close();
    }
}
