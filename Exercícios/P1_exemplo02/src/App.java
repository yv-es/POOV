import java.util.ArrayList;

import POOV.p1.EscalaTemperatura;
import POOV.p1.Temperatura;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Temperatura> temperaturas = new ArrayList<>();

        temperaturas.add(new Temperatura(0, EscalaTemperatura.KELVIN));
        temperaturas.add(new Temperatura(-273.15, EscalaTemperatura.CELSIUS));
        temperaturas.add(new Temperatura(-459.67, EscalaTemperatura.FAHRENHEIT));

        temperaturas.add(new Temperatura(273.15, EscalaTemperatura.KELVIN));
        temperaturas.add(new Temperatura(0, EscalaTemperatura.CELSIUS));
        temperaturas.add(new Temperatura(32, EscalaTemperatura.FAHRENHEIT));

        temperaturas.add(new Temperatura(373.15, EscalaTemperatura.KELVIN));
        temperaturas.add(new Temperatura(100, EscalaTemperatura.CELSIUS));
        temperaturas.add(new Temperatura(212, EscalaTemperatura.FAHRENHEIT));

        for(int i = 0; i < temperaturas.size(); i++){
            System.out.println(temperaturas.get(i));
            System.out.println("Temperatura em Celcius: " + temperaturas.get(i).getTemperaturaCelcius());
            System.out.println("Temperatura em Kelvin: " + temperaturas.get(i).getTemperaturaKelvin());
            System.out.println("Temperatura em Fahrenheit: " + temperaturas.get(i).getTemperaturaFahrenheit());
        }

        for(Temperatura t : temperaturas){
            System.out.println(t);
            System.out.println("Temperatura em Celcius: " + t.getTemperaturaCelcius());
            System.out.println("Temperatura em Kelvin: " + t.getTemperaturaKelvin());
            System.out.println("Temperatura em Fahrenheit: " + t.getTemperaturaFahrenheit());
        }

        
    }
}
