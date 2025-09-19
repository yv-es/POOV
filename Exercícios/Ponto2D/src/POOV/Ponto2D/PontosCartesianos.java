package POOV.Ponto2D;
public class PontosCartesianos {
    public static void main(String[] args) throws Exception {
        Ponto2D p1 = new Ponto2D();
        Ponto2D p2 = new Ponto2D(2, -3);
        Ponto2D p3 = new Ponto2D(3, 23);
        p1.mostrarPontos();
        p2.mostrarPontos();
        p2.movendoNoventaGraus();
        p2.mostrarPontos();
        p3.movendoNoventaGraus();
        p3.mostrarPontos();
    }
}
