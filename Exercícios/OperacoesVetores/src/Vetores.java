import java.util.Random;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int vet[] = new int[n];
        // Random gerador = new Random();

        for (int i = 0; i < vet.length; i++) { // gerar num randomicos de 0 a 100
            vet[i] = teclado.nextInt();
        }

        for(int i = 0; i < vet.length; i++){ //verificar se existe no vetor
            boolean repetido = false;
            for(int j = i - 1; j >= 0; j--){
                if(vet[i] == vet[j])
                    repetido = true;
            }
            if(!repetido)
            {
                for(int j = i + 1; j < vet.length; j++){
                    if(vet[i] == vet[j])
                        System.out.println("O numero " + vet[j] + " repetiu e esta na posicao " + j);
                }
            }
        }

        System.out.println("Vetor:");
        for (int num : vet) { // printar padrao
            System.out.print("[" + num + "]");
        }
        System.out.println();

        System.out.println("Vetor ao contrario");
        for (int i = vet.length - 1; i >= 0; i--) { // printa ao contrario
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println();

        int maior = 0;
        for (int i = 0; i < vet.length; i++) { // maior valor
            if (i == 0)
                maior = vet[i];
            else {
                if (vet[i] > maior)
                    maior = vet[i];
            }
        }
        System.out.println("maior valor: " + maior);

        System.out.println("Printando apenas dos indices pares:");
        for (int i = 0; i < vet.length; i += 2) { // printar so os indices pares
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println();

        System.out.println("Printando apenas dos indices impares:");
        for (int i = 1; i < vet.length; i += 2) { // printar so os indices impares
            System.out.print("[" + vet[i] + "]");
        }
        System.out.println();

        System.out.println("Pares:");
        for (int i = 0; i < vet.length; i++) { // printando os pares
            if (vet[i] % 2 == 0)
                System.out.print("[" + vet[i] + "]");
        }
        System.out.println();

        System.out.println("Impares:");
        for (int i = 0; i < vet.length; i++) { // printando os pares
            if (vet[i] % 2 != 0)
                System.out.print("[" + vet[i] + "]");
        }
        System.out.println();

        for (int i = 0; i < vet.length; i++) {// verificando repetidos
            boolean ja_repetiu = false;
            for (int j = i - 1; j >= 0; j--) {
                if (vet[i] == vet[j])
                    ja_repetiu = true;
            }
            if (!ja_repetiu) {
                for (int j = i + 1; j < vet.length; j++) {
                    if (vet[i] == vet[j]) {
                        System.out.println("O numero " + vet[j] + " repetiu");
                        break;
                    }
                }
            }
        }

        boolean crescente = true; // verificando ordem cresccente
        for (int i = 0; i < vet.length && crescente; i++) {
            for (int j = i + 1; j < vet.length && crescente; j++) {
                if (!(vet[i] <= vet[j]))
                    crescente = false;
            }
        }
        System.out.println((crescente ? "E crescente" : "Nao e crescente"));
        teclado.close();
    }

}
