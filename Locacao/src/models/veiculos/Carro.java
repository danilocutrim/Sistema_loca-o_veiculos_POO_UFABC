package models.veiculos;

public class Carro  extends Veiculo{
    private boolean ar;
    private boolean direcaoHidraulica;


    public Carro(int codigo, String modelo, String marca, int ano, float valores) {
        super(codigo, modelo, marca, ano, valores);
    }
    public Carro(){

    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }
}