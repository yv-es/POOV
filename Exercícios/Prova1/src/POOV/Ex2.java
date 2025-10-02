package POOV;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import POOV.Emprestimo.Emprestimo;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Emprestimo> lista = new ArrayList<>();
        int n = 0;
        LocalDate hoje = LocalDate.now();

        while(n != 2){
            System.out.println("1- Cadastrar empréstimo");
            System.out.println("2- Finalizar");

            n = teclado.nextInt();
            if(n != 2){
                System.out.print("Item:");
                String item = teclado.next();
                System.out.println();

                System.out.print("Nome pessoa:");
                String nomePessoa = teclado.next();
                System.out.println();

                System.out.print("Data: ");
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String data = teclado.next();
                System.out.println();

                LocalDate dataFormatada = LocalDate.parse(data, formatador);
                
                Emprestimo emp = new Emprestimo(item, nomePessoa, dataFormatada);
                lista.add(emp);
            }
        }
        if(!lista.isEmpty())
            lista.get(0).finalizar(hoje);
        teclado.close();

        int qntNaoDevolvidos = 0;
        for(Emprestimo i : lista){
            if(!i.isDevolvido())
                qntNaoDevolvidos++;
        }
        System.out.println("Quantidade de emprestimos nao devolvidos: " + qntNaoDevolvidos);
        
        for(Emprestimo i : lista){
            if(!i.isDevolvido()){
                System.out.println(i);
                System.out.println("Há quanto tempo esta sendo emprestado: " + i.diasEmprestados());
            }
        }   
    }

}
