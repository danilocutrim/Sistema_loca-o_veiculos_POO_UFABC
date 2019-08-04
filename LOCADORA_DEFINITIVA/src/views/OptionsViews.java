package views;

import controllers.*;
import models.User.Cliente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionsViews {
    private static Scanner leitor = new Scanner(System.in);
    public static void MostrarMenu(){
        int option = 0;
        do{
            System.out.println("###Escolha uma opção###");
            System.out.println("1-Cadastrar veiculo");
            System.out.println("2-Exibir  veiculos por código");

            System.out.println("3-Cadastrar cliente");
            System.out.println("4-Exibir lista de clientes");
            System.out.println("5-Exibir cliente por Cpf");

            System.out.println("6-Cadastrar Funcionario");
            System.out.println("7-Exibir lista de funcionarios");
            System.out.println("8-Exibir funcionario por cpf");



            System.out.println("9-Efetuar locação");
            System.out.println("10-Exibir lista de locação");
            System.out.println("11-Exibir locação por Cpf");

            System.out.println("12-Sair");

            try{
                option = leitor.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Escolha 1 para Carro 2 para Moto ou 3 para Van");
                        int escolha = leitor.nextInt();
                        leitor.nextLine();
                        switch (escolha){
                            case 1:
                                CarroController.CadastrarCarro();
                                break;
                            case 2:
                                MotoController.CadastrarMoto();
                                break;
                            case 3:
                                VanControllers.CadastrarVan();
                                break;
                        }
                        break;
                    case 2 :
                        VeiculoView.ExibirVeiculoPorCodigo();
                        break;
                    case 3:
                        ClienteController.CadastraCliente();
                        break;
                    case 4:
                        ClienteView.ExibirClientePorCpf();
                        break;
                    case 5:
                        ClienteView.ExibirClientes();
                        break;
                    case 6:
                        FuncionarioController.CadastraFuncionario();
                        break;
                    case 7:
                        FuncionarioView.ExibirFuncionarios();
                        break;
                    case 8:
                        FuncionarioView.ExibirFuncionarioPorCpf();
                        break;
                    case 9:
                        LocacaoController.Loca();
                        LocacaoController.LocarPorCpf();
                        break;
                    case 10:
                        LocacaoView.LocacoesEfetuadas();
                        break;
                    case 11:
                        LocacaoView.ExibirLocacaoPorCPF();
                        break;

                }
                option = 0;
            } catch (InputMismatchException e1){
                System.out.println("###Insira um numero");
                leitor.nextLine();
            }
        } while (option != 10);

    }
}
