package estrategia;

public class Crivo implements EstrategiaPrimo{

    @Override
    public boolean verifica_primo(int n) {
        int primos[] = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            primos[i] = 1;
        }
        for(int i = 2; i <= n; i++){
            if(primos[i] != -1){
                for(int j = i+i; j <= n; j+=i){
                    primos[j] = -1;
                }
            }
        }
        return primos[n] != -1;
    }

}
