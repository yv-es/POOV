import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String senha = s.nextLine();
        String senha_correta = "biboca@852";
        int qnt_tentativas = 0;
        
        while(!senha.equals(senha_correta) && qnt_tentativas < 3){
            System.out.println("Senha incorreta, digitar novamente");
            senha = s.nextLine();
            qnt_tentativas++;
        }
        if(senha.equals(senha_correta)){
            System.out.println("Senha correta, pode prosseguir");
        }
    }

}
