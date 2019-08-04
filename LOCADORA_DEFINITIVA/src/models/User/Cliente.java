package models.User;

//import geral.Usuario;

public class Cliente extends Usuario {

	private int id;

	public Cliente(String nome, String endereco, String data_Nasc, int cpf, int tel, int id) {
		super(nome, endereco, data_Nasc, cpf, tel);
		this.id = id;
	}
	public Cliente(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
