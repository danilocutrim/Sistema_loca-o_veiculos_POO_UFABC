package views;


import java.util.Scanner;

import controllers.CarroController;
import controllers.ClienteController;
import controllers.LocacaoController;
import controllers.MotoController;
import controllers.VanControllers;

public abstract class FuncionarioView {
    private static Scanner leitor = new Scanner(System.in);
    public static void ExibirFuncionarioPorCpf(){

    }
    public static void  ExibirFuncionarios(){

    }
    public static void MostrarMenu(){
        int option = 0;
        do{
            System.out.println("###Escolha uma opcao");
            System.out.println("1-Listar Ve�culos");
            System.out.println("2-Cadastrar veiculo");
            System.out.println("3-Exibir  veiculos por codigo");

            System.out.println("4-Cadastrar cliente");
            System.out.println("5-Exibir lista de clientes");
            System.out.println("6-Exibir cliente por Cpf");
            System.out.println("7-Orcar Ve�culo");

            System.out.println("8-Efetuar locacao");
            System.out.println("9-Exibir lista de locacao");
            System.out.println("10-Exibir locacoes por Cpf");
            System.out.println("11-Exibir locacoes por Ve�culo");
            System.out.println("12-Devolver Ve�culo");

            System.out.println("13-Sair");

            //     try{
            option = leitor.nextInt();
            switch (option){
                case 1 :
                    VeiculoView.ExibirVeiculos();
                    break;
                case 2:
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
                case 3 :
                    VeiculoView.ExibirVeiculoPorCodigo();
                    break;
                case 4:
                    ClienteController.CadastraCliente();
                    break;
                case 5:
                    ClienteView.ExibirClientePorCpf();
                    break;
                case 6:
                    ClienteView.ExibirClientes();
                    break;
                case 7:
                    VeiculoView.Orcamento();
                    break;
                case 8:
                    LocacaoController.LocarPorCpf();
                    break;
                case 9:
                    LocacaoView.LocacoesEfetuadas();
                    break;
                case 10:
                    LocacaoView.ExibirLocacaoPorCPF();
                    break;
                case 11:
                    LocacaoView.ExibirLocacaoPorVeiculo();
                    break;
                case 12:
                    LocacaoController.DevolverVeiculo();
                    break;
            }
        } while (option != 13);
        
        LoginView.Login();
    }

}

        

