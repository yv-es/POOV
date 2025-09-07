public class App {
    public static void main(String[] args) throws Exception {
        Temperatura temp = new Temperatura(10.2, "Kelvin");
        temp.printar();
        Temperatura temp2 = new Temperatura();
        temp2.printar();
        Temperatura temp3 = new Temperatura(10.2, "oi");
        temp3.printar();
    }
}
