package POOV.Tempo;

public class Tempo {
    private int hora;
    private int mins;
    private int segundos;

    public Tempo(){
        hora = 0;
        mins = 0;
        segundos = 0;
    }

    public Tempo(int hora, int mins, int segundos){
        setHora(hora);
        setMins(mins);
        setSegundos(segundos);
    }

    public void setHora(int hora){
        this.hora = hora > 0 && hora <= 24? hora : 0;
    }

    public void setMins(int mins){
        this.mins = mins > 0 && mins <= 60? mins : 0;   
    }
    
    public void  setSegundos(int segundos){
        this.segundos = segundos > 0 && segundos <= 60 ? segundos : 0;
    }

    public int getHora(){
        return hora;
    }

    public int getMins(){
        return mins;
    }

    public int getSegundos(){
        return segundos;
    }

    public void mostrarHorario(){
        System.out.println("Hora mostrada: " +  hora + ":" + mins + ":" + segundos);
    }

    public void adicionarObjetos(Tempo tempo2){
        this.hora = tempo2.getHora() > 0 ? tempo2.getHora() : 0;
        this.mins = tempo2.getMins() > 0 ? tempo2.getMins() : 0;
        this.segundos = tempo2.getSegundos() > 0 ? tempo2.getSegundos() : 0;
    }

    public int quantidadeSegundos(){
        int segundosTotais = getHora() * 3600 + getMins() * 60 +  getSegundos();
        return segundosTotais;
    }

}
