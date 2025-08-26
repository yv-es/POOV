import java.util.Scanner;

public class IntervaloPrimos {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        int vet[] = new int[n+5];

        for(int i = 0; i <= n; i++){
            vet[i] = i;
        }

        for(int i = 2; i <= n; i++){
            if(vet[i] != -1){
                for(int j = 2*i; j <= n; j+=i){
                    vet[j] = -1;
                }
            }
        }
        for(int i = 2; i <= n; i++){
            if(vet[i] != -1){
                System.out.println(vet[i]);
            }
        }



        teclado.close();
    }
}
