package POOV;
import java.time.LocalDate;

import POOV.Produto.Produto;
import POOV.Produto.ProdutoPerecivel;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("11", "rafaella", "adidas", 10, 23, LocalDate.of(2003, 12, 20), 20.2, 2.8);
        ProdutoPerecivel p2 = new ProdutoPerecivel("14", "gabriel", "nike", 14, 10, LocalDate.of(2003, 12, 18),
            250.00, 230.32, LocalDate.of(2003, 12, 20));
        p1.Mostrar();
        System.out.println(p2);
    }
}
