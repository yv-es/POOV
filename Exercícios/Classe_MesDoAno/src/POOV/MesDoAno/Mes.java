package POOV.MesDoAno;

public enum Mes {
    
    JANEIRO("janeiro"),
    FEVEREIRO("fevereiro"),
    MARCO("Marco"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro");
    
    String nomeDoMes;
    
    private Mes(String nomeDoMes){
        this.nomeDoMes = nomeDoMes;
    }

    public String getNomeDoMes(){
        return nomeDoMes;
    }

    public Mes procura(int indice){
        for(Mes m : Mes.values()){
            if(m.ordinal() == indice)
                return m;
        }
        return Mes.JANEIRO;
    }

}
