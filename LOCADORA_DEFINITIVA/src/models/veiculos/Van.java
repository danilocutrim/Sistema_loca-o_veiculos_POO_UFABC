package models.veiculos;

public class Van  extends Veiculo{
    private String assentos;

    public Van(String modelo, String marca, int ano, float valores) {
        super(modelo, marca, ano, valores);
    }

    public Van() {

    }

    public String getAssentos() {
        return assentos;
    }

    public void setAssentos(String assentos) {
        this.assentos = assentos;
    }
}
