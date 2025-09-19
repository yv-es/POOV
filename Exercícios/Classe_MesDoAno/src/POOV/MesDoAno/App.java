package POOV.MesDoAno;

public class App {
    public static void main(String[] args) throws Exception {
        MesDoAno mes1 = new MesDoAno(Mes.JANEIRO, "JANE", 30, 1);
        System.out.println(mes1.diasAteAqueleMes(mes1.getNumMes()));
        
        
    }
}
