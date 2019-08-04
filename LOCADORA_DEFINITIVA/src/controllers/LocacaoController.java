package controllers;

import db.Db;
import models.User.Cliente;
import models.veiculos.Veiculo;
import models.Locacao.*;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class LocacaoController {
	public static Scanner leitor = new Scanner(System.in);

	public static void LocarPorCpf() {
		System.out.println("Preencha o numero do CPF:");
		int Cpfcod = leitor.nextInt();
		Cliente cl = (Cliente) ClienteController.PesquisaPorCpf(Cpfcod);

		if (cl != null) {
			System.out.println("CPF encontrados: ");
			System.out.println("CPF:" + cl.getCpf());
			System.out.println("");

			int codveiculo;
			Veiculo cr = null;
			System.out.println("informe o codigo do veiculo");
			codveiculo = leitor.nextInt();
			leitor.nextLine();
			cr = PesquisarCarroPorCodigo(codveiculo);
			if (cr != null) {
				if (cr.isAlugado())
					System.out.println("Este veiculo ja esta alugado");
				else {
					if (cr.isReservado())
						System.out.println("Este veiculo ja esta reservado");
					else {

						System.out.println("informe o a data de retirada do veiculo");
						int a = leitor.nextInt();
						int b = leitor.nextInt();
						int c = leitor.nextInt();
						System.out.println("informe o numero de dias da locacao");
						int dias = leitor.nextInt();

						System.out.println("Veiculo :" + cr.getCodigo());
						System.out.println("");
						Aluguel aluguel = new Aluguel(cl, LocalDate.of(c, b, a), dias, cr);
						cr.historico.add(aluguel);
						cr.setAlugado(true);
						Db.getTabelalocacoes().add(aluguel);
						System.out.println("Augado com sucesso");
					}
				}
			} else {
				System.out.println("veiculo nao encontrado");
			}
		} else {
			System.out.println("cliente nao encontrado");
		}
	}

	public static Cliente PesquisaCPF(int cpfnum) {
		for (Cliente cl : Db.getTabelacliente()) {
			if (cl.getCpf() == cpfnum) {
				return cl;
			}
		}
		return null;
	}

	public static Veiculo BuscaCod(int cod) {
		for (Veiculo v : Db.getTabelaveiculos()) {
			if (v.getCodigo() == cod)
				return v;
		}
		return null;
	}

	public static void DevolverVeiculo() {
		System.out.println("Digite o cod do Ve�culo");
		int cod = leitor.nextInt();
		leitor.nextLine();
		System.out.println("informe o a data de devolucao do veiculo");
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		int c = leitor.nextInt();
		Veiculo v = LocacaoController.BuscaCod(cod);
		v.historico.get(v.historico.size() - 1).Devolver(LocalDate.of(c, b, a));
		v.setAlugado(false);
	}

	public static void ReservarVeiculo() {
		System.out.print("Digite o cod do Ve�culo");
		int cod = leitor.nextInt();
		leitor.nextLine();
		Veiculo v = LocacaoController.BuscaCod(cod);
		v.setReservado(true);
	}

	public static void CancelarReservaVeiculo() {
		System.out.print("Digite o cod do Ve�culo");
		int cod = leitor.nextInt();
		leitor.nextLine();
		Veiculo v = LocacaoController.BuscaCod(cod);
		v.setReservado(false);
	}

	public static Veiculo PesquisarCarroPorCodigo(int codCarro)
	{

		for(Veiculo car : Db.getTabelaveiculos())
		{
			if(car.getCodigo() == codCarro)
			{
				return car;
			}
		}
		return null;
	}
}
