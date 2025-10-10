package POOV.p1;

public enum EscalaTemperatura {
    CELSIUS("Celcius"),
    FAHRENHEIT("Fahrenheit"),
    KELVIN("Kelvin");

    String temperatura;

    private EscalaTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
    
    public String getTemperatura() {
        return temperatura;
    }

}
