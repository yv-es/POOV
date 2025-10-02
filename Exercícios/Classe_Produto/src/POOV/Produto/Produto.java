package POOV.Produto;
import java.time.LocalDate;

public class Produto {
    private String codigo;
    private String nome;
    private String marca;
    private int qntAtual;
    private int qntMinima;
    private LocalDate dataCompra;
    private double precoCompra;
    private double precoVenda;

    public Produto(){
        codigo = "sem codigo";
        nome = "sem nome";
        marca = "sem marca";
        qntAtual = 0;
        qntMinima = 0;
        dataCompra = LocalDate.now();
        precoCompra = 0;
        precoVenda = 0;
    }

    public Produto(String codigo, String nome, String marca, int qntAtual, int qntMinima, LocalDate dataCompra, double precoCompra, double precoVenda){
        this.codigo = codigo;
        this.nome = nome;
        this.marca = marca;
        setQntAtual(qntAtual);
        setqntMinima(qntMinima);
        setDataCompra(dataCompra);
        setPrecoCompra(precoCompra);
        setPrecoVenda(precoVenda);

    }


    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setQntAtual(int qntAtual){
        if(qntAtual > 0){
            this.qntAtual = qntAtual;
        }
        else
            this.qntAtual = 0;
    }

    public void setqntMinima(int qntMinima){
        if(qntMinima > 0)
            this.qntMinima = qntMinima;
        else{
            System.out.println("Quantidade minima padrao: 1");
            this.qntMinima = 1;
        }
    }

    public void setDataCompra(LocalDate dataCompra){
        this.dataCompra = dataCompra;
    }

    public void setPrecoCompra(double precoCompra){
        if(precoCompra > 0 && qntMinima > 0)
            this.precoCompra = precoCompra;
        else
            this.precoCompra = 0;
    }

    public void setPrecoVenda(double precoVenda){
        if(precoVenda > 0 && qntMinima > 0)
            this.precoVenda = precoVenda;
        else
            precoVenda = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getmarca(){
        return marca;
    }

    public int getQntA(){
        return qntAtual;
    }

    public int getQntM(){
        return qntMinima;
    }

    public LocalDate getDataC(){
        return dataCompra;
    }

    public double getPrecoC(){
        return precoCompra;
    }

    public double getPrecoV(){
        return precoVenda;
    }

    public void Mostrar(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Qnt Atual: " + qntAtual);
        System.out.println("Qnt Minima: " + qntMinima);
        System.out.println("Data compra: " + dataCompra);
        System.out.println("Preco compra: " + precoCompra);
        System.out.println("Preco venda: " + precoVenda);
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", marca=" + marca + ", qntAtual=" + qntAtual
                + ", qntMinima=" + qntMinima + ", dataCompra=" + dataCompra + ", precoCompra=" + precoCompra
                + ", precoVenda=" + precoVenda + "]";
    }


}
