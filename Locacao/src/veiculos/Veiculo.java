package veiculos;

public class Veiculo {

    private String marca;
    private Integer ano;
    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.isEmpty()){
            this.marca = marca;
        }
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if(ano !=null && ano >= 2015){
            this.ano = ano;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo != null && !modelo.isEmpty()){
            this.modelo = modelo;
        }
    }

}
