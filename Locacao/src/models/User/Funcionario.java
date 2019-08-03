//package models.User;

//import geral.Usuario;
package models.User;

public class Funcionario extends Usuario {

	private String funcao;  //encapsulamento com modificadores de acesso
	private static int id;
	
	//Construtor
	public Funcionario(String nome, String endereco, String data_Nasc,String sexo, int cpf, int tel, String funcao){
		
		super(nome,endereco,data_Nasc,sexo,cpf,tel);
		this.funcao = funcao;
		id ++;
		System.out.println("Funcionario: " + this.id +"Criado com sucesso !");
	}
	
	//GETs SETs
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getId() {
		return id;
	}
	
	
	//M�todos
	private void add_Veiculo() {
		
	}
	private void rem_Veiculo() {
		
	}
	private void al_Veiculo() {
		
	}
	private void dev_Veiculo() {
		
		if(ver_Veiculo().equals("OK")){
			
		}
	}
	public String ver_Veiculo(){
		
		return "OK";
	}
	
public String ToString(){
		
	return(" ---- Dados do Funcion�rio ---- " + "\n" + 
		   "Nome: " + getNome() + "\n" +
		   "Endere�o: " + getEndereco() +"\n" +
		   "Data de Nascimento: "+ getData_Nasc() +"\n" +
		   "Sexo: " + getSexo() + "\n" +
		   "CPF: " + getCpf() + "\n" +
		   "Telefone: " + getTel() + "\n" +
		   "Fun��o: " + getFuncao() + "\n" + 
		   "Fun��o: " + getId() + "\n" );
	}
	
}
