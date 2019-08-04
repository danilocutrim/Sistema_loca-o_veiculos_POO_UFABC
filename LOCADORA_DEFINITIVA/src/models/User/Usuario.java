package models.User;

public  class Usuario {

	protected String nome;
	protected String endereco;
	protected String data_Nasc;
	protected String sexo;
	protected int cpf;
	protected int tel;


	public Usuario(String nome, String endereco, String data_Nasc, int cpf, int tel) {
		this.nome = nome;
		this.endereco = endereco;
		this.data_Nasc = data_Nasc;
		this.cpf = cpf;
		this.tel = tel;
	}
	public Usuario(){

	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void setData_Nasc(String data_Nasc) {
		this.data_Nasc = data_Nasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
}