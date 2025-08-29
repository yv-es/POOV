import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //e) Mostrar o dia do mês da quarta quinta-feira de novembro do ano atual
        Scanner teclado = new Scanner(System.in);
        int ano =  LocalDate.now().getYear();
        int mes  = Month.NOVEMBER.getValue();
        LocalDate data = LocalDate.of(ano, mes, 1);
        
        int primeira_quarta = DayOfWeek.WEDNESDAY.getValue() - data.getDayOfWeek().getValue();
        if(primeira_quarta < 0)
            primeira_quarta+=7;

        data = data.plusDays(primeira_quarta + (3 * 7));
        System.out.println(data);


        teclado.close();
    }
}
