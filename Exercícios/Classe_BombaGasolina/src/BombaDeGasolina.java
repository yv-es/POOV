public class BombaDeGasolina {
    public double qntGasolina;
    public double precoRelativoAQntFornecida;
    private double custoPorLitro;
    /*Antes de ser usada, a bomba de gasolina deve 
    zerar a quantidade fornecida e o preço relativo*/
    public void AbastecerNovamente(){
        qntGasolina = 0.0;
        precoRelativoAQntFornecida = 0.0;
    }

    public BombaDeGasolina(){
        qntGasolina = 0.0;
        precoRelativoAQntFornecida = 0.0;
        custoPorLitro = 3.59;
    }

    public BombaDeGasolina(double qntGasolina){
        qntGasolina_E_PrecoAPagar(qntGasolina);
        custoPorLitro = 3.59;
    }

    public void qntGasolina_E_PrecoAPagar(double qntGasolina){
        if(qntGasolina > 0)
            this.qntGasolina = qntGasolina;
        else
            this.qntGasolina = - qntGasolina;

        precoRelativoAQntFornecida = qntGasolina * custoPorLitro;
    }

    public double AbastecerComValorFonecido(double qntDinheiro){
        return qntGasolina = qntDinheiro / custoPorLitro;
    }

    public void mostrar(){
        System.out.println("Quantidade de gasolina fornecida: " + qntGasolina);
        System.out.println("Preco relativo a quantidade fornecida: " + precoRelativoAQntFornecida);
        System.out.println("Custo por litro: " + custoPorLitro);
        System.out.println();
    }


}
