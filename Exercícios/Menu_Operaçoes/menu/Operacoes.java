package menu;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String opc = "a";

        while (!opc.equals("f")) {
            
            System.out.println("Digite a operacao que deseja efetuar: ");
            System.out.println("a) SOMA");
            System.out.println("b) SUBTRACAO");
            System.out.println("c) MULTIPLICACAO");
            System.out.println("d) DIVISAO");
            System.out.println("e) MODULO");
            System.out.println("f) SAIR");
            
            opc = teclado.next();
            if(!opc.equals("f")){
                System.out.println("Digite um numero: ");
                double n1 = teclado.nextDouble();
                System.out.println("Digite outro numero: ");
                double n2 = teclado.nextDouble();
    
                switch (opc) {
                    
                    case "a":
                        n1 += n2;
                        System.out.println("Soma: " + n1);
                        break;
    
                    case "b":
                        n1 -= n2;
                        System.out.println("Subtracao: " + n1);
                        break;
    
                    case "c":
                        n1 *= n2;
                        System.out.println("Multiplicacao: " + n1);
                        break;
    
                    case "d":
                        n1 /= n2;
                        System.out.println("Divisao: " + n1);
                        break;
    
                    case "e":
                        n1 = n1 % n2;
                        System.out.println("Modulo: " + n1);
                        break;
                    
                    default:
                        break;
                }
            }
        }

        teclado.close();

    }
}
