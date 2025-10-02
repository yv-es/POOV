package POOV.Produto;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    public LocalDate dataValidade;

    public ProdutoPerecivel(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String codigo, String nome, String marca, int qntAtual, int qntMinima, LocalDate dataCompra,
            double precoCompra, double precoVenda, LocalDate dataValidade) {
        super(codigo, nome, marca, qntAtual, qntMinima, dataCompra, precoCompra, precoVenda);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel [" + super.toString() + "dataValidade=" + dataValidade + "]";
    }



}
