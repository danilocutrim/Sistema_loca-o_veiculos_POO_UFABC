package models.User;

public class Funcionario extends Usuario {
    private int  codigoFuncional;
    public Funcionario(String nome, String endereco, String data_Nasc, int cpf, int tel) {
        super(nome, endereco, data_Nasc, cpf, tel);
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
