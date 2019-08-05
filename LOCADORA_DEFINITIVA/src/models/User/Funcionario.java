package models.User;

public class Funcionario extends Usuario {
    public Funcionario(String nome, String endereco, String data_Nasc, int cpf, long tel, String login, String senha) {
        super(nome, endereco, data_Nasc, cpf, tel, login,  senha);
    }
    public Funcionario(){

    }

}
