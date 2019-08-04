package models.veiculos;

import java.util.ArrayList;

import models.Locacao.*;
import models.User.Cliente;

public  abstract class Veiculo {

    private static int codigo_tot =0;
    private int codigo =0;
    private String modelo;
    private String marca;
    private int ano;
    private float valores;
    private String tipo;
	public ArrayList<Aluguel>historico = new ArrayList<>() ;
	private boolean alugado;
	private boolean reservado;
	private Cliente clienteReserva;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Veiculo(){

    }

    public Veiculo( String modelo, String marca, int ano, float valores) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valores = valores;
    }
    public void print_Historico()
    {
    	for (Aluguel al:historico)
    	{
    		System.out.println(al.toString());
    		System.out.println("--------------------------");
    	}
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

	public static int getCodigo_tot() {
		return codigo_tot;
	}

	public static void setCodigo_tot(int codigo_tot) {
		Veiculo.codigo_tot = codigo_tot;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public boolean isReservado() {
		return reservado;
	}

	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}

	public Cliente getClienteReserva() {
		return clienteReserva;
	}

	public void setClienteReserva(Cliente clienteReserva) {
		this.clienteReserva = clienteReserva;
	}
}


