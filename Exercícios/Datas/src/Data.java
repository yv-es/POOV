import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        //java instant(instante de agora no fuso horario 0, ou tambem a data de 1970 meia noite)
        Instant instante = Instant.now();
        System.out.println(instante);

        //formatar data (escrever a data de modos diferentes)
        FormatStyle formatar = FormatStyle.MEDIUM;

        //local date (data de hoje no meu sistema)
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje " + hoje);
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
        LocalDate data = LocalDate.of(ano, mes, dia);
        System.out.println("Data escolhida " + data);
        
        //duracao entre dois tempos (mas nao data seria mais uma conta matematica de horas minutos e segundos)
        Duration duracao = Duration.ofDays(dia);
        //duracao de 20 dias printados em segundos
        System.out.println("Duracao dos dias digitados " +duracao.getSeconds());
        
        //duracao entre duas datas
        Period periodo = Period.between(data, hoje);
        System.out.println("Duracao entre a data de hoje e a digitada " + periodo.getDays() + "/" + periodo.getMonths() + "/" + periodo.getYears());
        
        //horario local
        LocalTime agora = LocalTime.now();
        System.out.println("Horario de agora " + agora);
        int hora = teclado.nextInt();
        int minutos = teclado.nextInt();
        LocalTime hora_digitada = LocalTime.of(hora, minutos);
        System.out.println("Hora digitada " + hora_digitada);

        //hora e data juntos
        LocalDateTime agora2 = LocalDateTime.now(); // sem fuso horario
        System.out.println(agora2);
        LocalDateTime digitado = LocalDateTime.of(ano, mes, ano, dia, hora, minutos);
        System.out.println("Horario e data digitados juntos " + digitado);
        
        //utilizando fuso horario
        ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime fuso = ZonedDateTime.now(fusoSP); 
        System.out.println(fuso);

        


        teclado.close();
    }
}
