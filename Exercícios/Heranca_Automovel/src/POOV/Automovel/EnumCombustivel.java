package POOV.Automovel;

import java.math.BigDecimal;

public enum EnumCombustivel {
    ALCOOL("alcool", BigDecimal.valueOf(17.000)),
    GASOLINA("gasolina",BigDecimal.valueOf(20.000)),
    FLEX("flex", BigDecimal.valueOf(19.000)),
    DIESEL("diesel", BigDecimal.valueOf(25.000)),
    GAS("gas", BigDecimal.valueOf(30.000)),
    HIBRIDO("hibrido", BigDecimal.valueOf(25.000)),
    ELETRICO("eletrico", BigDecimal.valueOf(28.000));

    private String nome;
    private BigDecimal valor;

    private EnumCombustivel(String nome, BigDecimal valor){
        this.nome = nome;
        this.valor = valor;
    }

    public BigDecimal getValor(){
        return valor;
    }
    
    public String getDescricao(){
        return nome;
    }

}
