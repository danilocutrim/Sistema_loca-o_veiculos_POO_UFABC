package models.Locacao;
import models.User.Cliente;
import models.veiculos.Veiculo;

import java.time.LocalDate;
import java.time.Period;
public class Aluguel {

	private Cliente cliente;
	private Veiculo veiculo;
	private LocalDate data_Ret;
	private LocalDate data_Dev;
	private LocalDate data_Dev_Real;
	private int atraso=0;
	private float multa=0;
	private float preco;
	
	public Aluguel (Cliente cliente,LocalDate data_Ret,int dias, Veiculo veiculo)
	{
		this.cliente = cliente;
		this.data_Ret =  data_Ret;
		this.data_Dev =  data_Ret.plusDays(dias);	
		this.veiculo = veiculo;
		this.preco = veiculo.getValores()*dias;
	}
	public void Devolver (LocalDate data_Dev_Real)
	{
		this.data_Dev_Real =data_Dev_Real;
		if(data_Dev_Real.isAfter(data_Dev))
		{
			atraso = Period.between(data_Dev, data_Dev_Real).getDays() + (Period.between(data_Dev, data_Dev_Real).getMonths() *30);
			multa =  atraso *veiculo.getValores()*0.01f;
		}
		else 
			this.multa=0;
	}
	
	public String toString()
	{
		return ("Nome: " + cliente.getNome() + " CPF: "  + cliente.getCpf() + " Telefone: " + cliente.getTel() + " Veiculo: " + veiculo.getModelo() + " Marca: " + veiculo.getMarca() + " Ano: " +veiculo.getAno() + " Data retirada: " +data_Ret.toString() + " Data devolucao: " + data_Dev_Real + " Valor: " + preco +" Atraso: " + atraso + " Multa: " + multa + " Valor Total: " + preco+multa); 
		
	}
	public Cliente getCliente()
	{
		return cliente;
	}
}
