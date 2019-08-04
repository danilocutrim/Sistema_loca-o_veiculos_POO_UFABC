package models.veiculos;

public class Moto  extends Veiculo{

    private String cilindradas;

    public Moto(int codigo, String modelo, String marca, int ano, float valores) {
        super(codigo, modelo, marca, ano, valores);
        this.cilindradas = cilindradas;
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
}
