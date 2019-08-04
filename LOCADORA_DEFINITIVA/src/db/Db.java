package db;
import models.Locacao.Aluguel;
import models.User.Cliente;
import models.User.Funcionario;
import models.veiculos.Veiculo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Db {
    //Lista para armazenamento de clientes
    private static List<models.User.Cliente> tabelacliente;
    //Lista para armazenamento de funcionarios
    private static List<models.User.Funcionario> tabelafuncionario;
    //Lista para armazenamento de carros
    private static List<models.veiculos.Veiculo> tabelaveiculos;
    //Lista para armazenamento de novas locações
    private static List<models.Locacao.Aluguel> tabelalocacoes;
    private static String login = "MD";
    private static String senha = "123";

    public static List<Cliente> getTabelacliente() {
        return tabelacliente;
    }
    
    public void salvarVeiculos() throws IOException
    {
    	FileWriter arq = new FileWriter("C:\\Users\\mathe\\OneDrive\\�rea de Trabalho\\LOCADORA_DEFINITIVA\\bin");
        PrintWriter gravarArq = new PrintWriter(arq);
     
        gravarArq.printf("+--Resultado--+%n");
        for(Veiculo v : tabelaveiculos)
        {
        	gravarArq.printf
        }
    }
    
    public static List<Funcionario> getTabelafuncionario() {
        return tabelafuncionario;
    }

    public static List<Veiculo> getTabelaveiculos() {
        return tabelaveiculos;
    }

    public static List<Aluguel> getTabelalocacoes() {
        return tabelalocacoes;
    }
    public static void LaunchDB(){
        tabelacliente = new ArrayList<Cliente>();
        tabelafuncionario = new ArrayList<Funcionario>();
        tabelaveiculos = new ArrayList<Veiculo>();
        tabelalocacoes = new ArrayList<Aluguel>();
    }

	public static String getLogin() {
		return login;
	}

	public static void setLogin(String login) {
		Db.login = login;
	}

	public static String getSenha() {
		return senha;
	}

	public static void setSenha(String senha) {
		Db.senha = senha;
	}
}
