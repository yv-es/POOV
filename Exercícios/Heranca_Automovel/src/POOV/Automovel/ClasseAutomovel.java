package POOV.Automovel;

import java.math.BigDecimal;

public class ClasseAutomovel {
        private String modelo;
        private String cor;
        private EnumCombustivel combustivel;

        public ClasseAutomovel(String modelo, String cor, EnumCombustivel combustivel) {
            this.modelo = modelo;
            this.cor = cor;
            this.combustivel = combustivel;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public EnumCombustivel getCombustivel() {
            return combustivel;
        }

        public void setCombustivel(EnumCombustivel combustivel) {
            this.combustivel = combustivel;
        }

        public BigDecimal getPrecoCombustivel(){
            return combustivel.getValor();
        }



        

}
