package models.veiculos;

public class Moto  extends Veiculo{
	private String cilindradas;
    public Moto() {

    }

    public Moto(String modelo, String marca, int ano, float valores, String cilindradas, String tipo) {
        super(modelo, marca, ano, valores);
        this.cilindradas = cilindradas;
    }



    public Moto(String modelo, String marca, int ano, float valores) {
        super(modelo, marca, ano, valores);
    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

}
