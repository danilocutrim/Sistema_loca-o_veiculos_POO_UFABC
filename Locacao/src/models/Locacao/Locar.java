package models.Locacao;

import models.User.Cliente;
import models.veiculos.Veiculo;

public abstract class Locar {
    private Veiculo veiculo;
    private Cliente cliente;

    public Locar(Veiculo veiculo, Cliente cliente) {
        this.veiculo = veiculo;
        this.cliente = cliente;
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
}
