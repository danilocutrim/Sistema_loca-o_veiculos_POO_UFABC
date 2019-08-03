package models.User;

public abstract class Usuario {

	private String nome;
	private String endereco;
	private String data_Nasc;
	private String sexo;
	private int cpf;
	private int tel;

	
	protected Usuario(String placa, String nome, String endereco, String data_Nasc, String sexo, int cpf, int tel)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.data_Nasc = data_Nasc;
		this.sexo= sexo;
		this.cpf = cpf;
		this.tel = tel;
	}

	public Usuario(String nome, String endereco, String data_nasc, String sexo, int cpf, int tel) {


	}

	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getData_Nasc() {
		return data_Nasc;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}
