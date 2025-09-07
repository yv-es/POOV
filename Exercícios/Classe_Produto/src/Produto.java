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

    public Produto(String c, String n, String m, int qntAtual, int qntMinima, LocalDate dataCompra, double precoCompra, double precoVenda){
        codigo = c;
        nome = n;
        marca = m;
        setQntAtual(qntAtual);
        setqntMinima(qntMinima);
        setDataCompra(dataCompra);
        setPrecoCompra(precoCompra);
        setPrecoVenda(precoVenda);

    }


    public void setCodigo(String c){
        codigo = c;
    }
    
    public void setNome(String n){
        nome = n;
    }

    public void setMarca(String m){
        marca = m;
    }

    public void setQntAtual(int qntA){
        if(qntA > 0){
            qntAtual = qntA;
        }
        else
            qntAtual = 0;
    }

    public void setqntMinima(int qntM){
        if(qntM > 0)
            qntMinima = qntM;
        else{
            System.out.println("Quantidade minima padrao: 1");
            qntMinima = 1;
        }
    }

    public void setDataCompra(LocalDate dataC){
        dataCompra = dataC;
    }

    public void setPrecoCompra(double precoC){
        if(precoC > 0 && qntMinima > 0)
            precoCompra = precoC;
        else
            precoCompra = 0;
    }

    public void setPrecoVenda(double precoV){
        if(precoV > 0 && qntMinima > 0)
            precoVenda = precoV;
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
}
