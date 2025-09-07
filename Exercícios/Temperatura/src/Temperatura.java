import java.util.List;

public class Temperatura {
    private double temp;
    private String escala;
    private List <String> escalas = List.of("Celcius", "Fahrenheit", "Kelvin");
    

    public Temperatura(){
        temp = 0;
        escala = "Celcius";
    }

    public Temperatura(double g, String e){
        setTemperatura(g, e);
    }


    public void setTemperatura(double g, String e){
        if(escalas.contains(e))
            escala = e;
        else
            escala = "Celcius";
        if(g > 0)
            temp = g;
        else
            temp = 0;
    }

    public void printar(){
        System.out.println("Temperatura: " + temp);
        System.out.println("Escala: " + escala);
    }
}
