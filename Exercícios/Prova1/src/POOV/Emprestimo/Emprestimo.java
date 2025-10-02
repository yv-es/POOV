package POOV.Emprestimo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private String item;
    private String nomePessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private boolean devolvido;

    public Emprestimo(String item, String nomePessoa, LocalDate dataEmprestimo) {
        this.item = item;
        this.nomePessoa = nomePessoa;
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    public void finalizar(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
        setDevolvido(true);
    }

    public long diasEmprestados(){
        if(devolvido){
            long duracaoDias = ChronoUnit.DAYS.between(dataEmprestimo, dataDevolucao);
            return duracaoDias;
        }
        else{
            long duracaoDias = ChronoUnit.DAYS.between(dataEmprestimo, LocalDate.now());
            return duracaoDias;
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String devolucao = "";
        if (dataDevolucao != null) 
            devolucao = dataDevolucao.format(formatador);

        return "Emprestimo [item=" + item +
            ", nomePessoa=" + nomePessoa +
            ", dataEmprestimo=" + dataEmprestimo.format(formatador) +
            ", dataDevolucao=" + devolucao +
            ", devolvido=" + (devolvido ? "devolvido" : "nao devolvido") + "]";
    }

    /*
     @Override
     public String toString(){
        String mostrar =
        "Item: " + item +
        "Nome Pessoa: " + nomePessoa +
        "Data emprestimo: " + dataEmprestimo.toString() +
        "Data devolucao: " + dataDevolucao.toString();
        
        if(devolvido)
        mostrar += "Devolvido";
        else
        mostrar += "Nao devolvido";
        return mostrar;
    }
    
    */


    
    
}
