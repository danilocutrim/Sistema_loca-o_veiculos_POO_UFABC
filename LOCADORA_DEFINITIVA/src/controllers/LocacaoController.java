package controllers;

import db.Db;
import models.Locacao.Locar;
import models.User.Cliente;
import models.veiculos.Carro;
import models.veiculos.Veiculo;

import java.util.Scanner;

public class LocacaoController {
    public static Scanner leitor = new Scanner(System.in);

    public static void Loca(){
        System.out.println("Efetuar locação");
        System.out.println("");

    }
    public static void LocarPorCpf(){
        System.out.println("Preencha o numero do CPF:");
        int Cpfcod = leitor.nextInt();
        Cliente cl = (Cliente) ClienteController.PesquisaPorCpf(Cpfcod);

        if(cl !=null){
            System.out.println("CPF encontrados: ");
            System.out.println("CPF:" + cl.getCpf());
            System.out.println("");

            System.out.println("informe o 1 para alugar Carro, 2 para alugar moto ou 3 para alugar van");
            int op = leitor.nextInt();
            leitor.nextLine();
            Veiculo veiculoLoca;
            int codveiculo;
            Veiculo cr = null;
            switch (op){
                case 1:
                    System.out.println("informe o código do carro : ");
                    codveiculo = leitor.nextInt();
                    leitor.nextLine();
                    cr = CarroController.PesquisarCarroPorCodigo(codveiculo);
                    break;
                case 2:
                    System.out.println("informe o código da moto : ");
                    codveiculo= leitor.nextInt();
                    leitor.nextLine();
                    cr = CarroController.PesquisarCarroPorCodigo(codveiculo);

                    break;
                case 3:
                    System.out.println("informe o codigo da van");
                    codveiculo = leitor.nextInt();
                    leitor.nextLine();
                    cr = CarroController.PesquisarCarroPorCodigo(codveiculo);
            }
            if(cr != null){
                System.out.println("Veiculo :" +cr.getCodigo());
                System.out.println("");
                Locar pf = new Locar();
                pf.setCliente(cl);
                pf.setVeiculo(cr);
                Db.getTabelalocacoes().add(pf);
                System.out.println(pf.AlugaParaCliente());
            }
            else{
                System.out.println("veiculo não encontrado");
            }
        } else{
            System.out.println("cliente não encontrado");
        }
    }
}
