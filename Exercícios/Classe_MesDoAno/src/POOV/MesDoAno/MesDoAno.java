package POOV.MesDoAno;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MesDoAno {
    Mes nomeDoMes;
    String AbreviacaoDoMes;
    int numDias;
    int numMes;

    public MesDoAno(){
        AbreviacaoDoMes = "";
        numDias = 0;
        numMes = 0;
    }

    public MesDoAno(Mes nomeDoMes, String AbreviacaoDoMes, int numDias, int numMes){
        this.nomeDoMes = nomeDoMes;
        this.AbreviacaoDoMes = AbreviacaoDoMes;
        setNumDias(numDias);
        setNumMes(numMes);
        
    }

    public void setNumDias(int numDias){
        this.numDias = numDias > 0 && numDias <= 31 ? numDias : 1; //dia 1 como padrao
    }
    
    public void setNumMes(int numMes){
        this.numMes = numMes > 0 && numMes <= 12 ? numMes : 1; //janeiro como padrao
    }

    public long diasAteAqueleMes(int numMes){
        LocalDateTime data = LocalDateTime.of(2025, numMes, 1, 0, 0, 0);
        LocalDateTime agora = LocalDateTime.now().withHour(0).withMinute(0).withSecond(0);
        Duration duracao = Duration.between(data, agora);
        return duracao.getSeconds();
    }

    public long diasAteAqueleMes(Mes nomeDoMes){
        int mes = nomeDoMes.ordinal();
        LocalDate agora = LocalDate.now();
        LocalDate data = LocalDate.of(2025, mes, 1);

        Duration duracao = Duration.between(agora, data);
        return duracao.getSeconds();
    }

    public int getNumMes(){
        return numMes;
    }


}
