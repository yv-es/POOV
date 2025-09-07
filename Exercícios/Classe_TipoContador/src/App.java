public class App {
    public static void main(String[] args) throws Exception {
        TipoContador c1 = new TipoContador(100);
        TipoContador c2 = new TipoContador();

        c1.mostrarCont();
        c2.mostrarCont();

        c1.adicionaNoContador(200);
        c1.mostrarCont();
        c1.subtrairNoContador(450);
        c2.adicionaNoContador(150);
        c2.subtrairNoContador(40);

        c1.mostrarCont();
        c2.mostrarCont();
        
        c2.subtrairNoContador(-40);

        c2.mostrarCont();
    }
}
