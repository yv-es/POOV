package Enum.teste;

public class Porta {
    private Material material;
    private double largura;
    private boolean fechado;
    private boolean trancada;

    public Porta(){
        material = Material.MADEIRA;
        largura = 10.0;
        fechado = false;
        trancada = false;
    }

    public Porta(Material material, double largura, boolean fechado, boolean trancada){
        this.material = material;
        setLargura(largura);
        setFechado(fechado);
        setTrancada(trancada);
    }

    public void setLargura(double largura){
        if(largura > 0.0){
            this.largura = largura; 
        }else
            this.largura = -largura; 
    }

    public void setFechado(boolean fechado){
        this.fechado = fechado;
    }

    public void setTrancada(boolean trancada){
        if(!fechado)
            trancada = false;
        else
            this.trancada = trancada;
    }

    public double getLargura(){
        return largura;
    }

    public Material getMaterial(){
        return material;
    }

    public boolean isFechado(){
        return fechado;
    }

    public boolean isTrancada(){
        return trancada;
    }

    public void mostrar(){
        System.out.println(material.getDescricao());
        System.out.println(largura);
        System.out.println(fechado);
        System.out.println(trancada);
    }

}
