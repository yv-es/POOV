package POOV.p1;

public class Temperatura {
    private double valor;
    private EscalaTemperatura escala;

    public Temperatura(double valor, EscalaTemperatura escala) {
        this.valor = valor;
        this.escala = escala;
    }

    public Temperatura() {
        valor = 0;
        escala = EscalaTemperatura.CELSIUS;
    }

    public void setTemperatura(EscalaTemperatura escala, double valor) {
        if (escala == EscalaTemperatura.CELSIUS) {
            this.valor = 0.0;
            if (valor > -273.15 && valor < 1.415e32)
                this.valor = valor;
        } else if (escala == EscalaTemperatura.FAHRENHEIT) {
            this.valor = 32.0;
            if (valor > -459.67 && valor < 2.5e32)
                this.valor = valor;
        } else if (escala == EscalaTemperatura.KELVIN) {
            this.valor = 273.0;
            if (valor > 0 && valor < 1.416e32)
                this.valor = valor;
        }
    }

    public EscalaTemperatura getEscala() {
        return escala;
    }

    public double getTemperaturaCelcius(){
        if(escala == EscalaTemperatura.FAHRENHEIT)
            return ((valor - 32.0) * 5.0 / 9.0);
        else if(escala == EscalaTemperatura.KELVIN)
            return valor - 273.15;
        return valor;
    }

    public double getTemperaturaFahrenheit(){
        if(escala == EscalaTemperatura.CELSIUS)
            return (valor * (9.0/5.0) + 32);
        else if(escala == EscalaTemperatura.KELVIN)
            return ((valor - 273.15) * 9.0 / 5.0 + 32);
        return valor;
    }

    public double getTemperaturaKelvin(){
        if(escala == EscalaTemperatura.CELSIUS)
            return valor + 273.15;
        else if(escala ==  EscalaTemperatura.FAHRENHEIT)
            return ((valor - 32.0) * 5.0 / 9.0 + 273.15);
        return valor;
    }

    @Override
    public String toString() {
        return EscalaTemperatura.KELVIN == escala ? valor + " " + escala.getTemperatura() :
        valor + "º " + escala.getTemperatura();
    }

    

    

}
