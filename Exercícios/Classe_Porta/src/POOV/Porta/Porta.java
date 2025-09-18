package POOV.Porta;
public class Porta {
    private String material;
    private int largura;
    private boolean fechada;
    private boolean trancada;

    public Porta(String m, int l, boolean f, boolean t){
        setMaterial(m);
        setLargura(l);
        fechada = f;
        setTrancada(t);
    }

    public void setMaterial(String m){
        if(m.equals("madeira") || m.equals("aco") || m.equals("pvc") || m.equals("aluminio")) {
            material = m;
        }else{
            System.out.println("Material inexistente, utilizando madeira como padrao");
            material = "madeira";
        }
    }

    public void setLargura(int l){
        if(l > 0){
            largura = l;
        }else{
            System.out.println("Largura negativa invalida, utilizando 10 como padrao");
            largura = 10;
        }
    }
    
    public void setFechada(boolean f){
        if(f)
            fechada = true;
        else
            fechada = false;
    }

    public void setTrancada(boolean t){
        if(!fechada)
            trancada = false;
        else
            trancada = t;
    }


    public String getMaterial(){
        return material;
    }

    public int getlargura(){
        return largura;
    }

    public boolean isFechada(){
        return fechada;
    }

    public boolean isTrancada(){
        return trancada;
    }

     public void Mostrar(){
        System.out.println("Material: " + material);
        System.out.println("Largura: " + largura);
        System.out.println("Esta fechada " + fechada);
        System.out.println("Esta trancada: " + trancada);
    }
}
