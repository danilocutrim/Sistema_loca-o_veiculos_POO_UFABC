package controllers;

import db.Db;
import models.User.Funcionario;

import java.util.Scanner;

public class FuncionarioController {
    public static Scanner leitor = new Scanner(System.in);

    public static void  CadastraFuncionario(){
        System.out.println("digite o nome do funcionario:");
        String nomefuncionario = leitor.nextLine();

        System.out.println("digite o endereço do funcionario: ");
        String endereco = leitor.nextLine();

        System.out.println("digite a data de nascimento do funcionario:  ");
        String nasc = leitor.nextLine();

        System.out.println("digite o cpf do funcionario: ");
        int cpf = leitor.nextInt();
        leitor.nextLine();

        System.out.println("digite  o telefone do funcionario: ");
        int tel = leitor.nextInt();
        leitor.nextLine();

        Funcionario func = new Funcionario();
        func.setNome(nomefuncionario);
        func.setEndereco(endereco);
        func.setData_Nasc(nasc);
        func.setCpf(cpf);
        func.setTel(tel);
        Db.getTabelacliente().add(func);
    }

    public static Funcionario PesquisaPorCpf(int codfunc) {
        for (Funcionario funci : Db.getTabelafuncionario()) {
            if (funci.getCodigoFuncional() == codfunc ){
                return funci;
            }
        }
        return null;
    }

}