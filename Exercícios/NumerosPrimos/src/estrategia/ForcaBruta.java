package estrategia;

public class ForcaBruta implements EstrategiaPrimo {

    @Override
    public boolean verifica_primo(int n) {

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
