import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataAniversario = teclado.nextLine();
        LocalDate dataFormatada = LocalDate.parse(dataAniversario, formatador);
        LocalDate agora = LocalDate.now();

        if(dataFormatada.getDayOfYear() > agora.getDayOfYear())
            System.out.println("Esse ano voce ja fez aniversario");
        else
            System.out.println("Esse ano voce nao fez aniversario");
        
        Period idade = Period.between(dataFormatada, agora);
        System.out.println("Sua idade e: " + idade.getYears());

        teclado.close();
    }
}
