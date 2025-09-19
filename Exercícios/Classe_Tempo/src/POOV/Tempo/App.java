package POOV.Tempo;
public class App {
    public static void main(String[] args) throws Exception {
        Tempo t1 = new Tempo(2, 30, 60);
        t1.mostrarHorario();
        Tempo t2 = new Tempo(5, 68, 21);
        
        t2.mostrarHorario();
        t1.adicionarObjetos(t2);

        System.out.println("Horario 2 em 1:");
        t1.mostrarHorario();
        System.out.println(t1.quantidadeSegundos());
        
    }
}
