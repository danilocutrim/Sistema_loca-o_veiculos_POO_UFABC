package views;

import java.util.InputMismatchException;
import java.util.Scanner;

import controllers.CarroController;
import controllers.ClienteController;
import controllers.FuncionarioController;
import controllers.LocacaoController;
import controllers.MotoController;
import controllers.VanControllers;

public abstract class MasterView {
	private static Scanner leitor = new Scanner(System.in);

	public static void MostrarMenu() {
		int option = 0;
		do {
			System.out.println("###Escolha uma opcao");
			System.out.println("1-Listar Veículos");
			System.out.println("2-Cadastrar veiculo");
			System.out.println("3-Exibir  veiculos por codigo");

			System.out.println("4-Cadastrar cliente");
			System.out.println("5-Exibir cliente por Cpf");
			System.out.println("6-Exibir lista de clientes");
			System.out.println("7-Cadastrar Funcionario");
			System.out.println("8-Exibir lista de funcionarios");
			System.out.println("9-Exibir funcionario por cpf");

			System.out.println("10-Efetuar locacao");
			System.out.println("11-Exibir lista de locacao");
			System.out.println("12-Exibir locacoes por Cpf");
			System.out.println("13-Exibir locacoes por Veículo");
			System.out.println("14-Devolver Veículo");
			System.out.println("15-Orcar Veículo");

			System.out.println("16-Sair");

			try {
				option = leitor.nextInt();
				switch (option) {
				case 1:
					VeiculoView.ExibirVeiculos();
					break;
				case 2:
					System.out.println("Escolha 1 para Carro 2 para Moto ou 3 para Van");
					int escolha = leitor.nextInt();
					leitor.nextLine();
					switch (escolha) {

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
				case 3:
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
					FuncionarioController.CadastraFuncionario();
					break;
				case 8:
					FuncionarioView.ExibirFuncionarios();
					break;
				case 9:
					FuncionarioView.ExibirFuncionarioPorCpf();
					break;
				case 10:
					LocacaoController.LocarPorCpf();
					break;
				case 11:
					LocacaoView.LocacoesEfetuadas();
					break;
				case 12:
					LocacaoView.ExibirLocacaoPorCPF();
					break;
				case 13:
					LocacaoView.ExibirLocacaoPorVeiculo();
					break;
				case 14:
					LocacaoController.DevolverVeiculo();
					break;
				case 15:
					VeiculoView.Orcamento();
					break;
				}
			} catch (InputMismatchException e1) {
				System.out.println("###Insira um numero válido");
				leitor.nextLine();
			}
		} while (option != 16);

		LoginView.Login();

	}
}
