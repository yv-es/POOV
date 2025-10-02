package POOV.Automovel;

import java.math.BigDecimal;

public class AutomovelLuxo extends AutomovelBasico {
    private Boolean possuiDirecaoHidraulica;
    private Boolean possuiCambioAutomatico;
    private Boolean possuiVidrosETravasEletricos;
    
    public AutomovelLuxo(String modelo, String cor, EnumCombustivel combustivel, Boolean possuiRetrovisor,
            Boolean possuiLimpadorTraseiro, Boolean possuiRadio, Boolean possuiDirecaoHidraulica,
            Boolean possuiCambioAutomatico, Boolean possuiVidrosETravasEletricos) {
        super(modelo, cor, combustivel, possuiRetrovisor, possuiLimpadorTraseiro, possuiRadio);
        this.possuiDirecaoHidraulica = possuiDirecaoHidraulica;
        this.possuiCambioAutomatico = possuiCambioAutomatico;
        this.possuiVidrosETravasEletricos = possuiVidrosETravasEletricos;
    }

    public void setPossuiDirecaoHidraulica(Boolean possuiDirecaoHidraulica) {
        this.possuiDirecaoHidraulica = possuiDirecaoHidraulica;
    }

    public void setPossuiCambioAutomatico(Boolean possuiCambioAutomatico) {
        this.possuiCambioAutomatico = possuiCambioAutomatico;
    }

    public void setPossuiVidrosETravasEletricos(Boolean possuiVidrosETravasEletricos) {
        this.possuiVidrosETravasEletricos = possuiVidrosETravasEletricos;
    }

    public Boolean getPossuiDirecaoHidraulica() {
        return possuiDirecaoHidraulica;
    }

    public Boolean getPossuiCambioAutomatico() {
        return possuiCambioAutomatico;
    }

    public Boolean getPossuiVidrosETravasEletricos() {
        return possuiVidrosETravasEletricos;
    }

    public BigDecimal precoAutomovelLuxo(){
        BigDecimal precoTotal = precoAutomovelBasico();
        if(possuiDirecaoHidraulica)
            precoTotal = precoTotal.add(BigDecimal.valueOf(4000.00));
        if(possuiCambioAutomatico)
             precoTotal = precoTotal.add(BigDecimal.valueOf(7000.00));
        if(possuiVidrosETravasEletricos)
             precoTotal = precoTotal.add(BigDecimal.valueOf(3000.00));
        return precoTotal;
    }
    
}
