package models.User;

//import geral.Usuario;

public class Cliente extends Usuario {

	public Cliente(String nome, String endereco, String data_Nasc, int cpf, long tel, String login, String senha) {
		super(nome, endereco, data_Nasc, cpf, tel, login,  senha);
	}
	public Cliente(){

	}

}
