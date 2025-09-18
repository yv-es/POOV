package Enum.teste;

public enum Material {
    MADEIRA("madeira"),
    ACO("aço"),
    VIDRO("vidro"),
    PVC("PVC"),
    ALUMINIO("alumínio");

    private String descricao;

    private Material(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    
}
