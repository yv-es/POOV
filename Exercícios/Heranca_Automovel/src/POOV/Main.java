package POOV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import POOV.Automovel.AutomovelLuxo;
import POOV.Automovel.ClasseAutomovel;
import POOV.Automovel.EnumCombustivel;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        List <ClasseAutomovel> carros = new  ArrayList<>();
        int opc = -1;
        AutomovelLuxo carro1 = new AutomovelLuxo("BMW", "AZUL", EnumCombustivel.HIBRIDO, true, null, null, null, null, null);
        EnumCombustivel combustivel = EnumCombustivel.GASOLINA;

        carros.add(carro1);



        System.out.println("Modelo do carro: ");
        String modelo = teclado.next();
        System.out.println("Cor do carro: ");
        String cor = teclado.next();
    

        for(EnumCombustivel n : EnumCombustivel.values()){
            System.out.println(n.ordinal() + ") "  + n.getDescricao());
        }
        while(opc < 0  || opc > 8){
            opc = teclado.nextInt();

            for(EnumCombustivel n : EnumCombustivel.values()){
                if(n.ordinal() == opc)
                    combustivel = n;
            }
        }

        System.out.println(combustivel + " " + modelo + " " + cor);

        teclado.close();
    }
}
