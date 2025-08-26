import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Criar e mostrar um LocalDate exatamente 6 semanas a partir da data de hoje. 
public class Ex02_Datas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String data = teclado.nextLine();
    
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data_f = LocalDate.parse(data, formatador);

        System.out.println("Data atual: " + data_f + "\ndata daqui a 6 semanas: " + data_f.plusDays(7*6));


        teclado.close();
    }
}
