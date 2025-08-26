import java.util.Random;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        int matriz[][] = new int[3][3];
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matriz3[][] = new int[3][3];
        int matriz4[][] = new int[3][3];

        for(int i = 0; i < matriz.length; i++){ //matriz 1 e 2 random entre 0-10
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rand.nextInt(10);
                matriz1[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("Matriz 1: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        
        System.out.println("Matriz 1 transposta: ");
        for(int i = 0; i < matriz.length; i++){ //matriz 1 transposta em 3
            for(int j = 0; j < matriz[i].length; j++){
                matriz3[i][j] = matriz[j][i];
            }
        }

        System.out.println(); 

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("[" + matriz3[i][j] + "]");
            }
            System.out.println();
        }

        int maior = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                    if(matriz[i][j] > maior)
                        maior = matriz[i][j];
            }
        }
        System.out.println("maior elemento na matriz 1: " + maior);
        teclado.close();
    }
}
