public class PostoDeGasolina {
    public static void main(String[] args) throws Exception {
        BombaDeGasolina cliente1 = new BombaDeGasolina();
        BombaDeGasolina cliente2 = new BombaDeGasolina();
        cliente1.qntGasolina_E_PrecoAPagar(6);
        cliente1.mostrar();

        System.out.println("Quantidade de gasolina que o cliente conseguiu abastecer com 100 reais: " + cliente1.AbastecerComValorFonecido(100) +  " " + "L.");
        
        cliente1.AbastecerNovamente();
        cliente1.mostrar();
        cliente1.qntGasolina_E_PrecoAPagar(40);
        cliente1.mostrar();

        cliente2.mostrar();
        cliente2.qntGasolina_E_PrecoAPagar(27.8551);
        cliente2.mostrar();

        cliente2.AbastecerNovamente();
        cliente2.mostrar();

    }
}
