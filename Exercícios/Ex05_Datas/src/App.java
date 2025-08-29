import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        LocalDate agora = LocalDate.now();
        LocalDate tomadaDaBastilha = LocalDate.of(agora.getYear(), 7, 14);
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE);

        System.out.println(tomadaDaBastilha.format(formatador));

        teclado.close();
    }
}
