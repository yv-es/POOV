package Enum.teste;

public class Teste{
    public static void main(String[] args) {
        Porta p1 = new Porta(Material.MADEIRA, 10.2, false, true);
        Porta p2 = new Porta();
        Porta p3 = new Porta(Material.ALUMINIO, 100.21, true, true);
        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
    }
}