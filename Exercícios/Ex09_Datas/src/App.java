import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        LocalDate agora = LocalDate.now();
        
        Duration duracao = Duration.ofHours(10);
        
        LocalDateTime horarioSaida = LocalDateTime.of(agora.getYear(), agora.getMonth().getValue(), agora.getDayOfMonth(), 15, 05); //horario que sai em los
        LocalDateTime horarioChegada = LocalDateTime.of(agora.getYear(), agora.getMonth().getValue(), agora.getDayOfMonth() + 1, 01, 55); //horario chegado em los angeles

        ZoneId fusoDeLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoDeFrankfurt = ZoneId.of("Europe/Berlin");

        ZonedDateTime saidaComFuso = ZonedDateTime.of(horarioSaida, fusoDeLosAngeles);
        ZonedDateTime chegadaComfuso = ZonedDateTime.of(horarioChegada, fusoDeLosAngeles);

        LocalDateTime chegadaFuso = chegadaComfuso.toLocalDateTime();

        ZonedDateTime chegadaFrankfurt = ZonedDateTime.of(chegadaFuso, fusoDeFrankfurt);

        System.out.println("LocalDateTime Saida: " + horarioSaida);
        System.out.println("LocalDateTime Chegada: " + horarioChegada);
        
        System.out.println("ZoneId Los Angeles: " + fusoDeLosAngeles);
        System.out.println("ZoneId Frankfurt: " + fusoDeFrankfurt);

        System.out.println("ZonedDateTime Saida com Fuso: " + saidaComFuso);
        System.out.println("ZonedDateTime Chegada com Fuso: " + chegadaComfuso);

        System.out.println("LocalDateTime Chegada Fuso: " + chegadaFuso);
        
        System.out.println("ZonedDateTime Chegada Frankfurt: " + chegadaFrankfurt);
        
        System.out.println(saidaComFuso);
        System.out.println(saidaComFuso.toLocalDateTime());

        System.out.println(chegadaComfuso);
        System.out.println(chegadaComfuso.toLocalDateTime());

        System.out.println(chegadaFrankfurt);
        System.out.println(chegadaFrankfurt);

        System.out.println("Saída com Fuso: " + saidaComFuso);
        System.out.println("Chegada com Fuso: " + ZonedDateTime.of(saidaComFuso.plus(duracao).toLocalDateTime(), fusoDeFrankfurt).toOffsetDateTime().atZoneSameInstant(fusoDeFrankfurt));

        teclado.close();
    }
}
