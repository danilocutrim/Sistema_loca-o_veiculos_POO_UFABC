package models.Locacao;

import controllers.AlugaCarro;
import models.User.Cliente;
import models.veiculos.Veiculo;

import java.time.LocalDate;

public  class Locar  implements AlugaCarro {
    private Veiculo veiculo;
    private Cliente cliente;
    private String status;

    public Locar(Veiculo veiculo, Cliente cliente) {
        this.veiculo = veiculo;
        this.cliente = cliente;
    }
    public Locar(){

    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String AlugaParaCliente() {
        this.status = "locação efetuada";
        return status;
    }
}
