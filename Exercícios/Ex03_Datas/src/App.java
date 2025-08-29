import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();

        LocalDate dataDesejada = LocalDate.of(ano, mes, dia);
        System.out.println(dataDesejada);
        dataDesejada = dataDesejada.plusDays(42);
        System.out.println(dataDesejada);
        teclado.close();

    }
}
