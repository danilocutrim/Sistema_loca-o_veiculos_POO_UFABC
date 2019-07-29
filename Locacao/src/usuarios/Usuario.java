package usuarios;

public class Usuario {
    private String nome;
    private String cpf;
    private String endereco;
    private Integer idade;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco != null && !endereco.isEmpty()){
            this.endereco = endereco;
        }
        else{
            System.out.println("erro");
        }
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if(idade != null && idade >= 18){
            this.idade = idade;
        }
        else{
            System.out.println("erro");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()){
            this.nome = nome;
        }
        else{
            System.out.println("erro");
        }
    }

    public String getCpf() {
        return cpf;

    }

    public void setCpf(String cpf) {
        if(cpf != null && !cpf.isEmpty()){
            this.endereco = endereco;
        }
        else{
            System.out.println("erro");
        }
    }
}
