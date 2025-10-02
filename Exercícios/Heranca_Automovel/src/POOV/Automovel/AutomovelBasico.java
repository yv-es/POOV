package POOV.Automovel;

import java.math.BigDecimal;

public class AutomovelBasico extends ClasseAutomovel{
    private Boolean possuiRetrovisor;
    private Boolean possuiLimpadorTraseiro;
    private Boolean possuiRadio;
    
    public AutomovelBasico(String modelo, String cor, EnumCombustivel combustivel, Boolean possuiRetrovisor,
            Boolean possuiLimpadorTraseiro, Boolean possuiRadio) {
        super(modelo, cor, combustivel);
        this.possuiRetrovisor = possuiRetrovisor;
        this.possuiLimpadorTraseiro = possuiLimpadorTraseiro;
        this.possuiRadio = possuiRadio;
    }

    public BigDecimal precoAutomovelBasico(){
        BigDecimal precoTotal = getPrecoCombustivel();
        if(possuiRetrovisor)
            precoTotal = precoTotal.add(BigDecimal.valueOf(100.00));
        if(possuiLimpadorTraseiro)
            precoTotal = precoTotal.add(BigDecimal.valueOf(250.00));
        if(possuiRadio)
            precoTotal = precoTotal.add(BigDecimal.valueOf(300.00));

        return precoTotal;

    }

    public void setPossuiRetrovisor(Boolean possuiRetrovisor) {
        this.possuiRetrovisor = possuiRetrovisor;
    }

    public Boolean getPossuiRetrovisor() {
        return possuiRetrovisor;
    }


    public void setPossuiLimpadorTraseiro(Boolean possuiLimpadorTraseiro) {
        this.possuiLimpadorTraseiro = possuiLimpadorTraseiro;
    }


    public Boolean getPossuiLimpadorTraseiro() {
        return possuiLimpadorTraseiro;
    }

      
    public Boolean getPossuiRadio() {
            return possuiRadio;
    }


    public void setPossuiRadio(Boolean possuiRadio) {
        this.possuiRadio = possuiRadio;
    }
    

}
