package models.veiculos;

public  abstract class Veiculo {

    private int codigo;
    private String modelo;
    private String marca;
    private int ano;
    private float valores;
    public Veiculo(){

    }

    public Veiculo(int codigo, String modelo, String marca, int ano, float valores) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valores = valores;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValores() {
        return valores;
    }

    public void setValores(float valores) {
        this.valores = valores;
    }
}


