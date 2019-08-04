package views;

import controllers.LocacaoController;
import db.Db;
import models.Locacao.Aluguel;
import models.User.Cliente;
import models.veiculos.Veiculo;

import java.util.Scanner;

public abstract class LocacaoView {
    private static Scanner leitor = new Scanner(System.in);


    public static void LocacoesEfetuadas(){
        System.out.println("Lista de locacoes: ");
        System.out.println("-----------");

        for(Aluguel loc : Db.getTabelalocacoes()){
            System.out.println(loc.toString());

        }
    }
    public static void ExibirLocacaoPorCPF(){
        System.out.println("Digite o CPF");
        int cpf = leitor.nextInt();
        leitor.nextLine();
        Cliente clt = LocacaoController.PesquisaCPF(cpf);
        System.out.println("------");
        if(clt != null){
            for(Aluguel al : Db.getTabelalocacoes()){
                if(al.getCliente()==clt)
                    System.out.print(al.toString());
            }
        } else {
            System.out.println("CPF nao encontrado");
        }
    }
    public static void ExibirLocacaoPorVeiculo()
    {
        System.out.print("Digite o cod do Ve�culo");
        int cod = leitor.nextInt();
        leitor.nextLine();
        Veiculo v = LocacaoController.BuscaCod(cod);
        v.print_Historico();

    }
    

}
