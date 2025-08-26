import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01_Data {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String d1 = teclado.nextLine();
        String d2 = teclado.nextLine();

        LocalDate f_d1 = LocalDate.parse(d1, formatador);
        LocalDate f_d2 = LocalDate.parse(d2, formatador);

        boolean maior_data = f_d2.isBefore(f_d1);
        System.out.println("Data 1 formatada: " +f_d1.format(formatador));
        System.out.println("Data 2 formatada: " +f_d2.format(formatador));
        System.out.println(maior_data ? "Data 2 e a maior data" : "Data 1 e a maior data");
        
        Period periodo_d1d2;
        if(maior_data)
            periodo_d1d2 = Period.between(f_d2, f_d1);
        else
            periodo_d1d2 = Period.between(f_d1, f_d2);
        System.out.println("Diferenca entre as datas: " + periodo_d1d2.getDays() + "/" + periodo_d1d2.getMonths() + "/" + periodo_d1d2.getYears());
        teclado.close();
    }
}
