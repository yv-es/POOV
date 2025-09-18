package POOV.Automovel;
public class Automovel {
    private double preco;
    private double rendimento;

    public Automovel(){
        preco = 0;
        rendimento = 0;
    }

    public Automovel(double preco, double rendimento){
        setPreco(preco);
        setRendimento(rendimento);
    }

    private void setPreco(Double preco){
        if(preco > 0)
        this.preco = preco;
        else
        this.preco = 0;
    }
    
    public void setRendimento(double novoRendimento){
        if(novoRendimento > 0 && novoRendimento < preco)
        rendimento = novoRendimento;
        else
        rendimento = 0;
    }
    
    private double getRendimento(){
        return rendimento;
    }
    public double getPreco(){
        return preco;
    }

    public void printar(){
        System.out.println("Preco: " + preco);
        System.out.println("Rendimento: " + getRendimento());
    }
}
