import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("11", "rafaella", "adidas", 10, 1, LocalDate.of(2003, 12, 20), 20.2, 2.8);
        p1.Mostrar();
    }
}
