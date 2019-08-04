package controllers;

import db.Db;
import models.User.Cliente;
import models.User.Usuario;

import java.util.Scanner;

public class ClienteController {
    private static Scanner leitor = new Scanner(System.in);

    public static void CadastrarCliente() {

    }
    public static void  CadastraCliente(){
        System.out.println("digite o nome do cliente:");
        String nomeCliente = leitor.nextLine();

        System.out.println("digite o endereço do cliente: ");
        String endereco = leitor.nextLine();

        System.out.println("digite a data de nascimento do cliente: ");
        String nasc = leitor.nextLine();

        System.out.println("digite o cpf do cliente: ");
        int cpf = leitor.nextInt();
        leitor.nextLine();

        System.out.println("digite  o telefone do cliente: ");
        int tel = leitor.nextInt();
        leitor.nextLine();

        Cliente clie = new Cliente();
        clie.setNome(nomeCliente);
        clie.setEndereco(endereco);
        clie.setData_Nasc(nasc);
        clie.setCpf(cpf);
        clie.setTel(tel);
        Db.getTabelacliente().add(clie);
    }
    public static Usuario PesquisaPorCpf(int cpfCod){
        for(Usuario cl : Db.getTabelacliente()){
            if(cl.getCpf() == cpfCod ){
                return cl;
            }
        }
        return null;
    }
}