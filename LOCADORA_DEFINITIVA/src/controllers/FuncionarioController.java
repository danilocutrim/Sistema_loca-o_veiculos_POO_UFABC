package controllers;

import db.Db;
import models.User.Funcionario;

import java.io.IOException;
import java.util.Scanner;

public abstract class FuncionarioController {
    public static Scanner leitor = new Scanner(System.in);

    public static void  CadastraFuncionario(){
        System.out.println("digite o nome do funcionario:");
        String nomefuncionario = leitor.nextLine();

        System.out.println("digite o endereco do funcionario: ");
        String endereco = leitor.nextLine();

        System.out.println("digite a data de nascimento do funcionario:  ");
        String nasc = leitor.nextLine();
        
        System.out.println("digite o sexo do funcionario:  ");
        String sexo = leitor.nextLine();

        System.out.println("digite o cpf do funcionario: ");
        int cpf = leitor.nextInt();
        leitor.nextLine();

        System.out.println("digite  o telefone do funcionario: ");
        int tel = leitor.nextInt();
        leitor.nextLine();
        
        System.out.println("digite o login do funcionario:");
        String login = leitor.nextLine();
        
        System.out.println("digite a senha do funcionario:");
        String senha = leitor.nextLine();



        Funcionario func = new Funcionario();
        func.setNome(nomefuncionario);
        func.setEndereco(endereco);
        func.setData_Nasc(nasc);
        func.setCpf(cpf);
        func.setSexo(sexo);
        func.setTel(tel);
        func.setLogin(login);
        func.setSenha(senha);
        Db.getTabelafuncionario().add(func);
        try {
			Db.salvarClienteFunc();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public static Funcionario PesquisaPorCpf(int cpf) {
        for (Funcionario funci : Db.getTabelafuncionario()) {
            if (funci.getCpf() == cpf ){
                return funci;
            }
        }
        return null;
    }

}