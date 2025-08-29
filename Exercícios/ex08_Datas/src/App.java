import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 13) Escreva um programa em Java que mostre a quantos dias você está vivo.
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String digitado = teclado.nextLine();

        LocalDate dataAniversario = LocalDate.parse(digitado, formatador);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(dataAniversario, hoje);
        
        int qntDIas = (idade.getYears() * 365 + idade.getMonths() * 30 + idade.getDays());
        System.out.println(qntDIas);


        teclado.close();

    }
}
