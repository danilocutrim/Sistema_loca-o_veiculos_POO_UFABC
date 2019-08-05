package db;
import models.Locacao.Aluguel;
import models.User.Cliente;
import models.User.Funcionario;
import models.veiculos.Veiculo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    //Lista para armazenamento de novas loca챌천es
    private static List<models.Locacao.Aluguel> tabelalocacoes;
    private static String login = "MD";
    private static String senha = "123";

    public static List<Cliente> getTabelacliente() {
        return tabelacliente;
    }
    
    public static void salvarClienteFunc() throws IOException
    {
    	PrintWriter cliente = new PrintWriter("c:\\Users\\mathe\\OneDrive\\햞ea de Trabalho\\LOCADORA_DEFINITIVA\\bin\\cliente.txt");
        for(Cliente c : tabelacliente)
        {

        	cliente.printf("%s|%s|%s|%s|%s|%s|%s|%s|%n",c.getNome(),c.getEndereco(),c.getData_Nasc(),Integer.toString(c.getCpf()),c.getSexo(),String.valueOf(c.getTel()),c.getLogin(),c.getSenha());
        	cliente.flush();
        }
        PrintWriter func = new PrintWriter("c:\\Users\\mathe\\OneDrive\\햞ea de Trabalho\\LOCADORA_DEFINITIVA\\bin\\funcionario.txt");
        for(Funcionario c : tabelafuncionario)
        {
        	func.printf("%s|%s|%s|%s|%s|%s|%s|%s|%n",c.getNome(),c.getEndereco(),c.getData_Nasc(),Integer.toString(c.getCpf()),c.getSexo(),String.valueOf(c.getTel()),c.getLogin(),c.getSenha());
        	func.flush();
        }
        cliente.close();
        func.close();
    }
    public static void CarregaClienteFunc()
    {
    	 try {
    		 
             BufferedReader buffer = new BufferedReader(new FileReader("c:\\Users\\mathe\\OneDrive\\햞ea de Trabalho\\LOCADORA_DEFINITIVA\\bin\\cliente.txt"));
             String linha = null;
             while ((linha = buffer.readLine()) != null) {
            	 Cliente c= new Cliente();
            	 c.setNome(linha.split("[|]")[0]);
            	 c.setEndereco(linha.split("[|]")[1]);
            	 c.setData_Nasc(linha.split("[|]")[2]);
            	 c.setCpf(Integer.parseInt(linha.split("[|]")[3]));           	 
            	 c.setSexo(linha.split("[|]")[4]);
            	 c.setTel(Long.parseLong(linha.split("[|]")[5]));
            	 c.setLogin(linha.split("[|]")[6]);
            	 c.setSenha(linha.split("[|]")[7]);
            	 tabelacliente.add(c);
                 
             }
             BufferedReader bufferf = new BufferedReader(new FileReader("c:\\Users\\mathe\\OneDrive\\햞ea de Trabalho\\LOCADORA_DEFINITIVA\\bin\\funcionario.txt"));
             while ((linha = bufferf.readLine()) != null) {
            	 Funcionario c= new Funcionario();
            	 c.setNome(linha.split("[|]")[0]);
            	 c.setEndereco(linha.split("[|]")[1]);
            	 c.setData_Nasc(linha.split("[|]")[2]);
            	 c.setCpf(Integer.parseInt(linha.split("[|]")[3]));           	 
            	 c.setSexo(linha.split("[|]")[4]);
            	 c.setTel(Long.parseLong(linha.split("[|]")[5]));
            	 c.setLogin(linha.split("[|]")[6]);
            	 c.setSenha(linha.split("[|]")[7]);
            	 tabelafuncionario.add(c);
                 
             }
             buffer.close();
             bufferf.close();
         } catch (IOException e) {
             // TODO: handle exception
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
