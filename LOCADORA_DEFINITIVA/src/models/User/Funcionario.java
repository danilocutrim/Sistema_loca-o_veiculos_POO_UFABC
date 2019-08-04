package models.User;

public class Funcionario extends Usuario {
    private int  codigoFuncional;
    public Funcionario(String nome, String endereco, String data_Nasc, int cpf, int tel, String login, String senha) {
        super(nome, endereco, data_Nasc, cpf, tel, login,  senha);
        this.codigoFuncional = getCodigoFuncional();
    }
    public Funcionario(){

    }
    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }
}
