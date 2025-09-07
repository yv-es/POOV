public class TipoContador {
    private int cont;

    public TipoContador(){
        cont = 0;
    }

    public TipoContador(int c){
        setContador(c);
    }

    public void setContador(int c){
        if(c > 0)
            cont = c;
        else
            cont = 0;
    }

    public void adicionaNoContador(int add){
        if(add > 0)
            cont+=add;
    }

    public void subtrairNoContador(int sub){
        if(sub > 0)
            cont-=sub;
        else
            cont+=sub;
        if(cont < 0)
            cont = 0;
    }

    public void mostrarCont(){
        System.out.println("Contador: " + cont);
    }

}
