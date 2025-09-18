package POOV.Lampada;
public class Lampada {
    //atributos
    private int tensao;
    private int potencia;
    private boolean acesa;
    private boolean queimada;
    private boolean quebrada;

    //construtor
    public Lampada(){
        System.out.println("Construtor padrao da Lampada executado");
        tensao = 220;
        potencia = 60;
    }

    public Lampada (int tensao, int potencia){
        System.out.println("Construtor de inicializacao");
        this.tensao = tensao;
        this.potencia = potencia;
    }
    //set(modifica atributos privados)
    public void setTensao(int tensao){
        this.tensao = tensao;
    }
    //get/is(para booleans) (pega os atributos e joga pra fora)
    //metodos
    public int getTensao(){
        return tensao;
    }
    
    public void mostrar(){
        System.out.println("Tensao:" + tensao + "V");
        System.out.println("Potencia:" + potencia + "W");
        System.out.println(acesa ? "Acesa" : "Apagada");
        System.out.println(queimada ? "Queimada" : "Nao queimada");
        System.out.println(quebrada ? "Quebrada" : "Nao quebrada");
    }


}
