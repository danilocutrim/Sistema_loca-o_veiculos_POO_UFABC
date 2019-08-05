package views;

import controllers.ClienteController;
import db.Db;
import models.User.Cliente;
import models.User.Usuario;

import java.util.Scanner;

public abstract class ClienteView {
    private static Scanner leitor = new Scanner(System.in);
    public static void ExibirClientePorCpf(){
        System.out.println("Digite o CPF para encontrar");
        int cpf = leitor.nextInt();
        leitor.nextLine();
        Cliente clte =  ClienteController.PesquisaPorCpf(cpf);
        if(clte != null) {
            System.out.println("Dados pessoa encontrada: ");
            for (Usuario cli : Db.getTabelacliente()) {
                if(cli.equals(cli)) {
                    System.out.println("Nome: " + cli.getNome());
                    System.out.println("CPF: " + cli.getCpf());
                    System.out.println("Data de nascimento: " + cli.getData_Nasc());
                    System.out.println("Endereco: " + cli.getEndereco());
                    System.out.println("Sexo: " + cli.getSexo());
                    System.out.println("Telefone: " + cli.getTel());
                }

            }
        } else {
            System.out.println("cliente nao encontrado");
        }
    }
    public static void  ExibirClientes(){
        System.out.println("Pessoas cadastradas:");
        for(Usuario usr : Db.getTabelacliente()){
            System.out.println("Nome: " + usr.getNome());
            System.out.println("CPF: " + usr.getCpf());
            System.out.println("Data de nascimento: " + usr.getData_Nasc());
            System.out.println("Endereco: " + usr.getEndereco());
            System.out.println("Sexo: " + usr.getSexo());
            System.out.println("Telefone: " + usr.getTel());
        }
    }

}

