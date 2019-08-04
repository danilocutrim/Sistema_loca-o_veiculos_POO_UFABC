package views;

import controllers.LocacaoController;
import db.Db;
import models.Locacao.Locar;
import models.User.Cliente;

import java.util.Scanner;

public class LocacaoView {
    private static Scanner leitor = new Scanner(System.in);


    public static void LocacoesEfetuadas(){
        System.out.println("Lista de locações: ");
        System.out.println("-----------");

        for(Locar loc : Db.getTabelalocacoes()){
            System.out.println("CPF: " + loc.getCliente().getCpf());
            System.out.println("Nome: " + loc.getCliente().getNome());

        }
    }
    public static void ExibirLocacaoPorCPF(){
        System.out.println("Digite o CPF");
        int cpf = leitor.nextInt();
        leitor.nextLine();
        Cliente clt = LocacaoController.PesquisaCPF(cpf);
        System.out.println("------");
        if(clt != null){
            for(Locar pesq : Db.getTabelalocacoes()){
                System.out.println("CPF: " + clt.getCpf());
                System.out.println("Nome: " + clt.getNome());
            }
        } else {
            System.out.println("CPF não encontrado");
        }
    }

}
